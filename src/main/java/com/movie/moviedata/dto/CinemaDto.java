package com.movie.moviedata.dto;

import lombok.Data;

@Data
public class CinemaDto {
    private Long id;
    private String cinemaName;
    private String cinemaType;
    private Long cinemaTypeId;
    private String cinemaAddress;
    private String cinemaImageUrl;
    private Long areaId;
    private String area;
}
