package com.onetomanytraining.repository;

import com.onetomanytraining.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByTutorialId(long postId);

    @Transactional
    public void deleteByTutorialId(long tutorialId);


}
