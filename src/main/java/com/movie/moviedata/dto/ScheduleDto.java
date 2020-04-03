package com.movie.moviedata.dto;

import java.util.Date;

import lombok.Data;

@Data
public class ScheduleDto {
    
    private Long scheduleId;
    
    private String movieName;
    
    private String hallName;
    
    private String cinemaName;
    
    private Date startTime;
    
    private double price;
    
    private int remainingSeat;
}
