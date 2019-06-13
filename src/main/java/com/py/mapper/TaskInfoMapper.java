package com.py.mapper;

import com.py.model.TaskInfo;
import com.py.model.TaskInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskInfoMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table biz_safe_task_info
	 * @mbg.generated  Thu Jun 13 17:08:02 CST 2019
	 */
	long countByExample(TaskInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table biz_safe_task_info
	 * @mbg.generated  Thu Jun 13 17:08:02 CST 2019
	 */
	int deleteByExample(TaskInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table biz_safe_task_info
	 * @mbg.generated  Thu Jun 13 17:08:02 CST 2019
	 */
	int deleteByPrimaryKey(String taskId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table biz_safe_task_info
	 * @mbg.generated  Thu Jun 13 17:08:02 CST 2019
	 */
	int insert(TaskInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table biz_safe_task_info
	 * @mbg.generated  Thu Jun 13 17:08:02 CST 2019
	 */
	int insertSelective(TaskInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table biz_safe_task_info
	 * @mbg.generated  Thu Jun 13 17:08:02 CST 2019
	 */
	List<TaskInfo> selectByExample(TaskInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table biz_safe_task_info
	 * @mbg.generated  Thu Jun 13 17:08:02 CST 2019
	 */
	TaskInfo selectByPrimaryKey(String taskId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table biz_safe_task_info
	 * @mbg.generated  Thu Jun 13 17:08:02 CST 2019
	 */
	int updateByExampleSelective(@Param("record") TaskInfo record, @Param("example") TaskInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table biz_safe_task_info
	 * @mbg.generated  Thu Jun 13 17:08:02 CST 2019
	 */
	int updateByExample(@Param("record") TaskInfo record, @Param("example") TaskInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table biz_safe_task_info
	 * @mbg.generated  Thu Jun 13 17:08:02 CST 2019
	 */
	int updateByPrimaryKeySelective(TaskInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table biz_safe_task_info
	 * @mbg.generated  Thu Jun 13 17:08:02 CST 2019
	 */
	int updateByPrimaryKey(TaskInfo record);
}