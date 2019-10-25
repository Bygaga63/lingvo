package com.home.lingvo.infrastructure.persistance.entities;

import com.home.lingvo.core.domain.word.Word;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "word")
@AllArgsConstructor
public class WordData {
    @Id
    @GeneratedValue
    private Long id;
    private String value;

    public static WordData from(Word word){
        return new WordData(word.getId(), word.getValue());
    }

    public Word fromThis(){
        return new Word(id, value);
    }
}
