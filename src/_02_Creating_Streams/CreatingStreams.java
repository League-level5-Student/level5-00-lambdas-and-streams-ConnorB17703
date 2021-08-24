package _02_Creating_Streams;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;
import java.util.stream.Stream;

public class CreatingStreams {
	public static void main(String[] args) {
		//1. Create a stream out of the following collections.
		String[] strArr = {"one", "two", "three", "four"};
		Stream<String> stream = Arrays.stream(strArr);
		stream.forEach(str -> System.out.println(str));
		strArr[0] = "adfajd";
		stream.forEach(str -> System.out.println(str));
		
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		Stream<Integer> str = intList.stream();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		
		
		Stack<Random> randStack = new Stack<Random>();
		Stream<Random> s = randStack.stream();
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.push(new Random());
		randStack.push(new Random());
		
		
		ArrayDeque<Double> dQueue = new ArrayDeque<Double>();
		Stream<Double> ss = dQueue.stream();
		dQueue.push(0.0);
		dQueue.push(1.0);
		dQueue.push(2.0);
		dQueue.push(3.0);
	}
}
