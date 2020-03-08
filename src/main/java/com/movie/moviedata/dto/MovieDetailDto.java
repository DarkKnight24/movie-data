package com.movie.moviedata.dto;

import com.movie.moviedata.entity.Movie;
import lombok.Data;

/**
 * @作者 ：soul
 * @创建日期 ：Created in 2020/3/7 23:24
 * @描述：
 */
@Data
public class MovieDetailDto extends Movie {

    private String typeName;
    private String countryName;
}
