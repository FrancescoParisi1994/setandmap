package it.prova.mapandset.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestSetAndMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Point> points=new HashSet<>();
		Point p1=new Point(1,2);
		Point p2=new Point(1,2);
		points.add(p1);
		points.add(p2);
		Point p3=new Point(5, 6);
		points.add(p3);
		Point p4=new Point(3, 4);
		points.add(p4);
		for (Point pointItem : points) {
			System.out.println(pointItem.toString());
		}
		System.out.println();
		System.out.println(points.contains(p4));
		System.out.println();
		points.remove(p4);
		System.out.println(points.contains(p4));
		System.out.println();
		//MAP===============
		Map<Integer,String> classifica=new HashMap<>();
		classifica.put(1, "Juve");
		classifica.put(2, "Milan");
		classifica.put(3,"Napoli");
		for (Integer classificaItem : classifica.keySet()) {
			System.out.println(classifica.get(classificaItem));
		}
		System.out.println();
		classifica.remove(1);
		for (Integer classificaItem : classifica.keySet()) {
			System.out.println(classifica.get(classificaItem));
		}
		
	}

}
