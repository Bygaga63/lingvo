package com.home.lingvo.infrastructure.presenter.word;

import com.home.lingvo.core.domain.word.Word;
import com.home.lingvo.core.usecase.UseCase;
import com.home.lingvo.core.usecase.word.GetWord;
import com.home.lingvo.core.usecase.word.GetWords;
import com.home.lingvo.infrastructure.presenter.ApiResponse;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
public class WordController implements WordResource {
    private final UseCase<GetWords.InputValues, GetWords.OutputValues> getWords;
    private final UseCase<GetWord.InputValues, GetWord.OutputValues> getWord;

    @Override
    public ApiResponse<List<Word>> getWords() {
        List<Word> words = getWords.execute(GetWordsInputMapper.map()).getWords();
        return new ApiResponse<>(GetWordsOutputMapper.map(words));
    }

    @Override
    public ApiResponse<Word> getWord(Long id) {
        Optional<Word> word = getWord.execute(GetWordInputMapper.map(id)).getWord();
        return new ApiResponse<>(GetWordOutputMapper.map(word));
    }
}
