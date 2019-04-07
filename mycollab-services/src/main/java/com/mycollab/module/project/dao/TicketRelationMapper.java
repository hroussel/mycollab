package com.mycollab.module.project.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.project.domain.TicketRelation;
import com.mycollab.module.project.domain.TicketRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
@Mapper
public interface TicketRelationMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_ticket_relation
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    long countByExample(TicketRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_ticket_relation
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    int deleteByExample(TicketRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_ticket_relation
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_ticket_relation
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    int insert(TicketRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_ticket_relation
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    int insertSelective(TicketRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_ticket_relation
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    List<TicketRelation> selectByExample(TicketRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_ticket_relation
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    TicketRelation selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_ticket_relation
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    int updateByExampleSelective(@Param("record") TicketRelation record, @Param("example") TicketRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_ticket_relation
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    int updateByExample(@Param("record") TicketRelation record, @Param("example") TicketRelationExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_ticket_relation
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    int updateByPrimaryKeySelective(TicketRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_ticket_relation
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    int updateByPrimaryKey(TicketRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_ticket_relation
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    Integer insertAndReturnKey(TicketRelation value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_ticket_relation
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_prj_ticket_relation
     *
     * @mbg.generated Sun Apr 07 09:54:39 CDT 2019
     */
    void massUpdateWithSession(@Param("record") TicketRelation record, @Param("primaryKeys") List primaryKeys);
}