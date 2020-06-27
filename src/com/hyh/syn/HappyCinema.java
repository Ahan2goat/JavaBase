package com.hyh.syn;

import java.util.ArrayList;
import java.util.List;

public class HappyCinema {
	public static void main(String[] args) {
		//影院可用的位置
		List<Integer> available = new ArrayList<Integer>();
		available.add(1);
		available.add(2);
		available.add(3);
		available.add(4);
		available.add(5);
		available.add(6);
		//顾客定的位置
		List<Integer> seats1 = new ArrayList<Integer>();
		seats1.add(1);
		List<Integer> seats2 = new ArrayList<Integer>();
		seats2.add(6);
		seats2.add(5);
		
		MyCinema cinema = new MyCinema(available, "happy");
		new Thread(new HappyCustomer(cinema, seats1),"张三").start();
		new Thread(new HappyCustomer(cinema, seats2),"李四").start();
	}
	
}
class HappyCustomer implements Runnable{
	MyCinema cinema;
	List<Integer> seats;
	public HappyCustomer(MyCinema cinema, List<Integer> seats) {
		super();
		this.cinema = cinema;
		this.seats = seats;
	}
	@Override
	public void run() {
		synchronized (cinema) {
			boolean flag = cinema.bookTickets(seats);
			if(flag) {
				System.out.println("success!"+Thread.currentThread().getName()+"and seats is" +seats);
			}else {
				System.out.println("fail..."+Thread.currentThread().getName()+"the seats is not enough");
			}
		}
	}
	
}
class MyCinema{
	List<Integer> available;//可用的位置
	String name;
	public MyCinema(List<Integer> available, String name) {
		this.available = available;
		this.name = name;
	}
	//购票
	public boolean bookTickets(List<Integer> seats) {
		System.out.println("welcome to "+ this.name+"have seats :"+available);
		List<Integer> copy = new ArrayList<Integer>();
		copy.addAll(available);
		//相减
		copy.removeAll(seats);
		//判断大小
		if(available.size()-copy.size()!=seats.size()) {
			return false;
		}
		//成功
		available = copy;
		return true;
	}
}