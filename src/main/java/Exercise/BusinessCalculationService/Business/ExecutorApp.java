package Exercise.BusinessCalculationService.Business;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ExecutorApp {
    private DataService execute;
    public ExecutorApp(@Qualifier("MySQLDataService")DataService execute){
        this.execute=execute;
    }

    public void run(){
        System.out.println("The max element in the DataBases will be Displayed below : " +execute);
        execute.retrieveData();
        execute.collectData();
    }


}
