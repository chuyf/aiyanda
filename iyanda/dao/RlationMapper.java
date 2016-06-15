package com.iyanda.dao;

import com.iyanda.entity.Rlation;

import java.util.List;

import org.springframework.stereotype.Repository;
@Repository
public interface RlationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rlation
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rlation
     *
     * @mbggenerated
     */
    int insert(Rlation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rlation
     *
     * @mbggenerated
     */
    Rlation selectByPrimaryKey(String id);
    
    Rlation selectByCommunityIdAndUserId(String communityid,String userid);

    List<Rlation> selectByUserId(String userid);
    
    List<Rlation> selectByCommunityId(String communityid);
    
    
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rlation
     *
     * @mbggenerated
     */
    List<Rlation> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_rlation
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Rlation record);
}