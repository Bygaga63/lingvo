package com.home.lingvo.infrastructure.persistance.repositories;

import com.home.lingvo.core.domain.word.Word;
import com.home.lingvo.core.usecase.word.WordRepository;
import com.home.lingvo.infrastructure.persistance.entities.WordData;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Repository
public class WordRepositoryImpl implements WordRepository {
    private final JpaWordRepository jpaWordRepository;

    @Override
    public Optional<Word> getWord(Long id) throws IllegalArgumentException {
        return jpaWordRepository.findById(id).map(WordData::fromThis);
    }

    @Override
    public List<Word> getWords() {
        List<WordData> wordDataList = jpaWordRepository.findAll();
        return wordDataList.stream()
                .map(WordData::fromThis).collect(Collectors.toList());
    }
}
