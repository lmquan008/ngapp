package ngapp.example;
import org.springframework.stereotype.Repository;

@Repository(value="sampleRepository")
public class SampleRepository {
	
	
	
	public String sayHello(){
		return "Hello";
	}
}
