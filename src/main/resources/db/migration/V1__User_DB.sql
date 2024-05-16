CREATE SEQUENCE usr_seq start with 1 increment by 50;
CREATE TABLE usr(
    id      INT8     PRIMARY KEY,
    username    VARCHAR(50)     NOT NULL,
    password    VARCHAR(50)     NOT NULL
);