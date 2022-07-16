package com.sample.seungdols.domain.vo;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import com.sample.seungdols.domain.BoardMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;

@AutoConfigureTestDatabase(replace = Replace.NONE)
@MybatisTest
class BoardTest {

  @Autowired
  BoardMapper boardMapper;

  @Test
  @DisplayName("boardMapper가 주입 되면, null이 아니다")
  public void boardMapperLoadTest() {
    assertThat(boardMapper).isNotNull();
  }

  @Test
  @DisplayName("nested select 형태로 가져온다")
  public void getBoardTest() {
    Integer boardId = 1;

    Board board = boardMapper.getBoardById(boardId);

    assertThat(board).isNotNull();
    assertThat(board.boardId).isEqualTo(boardId);
    assertThat(board.comments).isNotNull();
  }

  @Test
  @DisplayName("nested result 형태로 가져온다")
  public void selectBoardWithComment() {
    Integer boardId = 1;

    Board board = boardMapper.selectBoardWithComment(boardId);

    assertThat(board.comments.size()).isGreaterThan(0);
  }
}