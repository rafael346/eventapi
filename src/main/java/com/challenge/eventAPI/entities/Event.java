package com.challenge.eventAPI.entities;

import com.challenge.eventAPI.entities.enums.EventStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.jetbrains.annotations.NotNull;

import java.time.Instant;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String startDate;

    private String endDate;
    private Float currency;
    private EventStatus eventStatus;

    public Event(){

    }

    public Event(Long id, String title, String startDate, String endDate,Float currency, EventStatus eventStatus) {
        this.id = id;
        this.endDate = endDate;
        this.title = title;
        this.startDate = startDate;
        this.currency = currency;
        this.eventStatus = eventStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }
    public EventStatus getEventStatus() {
        return EventStatus.valueOf(String.valueOf(eventStatus));
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Float getCurrency() {
        return currency;
    }

    public void setCurrency(Float currency) {
        this.currency = currency;
    }

    public void setEventStatus(@NotNull EventStatus eventStatus) {
        this.eventStatus = EventStatus.valueOf(eventStatus.getCode());
    }


}
