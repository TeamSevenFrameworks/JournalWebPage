--Students
INSERT INTO students (student_id, name, lastname)
VALUES ('1', N'Олена', N'Шинкаренко');
INSERT INTO students (student_id, name, lastname)
VALUES ('2', N'Валентин', N'Романченко');
INSERT INTO students (student_id, name, lastname)
VALUES ('3', N'Марина', N'Броваренко');
INSERT INTO students (student_id, name, lastname)
VALUES ('4', N'Ярослав', N'Шевченко');
INSERT INTO students (student_id, name, lastname)
VALUES ('5', N'Марина', N'Петренко');
INSERT INTO students (student_id, name, lastname)
VALUES ('6', N'Максим', N'Гнатюк');
INSERT INTO students (student_id, name, lastname)
VALUES ('7', N'Олександра', N'Романченко');
INSERT INTO students (student_id, name, lastname)
VALUES ('8', N'Тарас', N'Іванченко');
INSERT INTO students (student_id, name, lastname)
VALUES ('9', N'Валентин', N'Микитюк');
INSERT INTO students (student_id, name, lastname)
VALUES ('10', N'Тарас', N'Сергієнко');

--subjects
INSERT INTO subjects (subject_id, title)
VALUES ('1', N'Web System Design and Development');
INSERT INTO subjects (subject_id, title)
VALUES ('2', N'Об''єктно-орієнтоване програмування на мові Java');
INSERT INTO subjects (subject_id, title)
VALUES ('3', N'Інформаційні та телекомунікаційні технології');


--activities
INSERT INTO activities (act_id, title)
VALUES ('1', N'1 семестр');
INSERT INTO activities (act_id, title)
VALUES ('2', N'2 семестр');
INSERT INTO activities (act_id, title)
VALUES ('3', N'3 семестр');

--act_scores
INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES ('1','1','1','1','67', '1', '1');
INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES ('2','1','1','1','80', '2', '1');
INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES ('3','1','1','2','78', '3', '2');
INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES ('4','1','1','2','78', '4', '2');
INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES ('5','1','1','3','56', '5', '3');



INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES ('6','2','3','1','67', '1', '1');
INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES ('7','2','2','1','80', '2', '1');
INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES ('8','3','2','2','78', '3', '2');
INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES ('9','3','3','2','78', '4', '2');
INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES ('10','4','2','3','56', '5', '3');






--final_scores
INSERT INTO final_scores (score_id, student_id,subject_id, score)
VALUES ('1', '1', '1', '100');
INSERT INTO final_scores (score_id, student_id,subject_id, score)
VALUES ('2', '1', '2', '90');
INSERT INTO final_scores (score_id, student_id,subject_id, score)
VALUES ('3', '1', '3', '70');

INSERT INTO final_scores (score_id, student_id,subject_id, score)
VALUES ('4', '2', '1', '60');
INSERT INTO final_scores (score_id, student_id,subject_id, score)
VALUES ('5', '2', '2', '88');
INSERT INTO final_scores (score_id, student_id,subject_id, score)
VALUES ('6', '2', '3', '75');

INSERT INTO final_scores (score_id, student_id,subject_id, score)
VALUES ('7', '3', '1', '33');
INSERT INTO final_scores (score_id, student_id,subject_id, score)
VALUES ('8', '3', '2', '60');
INSERT INTO final_scores (score_id, student_id,subject_id, score)
VALUES ('9', '3', '3', '56');
