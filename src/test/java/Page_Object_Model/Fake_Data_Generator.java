package Page_Object_Model;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class Fake_Data_Generator 
{
	@Test
	void test_FakeData()
	{
		Faker fake= new Faker();
		
		String username= fake.name().username();
		String firstname= fake.name().firstName();
		String lastname= fake.name().lastName();
		String email= fake.internet().emailAddress();
		String phoneNo= fake.phoneNumber().phoneNumber();
		String animal= fake.animal().name();
		String password= fake.internet().password();
		String country= fake.country().name();
		
		System.out.println("Username is : "+username);
		System.out.println("Firstname is : "+firstname);
		System.out.println("Lastname is : "+lastname);
		System.out.println("email is : "+email);
		System.out.println("Phone Number is : "+phoneNo);
		System.out.println("Animal is : "+animal);
		System.out.println("Password is : "+password);
		System.out.println("Country is : "+country);
		
	}
	
	@Test
	void randomUtils()
	{
	// Through Random Utils
	String username1= RandomStringUtils.randomAlphabetic(5);
	String password1= RandomStringUtils.randomNumeric(5);
	String password2= RandomStringUtils.randomAlphanumeric(6);
	
	String mix= username1+password1;
	
	System.out.println(username1);
	System.out.println(password1);
	System.out.println(password2);
	
	System.out.println(mix);
	}

}
