package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.reviews.repos.GameReviewRepository;
import org.wecancodeit.reviews.pojos.GameReview;

import javax.annotation.Resource;

@Controller
public class HomeController {

    @Resource
    private GameReviewRepository gameReviewRepo;

    @RequestMapping("/")
    public String displayIndividualReviews(Model model) {
        Iterable<GameReview> allReviews = gameReviewRepo.findAll();
        model.addAttribute("reviews", allReviews);
        return "index";
    }
}
