CREATE SEQUENCE car_seq start with 1 increment by 50;
CREATE TABLE Car(
    id      INT8    PRIMARY KEY,
    usr_id  INT8,
    name    VARCHAR(50)     NOT NULL,
    model    VARCHAR(50)     NOT NULL,
    year    INTEGER     NOT NULL,
    carcass    VARCHAR(50)     NOT NULL,
    engine    VARCHAR(50)     NOT NULL,
    FOREIGN KEY (usr_id) REFERENCES usr(id)
);