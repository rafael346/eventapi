package com.challenge.eventAPI.controller;

import java.net.URI;
import java.util.List;
import com.challenge.eventAPI.entities.Event;
import com.challenge.eventAPI.services.EventService;
import org.apache.coyote.Response;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping("/event")
public class EventController {

    @Autowired
    private EventService service;

    @GetMapping
   public ResponseEntity<List<Event>> findAll(){
       List<Event> list = service.findAll();
       return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Event> insert(@RequestBody Event obj){
        obj = service.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Event> update(@PathVariable Long id, @RequestBody @NotNull Event obj){
        obj = service.update(id,obj);
        return ResponseEntity.ok().body(obj);

    }

}
