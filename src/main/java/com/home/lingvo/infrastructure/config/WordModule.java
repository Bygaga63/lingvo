package com.home.lingvo.infrastructure.config;

import com.home.lingvo.core.usecase.UseCase;
import com.home.lingvo.core.usecase.word.GetWord;
import com.home.lingvo.core.usecase.word.GetWords;
import com.home.lingvo.core.usecase.word.WordRepository;
import com.home.lingvo.infrastructure.presenter.word.WordController;
import com.home.lingvo.infrastructure.presenter.word.WordResource;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
public class WordModule {
    private final WordRepository wordRepository;

    @Bean
    public UseCase<GetWord.InputValues, GetWord.OutputValues> getWord() {
        return new GetWord(wordRepository);
    }

    @Bean
    public UseCase<GetWords.InputValues, GetWords.OutputValues> getWords() {
        return new GetWords(wordRepository);
    }

    @Bean
    public WordResource wordResource() {
        return new WordController(
                getWords(),
                getWord()
        );
    }
}
