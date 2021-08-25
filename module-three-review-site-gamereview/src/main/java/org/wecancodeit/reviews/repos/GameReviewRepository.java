package org.wecancodeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.pojos.Category;
import org.wecancodeit.reviews.pojos.GameReview;
import org.wecancodeit.reviews.pojos.Hashtag;

import java.util.Optional;

public interface GameReviewRepository extends CrudRepository<GameReview, Long> {
    public Iterable<GameReview> findAllByCategory(Category category);

    public Iterable<GameReview> findAllByHashtags(Hashtag hashtags);

    Optional<GameReview> findByGameTitle(String gameTitle);
}
