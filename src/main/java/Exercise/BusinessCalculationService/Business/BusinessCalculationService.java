package Exercise.BusinessCalculationService.Business;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@Component
@ComponentScan("Exercise.BusinessCalculationService.Business")
public class BusinessCalculationService {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(BusinessCalculationService.class)) {
            context.getBean(DataService.class).collectData();
            context.getBean(DataService.class).retrieveData();
            context.getBean(ExecutorApp.class).run();
        }
    }
}
