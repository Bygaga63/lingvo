package com.home.lingvo.infrastructure.presenter.word;

import com.home.lingvo.core.usecase.word.GetWord;

public class GetWordInputMapper {
    public static GetWord.InputValues map(Long id){
        return new GetWord.InputValues(id);
    }
}
