package com.retailsbs.logistikapp.domain.dao;

import java.util.List;

import com.retailsbs.logistikapp.domain.domain.Domain;
import com.retailsbs.logistikapp.domain.dto.DomainExample;

public interface DomainDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_domain
     *
     * @abatorgenerated Mon Nov 24 09:51:26 CST 2014
     */
    Long insert(Domain record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_domain
     *
     * @abatorgenerated Mon Nov 24 09:51:26 CST 2014
     */
    int updateByPrimaryKey(Domain record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_domain
     *
     * @abatorgenerated Mon Nov 24 09:51:26 CST 2014
     */
    int updateByPrimaryKeySelective(Domain record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_domain
     *
     * @abatorgenerated Mon Nov 24 09:51:26 CST 2014
     */
    List<Domain> selectByExample(DomainExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_domain
     *
     * @abatorgenerated Mon Nov 24 09:51:26 CST 2014
     */
    Domain selectByPrimaryKey(Long id_domain);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_domain
     *
     * @abatorgenerated Mon Nov 24 09:51:26 CST 2014
     */
    int deleteByPrimaryKey(Long id_domain);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_domain
     *
     * @abatorgenerated Mon Nov 24 09:51:26 CST 2014
     */
    int countByExample(DomainExample example);
}