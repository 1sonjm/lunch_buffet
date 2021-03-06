package com.buffet.lunchapi.service.post.dto;

import com.buffet.lunchapi.service.post.domain.Posts;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by jojoldu@gmail.com on 2017. 12. 27. Blog :
 * http://jojoldu.tistory.com Github : https://github.com/jojoldu
 */

@Getter
@Setter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;

    public Posts toEntity() {
        return Posts.builder().title(title).content(content).author(author).build();
    }
}
