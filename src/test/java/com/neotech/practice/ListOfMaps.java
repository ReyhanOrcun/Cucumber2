package com.neotech.practice;

import java.util.*;
import java.util.List;
import java.util.Map;

public class ListOfMaps { public static void main(String[] args) {
	
	List<Map<String, String>>  listOfMaps = new ArrayList<>();
	
	Map<String, String>   murat= new HashMap<>();
	
	murat.put("firstname", "Murat");
	murat.put("lastname", "Bulad");
	
	Map<String, String>   gurkan= new HashMap<>();
	
	gurkan.put("firstname", "Gurkan");
	gurkan.put("lastname", "Tuncer");
	
	
	listOfMaps.add(murat);
	listOfMaps.add(gurkan);
	
	System.out.println(listOfMaps);
	
	
	
	
	
	
	
}

}
