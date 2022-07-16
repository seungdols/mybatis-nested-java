package com.sample.seungdols.domain.vo;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.sample.seungdols.domain.BoardMapper;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;

@MybatisTest
class BoardTest {
  @Autowired
  BoardMapper boardMapper;

  @Test
  public void boardMapperLoadTest() {
    assertThat(boardMapper).isNotNull();
  }

  @Test
  public void getBoardTest() {
    Integer boardId = 1;

    Board board = boardMapper.getBoardById(boardId);

    assertThat(board).isNotNull();
    assertThat(board.boardId).isEqualTo(boardId);
    assertThat(board.comments).isNull();
  }

  @Test
  public void selectBoardWithComment() {
    Integer boardId = 1;

    Board board = boardMapper.selectBoardWithComment(boardId);

    assertThat(board.comments.size()).isGreaterThan(0);
  }
}