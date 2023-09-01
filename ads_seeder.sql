USE adlister_db;
TRUNCATE ads;

INSERT INTO ads (user_id, title, description)
VALUES (1, 'Thing', 'its a thing!'),
       (1, 'Thing2', 'its a better thing!'),
       (1, 'Thing3', 'its a suspicious thing...');

USE adlister_db;
TRUNCATE users;
INSERT INTO users (id, username, email, password)
VALUES (1, 'user1', 'user1@users.user', 'password');

SELECT * FROM ads;