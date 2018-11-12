package com.examonline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examonline.dao.StudentExamInfoMapper;
import com.examonline.po.StudentExamInfo;
import com.examonline.service.StudentExamInfoService;

/**
  *
  * <p>Title: StudentExamInfoServiceImpl</p>
  * <p>Description: </p>
  * @author: Berlin
  * @date: 2018-9-19
  * @time: 上午10:09:21
  * @version: 1.0
  */

@Service
public class StudentExamInfoServiceImpl implements StudentExamInfoService {

	@Autowired
	private StudentExamInfoMapper studentExamInfoMapper;
	
	@Override
	public List<StudentExamInfo> getStudentExamCountByClassId(int classId) {
		return studentExamInfoMapper.getStudentExamCountByClassId(classId);
	}

	@Override
	public List<StudentExamInfo> getStudentExamInfo(int studentId) {
		return studentExamInfoMapper.getStudentExamInfo(studentId);
	}

	@Override
	public List<StudentExamInfo> getAllStudentAvgScoreCount(int classId) {
		return studentExamInfoMapper.getAllStudentAvgScoreCount(classId);
	}

}
