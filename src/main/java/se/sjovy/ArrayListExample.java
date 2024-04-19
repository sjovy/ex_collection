package se.sjovy;

import java.util.*;

public class ArrayListExample {
    // create new main method
    public static void main(String[] args) {
        //create an array list of strings
        ArrayList<String> list = new ArrayList<String>();
        // List<String> list2 = new ArrayList<>();

        //add elements to the list
        list.add("Green");
        list.add("Blue");
        list.add("Red");
        list.add("Yellow");
        //print the list
        System.out.println(list);

        //iterate through the list
        for (String color : list) {
            System.out.println(color);
        }

        //insert black at first position in list
        list.add(0, "Black");
        //print the list

        //update the value at index 1 with white
        list.set(1, "White");
        //print the list

        //remove the third element
        list.remove(2);
        //print the list

        //search for Red in the list, print it if it is found
        if (list.contains("Red")) {
            System.out.println("Red is in the list");
        } else {
            System.out.println("Red is not in the list");
        }

        //sort the list alphabetically
        Collections.sort(list);
        System.out.println(list);

        //reverse the list
        Collections.reverse(list);
        System.out.println(list);

        // copy the list into a new list
        ArrayList<String> list2 = new ArrayList<String>(list);
        System.out.println(list2);

        //shuffle the list randomly
        Collections.shuffle(list);
        System.out.println(list);

        //extract a sublist from the list
        List<String> sublist = list.subList(0, 2);
        System.out.println(sublist);

        //compare the two lists
        if (list.equals(list2)) {
            System.out.println("The lists are equal");
        } else {
            System.out.println("The lists are not equal");
        }

        //join list and list2
        list.addAll(list2);
        System.out.println(list);

        //clone list2 into list3
        ArrayList<String> list3 = (ArrayList<String>) list2.clone();
        System.out.println(list3);

        //empty list2
        list2.clear();
        System.out.println(list2);

        //check if list2 is empty
        if (list2.isEmpty()) {
            System.out.println("List2 is empty");
        } else {
            System.out.println("List2 is not empty");
        }

        //check if list3 is empty
        if (list3.isEmpty()) {
            System.out.println("List3 is empty");
        } else {
            System.out.println("List3 is not empty");
        }

        //make list to size 10
        list.ensureCapacity(10);
        System.out.println(list.size());

        //trim the capacity of list1
        list3.trimToSize();
        System.out.println(list.size());

        //replace position 1 with position 4
        list.set(1, list.get(4));
        System.out.println(list);

        //print all the elements of list3 using the elements' position, step backwards.
        for (int i = list3.size() - 1; i >= 0; i--) {
            System.out.println(list3.get(i));
        }
    }
}

class LinkedListExample{

    // create new main method, empty
    public static void main(String[] args) {
        // create a linked list of strings
        LinkedList<String> list = new LinkedList<String>();
        //Fill it with colors, red, blue, green, yellow, black, purple
        list.add("Red");
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");
        list.add("Purple");
        //print the list
        System.out.println(list);

        //append white to the end of the list
        list.addLast("White");

        //iterate through the list and print, starting at 3rd element
        for (int i = 2; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //iterate the list backwards and print
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        //iterate backwards using iterator and print
        ListIterator<String> iterator = ((LinkedList<String>) list).listIterator(list.size());
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        //Insert orange at index 3 and print
        list.add(3, "Orange");
        System.out.println(list);

        //insert pink at first and last position and print
        list.addFirst("Pink");
        list.addLast("Pink");
        System.out.println(list);

        //offer to insert brown in front of first position and print
        list.offerFirst("Brown");
        System.out.println(list);

        //offer to insert grey behind last position and print
        list.offerLast("Grey");
        System.out.println(list);

        //Create linked list with violet and crimson
        LinkedList<String> list2 = new LinkedList<String>();
        list2.add("Violet");
        list2.add("Crimson");
        //insert list2 into list at index 4 and print
        list.addAll(4, list2);
        System.out.println(list);

        //extract the first and last element and print them
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        //print the list
        System.out.println(list);

        //get the first and last element and print them
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        //print the list
        System.out.println(list);

        //display all elements with their positions
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Position " + i + ": " + list.get(i));
        }

        //remove the first and last elements from the list and print the list
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        //make a deep copy of the list, call it listD
        LinkedList<String> listD = (LinkedList<String>) list.clone();

        //remove all elements from listD and print it
        listD.clear();
        System.out.println(listD);
        System.out.println(list);
        // make another deep copy of list, call it listD
        listD = (LinkedList<String>) list.clone();
        //make a shallow copy of listD, call it listS
        LinkedList<String> listS = listD;
        //remove all elements from listS and print it
        listS.clear();
        System.out.println(listS);
        System.out.println(listD);
        System.out.println(list);

        //swap the second and fifth elements in the list and print the list, use swap method
        Collections.swap(list, 1, 4);
        System.out.println(list);

        //shuffle the list randomly and print it
        Collections.shuffle(list);
        System.out.println(list);

        //make a deep copy of the list, call it listD
        listD = (LinkedList<String>) list.clone();

        //join list and listD and print the list
        list.addAll(listD);
        System.out.println(list);

        //remove and return the first element from the list - use pop, then print the list
        System.out.println(list.pop());
        System.out.println(list);

        //check if red is in the list, print the result
        if (list.contains("Red")) {
            System.out.println("Red is in the list");
        } else {
            System.out.println("Red is not in the list");
        }

        //Convert the list to an Array list and print it
        ArrayList<String> listA = new ArrayList<String>(list);
        System.out.println(listA);

        //compare list and listD, print the result
        if (list.equals(listD)) {
            System.out.println("The lists are equal");
        } else {
            System.out.println("The lists are not equal");
        }

        //check if listS is empty, print the result
        if (listS.isEmpty()) {
            System.out.println("ListS is empty");
        } else {
            System.out.println("ListS is not empty");
        }
    }
}
// create a new class call HashSetExample

