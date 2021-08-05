package com.retailsbs.logistikapp.user.dao;

import java.util.List;

import com.retailsbs.logistikapp.user.domain.Access;
import com.retailsbs.logistikapp.user.dto.AccessExample;

public interface AccessDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_access
     *
     * @abatorgenerated Thu Feb 19 13:29:00 CST 2015
     */
    Long insert(Access record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_access
     *
     * @abatorgenerated Thu Feb 19 13:29:00 CST 2015
     */
    int updateByPrimaryKey(Access record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_access
     *
     * @abatorgenerated Thu Feb 19 13:29:00 CST 2015
     */
    int updateByPrimaryKeySelective(Access record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_access
     *
     * @abatorgenerated Thu Feb 19 13:29:00 CST 2015
     */
    List<Access> selectByExample(AccessExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_access
     *
     * @abatorgenerated Thu Feb 19 13:29:00 CST 2015
     */
    Access selectByPrimaryKey(Long id_access);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_access
     *
     * @abatorgenerated Thu Feb 19 13:29:00 CST 2015
     */
    int deleteByPrimaryKey(Long id_access);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_access
     *
     * @abatorgenerated Thu Feb 19 13:29:00 CST 2015
     */
    int countByExample(AccessExample example);
}