package com.movie.moviedata.dto;

import lombok.Data;

@Data
public class HallDto {
    private Long hallId;
    
    private String cinemaName;
    
    private String hallName;
    
    private int hallCapacity;
    
    private String hallType;
}
