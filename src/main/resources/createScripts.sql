CREATE TABLE `questionaire`.`Questions` (
  `ID` INT NOT NULL,
  `Questions` VARCHAR(45) NOT NULL,
  `difficulty_Range` VARCHAR(45) NULL,
  `weightage` INT NULL,
  PRIMARY KEY (`ID`));
  
  
INSERT INTO questionaire.Questions (`ID`,`Questions`,`difficulty_Range`,`weightage`) VALUES (1,'what is abstract class?','low',2);
INSERT INTO questionaire.Questions (`ID`,`Questions`,`difficulty_Range`,`weightage`) VALUES (2,'how garbage collect works in java?','average',5);
INSERT INTO questionaire.Questions (`ID`,`Questions`,`difficulty_Range`,`weightage`) VALUES (3,'explain hashMap implementation?','high',10);
