package com.challenge.eventAPI.entities;

import com.challenge.eventAPI.entities.enums.EventStatus;
import org.jetbrains.annotations.NotNull;

import java.time.Instant;

public class Event {

    private Long id;
    private String title;
    private Instant startDate;

    private Instant endDate;
    private Float currency;
    private EventStatus eventStatus;

    public Event(){

    }

    public Event(Long id, String title, Instant startDate, Instant endDate,Float currency, EventStatus eventStatus) {
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

    public Instant getStartDate() {
        return startDate;
    }

    public Instant getEndDate() {
        return endDate;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(Instant endDate) {
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
