package com.company.listClasses;

public class ListUtils {
    public static ListElement addFirst(ListElement first, int newValue){
        ListElement newFirst = new ListElement(newValue);
        newFirst.setNext(first);
        return newFirst;
    }

    public static void filterList(ListElement pointer){
        if (pointer.isSimple()){
            System.out.println(Math.pow(pointer.getValue(), 2));
        }
        if (pointer.getNext() != null){
            filterList(pointer.getNext());
        }
    }

    public static void showList(ListElement pointer){
        System.out.println(pointer.getValue());
        if(pointer.getNext() != null){
            showList(pointer.getNext());
        }
    }
}
