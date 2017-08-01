CREATE USER 'mqs@localhost' IDENTIFIED BY 'mqs';
GRANT ALL PRIVILEGES ON *.* TO 'mqs'@'localhost' WITH GRANT OPTION;
SET PASSWORD FOR 'mqs'@'localhost' = PASSWORD('test123');
