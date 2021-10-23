package com.tsm.user.controller;

import com.tsm.user.entiry.Score;
import com.tsm.user.model.ResponseModel;
import com.tsm.user.model.ScoreDTO;
import com.tsm.user.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/score")
public class ScoreController {

    @Autowired
    ScoreService scoreService;

    @PostMapping
    public Score saveScore(@RequestBody ScoreDTO score) {
        return scoreService.saveUser(score);
    }

    @PutMapping("/{id}")
    public String updateScore(@PathVariable Integer id,@RequestBody ScoreDTO score) {
        scoreService.updateScore(id,score);
        return  "Updated";
    }
    @GetMapping("/{id}")
    public ResponseModel getScoreById(@PathVariable Integer id) {
        return scoreService.getUserById(id);
    }
}
