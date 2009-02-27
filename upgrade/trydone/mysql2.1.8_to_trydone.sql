ALTER TABLE jforum_categories ADD parent_id INT DEFAULT 0;
ALTER TABLE jforum_users add `user_qq` VARCHAR(15);
ALTER TABLE jforum_users add `user_sex` TINYINT default 0;
ALTER TABLE jforum_users add `user_birthday` datetime;