package com.shiftedtech.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;


public class DataStructures {

	public static void main(String[] args) {
		//arrayTest();
		//arrayListTest();
		//linkedListExample();
		//queueTest();
		//stackExample();
		
		//hashTableTest();
		//hashMapTest();
		//treeMap();
		//hashSet();
		hashSetEx();
		
		Student student1  = new Student(1,"Iftekhar","5162839999","Iftekhar@yahoo.com");
		Student student2  = new Student(1,"Ivaan","5162839999","Iftekhar@yahoo.com");
		
		if(student1.equals(student2)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		
	}
	
	public static void hashSetEx() {
		Set<Student> students = new TreeSet<>();
		students.add(new Student(1,"Iftekhar","5162839999","Iftekhar@yahoo.com"));
		students.add(new Student(3,"Ivaan","5162335999","Ivaan@yahoo.com"));
		students.add(new Student(2,"Shehla","5162337999","Shehla@yahoo.com"));
		
		System.out.println(students);
		
		
	}
	
	public static void hashSet() {
		//Set<String> daysOfWeek = new HashSet<>();
		//Set<String> daysOfWeek = new LinkedHashSet<String>();
		//Set<String> daysOfWeek = new TreeSet<String>();
		SortedSet<String> daysOfWeek = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
		//LinkedHashSet<String> daysOfWeek = new LinkedHashSet<String>(); 
		
		    // Adding new elements to the HashSet
	        daysOfWeek.add("Monday");
	        daysOfWeek.add("Tuesday");
	        daysOfWeek.add("Wednesday");
	        daysOfWeek.add("Thursday");
	        daysOfWeek.add("friday");
	        daysOfWeek.add("Saturday");
	        daysOfWeek.add("Sunday");

	        // Adding duplicate elements will be ignored
	        daysOfWeek.add("Monday");
	        
	        

	        System.out.println(daysOfWeek);
	        if(daysOfWeek.contains("Monday")) {
	        	System.out.println("It contains Monday");
	        }
	        for(String day: daysOfWeek) {
	            System.out.println(day);
	        }
	        
	        //Object[] elements = new Object[daysOfWeek.size()];
	       // elements =  daysOfWeek.toArray();
	        
	        String[] elements = new String[daysOfWeek.size()];
	        elements =  daysOfWeek.toArray(elements);
	        
	        System.out.println("5th element: " + elements);
	        
	        
	        List<Integer> numbersDivisibleBy5 = new ArrayList<>();
	        numbersDivisibleBy5.add(5);
	        numbersDivisibleBy5.add(10);
	        numbersDivisibleBy5.add(15);
	        numbersDivisibleBy5.add(20);
	        numbersDivisibleBy5.add(25);

	        List<Integer> numbersDivisibleBy3 = new ArrayList<>();
	        numbersDivisibleBy3.add(3);
	        numbersDivisibleBy3.add(6);
	        numbersDivisibleBy3.add(9);
	        numbersDivisibleBy3.add(12);
	        numbersDivisibleBy3.add(15);

	        // Creating a HashSet from another collection (ArrayList)
	        //Set<Integer> numbersDivisibleBy5Or3 = new HashSet<>(numbersDivisibleBy5);
	        Set<Integer> numbersDivisibleBy5Or3 = new HashSet<>();
	        numbersDivisibleBy5Or3.addAll(numbersDivisibleBy5);
	        
	        // Adding all the elements from an existing collection to a HashSet
	        numbersDivisibleBy5Or3.addAll(numbersDivisibleBy3);

	        System.out.println(numbersDivisibleBy5Or3);
	}
	public static void treeMap() {
		
		/*
		TreeMap<String, Integer> tMap = new TreeMap<>();
		//HashMap<String, Integer> tMap = new HashMap<>();
		tMap.put("Ameera", 3);
		tMap.put("Iftekhar", 1);
		tMap.put("Shehla", 2);
		tMap.put("Simrohn", 4);
		
		
		Set<String> keys = tMap.keySet();
		for(String key : keys) {
			System.out.println("Key: " + key + " Value: " + tMap.get(key));
		}
		
		*/
		//TreeMap<String, Integer> names = new TreeMap<>();
		
		//MyComparator comparator = new MyComparator();
		//TreeMap<String, Integer> names = new TreeMap<>(comparator);
		
		
		TreeMap<String, Integer> names = new TreeMap<>(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.compareToIgnoreCase(s1);
			}
		});
		

		names.put("Ameera", 3);
		names.put("Iftekhar", 1);
		names.put("shehla", 2);
		names.put("Simrohn", 4);
		
