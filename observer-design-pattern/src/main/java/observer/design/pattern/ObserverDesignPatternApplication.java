package observer.design.pattern;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObserverDesignPatternApplication.class, args);
		SearchProcess sp = new SearchProcess();
		
		sp.search();
		
	}

}
