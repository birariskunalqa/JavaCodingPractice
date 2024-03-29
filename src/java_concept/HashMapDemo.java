package java_concept;

import java.util.HashMap;

/*
HashMap - a class implemented Map interface
--------------
1. Data can be stored in the form of key, value pairs.
2. Key is unique. But we can have duplicate values.
3. Insertion order not preserved(Index not followed)
*/
public class HashMapDemo {

    public static void main(String[] args) {


        //HashMap hm=new HashMap();
        //Map hm=new HashMap();

        HashMap<Integer, String> hm = new HashMap<>();

        //adding data pairs to hashmap

        hm.put(101, "John");
        hm.put(102, "Scott");
        hm.put(103, "John");
        hm.put(104, "Mary");
        hm.put(101, "David");  //here 101 is duplicate key so latest value stored for Key-101

        System.out.println(hm); //  {101=David, 102=Scott, 103=John, 104=Mary}

        System.out.println(hm.size()); //4

        //remove pair
        hm.remove(103);   // 103 is key

        System.out.println("After removing pair:" + hm); //{101=David, 102=Scott, 104=Mary}

        System.out.println(hm.get(102));   // here 102 is key scott


        //print only keys from hashmap
        System.out.println(hm.keySet());  //[101, 102, 104]


        //print values from hashmap

        for (Object k : hm.keySet()) {
            System.out.println(k + "  " + hm.get(k));
        }

        hm.clear();

        System.out.println(hm);   //{}
    }
}
