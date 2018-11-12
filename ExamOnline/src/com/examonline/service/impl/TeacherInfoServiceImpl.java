package com.examonline.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examonline.dao.TeacherInfoMapper;
import com.examonline.po.TeacherInfo;
import com.examonline.service.TeacherInfoService;

/**
  *
  * <p>Title: TeacherInfoServiceImpl</p>
  * <p>Description: </p>
  * @author: Berlin
  * @date: 2018-8-13
  * @time: 下午3:16:25
  * @version: 1.0
  */

@Service
public class TeacherInfoServiceImpl implements TeacherInfoService {

	@Autowired
	private TeacherInfoMapper teacherInfoMapper;

	/*
	 * public List<TeacherInfo> getTeachers(TeacherInfo teacher) { return
	 * teacherInfoMapper.getTeachers(teacher); }
	 */

	@Override
	public TeacherInfo getTeacherByAccount(String teacherAccount) {
		return teacherInfoMapper.getTeacherByAccount(teacherAccount);
	}

	@Override
	public int updateTeacherIsWork(TeacherInfo teacherInfo) {
		return teacherInfoMapper.updateTeacherIsWork(teacherInfo);
	}

	@Override
	public TeacherInfo getTeacherById(int teacherId) {
		return teacherInfoMapper.getTeacherById(teacherId);
	}

	@Override
	public int isUpdateTeacherInfo(TeacherInfo teacher) {
		return teacherInfoMapper.isUpdateTeacherInfo(teacher);
	}

	@Override
	public int isAddTeacherInfo(TeacherInfo teacher) {
		return teacherInfoMapper.isAddTeacherInfo(teacher);
	}

	@Override
	public int isDelTeacherInfo(int teacherId) {
		return teacherInfoMapper.isDelTeacherInfo(teacherId);
	}

	@Override
	public List<TeacherInfo> getTeachers(Map<String, Object> map) {
		return teacherInfoMapper.getTeachers(map);
	}

	@Override
	public int getTeacherTotal() {
		return teacherInfoMapper.getTeacherTotal();
	}

}
