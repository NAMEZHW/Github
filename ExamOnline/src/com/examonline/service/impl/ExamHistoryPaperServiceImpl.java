package com.examonline.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examonline.dao.ExamHistoryPaperMapper;
import com.examonline.po.ExamHistoryInfo;
import com.examonline.po.ExamHistoryPaper;
import com.examonline.service.ExamHistoryPaperService;

/**
  *
  * <p>Title: ExamHistoryPaperServiceImpl</p>
  * <p>Description: </p>
  * @author: Berlin
  * @date: 2018-8-29
  * @time: 下午4:46:13
  * @version: 1.0
  */

@Service
public class ExamHistoryPaperServiceImpl implements ExamHistoryPaperService {

	@Autowired
	private ExamHistoryPaperMapper examHistoryPaperMapper;
	
	@Override
	public List<ExamHistoryPaper> getExamHistoryToStudent(int studentId) {
		return examHistoryPaperMapper.getExamHistoryToStudent(studentId);
	}

	@Override
	public int isAddExamHistory(Map<String, Object> map) {
		return examHistoryPaperMapper.isAddExamHistory(map);
	}

	@Override
	public int getHistoryInfoWithIds(Map<String, Object> map) {
		return examHistoryPaperMapper.getHistoryInfoWithIds(map);
	}

	@Override
	public List<ExamHistoryInfo> getExamHistoryToTeacher() {
		return examHistoryPaperMapper.getExamHistoryToTeacher();
	}

}
