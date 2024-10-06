package com.challenge.eventAPI.entities.enums;


import org.jetbrains.annotations.NotNull;

public enum EventStatus {
    Started(1),
    Completed(2),
    Paused(3);

    private final int code;

    private  EventStatus(int code){
        this.code= code;
    }

    public int getCode() {
        return code;
    }

    public static @NotNull EventStatus valueOf(int code){
        for (EventStatus value : EventStatus.values()){
            if(value.getCode() == code ){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid EventStatus code");
    }

}
