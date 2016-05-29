package ngapp.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
	
	private SampleRepository sampleRepository;
	
	@Autowired
	public void setSampleRepository(SampleRepository sampleRepository) {
		this.sampleRepository = sampleRepository;
	}
	
	public void printIt(){
		System.out.println(sampleRepository.sayHello() + " Quan");
		
	}
}
