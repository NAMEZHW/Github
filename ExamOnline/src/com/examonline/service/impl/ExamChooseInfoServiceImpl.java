package com.examonline.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examonline.dao.ExamChooseInfoMapper;
import com.examonline.po.ExamChooseInfo;
import com.examonline.service.ExamChooseInfoService;

/**
  *
  * <p>Title: ExamChooseInfoServiceImpl</p>
  * <p>Description: </p>
  * @author: Berlin
  * @date: 2018-8-25
  * @time: 上午10:35:03
  * @version: 1.0
  */

@Service
public class ExamChooseInfoServiceImpl implements ExamChooseInfoService {

	@Autowired
	private ExamChooseInfoMapper examChooseInfoMapper;

	//根据学生编号，试卷编号，试题编号获取选择记录
	@Override
	public ExamChooseInfo getChooseWithIds(Map<String, Object> map) {
		return examChooseInfoMapper.getChooseWithIds(map);
	}

	//修改选择记录
	@Override
	public int updateChooseWithIds(ExamChooseInfo examChoose) {
		return examChooseInfoMapper.updateChooseWithIds(examChoose);
	}

	//添加选择记录
	@Override
	public int addChoose(Map<String, Object> map) {
		return examChooseInfoMapper.addChoose(map);
	}

	@Override
	public List<ExamChooseInfo> getChooseInfoWithSumScore(
			Map<String, Object> map) {
		return examChooseInfoMapper.getChooseInfoWithSumScore(map);
	}

	@Override
	public List<ExamChooseInfo> getChooseInfoWithExamSubject(
			Map<String, Object> map) {
		return examChooseInfoMapper.getChooseInfoWithExamSubject(map);
	}


}
