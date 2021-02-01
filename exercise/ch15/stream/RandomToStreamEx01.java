package ch15.stream;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RandomToStreamEx01 {

	public static void main(String[] args) {
		System.out.println("int형 난수 스트림 : ");
		IntStream isr = new Random().ints(3);
		isr.forEach(s -> System.out.println(s));
		System.out.println("=====================");
		isr = new Random().ints(10, 0, 3);
		isr.forEach(s -> System.out.println(s));
		
		System.out.println("\nlong형 난수 스트림 : ");
		LongStream lsr = new Random().longs(3, 0, 10);
		lsr.forEach(s -> System.out.println(s));
		
		System.out.println("\ndouble형 난수 스트림 : ");
		DoubleStream dsr = new Random().doubles(3, 0, 10);
		dsr.forEach(s -> System.out.println(s));
		System.out.println();
		
		IntStream csr = "Stream을 배우자".chars();
		csr.forEach(s -> System.out.print((char)s + "[" + (int)s + "] "));
	}

}
