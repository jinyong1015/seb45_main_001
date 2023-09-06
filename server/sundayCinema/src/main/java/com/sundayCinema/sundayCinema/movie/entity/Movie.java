package com.sundayCinema.sundayCinema.movie.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sundayCinema.sundayCinema.advice.audit.Auditable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie extends Auditable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long movieId;
    @Column(nullable = false)
    private String movieCd;
    @Column(nullable = false)
    private String movieNm;// "영화명(국문)"
    @Column(nullable = false)
    private String movieNmEn;// "영화명(영문)"
    @Column(nullable = false)
    private String movieNmOg;// ""
    @Column(nullable = false)
    private String showTm;// "상영시간"
    @Column(nullable = false)
    private String prdtYear;
    @Column(nullable = false)
    private String openDt; // "개봉일"
    @Column(nullable = false)
    private String prdtStatNm; // 삭제 예정
    @Column(nullable = false)
    private String typeNm;
    @OneToMany(mappedBy = "movie")
    private List<MovieAudit> audits; // "관람 등급 명칭"
    @OneToMany(mappedBy = "movie")
    private List<Nation> nations = new ArrayList<>(); //: "국가"
    @OneToMany(mappedBy = "movie")
    private List<Actor> actors = new ArrayList<>();
    @OneToMany(mappedBy = "movie")
    private List<Genre> genres = new ArrayList<>();
    @OneToMany(mappedBy = "movie")
    private List<Director> directors = new ArrayList<>();
    @OneToMany(mappedBy = "movie")
    private List<YoutubeReview> youtubeReviews = new ArrayList<>();
    @OneToMany(mappedBy = "movie")
    private List<Poster> posters = new ArrayList<>();
    @OneToMany(mappedBy = "movie")
    private List<StillCut> stillCuts = new ArrayList<>();
    @OneToMany(mappedBy = "movie")
    private List<Trailer> trailers = new ArrayList<>();
    @OneToMany(mappedBy = "movie")
    private List<Plots> plots = new ArrayList<>();
}
