ALTER TABLE jforum_categries ALTER COLUMN add parent_id int;
ALTER TABLE jforum_users ALTER COLUMN add user_qq varchar(15);
ALTER TABLE jforum_users ALTER COLUMN add user_sex int;
ALTER TABLE jforum_users ALTER COLUMN add user_birthday datetime;