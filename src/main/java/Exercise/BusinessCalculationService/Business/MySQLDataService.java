package Exercise.BusinessCalculationService.Business;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MySQLDataService")
public class MySQLDataService implements DataService{
    @Override
    public int[] retrieveData(){
        int [] s1= new int[]{1,2,3,4,5,6,7,80,10};
        int s2 = 0;
        for(int i=0;i<s1.length-1;i++) {
            s2= Math.max(s1[i],s1[i+1]);

        }
        System.out.println(s2);
        return new int[]{s2};
    }

    @Override
    public int[] collectData() {
        int [] s1= new int[]{2000,400};
        int s2 = 0;
        for(int i=0;i<s1.length-1;i++) {
            s2= Math.min(s1[i],s1[i+1]);

        }
        System.out.println(s2);
        return new int[]{s2};
    }
}
