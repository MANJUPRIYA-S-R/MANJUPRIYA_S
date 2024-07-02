package basic.multiple;
public class hotel extends meals implements lunch,moringtiffen,nightdinner
{
public static void main(String[]args)
{
    hotel hh =new hotel();
    hh.dinner();
    hh.lunch();
    hh.tiffen();
    hh.meals();
}
    @Override
    public void lunch() { System.out.println(" meals");


    }

    @Override
    public void tiffen() { System.out.println(" All type of tiffens");

    }

    @Override
    public void dinner() { System.out.println(" dosai");

    }
    public void meals(){
        System.out.println(" full meals");
    }
}
