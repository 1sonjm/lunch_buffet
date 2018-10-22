package com.buffet.lunchapi.post;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.List;

import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.buffet.lunchapi.user.domain.Users;
import com.buffet.lunchapi.user.domain.UsersRepository;

/**
 * Created by jojoldu@gmail.com on 2017. 12. 23. Blog :
 * http://jojoldu.tistory.com Github : https://github.com/jojoldu
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    UsersRepository postsRepository;

    @After
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Ignore
    @Test
    public void 게시글저장_불러오기() {
        // given
        postsRepository.save(Users.builder().password("테스트 본문").name("jojoldu@gmail.com").build());

        // when
        List<Users> postsList = postsRepository.findAll();

        // then
        Users posts = postsList.get(0);
        assertThat(posts.getId(), is("테스트 게시글"));
        assertThat(posts.getName(), is("테스트 본문"));
    }

    @Test
    public void BaseTimeEntity_등록() {
        // given
        LocalDateTime now = LocalDateTime.now();
        postsRepository.save(Users.builder().password("테스트 본문").name("jojoldu@gmail.com").build());
        // when
        List<Users> postsList = postsRepository.findAll();

        // then
        Users posts = postsList.get(0);
        assertTrue(posts.getCreatedDate().isAfter(now));
        assertTrue(posts.getModifiedDate().isAfter(now));
    }
}
