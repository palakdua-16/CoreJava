package src.multithreading;

public class Max3 {
    public static <DT extends Comparable<DT>> DT maximumof(DT a,DT b,DT c)
    {
        DT max=a;
        if(b.compareTo(max)>0)
        {
            max=b;
        }
        if(c.compareTo(max)>0)
        {
            max=c;
        }
      return max;

    }

    public static void main(String[] args) {
        maximumof(2,3,4);
        maximumof(2.5,4.5,6.5);
    }

}
