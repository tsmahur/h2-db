package com.tsm.user.model;

import com.tsm.user.entiry.Score;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseModel {
    String status;
    Score score;
}

