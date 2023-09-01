USE adlister_db;
TRUNCATE ads;

INSERT INTO ads (title, description)
VALUES ('Thing', 'its a thing!'),
       ('Thing2', 'its a better thing!'),
       ('Thing3', 'its a suspicious thing...');