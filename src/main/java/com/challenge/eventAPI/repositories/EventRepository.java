package com.challenge.eventAPI.repositories;

import com.challenge.eventAPI.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {


}
