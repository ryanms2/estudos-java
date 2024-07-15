package one.digitalinnovation.gof;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "API Complemento de CEP",
		version = "1",
		description = "ajuda a complementar as informações do endereço do cliente apenas pelo cep."))
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
