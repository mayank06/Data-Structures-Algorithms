package com.mayank.practice;

import java.util.HashSet;
import java.util.Set;

public class TestSingleton {

	private static final TestSingleton INSTANCE = new TestSingleton();
	
	private Set<String> availableSeats;
	
	public static TestSingleton getInstance() {
		return INSTANCE;
	}
	
	public TestSingleton() {
		availableSeats = new HashSet<String>();
		availableSeats.add("1A");
		availableSeats.add("1B");
	}
	
	public boolean bookSeat(String seat) {
		return availableSeats.remove(seat);
	}
	
	public static void main(String[] args) {

		ticketBooking("1A");
		ticketBooking("1A");
	}

	public static void ticketBooking(String seat) {
		TestSingleton test = TestSingleton.getInstance();
		System.out.println(test.bookSeat(seat));
	}
}
