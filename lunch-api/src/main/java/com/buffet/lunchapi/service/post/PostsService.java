package com.buffet.lunchapi.service.post;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.buffet.lunchapi.service.post.domain.Posts;
import com.buffet.lunchapi.service.post.domain.PostsRepository;

import lombok.AllArgsConstructor;

/**
 * Created by jojoldu@gmail.com on 2017. 12. 27. Blog :
 * http://jojoldu.tistory.com Github : https://github.com/jojoldu
 */

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional
    public void save(Posts entity) {
        postsRepository.save(entity);
    }

}
