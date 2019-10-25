package com.home.lingvo.core.usecase.word;

import com.home.lingvo.core.domain.word.Word;
import com.home.lingvo.core.usecase.UseCase;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.util.List;

@RequiredArgsConstructor
public class GetWords extends UseCase<GetWords.InputValues, GetWords.OutputValues> {
    private final WordRepository wordRepository;

    @Override
    public OutputValues execute(InputValues input) {
        return new OutputValues(wordRepository.getWords());
    }

    @Value
    public static class InputValues implements UseCase.InputValues{

    }

    @Value
    public static class OutputValues implements UseCase.OutputValues{
        List<Word> words;
    }
}
