package com.collection.removeif;

import java.util.ArrayList;
import java.util.List;

public class Collection3 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("pune");
		list.add("bangalore");
		list.add("mumbai");
		list.add("delhi");
		//without java 8, atleast write 5-6 line of code
		list.removeIf((p) -> p.equals("mumbai"));
		System.out.println(list);
	}

}
