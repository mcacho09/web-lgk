package com.retailsbs.logistikapp.user.dao;

import java.util.List;

import com.retailsbs.logistikapp.user.domain.MessageGroup;
import com.retailsbs.logistikapp.user.dto.MessageGroupExample;

public interface MessageGroupDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_message_group
     *
     * @abatorgenerated Mon Aug 03 13:53:13 CDT 2015
     */
    Long insert(MessageGroup record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_message_group
     *
     * @abatorgenerated Mon Aug 03 13:53:13 CDT 2015
     */
    int updateByPrimaryKey(MessageGroup record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_message_group
     *
     * @abatorgenerated Mon Aug 03 13:53:13 CDT 2015
     */
    int updateByPrimaryKeySelective(MessageGroup record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_message_group
     *
     * @abatorgenerated Mon Aug 03 13:53:13 CDT 2015
     */
    List<MessageGroup> selectByExample(MessageGroupExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_message_group
     *
     * @abatorgenerated Mon Aug 03 13:53:13 CDT 2015
     */
    MessageGroup selectByPrimaryKey(Long id_message_group);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_message_group
     *
     * @abatorgenerated Mon Aug 03 13:53:13 CDT 2015
     */
    int deleteByPrimaryKey(Long id_message_group);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_message_group
     *
     * @abatorgenerated Mon Aug 03 13:53:13 CDT 2015
     */
    int countByExample(MessageGroupExample example);
}