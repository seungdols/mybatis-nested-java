package com.sample.seungdols.domain.vo;

public class Comment {

  Integer commentId;
  Integer boardId;
  String writer;
  String content;

  public Comment() {
  }

  public Comment(Integer commentId, Integer boardId, String writer, String content) {
    this.commentId = commentId;
    this.boardId = boardId;
    this.writer = writer;
    this.content = content;
  }

  public Integer getCommentId() {
    return commentId;
  }

  public void setCommentId(Integer commentId) {
    this.commentId = commentId;
  }

  public Integer getBoardId() {
    return boardId;
  }

  public void setBoardId(Integer boardId) {
    this.boardId = boardId;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
