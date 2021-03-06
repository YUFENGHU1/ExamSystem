package com.internet.cms.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.internet.cms.model.Score;
import com.internet.cms.model.ScoreExample;

public interface ScoreService {
	 /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Apr 09 17:20:20 CST 2017
     */
    int countByExample(ScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Apr 09 17:20:20 CST 2017
     */
    int deleteByExample(ScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Apr 09 17:20:20 CST 2017
     */
    int deleteByPrimaryKey(Integer scoreId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Apr 09 17:20:20 CST 2017
     */
    int insert(Score record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Apr 09 17:20:20 CST 2017
     */
    int insertSelective(Score record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Apr 09 17:20:20 CST 2017
     */
    List<Score> selectByExample(ScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Apr 09 17:20:20 CST 2017
     */
    Score selectByPrimaryKey(Integer scoreId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Apr 09 17:20:20 CST 2017
     */
    int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Apr 09 17:20:20 CST 2017
     */
    int updateByExample(@Param("record") Score record, @Param("example") ScoreExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Apr 09 17:20:20 CST 2017
     */
    int updateByPrimaryKeySelective(Score record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table score
     *
     * @mbggenerated Sun Apr 09 17:20:20 CST 2017
     */
    int updateByPrimaryKey(Score record);
}
