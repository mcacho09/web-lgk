package com.retailsbs.logistikapp.financial.dao;

import java.util.List;

import com.retailsbs.logistikapp.financial.domain.CategoryProduct;
import com.retailsbs.logistikapp.financial.dto.CategoryProductExample;

public interface CategoryProductDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_category_product
     *
     * @abatorgenerated Thu Jul 28 15:23:33 CDT 2016
     */
    Long insert(CategoryProduct record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_category_product
     *
     * @abatorgenerated Thu Jul 28 15:23:33 CDT 2016
     */
    int updateByPrimaryKey(CategoryProduct record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_category_product
     *
     * @abatorgenerated Thu Jul 28 15:23:33 CDT 2016
     */
    int updateByPrimaryKeySelective(CategoryProduct record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_category_product
     *
     * @abatorgenerated Thu Jul 28 15:23:33 CDT 2016
     */
    List<CategoryProduct> selectByExample(CategoryProductExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_category_product
     *
     * @abatorgenerated Thu Jul 28 15:23:33 CDT 2016
     */
    CategoryProduct selectByPrimaryKey(Long id_category_product);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_category_product
     *
     * @abatorgenerated Thu Jul 28 15:23:33 CDT 2016
     */
    int deleteByPrimaryKey(Long id_category_product);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_category_product
     *
     * @abatorgenerated Thu Jul 28 15:23:33 CDT 2016
     */
    int countByExample(CategoryProductExample example);
}