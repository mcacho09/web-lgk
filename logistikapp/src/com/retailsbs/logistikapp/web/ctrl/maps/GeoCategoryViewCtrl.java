package com.retailsbs.logistikapp.web.ctrl.maps;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.acegisecurity.Authentication;
import org.acegisecurity.context.SecurityContextHolder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.retailsbs.logistikapp.retail.domain.RetailCategory;
import com.retailsbs.logistikapp.retail.domain.Store;
import com.retailsbs.logistikapp.retail.domain.StoreCategory;
import com.retailsbs.logistikapp.retail.dto.StoreByIdsSearchCriteria;
import com.retailsbs.logistikapp.retail.service.RetailService;
import com.retailsbs.logistikapp.user.domain.Access;
import com.retailsbs.logistikapp.user.domain.Quantities;
import com.retailsbs.logistikapp.user.domain.UserAcegi;
import com.retailsbs.logistikapp.user.dto.NotificationTodaySearchCriteria;
import com.retailsbs.logistikapp.user.service.UserService;

/**
 * Class controller para la vista de geolocalización de tiendas
 * @author JUAN
 * @since 28-01-2015
 */
public class GeoCategoryViewCtrl implements Controller {
	
	protected final Log logger = LogFactory.getLog(getClass());

	private RetailService retailService;
	private UserService userService;
	private String view;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public void setRetailService(RetailService retailService) {
		this.retailService = retailService;
	}
	public void setView(String view) {
		this.view = view;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		logger.debug("----- HANDLE REQUEST -----");
		/*-------------------------------------------------------*/
		logger.debug("----- USER CONTEXT -----");
		// Se obtiene el contexto del usuario
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		UserAcegi useracegi = (UserAcegi) auth.getPrincipal();
		////////////////////////////////////////////////////////////////////////
		//Se obtienen los datos de acceso para el usuario
		List<Access> accesslist = userService.getAccessByIdUser(useracegi.getId_user());
		//Se obtiene el primer acceso por defecto
		Access useraccess = accesslist.get(0);
		////////////////////////////////////////////////////////////////////////
		logger.debug("----- USER ACCESS -----");
		/*-------------------------------------------------------*/
		NotificationTodaySearchCriteria dtoqty = new NotificationTodaySearchCriteria();
		dtoqty.setProfile(useracegi.getProfile());
		dtoqty.setFecha(new Date());
		dtoqty.setId_supplier(useraccess.getId_supplier());
		dtoqty.setId_user(useracegi.getId_user());
		logger.debug("----- HEADER/NOTIFICATION -----");
		Quantities nttdto = userService.getQtyAlertAndMessagesByIdUser(dtoqty);
		//HeaderNotificationDTO nttdto = userService.getHeaderNotificationByIdUser(useracegi.getId_user());
		logger.debug("alert="+nttdto.getAlert_qty()+" | message="+nttdto.getMessage_qty()+" | todo="+nttdto.getTodo_qty());
		/*-------------------------------------------------------*/
		
		boolean from_retail = ServletRequestUtils.getRequiredBooleanParameter(arg0, "from_retail");
		logger.debug("from_retail="+from_retail);
		String category = "";
		
		if(from_retail){
			// Se obtiene el parametro de id_retail_category y su respectivo objeto de dominio
			Long id_retail_category = ServletRequestUtils.getLongParameter(arg0, "id");
			RetailCategory category_retail = retailService.getRetailCategoryById(id_retail_category);
			category = category_retail.getName();
		}else{
			Long id_store_category = ServletRequestUtils.getLongParameter(arg0, "id");
			StoreCategory category_store = retailService.getStoreCategoryById(id_store_category);
			category = category_store.getName();
		}
		
		/*-------------------------------------------------------*/
		// Se obtiene el parametro del listado de ids de tiendas
		String ids0 = ServletRequestUtils.getRequiredStringParameter(arg0, "ids");
		logger.debug("ids0="+ids0.length());
		
		String[] ids1 = ids0.split(",");
		logger.debug("ids1="+ids0+" | len="+ids1.length);
		long[] ids = new long[ids1.length];
		for( int i=0; i<ids1.length; i++ )
			ids[i] = Long.parseLong( ids1[i] );
		
		// De la lista de ids se obtiene una lista de locales
		StoreByIdsSearchCriteria idto = new StoreByIdsSearchCriteria();
		idto.setIds(ids);
		List<Store> list = retailService.getStoreByIds(idto);
		logger.debug("list="+list.size());
		
		String storesName = "";
		String storesLatitude = "";
		String storesLongitude = "";
		String sep = "";
		for ( int i=0; i<list.size(); i++ ) {
			storesName = storesName + sep + (list.get(i)).getName();
			storesLatitude = storesLatitude + sep + (list.get(i)).getLatitude();
			storesLongitude = storesLongitude + sep + (list.get(i)).getLongitude();
			sep = "|";
		}
		
		logger.debug("storesName="+storesName);
		logger.debug("storesLatitude="+storesLatitude);
		logger.debug("storesLongitude="+storesLongitude);
		
		/*-------------------------------------------------------*/
		Map<String,Object> model = new HashMap<String,Object>();
		model.put("useracegi", useracegi);
		model.put("nttdto", nttdto);

		model.put("useraccess", useraccess);
		model.put("category", category);
		model.put("from_retail", from_retail);
		model.put("storesName", storesName);
		model.put("storesLatitude", storesLatitude);
		model.put("storesLongitude", storesLongitude);
		
		return new ModelAndView(view, model);
	}

}
