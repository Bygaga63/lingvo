package com.home.lingvo.infrastructure.presenter.word;

import com.home.lingvo.core.domain.word.Word;
import com.home.lingvo.infrastructure.presenter.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/words")
public interface WordResource {

    @GetMapping
    ApiResponse<List<Word>> getWords();

    @GetMapping("{id}")
    ApiResponse<Word> getWord(@PathVariable Long id);
}
