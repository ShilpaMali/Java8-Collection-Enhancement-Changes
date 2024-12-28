package com.collection.removeif;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {
public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("pune");
		list.add("bangalore");
		list.add("mumbai");
		list.add("delhi"); 
		//want to remove mumbai from list
		list.remove(2);
		System.out.println(list);
	}

}
