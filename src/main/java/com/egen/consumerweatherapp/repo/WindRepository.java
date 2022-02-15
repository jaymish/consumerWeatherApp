package com.egen.consumerweatherapp.repo;

import com.egen.consumerweatherapp.model.Weather;
import com.egen.consumerweatherapp.model.Wind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface WindRepository extends JpaRepository<Wind, String> {
}
