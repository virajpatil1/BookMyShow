package com.project.bookmyshow.service;

import com.project.bookmyshow.models.Screen;
import com.project.bookmyshow.repositories.ScreenRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ScreenService {

    private ScreenRepository screenRepository;
    public Screen getScreen(Long screenId) {

        return screenRepository.findById(screenId).orElse(null);
    }
}
