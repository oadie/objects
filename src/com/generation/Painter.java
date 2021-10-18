package com.generation;

public class Painter {
    String name;
    String origin;
    int born;

    public void how(){
        System.out.println("I am " +this.name+ ", from " +this.origin+ " and I born in " +this.born+ ".");
    }

    public void dead(){
        System.out.println("I am dust");
    }

    public void doing(){
        System.out.println("I am painting");
    }
}
