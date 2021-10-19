package com.generation;

public class Main {

    public static void main(String[] args) {

        Painter master1 = new Painter();
        //características / clases
        master1.name = "Doménikos Theotokópoulos";
        master1.origin = "Greece";
        master1.born = 1541;
        //objeto / instancia
        master1.how();
        //acción / atributos / comportamiento
        master1.dead();

        Painter master2 = new Painter();
        master2.name = "Diego Rodríguez de Silva y Velázquez";
        master2.origin = "Spain";
        master2.born = 1599;
        master2.how();
        master2.dead();

        Painter master3 = new Painter();
        master3.name = "Francisco José de Goya y Lucientes";
        master3.origin = "Spain";
        master3.born = 1746;
        master3.how();
        master3.dead();

        Painter master4 = new Painter();
        master4.name = "Édouard Manet";
        master4.origin = "France";
        master4.born = 1832;
        master4.how();
        master4.dead();

        Painter master5 = new Painter();
        master5.name = "Santiago Ydáñez";
        master5.origin = "Spain";
        master5.born = 1969;
        master5.how();
        master5.doing();

        Painter master6 = new Painter("Guillermo Lorca García-Huidobro");

        Painter master7 = new Painter("Francis Bacon","Ireland",1909);
        master7.how();
        master7.dead();

    }
}
