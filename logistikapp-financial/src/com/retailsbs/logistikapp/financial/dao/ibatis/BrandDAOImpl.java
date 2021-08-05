package com.retailsbs.logistikapp.financial.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.retailsbs.logistikapp.financial.dao.BrandDAO;
import com.retailsbs.logistikapp.financial.domain.Brand;
import com.retailsbs.logistikapp.financial.dto.BrandExample;

public class BrandDAOImpl extends SqlMapClientDaoSupport implements BrandDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_brand
     *
     * @abatorgenerated Thu Jul 28 13:53:52 CDT 2016
     */
    public BrandDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_brand
     *
     * @abatorgenerated Thu Jul 28 13:53:52 CDT 2016
     */
    public Long insert(Brand record) {
        Object newKey = getSqlMapClientTemplate().insert("lgk_brand.abatorgenerated_insert", record);
        return (Long) newKey;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_brand
     *
     * @abatorgenerated Thu Jul 28 13:53:52 CDT 2016
     */
    public int updateByPrimaryKey(Brand record) {
        int rows = getSqlMapClientTemplate().update("lgk_brand.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_brand
     *
     * @abatorgenerated Thu Jul 28 13:53:52 CDT 2016
     */
    public int updateByPrimaryKeySelective(Brand record) {
        int rows = getSqlMapClientTemplate().update("lgk_brand.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_brand
     *
     * @abatorgenerated Thu Jul 28 13:53:52 CDT 2016
     */
    @SuppressWarnings("unchecked")
    public List<Brand> selectByExample(BrandExample example) {
        List<Brand> list = (List<Brand>) getSqlMapClientTemplate().queryForList("lgk_brand.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_brand
     *
     * @abatorgenerated Thu Jul 28 13:53:52 CDT 2016
     */
    public Brand selectByPrimaryKey(Long id_brand) {
        Brand key = new Brand();
        key.setId_brand(id_brand);
        Brand record = (Brand) getSqlMapClientTemplate().queryForObject("lgk_brand.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_brand
     *
     * @abatorgenerated Thu Jul 28 13:53:52 CDT 2016
     */
    public int deleteByPrimaryKey(Long id_brand) {
        Brand key = new Brand();
        key.setId_brand(id_brand);
        int rows = getSqlMapClientTemplate().delete("lgk_brand.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_brand
     *
     * @abatorgenerated Thu Jul 28 13:53:52 CDT 2016
     */
    public int countByExample(BrandExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("lgk_brand.abatorgenerated_countByExample", example);
        return count;
    }
}