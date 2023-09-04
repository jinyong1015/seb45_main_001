package com.sundayCinema.sundayCinema.movie.repository;

import com.sundayCinema.sundayCinema.movie.entity.Movie;
import com.sundayCinema.sundayCinema.movie.entity.Poster;
import com.sundayCinema.sundayCinema.movie.entity.Trailer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PosterRepository extends JpaRepository<Poster, Long> {
    @Query("SELECT MAX(e.posterId) FROM Poster e")
    Long findMaxPosterId();

    List<Poster> findByMovie(Movie movie); // 전체 예고편 리스트 가져오기
}
