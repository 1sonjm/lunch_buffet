package com.buffet.lunchapi.service.post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.buffet.lunchapi.service.post.domain.PostsRepository;
import com.buffet.lunchapi.service.post.dto.PostsSaveRequestDto;

import lombok.AllArgsConstructor;

/**
 * Created by jojoldu@gmail.com on 2017. 12. 24. Blog :
 * http://jojoldu.tistory.com Github : https://github.com/jojoldu
 */

@RestController
@AllArgsConstructor
public class PostController {

    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto) {
        postsRepository.save(dto.toEntity());
    }
}
