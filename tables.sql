CREATE TABLE [students] (
	student_id int NOT NULL,
	name nchar(255) NOT NULL,
	lastname nchar(255) NOT NULL,
  CONSTRAINT [PK_STUDENTS] PRIMARY KEY CLUSTERED
  (
  [student_id] ASC
  ) WITH (IGNORE_DUP_KEY = OFF)

)
GO
CREATE TABLE [subjects] (
	subject_id int NOT NULL,
	title nchar(255) NOT NULL,
  CONSTRAINT [PK_SUBJECTS] PRIMARY KEY CLUSTERED
  (
  [subject_id] ASC
  ) WITH (IGNORE_DUP_KEY = OFF)

)
GO
CREATE TABLE [activities] (
	act_id int NOT NULL,
	title nchar(255) NOT NULL,
  CONSTRAINT [PK_ACTIVITIES] PRIMARY KEY CLUSTERED
  (
  [act_id] ASC
  ) WITH (IGNORE_DUP_KEY = OFF)

)
GO
CREATE TABLE [act_scores] (
	act_score_id int NOT NULL,
	student_id int NOT NULL,
	subject_id int NOT NULL,
	act_id int NOT NULL,
	score int NOT NULL,
	module int NOT NULL,
	semester int NOT NULL,
  CONSTRAINT [PK_ACT_SCORES] PRIMARY KEY CLUSTERED
  (
  [act_score_id] ASC
  ) WITH (IGNORE_DUP_KEY = OFF)

)
GO
CREATE TABLE [final_scores] (
	score_id int NOT NULL,
	student_id int NOT NULL,
	subject_id int NOT NULL,
	score int NOT NULL
)
GO





