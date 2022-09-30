package com.component.Spring.annotation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("feedExamList")
public class FeedExam {
List <String> subject;
Map <String,Integer> markRecord;
//public FeedExam(List<String> subject) {
////	subject=new ArrayList<String>();
////	subject.add("Math");
////	subject.add("Cse");
////	subject.add("Dsa");
//	
//}

public List<String> getSubject() {
	return subject;
}
public FeedExam() {
	markRecord=new HashMap<String,Integer>();
	markRecord.put("math", 95);
	markRecord.put("Cse", 90);
	markRecord.put("Dsa", 75);
	markRecord.put("Os", 85);
	subject=new ArrayList<String>();
	subject.add("Math");
	subject.add("Cse");
	subject.add("Dsa");
	
}

public void setSubject(List<String> subject) {
	this.subject = subject;
}

public Map<String, Integer> getMarkRecord() {
	return markRecord;
}

public void setMarkRecord(Map<String, Integer> markRecord) {
	this.markRecord = markRecord;
}


}
