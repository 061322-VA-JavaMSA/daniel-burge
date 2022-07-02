import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.revature.daos.UserPostgres;

class TestUserServices {

	@Test
	public void testUsersfromDB() {
		List<User> expected = new Arraylist<>();
		Users user1 = new User(1,"mzywicki0","SVJit0gY5fD0");
		Users user2 = new User(2,"vprandini1","kvovwA");
		Users user3 = new User(3,"frobben2","yylGPe3NZq");
		expected.add(user1);
		expected.add(user2);
		expected.add(user3);
		List<User> actual = u.createUser(actual,expected);
	}

}
