package com.app;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.app.model.Contestant;
import com.app.repository.*;

@SpringBootTest
class OnlineVotingSystemApplicationTests {
	
	@Autowired
	ContestantRepository cRepo;
	@Test
	public void test1() {
		Contestant c = new Contestant();
		c.setAge(21);
		c.setName("Ritesh");
		cRepo.save(c);
		assertNotEquals("rocky", cRepo.findByName("Ritesh"));
	}

}
