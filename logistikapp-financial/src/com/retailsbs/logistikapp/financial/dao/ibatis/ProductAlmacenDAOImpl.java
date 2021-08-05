package com.retailsbs.logistikapp.financial.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.retailsbs.logistikapp.financial.dao.ProductAlmacenDAO;
import com.retailsbs.logistikapp.financial.domain.ProductAlmacen;
import com.retailsbs.logistikapp.financial.dto.ProductAlmacenExample;

public class ProductAlmacenDAOImpl extends SqlMapClientDaoSupport implements ProductAlmacenDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_product_almacen
     *
     * @abatorgenerated Fri Oct 06 10:47:10 CDT 2017
     */
    public ProductAlmacenDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_product_almacen
     *
     * @abatorgenerated Fri Oct 06 10:47:10 CDT 2017
     */
    public Long insert(ProductAlmacen record) {
        Object newKey = getSqlMapClientTemplate().insert("lgk_product_almacen.abatorgenerated_insert", record);
        return (Long) newKey;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_product_almacen
     *
     * @abatorgenerated Fri Oct 06 10:47:10 CDT 2017
     */
    public int updateByPrimaryKey(ProductAlmacen record) {
        int rows = getSqlMapClientTemplate().update("lgk_product_almacen.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_product_almacen
     *
     * @abatorgenerated Fri Oct 06 10:47:10 CDT 2017
     */
    public int updateByPrimaryKeySelective(ProductAlmacen record) {
        int rows = getSqlMapClientTemplate().update("lgk_product_almacen.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_product_almacen
     *
     * @abatorgenerated Fri Oct 06 10:47:10 CDT 2017
     */
    @SuppressWarnings("unchecked")
    public List<ProductAlmacen> selectByExample(ProductAlmacenExample example) {
        List<ProductAlmacen> list = (List<ProductAlmacen>) getSqlMapClientTemplate().queryForList("lgk_product_almacen.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_product_almacen
     *
     * @abatorgenerated Fri Oct 06 10:47:10 CDT 2017
     */
    public ProductAlmacen selectByPrimaryKey(Long id_product_almacen) {
        ProductAlmacen key = new ProductAlmacen();
        key.setId_product_almacen(id_product_almacen);
        ProductAlmacen record = (ProductAlmacen) getSqlMapClientTemplate().queryForObject("lgk_product_almacen.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_product_almacen
     *
     * @abatorgenerated Fri Oct 06 10:47:10 CDT 2017
     */
    public int deleteByPrimaryKey(Long id_product_almacen) {
        ProductAlmacen key = new ProductAlmacen();
        key.setId_product_almacen(id_product_almacen);
        int rows = getSqlMapClientTemplate().delete("lgk_product_almacen.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_product_almacen
     *
     * @abatorgenerated Fri Oct 06 10:47:10 CDT 2017
     */
    public int countByExample(ProductAlmacenExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("lgk_product_almacen.abatorgenerated_countByExample", example);
        return count;
    }
}