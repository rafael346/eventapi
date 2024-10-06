package com.challenge.eventAPI.services;

import java.util.List;
import com.challenge.eventAPI.entities.Event;
import com.challenge.eventAPI.repositories.EventRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    private EventRepository repository;

    public List<Event> findAll(){
        return repository.findAll();
    }

    public Event insert(Event obj){
        return repository.save(obj);
    }

    public void delete(Long id){
        repository.deleteById(id);
    }

    public Event update(Long id, Event obj){
        Event entity = repository.getReferenceById(id);
        updateData(entity,obj);
        return  repository.save(entity);
    }

    public void updateData(@NotNull Event entity, @NotNull Event  obj){
        entity.setCurrency(obj.getCurrency());
        entity.setTitle(obj.getTitle());
        entity.setEventStatus(obj.getEventStatus());
        entity.setStartDate(obj.getStartDate());
        entity.setEndDate(obj.getEndDate());
    }

}
