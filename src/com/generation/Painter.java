package com.generation;

public class Painter {
    String name;
    String origin;
    int born;

    public Painter() {

    }

    public Painter(String name) {
        this.name = name;
    }

    public Painter (String name, String origin, int born){
        this.name = name;
        this.origin = origin;
        this.born = born;
    }

    public void how(){
        System.out.println("I am " +this.name+ ", from " +this.origin+ ", borned in " +this.born+ ".");
    }

    public void dead(){
        System.out.println("I am dust");
    }

    public void doing(){
        System.out.println("I am painting");
    }
}
