package com.movie.moviedata.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class CinemaMovieDto {
    private String cinemaType;
    
    private String movieName;
    
    private Double suggestedPrice;
    
    private Double boxOffice;
    
    private Long id;
    
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date movieReleaseDate;
}
