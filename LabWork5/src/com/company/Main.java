package com.company;
import com.company.listClasses.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Input number of elements ");
        int number = console.nextInt();
        System.out.print("Input number of element ");
        int value = console.nextInt();
        ListElement first = new ListElement(value);
        for (int i = 1; i < number; i++){
            System.out.print("Input number of element ");
            value = console.nextInt();
            first = ListUtils.addFirst(first, value);
        }
        ListUtils.filterList(first);
    }
}
