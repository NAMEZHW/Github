package com.examonline.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examonline.dao.ExamPlanInfoMapper;
import com.examonline.po.ExamPlanInfo;
import com.examonline.service.ExamPlanInfoService;

/**
  *
  * <p>Title: ExamPlanInfoServiceImpl</p>
  * <p>Description: </p>
  * @author: Berlin
  * @date: 2018-8-22
  * @time: 下午4:06:02
  * @version: 1.0
  */

@Service
public class ExamPlanInfoServiceImpl implements ExamPlanInfoService {

	@Autowired
	private ExamPlanInfoMapper examPlanInfoMapper;
	
	@Override
	public List<ExamPlanInfo> getExamPlans(Map<String, Object> map) {
		return examPlanInfoMapper.getExamPlans(map);
	}

	@Override
	public int isAddExamPlan(ExamPlanInfo examPlan) {
		return examPlanInfoMapper.isAddExamPlan(examPlan);
	}

	@Override
	public int isUpdateExamPlan(ExamPlanInfo examPlan) {
		return examPlanInfoMapper.isUpdateExamPlan(examPlan);
	}

	@Override
	public ExamPlanInfo getExamPlanById(int examPlanId) {
		return examPlanInfoMapper.getExamPlanById(examPlanId);
	}

	//查询学生待考信息
	@Override
	public List<ExamPlanInfo> getStudentWillExam(Map<String, Object> map) {
		return examPlanInfoMapper.getStudentWillExam(map);
	}

	//移除过期考试安排
	@Override
	public int isRemoveExamPlan(int examPlanId) {
		return examPlanInfoMapper.isRemoveExamPlan(examPlanId);
	}

}
