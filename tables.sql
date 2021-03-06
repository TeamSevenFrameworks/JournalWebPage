CREATE TABLE students (
	student_id int NOT NULL,
	name char(50) NOT NULL,
	lastname char(50) NOT NULL,
  CONSTRAINT PK_STUDENTS PRIMARY KEY
  (
  student_id 
  )

);

CREATE TABLE subjects (
	subject_id int NOT NULL,
	title char(100) NOT NULL,
  CONSTRAINT PK_SUBJECTS PRIMARY KEY 
  (
  subject_id 
  )

);

CREATE TABLE activities (
	act_id int NOT NULL,
	title char(100) NOT NULL,
  CONSTRAINT PK_ACTIVITIES PRIMARY KEY
  (
  act_id 
  ) 

);

CREATE TABLE act_scores (
	act_score_id int NOT NULL,
	student_id int NOT NULL,
	subject_id int NOT NULL,
	act_id int NOT NULL,
	score int NOT NULL,
	module int NOT NULL,
	semester int NOT NULL,
  CONSTRAINT PK_ACT_SCORES PRIMARY KEY 
  (
  act_score_id 
  ) 

);

CREATE TABLE final_scores (
	score_id int NOT NULL,
	student_id int NOT NULL,
	subject_id int NOT NULL,
	score int NOT NULL.
	CONSTRAINT PK_FINAL_SCORES PRIMARY KEY
  (
  score_id 
  )

);