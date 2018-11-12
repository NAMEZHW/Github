package com.examonline.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examonline.dao.SubjectInfoMapper;
import com.examonline.po.SubjectInfo;
import com.examonline.service.SubjectInfoService;

/**
  *
  * <p>Title: SubjectInfoServiceImpl</p>
  * <p>Description: </p>
  * @author: Berlin
  * @date: 2018-8-17
  * @time: 下午4:32:18
  * @version: 1.0
  */

@Service
public class SubjectInfoServiceImpl implements SubjectInfoService {

	@Autowired
	private SubjectInfoMapper subjectInfoMapper;
	
	@Override
	public List<SubjectInfo> getSubjects(Map<String, Object> map) {
		return subjectInfoMapper.getSubjects(map);
	}
	
	@Override
	public SubjectInfo getSubjectWithId(int subjectId) {
		return subjectInfoMapper.getSubjectWithId(subjectId);
	}

	@Override
	public int getSubjectTotal() {
		return subjectInfoMapper.getSubjectTotal();
	}

	@Override
	public int isAddSubject(SubjectInfo subject) {
		return subjectInfoMapper.isAddSubject(subject);
	}

	@Override
	public int isUpdateSubject(SubjectInfo subject) {
		return subjectInfoMapper.isUpdateSubject(subject);
	}

	@Override
	public int isDelSubject(int subjectId) {
		return subjectInfoMapper.isDelSubject(subjectId);
	}

	/**
	 * 批量添加试题
	 */
	@Override
	public int isAddSubjects(Map<String, Object> subjects) {
		return subjectInfoMapper.isAddSubjects(subjects);
	}

}
