package com.appointmentBooking;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.appointmentBooking.entities.User;
import com.appointmentBooking.repo.UserRepository;

@SpringBootApplication
public class AppointmentBooking1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(AppointmentBooking1Application.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		// create user
		User user1 = new User();
		user1.setAppointmentDate(LocalDate.of(2023, 5, 26));
		user1.setIssueDate(LocalDate.of(2023, 5, 23));
		user1.setDealerName("dealer1");
		user1.setCustName("ankit");
		user1.setCustemail("a@gmail.com");
		user1.setCustContactno(274327432);
		User resultUser1 = userRepository.save(user1);
		System.out.println(resultUser1);
		
		User user2 = new User();
		user2.setAppointmentDate(LocalDate.of(2023, 5, 26));
		user2.setIssueDate(LocalDate.of(2023, 5, 23));
		user2.setDealerName("dealer1");
		user2.setCustName("ankit");
		user2.setCustemail("a@gmail.com");
		user2.setCustContactno(274327432);
		User resultUser2 = userRepository.save(user2);
		System.out.println(resultUser2);
		
		
		// update user by id
		int id = 1;
		Optional<User> op = userRepository.findById(id);
		User user = op.get();
		user.setAppointmentDate(LocalDate.of(2023, 5, 29));
		userRepository.save(user);
		
		System.out.println("updated user :" + user);
		
		
		// read user (get)
		Iterable<User> itr = userRepository.findAll();
		itr.forEach(u->System.out.println(u));
		// read user by id
		int getId = 2;
		Optional<User> op1 = userRepository.findById(getId);
		User u = op1.get();
		System.out.println(u);
		

		// delete user
		int deleteId = 1;
		userRepository.deleteById(deleteId);
		
		
	}

}
