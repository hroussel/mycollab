package com.mycollab.module.project.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.project.domain.ProjectNotificationSetting;
import com.mycollab.module.project.domain.ProjectNotificationSettingExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
@Mapper
public interface ProjectNotificationSettingMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    long countByExample(ProjectNotificationSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    int deleteByExample(ProjectNotificationSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    int insert(ProjectNotificationSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    int insertSelective(ProjectNotificationSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    List<ProjectNotificationSetting> selectByExample(ProjectNotificationSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    ProjectNotificationSetting selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    int updateByExampleSelective(@Param("record") ProjectNotificationSetting record, @Param("example") ProjectNotificationSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    int updateByExample(@Param("record") ProjectNotificationSetting record, @Param("example") ProjectNotificationSettingExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    int updateByPrimaryKeySelective(ProjectNotificationSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    int updateByPrimaryKey(ProjectNotificationSetting record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    Integer insertAndReturnKey(ProjectNotificationSetting value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_notifications
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    void massUpdateWithSession(@Param("record") ProjectNotificationSetting record, @Param("primaryKeys") List primaryKeys);
}