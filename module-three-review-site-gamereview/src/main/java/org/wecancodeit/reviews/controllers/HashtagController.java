package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.repos.GameReviewRepository;
import org.wecancodeit.reviews.pojos.Hashtag;
import org.wecancodeit.reviews.repos.HashtagRepository;

import javax.annotation.Resource;

@Controller
public class HashtagController {
    @Resource
    private HashtagRepository hashtagRepository;

    @Resource
    private GameReviewRepository gameReviewRepository;

    @RequestMapping("/hashtags")
    public String displayAllHashtags(Model model) {
        Iterable<Hashtag> allHashtags = hashtagRepository.findAll();
        model.addAttribute("hashtags", allHashtags);
        return "hashtags";
    }

    @RequestMapping("/hashtags/hashtag")
    public String displayHashtag(@RequestParam("id") Long id, Model model) {
        Hashtag hashtag = hashtagRepository.findById(id).get();
        model.addAttribute("individualHashtag", hashtag);
        model.addAttribute("individualReviews", gameReviewRepository.findAllByHashtags(hashtag));
        return "hashtag";
    }


}
