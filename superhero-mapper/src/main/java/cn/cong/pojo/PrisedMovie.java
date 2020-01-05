package cn.cong.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "prised_movie")
public class PrisedMovie {
    @Id
    private String id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "movie_id")
    private String movieId;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return user_id
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return movie_id
     */
    public String getMovieId() {
        return movieId;
    }

    /**
     * @param movieId
     */
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
}