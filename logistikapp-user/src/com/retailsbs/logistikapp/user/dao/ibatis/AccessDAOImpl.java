package com.retailsbs.logistikapp.user.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.retailsbs.logistikapp.user.dao.AccessDAO;
import com.retailsbs.logistikapp.user.domain.Access;
import com.retailsbs.logistikapp.user.dto.AccessExample;

public class AccessDAOImpl extends SqlMapClientDaoSupport implements AccessDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_access
     *
     * @abatorgenerated Thu Feb 19 13:29:00 CST 2015
     */
    public AccessDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_access
     *
     * @abatorgenerated Thu Feb 19 13:29:00 CST 2015
     */
    public Long insert(Access record) {
        Object newKey = getSqlMapClientTemplate().insert("lgk_access.abatorgenerated_insert", record);
        return (Long) newKey;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_access
     *
     * @abatorgenerated Thu Feb 19 13:29:00 CST 2015
     */
    public int updateByPrimaryKey(Access record) {
        int rows = getSqlMapClientTemplate().update("lgk_access.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_access
     *
     * @abatorgenerated Thu Feb 19 13:29:00 CST 2015
     */
    public int updateByPrimaryKeySelective(Access record) {
        int rows = getSqlMapClientTemplate().update("lgk_access.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_access
     *
     * @abatorgenerated Thu Feb 19 13:29:00 CST 2015
     */
    @SuppressWarnings("unchecked")
    public List<Access> selectByExample(AccessExample example) {
        List<Access> list = (List<Access>) getSqlMapClientTemplate().queryForList("lgk_access.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_access
     *
     * @abatorgenerated Thu Feb 19 13:29:00 CST 2015
     */
    public Access selectByPrimaryKey(Long id_access) {
        Access key = new Access();
        key.setId_access(id_access);
        Access record = (Access) getSqlMapClientTemplate().queryForObject("lgk_access.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_access
     *
     * @abatorgenerated Thu Feb 19 13:29:00 CST 2015
     */
    public int deleteByPrimaryKey(Long id_access) {
        Access key = new Access();
        key.setId_access(id_access);
        int rows = getSqlMapClientTemplate().delete("lgk_access.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_access
     *
     * @abatorgenerated Thu Feb 19 13:29:00 CST 2015
     */
    public int countByExample(AccessExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("lgk_access.abatorgenerated_countByExample", example);
        return count;
    }
}