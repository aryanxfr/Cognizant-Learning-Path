package org.example;

public class Assertions {
    public int sum(int a,int b){
        return a+b;
    }
    public boolean isGreater(int a,int b){
        return a>b;
    }
    public boolean isLess(int a,int b){
        return a<b;
    }
    public Object getNullObject(){
        return null;
    }
    public Object NotNullObject(){
        return new Object();
    }
    public String getString(){
        return "hello";
    }
    public String[] CharArray(){
        return new String[]{"A","B","C"};
    }
    public int[] getArray(){
        return new int[]{1,2,3};
    }
    public String newString(String value){
        return new String(value);
    }
}
