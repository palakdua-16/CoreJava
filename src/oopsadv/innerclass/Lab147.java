package src.oopsadv.innerclass;

import javax.sound.midi.Soundbank;

public class Lab147 {
    public static void main(String[] args) {
      Car c=new Car();
      Car.Engine engine=c.new Engine();
      engine.start();
      c.drive();
    }
}

class Car
{
    int a=10;
    void start()
    {
        System.out.println("Engine start");
    }
    void drive()
    {
        System.out.println("Car sarted");
    }
    class Engine {
        void start()
        {
            System.out.println("Engine started"+ a);
        }
    }
}
