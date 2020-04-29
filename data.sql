--Students
INSERT INTO students (student_id, name, lastname)
VALUES (1, 'Олена', 'Шинкаренко');
INSERT INTO students (student_id, name, lastname)
VALUES (2,  'Валентин', 'Романченко');
INSERT INTO students (student_id, name, lastname)
VALUES (3,  'Марина', 'Броваренко');
INSERT INTO students (student_id, name, lastname)
VALUES (4,  'Ярослав', 'Шевченко');
INSERT INTO students (student_id, name, lastname)
VALUES (5,  'Марина', 'Петренко');
INSERT INTO students (student_id, name, lastname)
VALUES (6,  'Максим', 'Гнатюк');
INSERT INTO students (student_id, name, lastname)
VALUES (7,  'Олександра', 'Романченко');
INSERT INTO students (student_id, name, lastname)
VALUES (8,  'Тарас', 'Іванченко');
INSERT INTO students (student_id, name, lastname)
VALUES (9,  'Валентин', 'Микитюк');
INSERT INTO students (student_id, name, lastname)
VALUES (10, 'Тарас', 'Сергієнко');

--subjects
INSERT INTO subjects (subject_id, title)
VALUES (1, 'Web System Design and Development');
INSERT INTO subjects (subject_id, title)
VALUES (2, 'Об''єктно-орієнтоване програмування на мові Java');
INSERT INTO subjects (subject_id, title)
VALUES (3, 'Інформаційні та телекомунікаційні технології');


--activities
INSERT INTO activities (act_id, title)
VALUES (1, '1 семестр');
INSERT INTO activities (act_id, title)
VALUES (2, '2 семестр');
INSERT INTO activities (act_id, title)
VALUES (3, '3 семестр');

--act_scores
INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES (1,1,1,1,67,1,1);
INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES (2,1,1,1,80,2,1);
INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES (3,1,1,2,78,3,2);
INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES (4,1,1,2,78,4,2);
INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES (5,1,1,3,56,5,3);



INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES (6,2,3,1,67,1,1);
INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES (7,2,2,1,80,2,1);
INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES (8,3,2,2,78,3,2);
INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES (9,3,3,2,78,4,2);
INSERT INTO act_scores (act_score_id, student_id, subject_id, act_id, score, module, semester)
VALUES (10,4,2,3,56,5,3);






--final_scores
INSERT INTO final_scores (score_id, student_id,subject_id, score)
VALUES (1, 1, 1, 100);
INSERT INTO final_scores (score_id, student_id,subject_id, score)
VALUES (2, 1, 2, 90);
INSERT INTO final_scores (score_id, student_id,subject_id, score)
VALUES (3, 1, 3, 70);

INSERT INTO final_scores (score_id, student_id,subject_id, score)
VALUES (4, 2, 1, 60);
INSERT INTO final_scores (score_id, student_id,subject_id, score)
VALUES (5, 2, 2, 88);
INSERT INTO final_scores (score_id, student_id,subject_id, score)
VALUES (6, 2, 3, 75);

INSERT INTO final_scores (score_id, student_id,subject_id, score)
VALUES (7, 3, 1, 33);
INSERT INTO final_scores (score_id, student_id,subject_id, score)
VALUES (8, 3, 2, 60);
INSERT INTO final_scores (score_id, student_id,subject_id, score)
VALUES (9, 3, 3, 56);
