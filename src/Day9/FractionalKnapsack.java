package Day9;
import java.util.*;
class item{
    int weight;
    int value;

    item(int weight, int value){
        this.weight = weight;
        this.value = value;
    }
}
public class FractionalKnapsack {
    public static void main(String[] args){
        item[] items = {
                new item(10,60),
                new item(20,100),
                new item(30,120),
        };

        int capacity = 50;

        Arrays.sort(
                items,(a,b) ->
            Double.compare(
                    (double)b.value/b.weight,
                    (double)a.value/a.weight
            )
        );
        double totalValue = 0;
        for(item item: items){
            if(capacity >= item.weight){
                capacity -= item.weight;
                totalValue += item.value;
            }else{
                totalValue +=
                        ((double)item.value/item.weight)
                        *capacity;
                break;
            }
        }
        System.out.println(
                "Maximum Value = " + totalValue
        );
    }
}
