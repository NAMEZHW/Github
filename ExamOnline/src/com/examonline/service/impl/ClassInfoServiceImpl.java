package com.examonline.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examonline.dao.ClassInfoMapper;
import com.examonline.po.ClassInfo;
import com.examonline.service.ClassInfoService;

/**
  *
  * <p>Title: ClassInfoServiceImpl</p>
  * <p>Description: 班级信息 Service 实现类</p>
  * @author: Berlin
  * @date: 2018-8-13
  * @time: 下午2:16:32
  * @version: 1.0
  */

@Service
public class ClassInfoServiceImpl implements ClassInfoService {

	@Autowired
	private ClassInfoMapper classInfoMapper;
	
	//获取班级集合
	@Override
	public List<ClassInfo> getClasses(ClassInfo classInfo) {
		return classInfoMapper.getClasses(classInfo);
	}

	//添加班级
	@Override
	public int isAddClass(ClassInfo classInfo) {
		return classInfoMapper.isAddClass(classInfo);
	}

	//删除班级
	@Override
	public int isDelClass(int classId) {
		return classInfoMapper.isDelClass(classId);
	}

	@Override
	public ClassInfo getClassById(int classId) {
		return classInfoMapper.getClassById(classId);
	}
	@Override
	public int isUpdateClass(ClassInfo classInfo) {
		return classInfoMapper.isUpdateClass(classInfo);
	}

	//获取指定年级下的班级
	@Override
	public List<ClassInfo> getClassByGradeId(int gradeId) {
		return classInfoMapper.getClassByGradeId(gradeId);
	}

	//获取各(指定年级下)班级下的学生总量
	@Override
	public Map<String, Object> getStudentCountForClass(Integer gradeId) {
		return classInfoMapper.getStudentCountForClass(gradeId);
	}

	//根据当前班级班主任编号获取当前班级信息
	@Override
	public ClassInfo getClassByTeacherId(int teacherId) {
		return classInfoMapper.getClassByTeacherId(teacherId);
	}

}