		Set<String> keys2 = names.keySet();
		for(String key : keys2) {
			System.out.println("Key: " + key + " Value: " + names.get(key));
		}
		
		
	}
	
	public static void hashMapTest() {
		
		Student student1 = new Student(1,"Iftekhar","5162339999","iivaan@yahoo.com");
		Student student2 = new Student(2,"Ivaan","5162339999","iivaan@yahoo.com");
		Student student3 = new Student(3,"Shehla","5162339999","iivaan@yahoo.com");
		
		HashMap<Integer, Student> hashMap = new HashMap<>();
		hashMap.put(student1.getId(), student1);
		hashMap.put(student2.getId(), student2);
		hashMap.put(student3.getId(), student3);
		hashMap.put(null, student3);
		
		Student student = hashMap.get(2);
		System.out.println(student);
		
		
	}
	
	public static void hashTableTest() {
		Hashtable<Integer, String> ht = new Hashtable<>();
		
		ht.put(1, "Iftekhar");
		ht.put(4, "Simrohn");
		ht.put(3, "Ameera");
		ht.put(2, "Shehla");
		ht.put(5, "Shehla");
		//ht.put(null, "Mir");
		
		
		String item = ht.get(3);
		System.out.println(item);
		
		if(ht.containsKey(3)) {
			ht.remove(3);
		}
		System.out.println(ht);
		
		ht.put(1, "Ivaan");
		
		System.out.println(ht);
		
		Set<Integer> keys =  ht.keySet();
		for(Integer key : keys) {
			System.out.println(ht.get(key));
		}
		
		Enumeration<Integer>  enumeration = ht.keys();
		while (enumeration.hasMoreElements()) {
			Integer i = enumeration.nextElement();
			System.out.println(ht.get(i));
		}
		
		Set<Entry<Integer, String>> names = ht.entrySet();
		for(Entry<Integer, String> name : names) {
			System.out.println("Key: " + name.getKey());
			System.out.println("Value: " + name.getValue());
		}
		
		
		
		
	}
	
	public static void stackExample() {
		// Creating a Stack
        Stack<String> stackOfCards = new Stack<>();
        
        // Pushing new items to the Stack
        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        System.out.println("Stack => " + stackOfCards);
        System.out.println();
          
       // Popping items from the Stack
        String cardAtTop = stackOfCards.pop();  // Throws EmptyStackException if the stack is empty
        System.out.println("Stack.pop() => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);
        System.out.println();
        
        // Get the item at the top of the stack without removing it
        cardAtTop = stackOfCards.peek();
        System.out.println("Stack.peek() => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);
        
        // Search for an element
        // The search() method returns the 1-based position of the element from the top of the stack
        // It returns -1 if the element was not found in the stack
        int position = stackOfCards.search("Queen");
        System.out.println("Position: " + position);
        
        System.out.println("\n=== Iterate over a Stack using iterator() ===");
        Iterator<String> platesIterator = stackOfCards.iterator();
    
        while (platesIterator.hasNext()) { 
        	String plate = platesIterator.next();
        	System.out.println(plate);
        }
        
        System.out.println("Current Stack => " + stackOfCards);
        
        
        
        System.out.println("=== Iterate over a Stack using Java 8 forEach() method ===");
        stackOfCards.forEach(plate -> {
            System.out.println(plate);
        });
        
        for(String item : stackOfCards) {
        	System.out.println(item);
        }
        stackOfCards.clear();
        System.out.println("Current Stack => " + stackOfCards);
	}
	
	public static void queueTest() {
		// Create and initialize a Queue using a LinkedList
        Queue<String> peopleQueue = new LinkedList<>();

        // Adding new elements to the Queue (The Enqueue operation)
        peopleQueue.add("Iftekhar");
        peopleQueue.add("Ameera");
        peopleQueue.add("Simrohn");
        peopleQueue.add("Shehla");
        peopleQueue.add("Steven");
        
        System.out.println("WaitingQueue : " + peopleQueue);
        
        // Removing an element from the Queue using remove() (The Dequeue operation)
        // The remove() method throws NoSuchElementException if the Queue is empty
        String name = peopleQueue.remove();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + peopleQueue);

        name = peopleQueue.poll();
        System.out.println("Removed from WaitingQueue : " + name + " | New WaitingQueue : " + peopleQueue);

        // Removing an element from the Queue using poll()
        // The poll() method is similar to remove() except that it returns null if the Queue is empty.
        name = peopleQueue.peek();
        System.out.println("Peek from WaitingQueue : " + name + " | New WaitingQueue : " + peopleQueue);

        peopleQueue.remove("Shehla");
        System.out.println("WaitingQueue : " + peopleQueue);
        
        Iterator<String> iterator =  peopleQueue.iterator();
        while (iterator.hasNext()) {
			String item = iterator.next();
			System.out.println(item);
		}
        
        System.out.println("WaitingQueue : " + peopleQueue);
        
        System.out.println("\n=== Iterating over a Queue using simple for-each loop ===");
        for(String name2: peopleQueue) {
            System.out.println(name2);
        }
     
        System.out.println("=== Iterating over a Queue using Java 8 forEach() ===");
        peopleQueue.forEach(name3 -> {
            System.out.println(name3);
        });
	}
	
	

	private static void arrayListTest() {
		System.out.println("******* ArrayList Test *****");
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Iftekhar");
		list.add("Shehla");
		list.add("Ameera");
		list.add("Simrohn");
		//list.add(4);
	
		System.out.println(list.get(3));
		
		list.add(4, "Fahad");
		//list.add(4, "Islam");
		
		list.set(4, "Islam");
		System.out.println(list.get(4));
		
		System.out.println("Size: " + list.size());
		
		list.remove(4);
		
		System.out.println("Size: " + list.size());
		
		System.out.println("*** With for loop");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("*** With for each");
		for(String xObject : list) {
			System.out.println(xObject);
		}
		
		System.out.println("*** With iterator");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		list.clear();
		System.out.println("Is Empty: " + list.isEmpty());
		
		
		System.out.println("Array to ArrayList");
		String[] names = {"Iftekhar","Shehla","Ameera","Simrohn"};
		ArrayList<String> nameList = new ArrayList<>();
		nameList = (ArrayList<String>) Arrays.asList(names);
		
		
		System.out.println("ArrayList to Array");
		String[] newNames  = new String[nameList.size()];
		newNames = nameList.toArray(newNames);
		
		
	}

	public static void arrayTest() {
		
		System.out.println("******* Array Data Structure *******");
		String[] names = new String[4];
		
		//How to add the data
		names[0] = "Iftekhar";
		names[1] = "Shehla";
		names[2] = "Ameera";
		names[3] = "Simrohn";
		//names[3] = 49;
		
		//How to get the data back
		System.out.println(names[2]);
		
		//How many
		int count = names.length;
		
		//iterate over data
		System.out.println("*** For loop");
		for(int x = 0; x < count; x++)  {
			System.out.println(names[x]);
		} 
		
		for(int x = 0; x < count; x++){
			System.out.println(names[x]);
		}
		
		System.out.println("*** For each loop");
		for(String name : names) {
			System.out.println(name);
		}
		
		//Clean all data
		//names = new String[4];
		
		String[] names2 = new String[5];
		for(int i = 0; i < names.length; i++) {
			names2[i] = names[i];
		}
		
		//String[] names2 = Arrays.copyOf(names, 5);
		
		
		names2[4] = "Fahad";
		System.out.println("*** For each loop");
		for(String name : names2) {
			System.out.println(name);
		}
	
		names = Arrays.copyOf(names, 5);
		
		//How to remove it
		names2[4] = null;
		
		System.out.println(Arrays.toString(names2));
		System.out.println(Arrays.deepToString(names2));
	}

	public static void linkedListExample(){
		//https://www.callicoder.com/java-linkedlist/
		
		// Creating a LinkedList
		LinkedList<String> friends = new LinkedList<>();
       // List<String> friends = new LinkedList<>();
        //List<String> friends = new ArrayList<>();

        // Adding new elements to the end of the LinkedList using add() method.
        friends.add("Rajeev");
        friends.add("John");
        friends.add("David");
        friends.add("Chris");
        friends.add("Steve");

        System.out.println("Initial LinkedList : " + friends);
        
        // Adding an element at the specified position in the LinkedList
        friends.add(3, "Lisa");
        System.out.println("After add(3, \"Lisa\") : " + friends);
        
        // Adding an element at the beginning of the LinkedList
        friends.addFirst("Steve");
        System.out.println("After addFirst(\"Steve\") : " + friends);
        
        // Adding an element at the end of the LinkedList (This method is equivalent to the add() method)
        friends.addLast("Jennifer");
        System.out.println("After addLast(\"Jennifer\") : " + friends);

     // Adding all the elements from an existing collection to the end of the LinkedList
        List<String> familyFriends = new ArrayList<>();
        familyFriends.add("Jesse");
        familyFriends.add("Walt");

        friends.addAll(familyFriends);
        System.out.println("After addAll(familyFriends) : " + friends);
        
        System.out.println("Get first: " + friends.getFirst());
        System.out.println("Get last: " + friends.getLast());
        System.out.println("Get 2: " + friends.get(2));
        
        friends.remove(2);
        System.out.println("After remove : " + friends);
        
        // Remove all the elements that satisfy the given predicate
        friends.removeIf(friend -> friend.startsWith("S") || friend.startsWith("J"));
        System.out.println("Removed elements starting with S => " + friends);

        for(int i = 0; i < friends.size(); i++) {
        	System.out.println("Item[" + i + "]: " + friends.get(i));
        }
        
        for(String item : friends) {
        	System.out.println(item);
        }
        
        friends.forEach(name -> {System.out.println(name);});
        
        System.out.println("Frinds: " + friends);
        System.out.println(friends.peek());
        System.out.println(friends.peekFirst());
        System.out.println(friends.peekLast());
        System.out.println("Frinds: " + friends);
        friends.poll();
        System.out.println("Frinds: " + friends);
        
    
	}
}
