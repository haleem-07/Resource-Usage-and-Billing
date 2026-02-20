import java.util.*;
public class Service {
    int firstHourCost = 30;
    int extraHoursCost = 10;



    public int calculateBill(int hours){
        if (hours <= 1){
            return firstHourCost;
        }
        else {
            return firstHourCost + extraHoursCost;
        }
    }
}
