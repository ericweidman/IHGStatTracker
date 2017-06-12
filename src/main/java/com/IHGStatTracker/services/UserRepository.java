package com.IHGStatTracker.services;

import com.IHGStatTracker.entities.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ericweidman on 6/11/17.
 */
public interface UserRepository extends CrudRepository<User, Integer> {
}
