package com.retailsbs.logistikapp.logistic.dao.ibatis;



import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.retailsbs.logistikapp.logistic.dao.TravelDAO;
import com.retailsbs.logistikapp.logistic.domain.Travel;
import com.retailsbs.logistikapp.logistic.dto.TravelExample;

public class TravelDAOImpl extends SqlMapClientDaoSupport implements TravelDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_travel
     *
     * @abatorgenerated Mon Aug 17 11:49:23 CDT 2015
     */
    public TravelDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_travel
     *
     * @abatorgenerated Mon Aug 17 11:49:23 CDT 2015
     */
    public Long insert(Travel record) {
        Object newKey = getSqlMapClientTemplate().insert("lgk_travel.abatorgenerated_insert", record);
        return (Long) newKey;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_travel
     *
     * @abatorgenerated Mon Aug 17 11:49:23 CDT 2015
     */
    public int updateByPrimaryKey(Travel record) {
        int rows = getSqlMapClientTemplate().update("lgk_travel.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_travel
     *
     * @abatorgenerated Mon Aug 17 11:49:23 CDT 2015
     */
    public int updateByPrimaryKeySelective(Travel record) {
        int rows = getSqlMapClientTemplate().update("lgk_travel.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_travel
     *
     * @abatorgenerated Mon Aug 17 11:49:23 CDT 2015
     */
    @SuppressWarnings("unchecked")
    public List<Travel> selectByExample(TravelExample example) {
        List<Travel> list = (List<Travel>) getSqlMapClientTemplate().queryForList("lgk_travel.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_travel
     *
     * @abatorgenerated Mon Aug 17 11:49:23 CDT 2015
     */
    public Travel selectByPrimaryKey(Long id_travel) {
        Travel key = new Travel();
        key.setId_travel(id_travel);
        Travel record = (Travel) getSqlMapClientTemplate().queryForObject("lgk_travel.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_travel
     *
     * @abatorgenerated Mon Aug 17 11:49:23 CDT 2015
     */
    public int deleteByPrimaryKey(Long id_travel) {
        Travel key = new Travel();
        key.setId_travel(id_travel);
        int rows = getSqlMapClientTemplate().delete("lgk_travel.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_travel
     *
     * @abatorgenerated Mon Aug 17 11:49:23 CDT 2015
     */
    public int countByExample(TravelExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("lgk_travel.abatorgenerated_countByExample", example);
        return count;
    }
}