CREATE TABLE IF NOT EXISTS users (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    PRIMARY KEY (id),
    UNIQUE (email)
);

INSERT INTO users (name, email) VALUES ('User1', 'user1@mail.com'), ('User2', 'user2@mail.com');

