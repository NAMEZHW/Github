package com.examonline.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.examonline.po.CourseInfo;

/**
  *
  * <p>Title: CourseInfoMapper</p>
  * <p>Description: </p>
  * @author: Berlin
  * @date: 2018-8-15
  * @time: 下午5:23:23
  * @version: 1.0
  */

@Repository
public interface CourseInfoMapper {

	public List<CourseInfo> getCourses(CourseInfo course);
	
	public int isUpdateCourse(CourseInfo course);

	public int isAddCourse(CourseInfo course);
	
	public int isDelCourse(int courseId);
	
	public CourseInfo getCourseById(int courseId);
}
