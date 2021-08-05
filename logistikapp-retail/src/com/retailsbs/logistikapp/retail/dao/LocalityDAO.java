package com.retailsbs.logistikapp.retail.dao;

import java.util.List;

import com.retailsbs.logistikapp.retail.domain.Locality;
import com.retailsbs.logistikapp.retail.dto.LocalityExample;

public interface LocalityDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_locality
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    Long insert(Locality record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_locality
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    int updateByPrimaryKey(Locality record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_locality
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    int updateByPrimaryKeySelective(Locality record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_locality
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    List<Locality> selectByExample(LocalityExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_locality
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    Locality selectByPrimaryKey(Long id_locality);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_locality
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    int deleteByPrimaryKey(Long id_locality);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_locality
     *
     * @abatorgenerated Thu Nov 20 16:35:37 CST 2014
     */
    int countByExample(LocalityExample example);
}