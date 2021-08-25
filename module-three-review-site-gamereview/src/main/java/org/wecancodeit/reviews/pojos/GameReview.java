package org.wecancodeit.reviews.pojos;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
public class GameReview {

    @Id
    @GeneratedValue
    private Long id;

    private String gameTitle;
    private String platforms;
    private String imageUrl;
    private String imageAltText;
    private String reviewTitle;

    @Lob
    private String reviewContent;

    @ManyToOne
    private Category category;

    @ManyToMany
    private Collection<Hashtag> hashtags;

    @OneToMany(mappedBy = "gameReview")
    private Set<GuestReview> guestReviews;


    protected GameReview() {
    }

    public GameReview(String gameTitle, String platforms, String imageUrl, String imageAltText, String reviewTitle, String reviewContent, Category category, Hashtag... hashtags) {
        this.gameTitle = gameTitle;
        this.platforms = platforms;
        this.imageUrl = imageUrl;
        this.imageAltText = imageAltText;
        this.reviewTitle = reviewTitle;
        this.reviewContent = reviewContent;
        this.category = category;
        this.hashtags = Set.of(hashtags);
    }

    public Long getId() {
        return id;
    }

    public String getGameTitle() {
        return gameTitle;
    }

    public String getPlatforms() {
        return platforms;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getImageAltText() {
        return imageAltText;
    }

    public String getReviewTitle() {
        return reviewTitle;
    }

    public String getReviewContent() {
        return reviewContent;
    }

    public Category getCategory() {
        return category;
    }

    public Collection<Hashtag> getHashtags() {
        return hashtags;
    }

    public Set<GuestReview> getGuestReviews() {
        return guestReviews;
    }

    public boolean addHashtag(Hashtag hashtag) {
        int matchCount = 0;
        for (Hashtag current : hashtags) {
            if (current.getHashtagName().equals(hashtag.getHashtagName())) {
                matchCount++;
            }
        }
        if (matchCount == 0) {
            hashtags.add(hashtag);
            System.out.println("added hashtag");
            return true;
        } else return false;
    }

    @Override
    public String toString() {
        return "GameReview{" +
                "id=" + id +
                ", gameTitle='" + gameTitle + '\'' +
                ", platforms='" + platforms + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", imageAltText='" + imageAltText + '\'' +
                ", reviewTitle='" + reviewTitle + '\'' +
                ", reviewContent='" + reviewContent + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GameReview that = (GameReview) o;

        if (id != null ? !id.equals(that.id) : that.id != null)
            return false;
        if (gameTitle != null ? !gameTitle.equals(that.gameTitle) : that.gameTitle != null)
            return false;
        if (platforms != null ? !platforms.equals(that.platforms) : that.platforms != null)
            return false;
        if (imageUrl != null ? !imageUrl.equals(that.imageUrl) : that.imageUrl != null)
            return false;
        if (imageAltText != null ? !imageAltText.equals(that.imageAltText) : that.imageAltText != null)
            return false;
        if (reviewTitle != null ? !reviewTitle.equals(that.reviewTitle) : that.reviewTitle != null)
            return false;
        return reviewContent != null ? reviewContent.equals(that.reviewContent) : that.reviewContent == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (gameTitle != null ? gameTitle.hashCode() : 0);
        result = 31 * result + (platforms != null ? platforms.hashCode() : 0);
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        result = 31 * result + (imageAltText != null ? imageAltText.hashCode() : 0);
        result = 31 * result + (reviewTitle != null ? reviewTitle.hashCode() : 0);
        result = 31 * result + (reviewContent != null ? reviewContent.hashCode() : 0);
        return result;
    }
}
