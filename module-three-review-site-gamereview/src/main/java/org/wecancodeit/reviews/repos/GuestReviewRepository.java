package org.wecancodeit.reviews.repos;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.reviews.pojos.GuestReview;

public interface GuestReviewRepository extends CrudRepository<GuestReview, Long> {

}
