package demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

/*	@Bean
	public SecurityConfiguration applicationSecurity() {
		return new SecurityConfiguration();
	}*/

	@Bean
	public CommandLineRunner commandLineRunner(final UserRepository userRepository){
            userRepository.save(new User("Amar","amar"));
            userRepository.save(new User("Alka","alka"));
        return strings -> userRepository.findAll().forEach(user -> System.out.println(user));
	}
}
