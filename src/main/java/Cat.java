import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope("prototype") // если есть, объекты разные, но тест проходит при наличии аннотации перед Bean
public class Cat { }
