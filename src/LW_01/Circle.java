package LW_01;

public class Circle {

    private int radious ;//private - only valid inside this class
    Circle(int r){
        radious = r ;
    }

    public double computeArea(){
        return (Math.PI*radious*radious) ;
    }

    public double computeCircumference(){
        return (2*Math.PI*radious) ;
    }
}
