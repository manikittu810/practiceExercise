package Exercise.BusinessCalculationService.Business;

import org.springframework.stereotype.Component;

@Component
public interface DataService {
    int[] retrieveData();
    int[] collectData();
}
