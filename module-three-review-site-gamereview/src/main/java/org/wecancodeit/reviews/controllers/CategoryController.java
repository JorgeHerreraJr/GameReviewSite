package org.wecancodeit.reviews.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.reviews.repos.CategoryRepository;
import org.wecancodeit.reviews.repos.GameReviewRepository;
import org.wecancodeit.reviews.pojos.Category;

import javax.annotation.Resource;

@Controller
public class CategoryController {
    @Resource
    private CategoryRepository categoryRepo;

    @Resource
    private GameReviewRepository gameReviewRepo;

    @RequestMapping("/categories")
    public String displayAllCategories(Model model) {
        Iterable<Category> allCategories = categoryRepo.findAll();
        model.addAttribute("categories", allCategories);

        return "categories";
    }

    @RequestMapping("/categories/category")
    public String displayCategory(@RequestParam("id") Long id, Model model) {
        Category category = categoryRepo.findById(id).get();
        model.addAttribute("individualCategory", category);
        model.addAttribute("individualReviews", gameReviewRepo.findAllByCategory(category));
        return "category";
    }
}
