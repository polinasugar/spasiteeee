package com.company.listClasses;

public class ListElement {
    private Integer value;
    private ListElement next;

    public ListElement(){
        value = null;
    }

    public ListElement(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public ListElement getNext(){
        return next;
    }

    public void setNext(ListElement next){
        this.next = next;
    }

    public Boolean isSimple(){
        Boolean result;
        for(int i = 2; i < this.value; i++) {
            if (this.value % i == 0) {
                result = false;
                return result;
            }
        }
        result = true;
        return result;
    }
}
