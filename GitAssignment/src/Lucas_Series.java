import java.util.ArrayList;

public class Lucas_Series implements ISubscriber {

    public static int getLucasSeries(double x) {

        if (x == 0){
            return 2;}
        if (x == 1){
            return 1;}


        return (getLucasSeries(x - 1) + getLucasSeries(x - 2) );

    }


    @Override
    public void notifySubscriber(String input) {
        // TODO Auto-generated method stub
        int x = Integer.valueOf(input);
        System.out.println("Lucas Series = " + getLucasSeries(x));
    }
}

