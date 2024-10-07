package com.challenge.eventAPI.services;

import java.util.List;
import com.challenge.eventAPI.entities.Event;
import com.challenge.eventAPI.repositories.EventRepository;
import com.challenge.eventAPI.services.exceptions.DatabaseException;
import com.challenge.eventAPI.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
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
        try{
            repository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException();
        }
        catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }

    public Event update(Long id, Event obj){
        try{
            Event entity = repository.getReferenceById(id);
            updateData(entity,obj);
            return  repository.save(entity);
        }catch (EntityNotFoundException e){
            throw new ResourceNotFoundException();
        }

    }

    public void updateData(@NotNull Event entity, @NotNull Event  obj){
        entity.setCurrency(obj.getCurrency());
        entity.setTitle(obj.getTitle());
        entity.setEventStatus(obj.getEventStatus());
        entity.setStartDate(obj.getStartDate());
        entity.setEndDate(obj.getEndDate());
    }

}
