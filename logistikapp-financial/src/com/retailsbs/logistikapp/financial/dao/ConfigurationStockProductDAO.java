package com.retailsbs.logistikapp.financial.dao;

import java.util.List;

import com.retailsbs.logistikapp.financial.domain.ConfigurationStockProduct;
import com.retailsbs.logistikapp.financial.dto.ConfigurationStockProductExample;

public interface ConfigurationStockProductDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_configuration_stock_product
     *
     * @abatorgenerated Thu Aug 31 11:31:38 CDT 2017
     */
    Long insert(ConfigurationStockProduct record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_configuration_stock_product
     *
     * @abatorgenerated Thu Aug 31 11:31:38 CDT 2017
     */
    int updateByPrimaryKey(ConfigurationStockProduct record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_configuration_stock_product
     *
     * @abatorgenerated Thu Aug 31 11:31:38 CDT 2017
     */
    int updateByPrimaryKeySelective(ConfigurationStockProduct record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_configuration_stock_product
     *
     * @abatorgenerated Thu Aug 31 11:31:38 CDT 2017
     */
    List<ConfigurationStockProduct> selectByExample(ConfigurationStockProductExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_configuration_stock_product
     *
     * @abatorgenerated Thu Aug 31 11:31:38 CDT 2017
     */
    ConfigurationStockProduct selectByPrimaryKey(Long id_configuration_stock_product);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_configuration_stock_product
     *
     * @abatorgenerated Thu Aug 31 11:31:38 CDT 2017
     */
    int deleteByPrimaryKey(Long id_configuration_stock_product);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_configuration_stock_product
     *
     * @abatorgenerated Thu Aug 31 11:31:38 CDT 2017
     */
    int countByExample(ConfigurationStockProductExample example);
}