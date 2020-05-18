CREATE TABLE students (
	id int NOT NULL,
	name char(50) NOT NULL,
	lastname char(50) NOT NULL,
  CONSTRAINT PK_STUDENTS PRIMARY KEY
  (
  id 
  )

);

CREATE TABLE subjects (
	id int NOT NULL,
	title char(100) NOT NULL,
  CONSTRAINT PK_SUBJECTS PRIMARY KEY 
  (
  id 
  )

);

CREATE TABLE semesters (
	id int NOT NULL,
	title char(100) NOT NULL,
  CONSTRAINT PK_SEMESTERS PRIMARY KEY
  (
  id 
  ) 

);

CREATE TABLE modules (
	id int NOT NULL,
	semester_id int NOT NULL,
	title char(100) NOT NULL,
  CONSTRAINT PK_MODULES PRIMARY KEY
  (
  id 
  ),
  FOREIGN KEY (semester_id)  REFERENCES semesters (id)

);

CREATE TABLE activities (
	id int NOT NULL,
	subject_id int NOT NULL,
	module_id int NOT NULL,
	title char(100) NOT NULL,
  CONSTRAINT PK_ACTIVITIES PRIMARY KEY
  (
  id 
  ),
  FOREIGN KEY (subject_id)  REFERENCES subjects (id),
  FOREIGN KEY (module_id)  REFERENCES modules (id)

);

CREATE TABLE act_scores (
	id int NOT NULL,
	student_id int NOT NULL,
	activity_id int NOT NULL,
	score int NOT NULL,
  CONSTRAINT PK_ACT_SCORES PRIMARY KEY 
  (
  id 
  ),
  FOREIGN KEY (student_id)  REFERENCES students (id),
  FOREIGN KEY (activity_id)  REFERENCES activities (id)

);