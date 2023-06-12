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
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();

		List<String> arrayList1 = new ArrayList<String>();
		List<String> linkedList1 = new LinkedList<String>();

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

		for(int i = 0; i < 102000; i++)
		{
			arrayList.remove(i);
		}
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("ArrayList integer_deletion time: " + (endTime - startTime) + " ns ");
		System.out.println("ArrayList memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		for(int i = 0; i < 102000; i++)
		{
			linkedList.remove(i);
		}
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("LinkedList integer_deletion time: " + (endTime - startTime) + " ns ");
		System.out.println("LinkedList memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		
		//get Integer comparison

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		for(int i = 0; i < 101000; i++)
		{
			arrayList.get(i);
		}
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("ArrayList integer_get time: " + (endTime - startTime) + " ns ");
		System.out.println("ArrayList memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		for(int i = 0; i < 101000; i++)
		{
			linkedList.get(i);
		}
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("LinkedList integer_get time: " + (endTime - startTime) + " ns ");
		System.out.println("LinkedList memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");



		//adding Strings comparison

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		arrayList1.add("Swapna");

		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("ArrayList string_insertion time: " + (endTime - startTime) + " ns ");
		System.out.println("ArrayList memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		linkedList1.add("Swapna");

		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("LinkedList string_instertion time: " + (endTime - startTime) + " ns ");
		System.out.println("LinkedList memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");


		//remove strings comparison

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		arrayList1.remove("Swapna");

		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("ArrayList string_deletion time: " + (endTime - startTime) + " ns ");
		System.out.println("ArrayList memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		linkedList1.remove("Swapna");

		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("LinkedList string_deletion time: " + (endTime - startTime) + " ns ");
		System.out.println("LinkedList memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");
	}
}