class HashSetExample {
    // create new main method, empty
    public static void main(String[] args) {
        // create a hash set of strings
        HashSet<String> set = new HashSet<String>();
        //add elements to the set
        set.add("Red");
        set.add("Blue");
        set.add("Green");
        set.add("Yellow");
        //print the set
        System.out.println(set);

        //iterate through the set and print
        for (String color : set) {
            System.out.println(color);
        }

        //iterate using iterator and print
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //Get and print the number of elements in the set
        System.out.println(set.size());

        //empty the set and print
        set.clear();
        System.out.println(set);

        //test if the set is empty, print the result
        if (set.isEmpty()) {
            System.out.println("The set is empty");
        } else {
            System.out.println("The set is not empty");
        }

        //Make a new hash set with the same elements as the first set
        HashSet<String> set2 = new HashSet<String>();
        set2.add("Red");
        set2.add("Blue");
        set2.add("Green");
        set2.add("Yellow");

        //Clone the set and print the clone
        HashSet<String> set3 = (HashSet<String>) set2.clone();
        System.out.println(set3);

        //Convert set2 to an array and print it
        String[] array = set2.toArray(new String[set2.size()]);
        System.out.println(Arrays.toString(array));
        System.out.println(set2);

        //convert set2 to a tree set and print it
        TreeSet<String> treeSet = new TreeSet<String>(set2);
        System.out.println(treeSet);

        //make a tree set, fill it with Integers 1- 10
        TreeSet<Integer> treeSet2 = new TreeSet<Integer>();
        for (int i = 1; i <= 10; i++) {
            treeSet2.add(i);
        }

        //find and print all numbers less than 7 in treeset2
        System.out.println(treeSet2.headSet(7));
        // make them into a new hashset
        HashSet<Integer> set4 = new HashSet<Integer>(treeSet2.headSet(7));

        //make treeset2 into a hashset
        HashSet<Integer> set5 = new HashSet<Integer>(treeSet2);

        //compare set4 and set5, print the result
        if (set4.equals(set5)) {
            System.out.println("The sets are equal");
        } else {
            System.out.println("The sets are not equal");
        }

        //retain the same elements in set4 and set5, and print them
        set4.retainAll(set5);
        System.out.println(set4);

        //remove all elements in set4 from set5, and print set5
        set5.removeAll(set4);
        System.out.println(set5);

    }


}

//new class TreeSetExample, empty main method
class TreeSetExample {
    public static void main(String[] args) {

        //Create an empty tree set
        TreeSet<String> treeSet = new TreeSet<String>();
        //put five colors in it
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Green");
        treeSet.add("Yellow");
        treeSet.add("Black");
        //print the tree set
        System.out.println(treeSet);

        //use iterotor to iterate through the tree set and print
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //use descending iterator to iterate through the tree set and print
        Iterator<String> descendingIterator = treeSet.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }

        //add all elements of the tree set to a new tree set
        TreeSet<String> treeSet2 = new TreeSet<String>();
        treeSet2.addAll(treeSet);
        //print the new tree set
        System.out.println(treeSet2);

        //add all elements of the tree set to a new hash set
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.addAll(treeSet);

        //print the first and last element of the tree set
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());

        //print the element blue in the tree set
        System.out.println(treeSet.ceiling("Blue"));

        //print out the number of elements in the tree set
        System.out.println(treeSet.size());

        //create and fill a new tree set with integers 1-10, from an array
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeSet<Integer> treeSet3 = new TreeSet<Integer>(Arrays.asList(array));

        //Write a Java program to find numbers less than 7 in the tree set.
        System.out.println(treeSet3.headSet(7));
        //get all elemnts less than 7 and GREATER than but not equal to 2 from treeSet3
        System.out.println(treeSet3.subSet(3, 7));

    }

}

//new class HashMapExample
class HashMapExample {
    public static void main(String[] args) {
        //create a new hash map
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        //put some key value pairs in it
        map.put(1, "Red");
        map.put(2, "Blue");
        map.put(3, "Green");
        map.put(4, "Yellow");
        //print the map
        System.out.println(map);

        //get and print the value of key 3
        System.out.println(map.get(3));



    }
}