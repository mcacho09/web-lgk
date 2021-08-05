package com.retailsbs.logistikapp.domain.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.retailsbs.logistikapp.domain.dao.DomainContentDAO;
import com.retailsbs.logistikapp.domain.domain.DomainContent;
import com.retailsbs.logistikapp.domain.dto.DomainContentExample;

public class DomainContentDAOImpl extends SqlMapClientDaoSupport implements DomainContentDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_domain_content
     *
     * @abatorgenerated Mon Nov 24 09:51:26 CST 2014
     */
    public DomainContentDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_domain_content
     *
     * @abatorgenerated Mon Nov 24 09:51:26 CST 2014
     */
    public Long insert(DomainContent record) {
        Object newKey = getSqlMapClientTemplate().insert("lgk_domain_content.abatorgenerated_insert", record);
        return (Long) newKey;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_domain_content
     *
     * @abatorgenerated Mon Nov 24 09:51:26 CST 2014
     */
    public int updateByPrimaryKey(DomainContent record) {
        int rows = getSqlMapClientTemplate().update("lgk_domain_content.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_domain_content
     *
     * @abatorgenerated Mon Nov 24 09:51:26 CST 2014
     */
    public int updateByPrimaryKeySelective(DomainContent record) {
        int rows = getSqlMapClientTemplate().update("lgk_domain_content.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_domain_content
     *
     * @abatorgenerated Mon Nov 24 09:51:26 CST 2014
     */
    @SuppressWarnings("unchecked")
    public List<DomainContent> selectByExample(DomainContentExample example) {
        List<DomainContent> list = (List<DomainContent>) getSqlMapClientTemplate().queryForList("lgk_domain_content.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_domain_content
     *
     * @abatorgenerated Mon Nov 24 09:51:26 CST 2014
     */
    public DomainContent selectByPrimaryKey(Long id_domain_content) {
        DomainContent key = new DomainContent();
        key.setId_domain_content(id_domain_content);
        DomainContent record = (DomainContent) getSqlMapClientTemplate().queryForObject("lgk_domain_content.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_domain_content
     *
     * @abatorgenerated Mon Nov 24 09:51:26 CST 2014
     */
    public int deleteByPrimaryKey(Long id_domain_content) {
        DomainContent key = new DomainContent();
        key.setId_domain_content(id_domain_content);
        int rows = getSqlMapClientTemplate().delete("lgk_domain_content.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_domain_content
     *
     * @abatorgenerated Mon Nov 24 09:51:26 CST 2014
     */
    public int countByExample(DomainContentExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("lgk_domain_content.abatorgenerated_countByExample", example);
        return count;
    }
}