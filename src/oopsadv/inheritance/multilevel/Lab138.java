package src.oopsadv.inheritance.multilevel;

public class Lab138 {
    public static void main(String[] args) {
       //Son s= new Son();
     //  s.bhk3();
       Grandfather g=new Grandfather();
       Grandfather g1=new Father();
       Father F=new Son(); //Father was present when son was created
       //Son s=new Grandfather(); //Son was not present when Grandfather was created
    }
}
