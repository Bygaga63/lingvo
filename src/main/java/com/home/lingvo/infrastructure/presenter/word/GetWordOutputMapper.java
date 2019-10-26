package com.home.lingvo.infrastructure.presenter.word;

import com.home.lingvo.core.domain.word.Word;
import com.home.lingvo.core.exception.WordException;

import java.util.Optional;

public class GetWordOutputMapper {
    public static Word map(Optional<Word> word) {
        return word.orElseThrow(() -> new WordException("Word not found"));
    }
}
