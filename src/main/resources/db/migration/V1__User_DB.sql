CREATE SEQUENCE usr_seq start with 1 increment by 50;

CREATE TABLE usr(
    id          int8   PRIMARY KEY,
    username   VARCHAR(50)    NOT NULL,
    password    VARCHAR(200)     NOT NULL,
    role   VARCHAR(20)    NOT NULL
);