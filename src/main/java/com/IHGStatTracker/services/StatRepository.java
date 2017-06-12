package com.IHGStatTracker.services;

import com.IHGStatTracker.entities.Stat;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ericweidman on 6/11/17.
 */
public interface StatRepository extends CrudRepository<Stat, Integer> {
}
