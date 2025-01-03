1. Run below sql script in Mysql work bench

create database test; 
use test; 
CREATE TABLE employee ( emp_id int NOT NULL AUTO_INCREMENT, full_name varchar(255) NOT NULL, email varchar(255), address varchar(255), PRIMARY KEY (emp_id) );

INSERT INTO employee (full_name,email,address) VALUES ('Ambika KH','ammu@gmail.com','Hyderbad');

INSERT INTO employee (full_name,email,address) VALUES ('Ambi K','ambi@gmail.com','Bangalore');

DELIMITER $$
CREATE PROCEDURE getAllEmployees()
BEGIN
    SELECT * FROM employee;
END$$
DELIMITER ;

2. Now take this app into IDE and run "mvn clean install "
3. Run the application and You will see employee details printed in the console

Happy coding !

Ambika Valagonda
