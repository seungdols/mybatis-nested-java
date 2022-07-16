package com.sample.seungdols.domain;

import com.sample.seungdols.domain.vo.Board;
import com.sample.seungdols.domain.vo.Comment;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
  Board getBoardById(Integer boardId);

  List<Comment> getCommentListById(Integer boardId);

  Board selectBoardWithComment(Integer boardId);
}
