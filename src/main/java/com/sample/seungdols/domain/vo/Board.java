package com.sample.seungdols.domain.vo;

import java.util.List;

public class Board {

  Integer boardId;
  String title;
  String content;
  List<Comment> comments;

  public Board() {
  }

  public Board(Integer boardId, String title, String content,
      List<Comment> comments) {
    this.boardId = boardId;
    this.title = title;
    this.content = content;
    this.comments = comments;
  }

  public Integer getBoardId() {
    return boardId;
  }

  public void setBoardId(Integer boardId) {
    this.boardId = boardId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public List<Comment> getComments() {
    return comments;
  }

  public void setComments(List<Comment> comments) {
    this.comments = comments;
  }
}
