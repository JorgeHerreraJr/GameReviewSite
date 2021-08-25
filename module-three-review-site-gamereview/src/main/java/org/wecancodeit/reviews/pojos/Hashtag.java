package org.wecancodeit.reviews.pojos;

import org.wecancodeit.reviews.pojos.GameReview;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Hashtag {
    @Id
    @GeneratedValue
    private Long id;
    private String hashtagName;

    protected Hashtag() {
    }

    public Hashtag(String hashtagName) {
        this.hashtagName = hashtagName;
        this.gameReviews = new ArrayList<>();
    }

    @ManyToMany(mappedBy = "hashtags")
    private Collection<GameReview> gameReviews;

    public Long getId() {
        return id;
    }

    public String getHashtagName() {
        return hashtagName;
    }

    public Collection<GameReview> getGameReviews() {
        return gameReviews;
    }

    public void addPost(GameReview gameReview) {
        gameReviews.add(gameReview);
    }
}
