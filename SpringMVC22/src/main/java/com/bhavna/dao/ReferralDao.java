package com.bhavna.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.bhavna.bean.ReferralBean;

public class ReferralDao {
	List<ReferralBean> list = new ArrayList<ReferralBean>();
	  List<ReferralBean> list2 = new ArrayList();
	  ReferralBean ref1 = new ReferralBean(1,"Ekjot",  24 );
	  ReferralBean ref2 = new ReferralBean(2,"Ram", 89);
	  ReferralBean ref3 = new ReferralBean(3,"Hisham", 27);
	  ReferralBean ref4 = new ReferralBean(4,"Daksh",  21);



	   public List<ReferralBean> add() {
	        list.add(ref1);
	        list.add(ref2);
	        list.add(ref3);
	        list.add(ref4);
	        for (Object b : list) {
	            System.out.println(b);
	        }
	        return list;
	    }

	public List addReferral(ReferralBean person) {
		list.add(person);
		System.out.println("in add" + person);
		System.out.println("All Referrals");
//		  for(ReferralBean mem:list)    
//			    System.out.println(mem);    
		  return list;
	}

	public void viewReferral() {
		System.out.println("All Referrals in view");
//		Iterator<ReferralBean> itr = list.iterator();// getting the Iterator
//		while (itr.hasNext()) {// check if iterator has the elements
//			System.out.println(itr.next());
////			System.out.println(list);
//		}
	}
}
