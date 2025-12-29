package io.github.derick.aquiteturaspring;

import jakarta.el.BeanNameResolver;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class  AquiteturaspringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AquiteturaspringApplication.class, args);

        SpringApplicationBuilder builder = new SpringApplicationBuilder(AquiteturaspringApplication.class);
        builder.profiles("Produção");
        builder.run(args);
     builder.bannerMode(Banner.Mode.OFF);
     ConfigurableApplicationContext applicationContext = builder.context();
     //   var produtoRepository = applicationContext.getBean("Produto repository");

        builder.run(args);
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
       var applicationName = environment.getProperty("spring.application.name");
   System.out.println("Nome da aplicação: "+ applicationName);

    }

}
