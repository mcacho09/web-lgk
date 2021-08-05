package com.retailsbs.logistikapp.user.dao.ibatis;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.retailsbs.logistikapp.user.dao.ToDoDAO;
import com.retailsbs.logistikapp.user.domain.ToDo;
import com.retailsbs.logistikapp.user.dto.ToDoExample;

public class ToDoDAOImpl extends SqlMapClientDaoSupport implements ToDoDAO {

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_todo
     *
     * @abatorgenerated Fri Dec 05 17:21:35 CST 2014
     */
    public ToDoDAOImpl() {
        super();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_todo
     *
     * @abatorgenerated Fri Dec 05 17:21:35 CST 2014
     */
    public Long insert(ToDo record) {
        Object newKey = getSqlMapClientTemplate().insert("lgk_todo.abatorgenerated_insert", record);
        return (Long) newKey;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_todo
     *
     * @abatorgenerated Fri Dec 05 17:21:35 CST 2014
     */
    public int updateByPrimaryKey(ToDo record) {
        int rows = getSqlMapClientTemplate().update("lgk_todo.abatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_todo
     *
     * @abatorgenerated Fri Dec 05 17:21:35 CST 2014
     */
    public int updateByPrimaryKeySelective(ToDo record) {
        int rows = getSqlMapClientTemplate().update("lgk_todo.abatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_todo
     *
     * @abatorgenerated Fri Dec 05 17:21:35 CST 2014
     */
    @SuppressWarnings("unchecked")
    public List<ToDo> selectByExample(ToDoExample example) {
        List<ToDo> list = (List<ToDo>) getSqlMapClientTemplate().queryForList("lgk_todo.abatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_todo
     *
     * @abatorgenerated Fri Dec 05 17:21:35 CST 2014
     */
    public ToDo selectByPrimaryKey(Long id_todo) {
        ToDo key = new ToDo();
        key.setId_todo(id_todo);
        ToDo record = (ToDo) getSqlMapClientTemplate().queryForObject("lgk_todo.abatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_todo
     *
     * @abatorgenerated Fri Dec 05 17:21:35 CST 2014
     */
    public int deleteByPrimaryKey(Long id_todo) {
        ToDo key = new ToDo();
        key.setId_todo(id_todo);
        int rows = getSqlMapClientTemplate().delete("lgk_todo.abatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_todo
     *
     * @abatorgenerated Fri Dec 05 17:21:35 CST 2014
     */
    public int countByExample(ToDoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("lgk_todo.abatorgenerated_countByExample", example);
        return count;
    }
}