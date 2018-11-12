package com.examonline.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examonline.dao.ExamSubjectMiddleInfoMapper;
import com.examonline.po.ExamSubjectMiddleInfo;
import com.examonline.service.ExamSubjectMiddleInfoService;

/**
  *
  * <p>Title: ExamSubjectMiddleInfoServiceImpl</p>
  * <p>Description: </p>
  * @author: Berlin
  * @date: 2018-8-20
  * @time: 下午4:17:55
  * @version: 1.0
  */

@Service
public class ExamSubjectMiddleInfoServiceImpl implements
		ExamSubjectMiddleInfoService {

	@Autowired
	private ExamSubjectMiddleInfoMapper examSubjectMiddleInfoMapper;
	
	//查询试卷-试题信息
	@Override
	public List<ExamSubjectMiddleInfo> getExamPaperWithSubject(
			ExamSubjectMiddleInfo esm) {
		return examSubjectMiddleInfoMapper.getExamPaperWithSubject(esm);
	}

	@Override
	public int isAddESM(Map<String, Object> map) {
		return examSubjectMiddleInfoMapper.isAddESM(map);
	}

	@Override
	public int removeSubjectWithExamPaper(Map<String, Object> map) {
		return examSubjectMiddleInfoMapper.removeSubjectWithExamPaper(map);
	}

	@Override
	public Integer getEsmByExamIdWithSubjectId(ExamSubjectMiddleInfo esm) {
		return examSubjectMiddleInfoMapper.getEsmByExamIdWithSubjectId(esm);
	}

}
