package com.velocity;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("gold");
		list.add("platinum");
		list.add("silver");
		list.forEach((s) -> System.out.println(s));
	}

}
