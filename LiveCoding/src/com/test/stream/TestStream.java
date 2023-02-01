package com.test.stream;

import java.util.Optional;

public class TestStream {
 public void function1() {
	 String[] str=new String[5];
	 str[2]="Arpit";
	 Optional <String>checkNull= Optional.ofNullable(str[2]);
	 if(checkNull.isPresent()) {
		 System.out.println(str[2]);
	 }else
		 System.out.println("the string is null");
 }
}
