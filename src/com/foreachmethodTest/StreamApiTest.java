package com.foreachmethodTest;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiTest {

	public static void main(String[] args) {
		List<Integer> l1= new ArrayList();
		for (int i = 0; i <100; i++) {
			l1.add(i);
		}
  Stream<Integer> mystream=l1.stream().filter(xyz ->xyz%2==0).filter(xyz->xyz>=90);
        mystream.forEach(abc-> System.out.println(abc));
	}

   
	}