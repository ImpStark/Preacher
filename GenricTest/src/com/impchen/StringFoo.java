package com.impchen;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ust on 2015/9/25.
 */
public class StringFoo<T extends Collection> {
    private T x;

    public static void main(String[] args) {
        StringFoo<ArrayList> listFoo = null;
        listFoo = new StringFoo<>(new ArrayList());

//        listFoo = new StringFoo<>(new ArrayList());
        System.out.println("done");
    }

    public  StringFoo(T x){
        this.x = x;
    }

    public T getX(){
        return this.x;
    }

    public void setX(T x){
        this.x = x;
    }









}
