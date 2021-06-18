package com.demo.powermock;

public final class MyCalc {

    public final static Result sum(int a,int b){
        int result = CalcStatic.sum(1,b);
        return new Result(a,b,result);
    }

}