package com.kaushaltop;

import java.util.ArrayList;

public class Quick {

    private static ArrayList<Integer> myListInt = new ArrayList<Integer>();
    private static ArrayList<Double> myListDouble = new ArrayList<Double>();
    private static ArrayList<String> myListString = new ArrayList<String>();

    public static void printAllInts(ArrayList<Integer> myListInt) {

        for (int i = 0; i< myListInt.size(); i++) {

            System.out.println(myListInt.get(i));
        }
    }

    public static void printSpecificInt(ArrayList<Integer> myListInt, int position) {

        System.out.println(myListInt.get(position));
    }

    public static void addIntEle(ArrayList<Integer> myListInt, int element) {

        myListInt.add(element);
    }

    public static void pushIntAt(ArrayList<Integer> myListInt, int position, int element) {

        myListInt.add(position, element);
    }

    public static void pushIntAtEnd(ArrayList<Integer> myListInt, int element) {

        myListInt.add(myListInt.size(), element);
    }

    public static void pushIntAtStart(ArrayList<Integer> myListInt, int element) {

        myListInt.add(0, element);
    }

    public static void popIntAt(ArrayList<Integer> myListInt, int position) {

        myListInt.remove(position);
    }

    public static void popIntAtStart(ArrayList<Integer> myListInt) {

        myListInt.remove(0);
    }

    public static void popIntAtEnd(ArrayList<Integer> myListInt) {

        myListInt.remove(myListInt.size()-1);
    }

    public static void printAllDoubles(ArrayList<Double> myListDouble) {

        for (int i = 0; i< myListDouble.size(); i++) {

            System.out.println(myListDouble.get(i));
        }
    }

    public static void printSpecificDouble(ArrayList<Double> myListDouble, int position) {

        System.out.println(myListDouble.get(position));
    }

    public static void addDoubleEle(ArrayList<Double> myListDouble, double element) {

        myListDouble.add(element);
    }

    public static void pushDoubleAt(ArrayList<Double> myListDouble, int position, double element) {

        myListDouble.add(position, element);
    }

    public static void pushDoubleAtEnd(ArrayList<Double> myListDouble, double element) {

        myListDouble.add(myListDouble.size(), element);
    }

    public static void pushDoubleAtStart(ArrayList<Double> myListDouble, double element) {

        myListDouble.add(0, element);
    }

    public static void popDoubleAt(ArrayList<Double> myListDouble, int position) {

        myListDouble.remove(position);
    }

    public static void popDoubleAtStart(ArrayList<Double> myListDouble) {

        myListDouble.remove(0);
    }

    public static void popDoubleAtEnd(ArrayList<Double> myListDouble) {

        myListDouble.remove(myListDouble.size()-1);
    }

    public static void printAllStrings(ArrayList<String> myListString) {

        for (int i = 0; i< myListString.size(); i++) {

            System.out.println(myListString.get(i));
        }
    }

    public static void printSpecificString(ArrayList<String> myListString, int position) {

        System.out.println(myListString.get(position));
    }

    public static void addStringEle(ArrayList<String> myListString, String element) {

        myListString.add(element);
    }

    public static void pushStringAt(ArrayList<String> myListString, int position, String element) {

        myListString.add(position, element);
    }

    public static void pushStringAtEnd(ArrayList<String> myListString, String element) {

        myListString.add(myListString.size(), element);
    }

    public static void pushStringAtStart(ArrayList<String> myListString, String element) {

        myListString.add(0, element);
    }

    public static void popStringAt(ArrayList<String> myListString, int position) {

        myListString.remove(position);
    }

    public static void popStringAtStart(ArrayList<String> myListString) {

        myListString.remove(0);
    }

    public static void popStringAtEnd(ArrayList<String> myListString) {

        myListString.remove(myListString.size()-1);
    }

    public static void successionIntArrayList(ArrayList<Integer> myListInt, int start, int end) {

        for (int i=start; i<end; i++) {

            Quick.pushIntAt(myListInt, i, i+1);
        }
    }

    public static void successionDoubleArrayList(ArrayList<Double> myListDouble, int start, int end) {

        for (int i=start; i<end; i++) {

            Quick.pushDoubleAt(myListDouble, i, i+1);
        }
    }
}
