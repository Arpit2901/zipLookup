package com.dao.Exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamServices {
	@Autowired
ExamDao examDao;
public void addExam() {
	examDao.addExam();
}
}
