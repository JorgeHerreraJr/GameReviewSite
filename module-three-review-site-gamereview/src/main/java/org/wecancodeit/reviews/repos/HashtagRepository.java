package org.wecancodeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.pojos.GameReview;
import org.wecancodeit.reviews.pojos.Hashtag;

import java.util.Optional;

public interface HashtagRepository extends CrudRepository<Hashtag, Long> {
    public Iterable<Hashtag> findAllByGameReviews(GameReview gameReviews);

    Optional<Hashtag> findByHashtagName(String hashtagName);
}
