package com.training.Assignment4;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapComparison 
{
	private static long getMemoryUsage()
	{
		Runtime runtime = Runtime.getRuntime();
		return runtime.totalMemory() - runtime.freeMemory();
	}
	public static void main(String[] args)
	{

		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();

		long startTime,endTime;
		long memoryBefore,memoryAfter;

		//adding Integer comparison

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		for(int i = 0; i < 100000; i++)
		{
			hashMap.put(i, "value"+i);
		}
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("HashMap integer_insertion time: " + (endTime - startTime) + " ns ");
		System.out.println("HashMap memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		for(int i = 0; i < 100000; i++)
		{
			treeMap.put(i, "value"+i);
		}
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("TreeMap integer_insertion time: " + (endTime - startTime) + " ns ");
		System.out.println("TreeMap memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");


		//remove Integer comparison

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		for(int i = 0; i < 100000; i++)
		{
			hashMap.remove(i, "value"+i);
		}
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("HashMap integer_deletion time: " + (endTime - startTime) + " ns ");
		System.out.println("HashMap memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		for(int i = 0; i < 100000; i++)
		{
			treeMap.remove(i, "value"+i);
		}
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("TreeMap integer_deletion time: " + (endTime - startTime) + " ns ");
		System.out.println("TreeMap memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		//get Integer comparison

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		for(int i = 0; i < 100000; i++)
		{
			hashMap.getOrDefault(i, "value"+i);
		}
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("HashMap integer_get time: " + (endTime - startTime) + " ns ");
		System.out.println("HashMap memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");

		startTime = System.nanoTime();
		memoryBefore = getMemoryUsage();

		for(int i = 0; i < 100000; i++)
		{
			treeMap.getOrDefault(i, "value"+i);
		}
		memoryAfter = getMemoryUsage();
		endTime = System.nanoTime();

		System.out.println("==============================");
		System.out.println("TreeMap integer_get time: " + (endTime - startTime) + " ns ");
		System.out.println("TreeMap memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
		System.out.println("==============================");


	}

}
