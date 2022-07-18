package com.example.ranprogen.service;

import com.example.ranprogen.model.Answer;
import com.example.ranprogen.rpository.AnswerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainService {
    final AnswerRepository answerRepository;

    public Answer randomAnswer(){
        long qty = answerRepository.count();
        int idx = (int) (Math.random()*qty);
        PageRequest pageRequest = PageRequest.of(idx,1);
        Page<Answer> answerPage = answerRepository.findAll(pageRequest);
        Answer answer = null;
        if(answerPage.hasContent()){
            answer = answerPage.getContent().get(0);
        }
        return answer;
    }
}
