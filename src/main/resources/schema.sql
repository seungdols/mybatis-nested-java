CREATE TABLE board
(
    board_id      IDENTITY PRIMARY KEY,
    board_title   VARCHAR(255) NOT NULL,
    board_content VARCHAR(255) NOT NULL
);

CREATE TABLE comment
(
    comment_id IDENTITY PRIMARY KEY,
    board_id   INT          NOT NULL,
    writer     VARCHAR(255) NOT NULL,
    content    VARCHAR(255) NOT NULL,
    FOREIGN KEY (board_id) REFERENCES board
);