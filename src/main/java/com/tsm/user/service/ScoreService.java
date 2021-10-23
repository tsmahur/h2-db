package com.tsm.user.service;

import com.tsm.user.entiry.Score;
import com.tsm.user.model.ResponseModel;
import com.tsm.user.model.ScoreDTO;
import com.tsm.user.repository.ScoreRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class ScoreService {

    @Autowired
     ScoreRepository scoreRepository;

    public Score saveUser(ScoreDTO score) {
        Score scoreToSave=new Score();
        scoreToSave.setScore(score.getScore());
        scoreToSave.setType(score.getType());
        scoreToSave.setStatus(score.getStatus());
        return scoreRepository.save(scoreToSave);
    }
    public void updateScore(Integer id, ScoreDTO score) {
        Optional<Score> optional = scoreRepository.findById(id);
        Score scoreFound = optional.orElseThrow(() -> new RuntimeException("Score Not found"));
        scoreFound.setScore(score.getScore()); ///get score and update
        scoreRepository.save(scoreFound);
//        return new ResponseModel("success",scoreFound);
    }

    public ResponseModel getUserById(Integer id) {
        ResponseModel responseModel = new ResponseModel();
        Score score = scoreRepository.findById(id).orElseThrow(()->new RuntimeException("Score not fond"));

        responseModel.setScore(score);
        responseModel.setStatus("success");

        return  responseModel;
    }
}
