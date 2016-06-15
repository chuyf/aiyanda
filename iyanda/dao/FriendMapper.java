package com.iyanda.dao;

import com.iyanda.entity.Friend;

import java.util.List;

public interface FriendMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_friend
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_friend
     *
     * @mbggenerated
     */
    int insert(Friend record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_friend
     *
     * @mbggenerated
     */
    Friend selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_friend
     *
     * @mbggenerated
     */
    List<Friend> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_friend
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Friend record);
}