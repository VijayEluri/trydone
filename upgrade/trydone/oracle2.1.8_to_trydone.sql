ALTER TABLE jforum_categories ADD parent_id number DEFAULT 0;
ALTER TABLE jforum_users ADD user_qq varchar(15);
ALTER TABLE jforum_users ADD user_sex int;
ALTER TABLE jforum_users ADD user_birthday datetime;