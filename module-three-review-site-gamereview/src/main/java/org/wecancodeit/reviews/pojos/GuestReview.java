package org.wecancodeit.reviews.pojos;

import javax.persistence.*;

@Entity
public class GuestReview {
    @Id
    @GeneratedValue
    private Long id;
    private String guestReviewerName;
    private String guestReviewTitle;

    @Lob
    private String guestReviewContent;

    @ManyToOne
    private GameReview gameReview;

    public GuestReview() {

    }

    public GuestReview(GameReview gameReview, String guestReviewerName, String guestReviewTitle, String guestReviewContent) {
        this.gameReview = gameReview;
        this.guestReviewerName = guestReviewerName;
        this.guestReviewTitle = guestReviewTitle;
        this.guestReviewContent = guestReviewContent;
    }

    public Long getId() {
        return id;
    }

    public String getGuestReviewerName() {
        return guestReviewerName;
    }

    public String getGuestReviewTitle() {
        return guestReviewTitle;
    }

    public String getGuestReviewContent() {
        return guestReviewContent;
    }

    public GameReview getGameReview() {
        return gameReview;
    }
}
