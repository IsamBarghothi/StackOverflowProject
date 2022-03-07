package com.CS393.Project.repository;
import com.CS393.Project.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

public interface CommentRepository extends JpaRepository<Comment, Integer> {

    @Modifying
    @Query("update Comment c set c.text=?1 where c.id=?2")
    public void updateCommentById(String text, int commentId);

}
