package com.training.Assignment4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison 
{
	private static long getMemoryUsage()
	{
		Runtime runtime = Runtime.getRuntime();
		return runtime.totalMemory() - runtime.freeMemory();
	}
	public static void main(String[] args) 
	{
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();

		long startTime,endTime;
		long memoryBefore,memoryAfter;

		//adding Integer comparison

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		for(int i = 0; i < 100000; i++)
		{
			arrayList.add(i);
		}
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("ArrayList integer_insertion time: " + (endTime - startTime) + " ns ");
		System.out.println("ArrayList memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		for(int i = 0; i < 100000; i++)
		{
			linkedList.add(i);
		}
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("LinkedList integer_insertion time: " + (endTime - startTime) + " ns ");
		System.out.println("LinkedList memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");


		//remove integer comparison

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();


		arrayList.remove(5000);

		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("ArrayList integer_deletion time: " + (endTime - startTime) + " ns ");
		System.out.println("ArrayList memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();


		linkedList.remove(6000);

		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("LinkedList integer_deletion time: " + (endTime - startTime) + " ns ");
		System.out.println("LinkedList memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");


		//get Integer comparison

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();


		arrayList.get(9000);

		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("ArrayList integer_get time: " + (endTime - startTime) + " ns ");
		System.out.println("ArrayList memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();


		linkedList.get(588);

		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("LinkedList integer_get time: " + (endTime - startTime) + " ns ");
		System.out.println("LinkedList memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");


		List<Double> arrayList1 = new ArrayList<Double>();
		List<Double> linkedList1 = new LinkedList<Double>();

		startTime = System.nanoTime();
		arrayList1.add(20000.00);
		endTime = System.nanoTime();
		System.out.println("ArrayList double: " + (endTime - startTime) + " ns ");
		
		linkedList1.add(10000.00);
		System.out.println("Linkedlist double: " + (endTime - startTime) + " ns ");


	}
}
