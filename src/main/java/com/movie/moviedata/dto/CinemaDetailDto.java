package com.movie.moviedata.dto;

import lombok.Data;

@Data
public class CinemaDetailDto extends CinemaDto{
    private Long provinceId;
    private Long cityId;
    private Long countryId;
    private String cinemaImage;
}
