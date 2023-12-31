package Exercise.BusinessCalculationService.Business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class Business{

    private final Dependency1 dependency1;
    private final Dependency2 dependency2;

    public Business(Dependency1 dependency1, Dependency2 dependency2) {
        super();
        System.out.println("This is Contructor DI");
        this.dependency1= dependency1;
        this.dependency2= dependency2;
    }
public String toString() {
    return "Using  " + dependency1 + " : " + dependency2;
}
}


@Component
class Dependency1 {

}

@Component
class Dependency2 {


}

@Configuration
@ComponentScan
public class DependencyInjection {
    public static void main(String[] args) {
        try (var context =
                     new AnnotationConfigApplicationContext(DependencyInjection.class)) {
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(context.getBean(Business.class));
        }
    }

}
