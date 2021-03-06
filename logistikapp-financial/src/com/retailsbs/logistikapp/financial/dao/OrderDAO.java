package com.retailsbs.logistikapp.financial.dao;

import com.retailsbs.logistikapp.financial.domain.Order;
import com.retailsbs.logistikapp.financial.dto.OrderExample;
import java.util.List;

public interface OrderDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_order
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    Long insert(Order record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_order
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    int updateByPrimaryKey(Order record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_order
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_order
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    List<Order> selectByExample(OrderExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_order
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    Order selectByPrimaryKey(Long id_order);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_order
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    int deleteByPrimaryKey(Long id_order);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_order
     *
     * @abatorgenerated Thu Aug 18 11:32:18 CDT 2016
     */
    int countByExample(OrderExample example);
}