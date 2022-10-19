package com.cbu.backend.boardcomment.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BoardCommentRequestDTO {
    private String content;
    private String writer;
}
