package io.github.andreyvasylyuk.Chapter3;

import static java.lang.Math.*;

public class TestEsamples2 {

	public static void main(String[] args) {
		System.out.println("The square root of \u03C0"
				+ " is " + sqrt(PI));

		
		double x = 9.997;
		
		int nx = (int) x;	//9 - discards the fractional part

		int ny = (int) Math.round(x);	// 10 - round to the nearest int
		
		byte y = (byte) 300;	// 44 - goes 127, then from -128 -> 44
	}

}
