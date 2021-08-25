package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.repos.GuestReviewRepository;
import org.wecancodeit.reviews.repos.GameReviewRepository;
import org.wecancodeit.reviews.pojos.Hashtag;
import org.wecancodeit.reviews.repos.HashtagRepository;
import org.wecancodeit.reviews.pojos.GuestReview;
import org.wecancodeit.reviews.pojos.GameReview;

import javax.annotation.Resource;
import java.util.Optional;

@Controller
public class GameReviewController {

    @Resource
    private GameReviewRepository gameReviewRepo;

    @Resource
    private HashtagRepository hashtagRepo;

    @Resource
    private GuestReviewRepository guestReviewRepo;

    @RequestMapping("/categories/category/game-review")
    public String displayCategoryGameReview(@RequestParam("id") long id, Model model) {
        GameReview selectedReview = gameReviewRepo.findById(id).get();
        model.addAttribute("individualReview", selectedReview);
        model.addAttribute("individualHashtag", hashtagRepo.findAllByGameReviews(selectedReview));
        return "individual-game-review";
    }

    @PostMapping("/categories/category/add-hashtag")
    public String addHashtagToReview(@RequestParam("hashtag") String hashtag, @RequestParam("gamereviewid") long id, Model model) {
        Hashtag userHashtag = new Hashtag(hashtag);
        GameReview gameReview = gameReviewRepo.findById(id).get();
        Optional<Hashtag> optionalHashtag = hashtagRepo.findByHashtagName(hashtag);
        if (!optionalHashtag.isEmpty()) {
            userHashtag = optionalHashtag.get();
        } else {
            hashtagRepo.save(userHashtag);
        }
        if (gameReview.addHashtag(userHashtag)) {
            gameReviewRepo.save(gameReview);
        }

        return "redirect:/categories/category/game-review?id=" + gameReview.getId();
    }

    @PostMapping("/categories/category/add-review")
    public String addGameGuestReviews(@RequestParam("gamereviewid") long id, @RequestParam("guestReviewerName") String guestReviewerName,
                                      @RequestParam("guestReviewTitle") String guestReviewTitle, @RequestParam("guestReviewContent") String guestReviewContent) {
        GameReview currentReview = gameReviewRepo.findById(id).get();
        guestReviewRepo.save(new GuestReview(currentReview, guestReviewerName, guestReviewTitle, guestReviewContent));
        return "redirect:/categories/category/game-review?id=" + currentReview.getId();

    }
}
