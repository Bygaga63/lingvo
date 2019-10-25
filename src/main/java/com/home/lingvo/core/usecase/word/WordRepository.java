package com.home.lingvo.core.usecase.word;

import com.home.lingvo.core.domain.word.Word;

import java.util.List;
import java.util.Optional;

public interface WordRepository {
    Optional<Word> getWord(Long id) throws IllegalArgumentException;
    List<Word> getWords();
}
