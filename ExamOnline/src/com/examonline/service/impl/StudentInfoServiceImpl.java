package com.examonline.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examonline.dao.StudentInfoMapper;
import com.examonline.po.StudentInfo;
import com.examonline.service.StudentInfoService;

/**
  *
  * <p>Title: StudentInfoServiceImpl</p>
  * <p>Description: </p>
  * @author: Berlin
  * @date: 2018-8-16
  * @time: 上午10:20:39
  * @version: 1.0
  */

@Service
public class StudentInfoServiceImpl implements StudentInfoService {

	@Autowired
	private StudentInfoMapper studentInfoMapper;
	
	@Override
	public List<StudentInfo> getStudents(Map<String, Object> map) {
		return studentInfoMapper.getStudents(map);
	}

	@Override
	public StudentInfo getStudentById(int studentId) {
		return studentInfoMapper.getStudentById(studentId);
	}

	@Override
	public int isUpdateStudent(StudentInfo student) {
		return studentInfoMapper.isUpdateStudent(student);
	}

	@Override
	public int isDelStudent(int studentId) {
		return studentInfoMapper.isDelStudent(studentId);
	}

	@Override
	public int isAddStudent(StudentInfo student) {
		return studentInfoMapper.isAddStudent(student);
	}

	@Override
	public int getStudentTotal() {
		return studentInfoMapper.getStudentTotal();
	}

	@Override
	public StudentInfo getStudentByAccountAndPwd(String studentAccount) {
		return studentInfoMapper.getStudentByAccountAndPwd(studentAccount);
	}

	@Override
	public int isResetPwdWithStu(StudentInfo studentInfo) {
		return studentInfoMapper.isResetPwdWithStu(studentInfo);
	}

	@Override
	public List<StudentInfo> getStudentsByClassId(int classId) {
		return studentInfoMapper.getStudentsByClassId(classId);
	}

}
