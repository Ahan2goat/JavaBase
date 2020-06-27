package cn.hyh.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "offer");
		Map<String, String> synchronizedMap = Collections.synchronizedMap(map);
		System.out.println(synchronizedMap);
		ConcurrentHashMap<Integer, String> cmap = new ConcurrentHashMap<Integer, String>();
		cmap.put(1, "firstconcurrenthashmap");
		cmap.get(1);
		System.out.println(cmap);
		
		ExecutorService ftp = null;
		Executors.newFixedThreadPool(2);
		Executors.newCachedThreadPool();
		Executors.newScheduledThreadPool(2);
		Executors.newSingleThreadExecutor();
		Executors.newSingleThreadScheduledExecutor();
		
		int i = 5;
		int j = 10;
		System.out.println(~i+~j);
	}
}
