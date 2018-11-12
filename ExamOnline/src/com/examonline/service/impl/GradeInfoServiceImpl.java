package com.examonline.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examonline.dao.GradeInfoMapper;
import com.examonline.po.GradeInfo;
import com.examonline.service.GradeInfoService;

/**
  *
  * <p>Title: GradeInfoServiceImpl</p>
  * <p>Description: </p>
  * @author: Berlin
  * @date: 2018-8-14
  * @time: 上午9:57:27
  * @version: 1.0
  */

@Service
public class GradeInfoServiceImpl implements GradeInfoService {

	@Autowired
	private GradeInfoMapper gradeInfoMapper;
	
	@Override
	public List<GradeInfo> getGrades() {
		return gradeInfoMapper.getGrades();
	}

	@Override
	public int isAddGrade(GradeInfo grade) {
		return gradeInfoMapper.isAddGrade(grade);
	}

	@Override
	public int isDelGrade(int gradeId) {
		return gradeInfoMapper.isDelGrade(gradeId);
	}

	@Override
	public int isUpdateGrade(GradeInfo grade) {
		return gradeInfoMapper.isUpdateGrade(grade);
	}

	@Override
	public GradeInfo getGradeById(int gradeId) {
		return gradeInfoMapper.getGradeById(gradeId);
	}

}
