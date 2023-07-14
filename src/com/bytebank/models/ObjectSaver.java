package com.bytebank.models;

public class ObjectSaver {
    private int index = 0;
    private final Object[] objArr = new Object[10];


    public void addObj(Object obj) {
        this.objArr[this.index] = obj;
        this.index++;
    }

    public Object getObj(int index) {
        if (index < this.index) {
            return this.objArr[index];
        }
        return "Not a valid index.";
    }

    public void showAllObjects() {
        int index = 0;
        while (index < this.index) {
            System.out.printf("Class is:%sObject is:%s%n", this.objArr[index].getClass(), this.objArr[index]);
            index++;
        }
    }
}
