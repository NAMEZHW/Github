package com.examonline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examonline.dao.CourseInfoMapper;
import com.examonline.po.CourseInfo;
import com.examonline.service.CourseInfoService;

/**
  *
  * <p>Title: CourseInfoServiceImpl</p>
  * <p>Description: </p>
  * @author: Berlin
  * @date: 2018-8-15
  * @time: 下午5:30:48
  * @version: 1.0
  */

@Service
public class CourseInfoServiceImpl implements CourseInfoService {
	
	@Autowired
	private CourseInfoMapper courseInfoMapper;

	@Override
	public List<CourseInfo> getCourses(CourseInfo course) {
		return courseInfoMapper.getCourses(course);
	}

	@Override
	public int isUpdateCourse(CourseInfo course) {
		return courseInfoMapper.isUpdateCourse(course);
	}

	@Override
	public int isAddCourse(CourseInfo course) {
		return courseInfoMapper.isAddCourse(course);
	}

	@Override
	public int isDelCourse(int courseId) {
		return courseInfoMapper.isDelCourse(courseId);
	}

	@Override
	public CourseInfo getCourseById(int courseId) {
		return courseInfoMapper.getCourseById(courseId);
	}

}
