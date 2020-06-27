package com.hyh.interview;

import java.util.HashSet;
import java.util.Set;

public class Typeshanghaishuhui {
	public static void main(String[] args) {
		Set<Short> shortset = new HashSet<Short>();
		for(short i=0; i<100; i++) {
			shortset.add(i);
			shortset.remove(i-1);
		}
		System.out.println(shortset.size());
		
		Set<Long> longset = new HashSet<Long>();
		for(Long i=0L; i<100; i++) {
			longset.add(i);
			Long temp = i-1;
			longset.remove(temp);
		}
		System.out.println(longset.size());
	}
}
