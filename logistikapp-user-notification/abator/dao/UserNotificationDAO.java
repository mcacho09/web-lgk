package dao;

import domain.UserNotification;
import domain.UserNotificationExample;
import java.util.List;

public interface UserNotificationDAO {
    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_user_notification
     *
     * @abatorgenerated Tue Jul 07 12:25:08 CDT 2020
     */
    Long insert(UserNotification record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_user_notification
     *
     * @abatorgenerated Tue Jul 07 12:25:08 CDT 2020
     */
    int updateByPrimaryKey(UserNotification record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_user_notification
     *
     * @abatorgenerated Tue Jul 07 12:25:08 CDT 2020
     */
    int updateByPrimaryKeySelective(UserNotification record);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_user_notification
     *
     * @abatorgenerated Tue Jul 07 12:25:08 CDT 2020
     */
    List<UserNotification> selectByExample(UserNotificationExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_user_notification
     *
     * @abatorgenerated Tue Jul 07 12:25:08 CDT 2020
     */
    UserNotification selectByPrimaryKey(Long id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_user_notification
     *
     * @abatorgenerated Tue Jul 07 12:25:08 CDT 2020
     */
    int deleteByExample(UserNotificationExample example);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_user_notification
     *
     * @abatorgenerated Tue Jul 07 12:25:08 CDT 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table lgk_user_notification
     *
     * @abatorgenerated Tue Jul 07 12:25:08 CDT 2020
     */
    int countByExample(UserNotificationExample example);
}