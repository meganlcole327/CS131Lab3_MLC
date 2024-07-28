package main;

import arraylist.*;
import java.util.ArrayList;

public class ListApp {

	public static void main(String[] args) {
		
		//List of Strings
		
		ArrayList<String> stringList = new ArrayList<>();
		stringList.add("Tigers");
		stringList.add("Lions");
		stringList.add("Leapords");
		
		System.out.println("String List: " + stringList.toString());
		
		//List of Squares
		ArrayList<Square> squareList = new ArrayList<>();
		squareList.add(new Square(8.8));
		squareList.add(new Square(6.8));
		squareList.add(new Square(4.2));
		
		System.out.println("Square List: " + squareList.toString());
		
		//List of PointThreeD
		ArrayList<PointThreeD> point3dList = new ArrayList<>();
		point3dList.add(new PointThreeD(1.0, 8.0, 6.0));
		point3dList.add(new PointThreeD(2.0, 4.0, 5.0));
		point3dList.add(new PointThreeD(3.0, 7.0, 9.0));
		
		System.out.println("Square List: " + point3dList.toString());
		

	} //end main

} //end class
