package com.ibm.developerworks;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class DataMatica implements Comparable{

	
	static List<PointPojo>l1= new ArrayList<>();
	public static Map hm= new HashMap<>();
	
	
	public static List<PointPojo> obj(){
		
		PointPojo p1= new PointPojo(1,0.0,0.0);
		PointPojo p2= new PointPojo(2,10.1,-10.1);
		PointPojo p3= new PointPojo(3,12.2,-12.2);
		PointPojo p4= new PointPojo(4,38.3,38.3);
		PointPojo p5= new PointPojo(5,79.99,179.99);
		
		
		
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		l1.add(p4);
		l1.add(p5);
		
		
		return l1;
		
	}
	
	
	
	public static Map sortV(List<PointPojo>l3, PointPojo p){
		
		
		
		double temp=0;
		for(PointPojo list:l3){
			
			
			temp= Math.sqrt(Math.pow((list.getX1()-p.getX1()), 2)+Math.pow(list.getY1()-p.getY1(), 2));
			//System.out.println(temp);
			
			if(temp!=0.0)
			hm.put( l3.get(l3.indexOf(list)), temp);	
			
		}
		return hm;
		//return hm; add retun statemnt to get map object and type as map in method signature
		}
	
	private static  Map sortByValue(Map m) {
	    List<Entry> list2 = new LinkedList<>(m.entrySet());
	    Collections.sort(list2, new Comparator<Object>() {
	        
	        public int compare(Object o1, Object o2) {
	            return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());
	        }
	    });

	    Map result = new LinkedHashMap<>();
	    for (Iterator<Entry> it = list2.iterator();
	    		it.hasNext();)
	    {
	        Map.Entry entry = (Map.Entry) it.next();
	        result.put(entry.getKey(), entry.getValue());
	    }

	    return result;
	}
		
	
	public  void printOutput(PointPojo p){
		
		
List<PointPojo> l4 =obj();
		
		
		Map mp= new HashMap();
			
			mp=sortV(l4, p); // return map object to iterate all elements and assign it to sortbyvaluemaethod to sort the map
		
		
	Map mst=	sortByValue(mp);
	//System.out.println(Arrays.asList(mst));
	
	Iterator iterator = mst.entrySet().iterator();
	while (iterator.hasNext()) {
		Map.Entry entry = (Map.Entry) iterator.next();
		System.out.println(entry.getKey() );
	
	}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		PointPojo px5= new PointPojo(5,79.99,179.99);
	
		System.out.println("the route is"+px5.toString());
		
	DataMatica dt= new DataMatica();
		
		dt.printOutput(px5);
	
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
