package com.training.Assignment4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetComparison 
{
	private static long getMemoryUsage()
	{
		Runtime runtime = Runtime.getRuntime();
		return runtime.totalMemory() - runtime.freeMemory();
	}
	public static void main(String[] args) {

		Set<Integer> hashSet = new HashSet<Integer>();
		Set<Integer> treeSet = new TreeSet<Integer>();

		Set<String> hashSet1 = new HashSet<String>();
		Set<String> treeSet1= new TreeSet<String>();

		long startTime,endTime;
		long memoryBefore,memoryAfter;

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		//adding Integer comparison

		for(int i = 0; i < 100000; i++)
		{
			hashSet.add(i);
		}
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("HashSet integer_insertion time: " + (endTime - startTime) + " ns ");
		System.out.println("HashSet memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		for(int i = 0; i < 100000; i++)
		{
			treeSet.add(i);
		}
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("TreeSet integeer_insertion time: " + (endTime - startTime) + " ns ");
		System.out.println("TreeSet memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");


		//remove Integer comparison

		hashSet.remove(2000);

		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("HashSet integer_deletion time: " + (endTime - startTime) + " ns ");
		System.out.println("HashSet memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		treeSet.remove(1000);

		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("TreeSet integer_deletion time: " + (endTime - startTime) + " ns ");
		System.out.println("TreeSet memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");
		

		//adding Strings comparison

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		hashSet1.add("Swapna");

		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("HashSet string_insertion time: " + (endTime - startTime) + " ns ");
		System.out.println("HashSet memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		treeSet1.add("Swapna");

		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("TreeSet string_instertion time: " + (endTime - startTime) + " ns ");
		System.out.println("TreeSet memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		//remove Strings comparison

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		hashSet1.remove("Swapna");

		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("HashSet string_insertion time: " + (endTime - startTime) + " ns ");
		System.out.println("HashSet memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		treeSet1.remove("Swapna");

		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("TreeSet string_instertion time: " + (endTime - startTime) + " ns ");
		System.out.println("TreeSet memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");
	}
}