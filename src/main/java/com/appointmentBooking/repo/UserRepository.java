package com.appointmentBooking.repo;
import org.springframework.data.repository.CrudRepository;
import com.appointmentBooking.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
