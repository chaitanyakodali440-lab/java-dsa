package Day9;
import java.util.*;

public class JobSequencing {
    static class Job{
        String name;
        int deadline;
        int profit;

        Job(String name, int deadline,int profit){
            this.name = name;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static void main(String[] args){
        Job[] jobs = {
                new Job("A", 2, 100),
                new Job("B", 1,50),
                new Job("C", 2,200),
                new Job("D", 1,80)
        };
        Arrays.sort(jobs ,
                (a,b) -> b.profit - a.profit);
        int maxDeadline = 0;

        for(Job job : jobs){
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        String[] slots = new String[maxDeadline + 1];
        int totalProfit = 0;

        for(Job job : jobs){
            for(int slot = job.deadline;slot >= 1;slot--){
                if(slots[slot] == null){
                    slots[slot] = job.name;

                    totalProfit += job.profit;

                    break;
                }
            }
            System.out.println("Schedule: ");

            for(int i = 1;i < slots.length; i++){
                System.out.println("Slot" + i + "----> " + slots[i]);
            }

            System.out.println("Maximum Profit = " + totalProfit);
        }
    }
}
