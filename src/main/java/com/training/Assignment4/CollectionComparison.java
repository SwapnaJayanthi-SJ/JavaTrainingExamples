package com.training.Assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionComparison 
{
private static long getMemoryUsage()
{
	Runtime runtime = Runtime.getRuntime();
	return runtime.totalMemory() - runtime.freeMemory();
}
public static void main(String[] args) {
	List<Integer> arrayList = new ArrayList<Integer>();
	List<Integer> linkedList = new LinkedList<Integer>();
	
	
	Set<Integer> hashSet = new HashSet<Integer>();
	Set<Integer> treeSet = new TreeSet<Integer>();
	
	Map<Integer, String> hashMap = new HashMap<Integer, String>();
	Map<Integer, String> treeMap = new TreeMap<Integer, String>();
	
	long startTime,endTime;
	long memoryBefore,memoryAfter;
	
	//Arraylist and Linkedlist
	
	startTime = System.nanoTime();
	memoryBefore = getMemoryUsage();
		
	for(int i = 0; i < 100000; i++)
	{
		arrayList.add(i);
	}
	memoryAfter = getMemoryUsage();
	endTime = System.nanoTime();
	
	System.out.println("==============================");
	System.out.println("ArrayList insertion time: " + (endTime - startTime) + " ns ");
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
	System.out.println("LinkedList insertion time: " + (endTime - startTime) + " ns ");
	System.out.println("LinkedList memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
	System.out.println("==============================");
	
	
	//HashSet and TreeSet
	
	startTime = System.nanoTime();
	memoryBefore = getMemoryUsage();
		
	for(int i = 0; i < 100000; i++)
	{
		hashSet.add(i);
	}
	memoryAfter = getMemoryUsage();
	endTime = System.nanoTime();
	
	System.out.println("==============================");
	System.out.println("HashSet insertion time: " + (endTime - startTime) + " ns ");
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
	System.out.println("TreeSet insertion time: " + (endTime - startTime) + " ns ");
	System.out.println("TreeSet memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
	System.out.println("==============================");
	
	//HashMap and TreeMap
	
	startTime = System.nanoTime();
	memoryBefore = getMemoryUsage();
		
	for(int i = 0; i < 100000; i++)
	{
		hashMap.put(i, "value"+i);
	}
	memoryAfter = getMemoryUsage();
	endTime = System.nanoTime();
	
	System.out.println("==============================");
	System.out.println("HashMap insertion time: " + (endTime - startTime) + " ns ");
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
	System.out.println("TreeMap insertion time: " + (endTime - startTime) + " ns ");
	System.out.println("TreeMap memory usage: " + (memoryAfter - memoryBefore) + " bytes ");
	System.out.println("==============================");
}
}
