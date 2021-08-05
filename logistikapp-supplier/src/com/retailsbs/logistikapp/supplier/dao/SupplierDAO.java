package com.retailsbs.logistikapp.supplier.dao;

import java.util.List;

import com.retailsbs.logistikapp.supplier.domain.Supplier;
import com.retailsbs.logistikapp.supplier.dto.SupplierExample;

public interface SupplierDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_supplier
     *
     * @abatorgenerated Fri Apr 08 12:37:47 CDT 2016
     */
    Long insert(Supplier record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_supplier
     *
     * @abatorgenerated Fri Apr 08 12:37:47 CDT 2016
     */
    int updateByPrimaryKey(Supplier record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_supplier
     *
     * @abatorgenerated Fri Apr 08 12:37:47 CDT 2016
     */
    int updateByPrimaryKeySelective(Supplier record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_supplier
     *
     * @abatorgenerated Fri Apr 08 12:37:47 CDT 2016
     */
    List<Supplier> selectByExample(SupplierExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_supplier
     *
     * @abatorgenerated Fri Apr 08 12:37:47 CDT 2016
     */
    Supplier selectByPrimaryKey(Long id_supplier);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_supplier
     *
     * @abatorgenerated Fri Apr 08 12:37:47 CDT 2016
     */
    int deleteByPrimaryKey(Long id_supplier);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_supplier
     *
     * @abatorgenerated Fri Apr 08 12:37:47 CDT 2016
     */
    int countByExample(SupplierExample example);
}