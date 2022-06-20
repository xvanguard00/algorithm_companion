package com.example.licenta_al;

public class QuestionAnswer {

    public static String question[] = {
            "Which sorting algorithm is the simplest?",
            "Which sorting algorithm swaps adjacent elements if they are in a wrong order?",
            "Is Bubble Sort good for big data sets? Does it have a good complexity?"

    };

    public static String choices[][]={
            {"Bubble Sort","Quick Sort", "Heap Sort", "Merge Sort"},
            {"Quick Sort", "Heap Sort", "Bubble Sort", "Merge Sort"},
            {"It is good for big data sets and it has a good complexity", "It is good for big data sets but it has bad complexity,",
                    "It is bad for big data sets but it has good complexity","It is bad for big data sets and has bad complexity."},



    };

    public static String correctAnswers[] = {
            "Bubble Sort",
            "Bubble Sort",
            "It is bad for big data sets and has bad complexity."
    };



}
