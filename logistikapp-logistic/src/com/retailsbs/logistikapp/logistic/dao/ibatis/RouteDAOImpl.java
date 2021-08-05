package com.retailsbs.logistikapp.logistic.dao.ibatis;


import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.retailsbs.logistikapp.logistic.dao.RouteDAO;
import com.retailsbs.logistikapp.logistic.domain.Route;
import com.retailsbs.logistikapp.logistic.dto.RouteExample;

public class RouteDAOImpl extends SqlMapClientDaoSupport implements RouteDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_route
     *
     * @abatorgenerated Mon Aug 17 10:56:01 CDT 2015
     */
    public RouteDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_route
     *
     * @abatorgenerated Mon Aug 17 10:56:01 CDT 2015
     */
    public Long insert(Route record) {
        Object newKey = getSqlMapClientTemplate().insert("lgk_route.abatorgenerated_insert", record);
        return (Long) newKey;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_route
     *
     * @abatorgenerated Mon Aug 17 10:56:01 CDT 2015
     */
    public int updateByPrimaryKey(Route record) {
        int rows = getSqlMapClientTemplate().update("lgk_route.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_route
     *
     * @abatorgenerated Mon Aug 17 10:56:01 CDT 2015
     */
    public int updateByPrimaryKeySelective(Route record) {
        int rows = getSqlMapClientTemplate().update("lgk_route.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_route
     *
     * @abatorgenerated Mon Aug 17 10:56:01 CDT 2015
     */
    @SuppressWarnings("unchecked")
    public List<Route> selectByExample(RouteExample example) {
        List<Route> list = (List<Route>) getSqlMapClientTemplate().queryForList("lgk_route.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_route
     *
     * @abatorgenerated Mon Aug 17 10:56:01 CDT 2015
     */
    public Route selectByPrimaryKey(Long id_route) {
        Route key = new Route();
        key.setId_route(id_route);
        Route record = (Route) getSqlMapClientTemplate().queryForObject("lgk_route.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_route
     *
     * @abatorgenerated Mon Aug 17 10:56:01 CDT 2015
     */
    public int deleteByPrimaryKey(Long id_route) {
        Route key = new Route();
        key.setId_route(id_route);
        int rows = getSqlMapClientTemplate().delete("lgk_route.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_route
     *
     * @abatorgenerated Mon Aug 17 10:56:01 CDT 2015
     */
    public int countByExample(RouteExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("lgk_route.abatorgenerated_countByExample", example);
        return count;
    }
}