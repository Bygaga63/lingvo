package com.home.lingvo.core.usecase.word;

import com.home.lingvo.core.domain.word.Word;
import com.home.lingvo.core.usecase.UseCase;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.util.Optional;


@RequiredArgsConstructor
public class GetWord extends UseCase<GetWord.InputValues, GetWord.OutputValues> {
    private final WordRepository wordRepository;


    @Override
    public OutputValues execute(InputValues input) {
        return new OutputValues(wordRepository.getWord(input.getId()));
    }

    @Value
    public static class InputValues implements UseCase.InputValues{
        private final Long id;
    }

    @Value
    public static class OutputValues implements UseCase.OutputValues{
        private final Optional<Word> word;
    }
}
