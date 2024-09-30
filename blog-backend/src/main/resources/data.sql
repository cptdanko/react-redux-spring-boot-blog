CREATE TABLE IF NOT EXISTS blogpost (id VARCHAR(9) PRIMARY KEY, title VARCHAR(255), content VARCHAR(255)
, date_published DATE, username VARCHAR(255));

insert into blogpost(id, title, content, username) VALUES (1, 'Post 1.0', 'Brand new blogpost','bhuman@mydaytodo.com');
insert into blogpost(id, title, content, username) VALUES (2, 'Post 2.0', 'Even a brander and newer blogpost','bhuman@mydaytodo.com');
insert into blogpost(id, title, content, username) VALUES (3, 'Post 3.0', 'Not the newest and brandest blogpost','bhuman@mydaytodo.com');
insert into blogpost(id, title, content, username) VALUES (4, 'Post 4.0', 'Qins new blogpost and announces it to the world','qin@mydaytodo.com');