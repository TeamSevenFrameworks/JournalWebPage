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

CREATE TABLE semesters (
	semester_id int NOT NULL,
	title char(100) NOT NULL,
  CONSTRAINT PK_SEMESTERS PRIMARY KEY
  (
  semester_id 
  ) 

);

CREATE TABLE modules (
	module_id int NOT NULL,
	semester_id int NOT NULL,
	title char(100) NOT NULL,
  CONSTRAINT PK_MODULES PRIMARY KEY
  (
  module_id 
  ) 

);

CREATE TABLE activities (
	act_id int NOT NULL,
	subject_id int NOT NULL,
	module_id int NOT NULL,
	title char(100) NOT NULL,
  CONSTRAINT PK_ACTIVITIES PRIMARY KEY
  (
  act_id 
  ) 

);

CREATE TABLE act_scores (
	act_score_id int NOT NULL,
	student_id int NOT NULL,
	act_id int NOT NULL,
	score int NOT NULL,
  CONSTRAINT PK_ACT_SCORES PRIMARY KEY 
  (
  act_score_id 
  )

);