package com.project.bookmyshow.controller;


import com.project.bookmyshow.dtos.ShowRequestDTO;
import com.project.bookmyshow.models.Show;
import com.project.bookmyshow.service.ShowService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/show")
@AllArgsConstructor
public class showController {

    private ShowService showService;
    @GetMapping("/{id}")
    public Show readShow(@PathVariable Long id) {
        return showService.getShow(id);
    }

    @PostMapping
    public Show createShow(@RequestBody ShowRequestDTO request) {
        return showService.createShow(request);
    }
}
