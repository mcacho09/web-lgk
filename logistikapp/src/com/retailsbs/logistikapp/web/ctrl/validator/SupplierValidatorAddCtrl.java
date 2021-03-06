package com.retailsbs.logistikapp.web.ctrl.validator;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.retailsbs.logistikapp.supplier.dto.AddSupplierDTO;
import com.retailsbs.logistikapp.supplier.dto.AvaibleSupplierCodeSearchCriteria;
import com.retailsbs.logistikapp.supplier.exception.SupplierCodeDuplicateException;
import com.retailsbs.logistikapp.supplier.service.SupplierService;

public class SupplierValidatorAddCtrl implements Validator {

	protected final Log logger = LogFactory.getLog(getClass());

	private SupplierService supplierService;
	private String ACTIVE;

	public void setSupplierService(SupplierService supplierService) {
		this.supplierService = supplierService;
	}

	public void setACTIVE(String aCTIVE) {
		ACTIVE = aCTIVE;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean supports(Class supplier) {
		return supplier.equals(AddSupplierDTO.class);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		AddSupplierDTO dto = (AddSupplierDTO) arg0;

		if (dto == null) {
			arg1.reject("error.nullpointer", "Null data received");
		} else {

			String name = dto.getName();
			String code = dto.getCode();
			logger.debug("name=" + name);
			logger.debug("code=" + code);

			// Se controla que se ingrese un valor
			if (name == "") arg1.rejectValue("name", "error.code", "Ingresa el nombre del proveedor");
			if (code == "") arg1.rejectValue("code", "error.code", "Ingresa un c?digo para el proveedor");

			// Se valida que el c?digo del proveedor no est? duplicado
			AvaibleSupplierCodeSearchCriteria dto_sup = new AvaibleSupplierCodeSearchCriteria();
			dto_sup.setCode(code);
			dto_sup.setActive(ACTIVE);
			try {
				supplierService.getAvaibleSupplierCodeSearchCriteria(dto_sup);
			} catch (SupplierCodeDuplicateException e) {
				arg1.rejectValue("code", "error.code", e.getMessage());
			}

		}

	}

}
