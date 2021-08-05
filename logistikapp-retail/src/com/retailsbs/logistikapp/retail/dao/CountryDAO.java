package com.retailsbs.logistikapp.retail.dao;

import java.util.List;

import com.retailsbs.logistikapp.retail.domain.Country;
import com.retailsbs.logistikapp.retail.dto.CountryExample;

public interface CountryDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_country
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    Long insert(Country record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_country
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    int updateByPrimaryKey(Country record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_country
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    int updateByPrimaryKeySelective(Country record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_country
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    List<Country> selectByExample(CountryExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_country
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    Country selectByPrimaryKey(Long id_country);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_country
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    int deleteByPrimaryKey(Long id_country);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_country
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    int countByExample(CountryExample example);
}