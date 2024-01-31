import java.util.ArrayList;
import java.util.Collections;
public class Job_Sequencing {
    static class Job{
        int id;
        int deadline;
        int profit;
        public Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String[] args) {
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs=new ArrayList<>(jobInfo.length);
        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
        }
        Collections.sort(jobs, (a,b) -> b.profit-a.profit);
        int time=0;
        int p1=0;
        ArrayList<Integer> seq=new ArrayList<>();
        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                p1+=curr.profit;
                time++;
                seq.add(curr.id);
            }

        }
        System.out.println("Maximum Profit "+p1);
        for(int i=0;i<seq.size();i++){
            System.out.println(seq.get(i)+" ");
        }
    }
    
}
