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


--semesters
INSERT INTO semesters (semester_id, title)
VALUES (1, '1 семестр');
INSERT INTO semesters (semester_id, title)
VALUES (2, '2 семестр');
INSERT INTO semesters (semester_id, title)
VALUES (3, '3 семестр');

--modules
INSERT INTO modules (module_id, semester_id, title)
VALUES (1, 1, '1 модуль');
INSERT INTO modules (module_id, semester_id, title)
VALUES (2, 1, '2 модуль');
INSERT INTO modules (module_id, semester_id, title)
VALUES (3, 2, '1 модуль');
INSERT INTO modules (module_id, semester_id, title)
VALUES (4, 2, '2 модуль');
INSERT INTO modules (module_id, semester_id, title)
VALUES (5, 3, '1 модуль');
INSERT INTO modules (module_id, semester_id, title)
VALUES (6, 3, '2 модуль');

--activities
INSERT INTO activities (act_id, subject_id, module_id, title)
VALUES (1, 1, 1, 'task 1');
INSERT INTO activities (act_id, subject_id, module_id, title)
VALUES (2, 1, 1, 'task 2');
INSERT INTO activities (act_id, subject_id, module_id, title)
VALUES (3, 1, 2, 'task 3');
INSERT INTO activities (act_id, subject_id, module_id, title)
VALUES (4, 2, 1, 'task 1');
INSERT INTO activities (act_id, subject_id, module_id, title)
VALUES (5, 2, 1, 'task 2');
INSERT INTO activities (act_id, subject_id, module_id, title)
VALUES (6, 2, 2, 'task 3');
INSERT INTO activities (act_id, subject_id, module_id, title)
VALUES (7, 3, 1, 'task 1');
INSERT INTO activities (act_id, subject_id, module_id, title)
VALUES (8, 3, 1, 'task 2');
INSERT INTO activities (act_id, subject_id, module_id, title)
VALUES (9, 3, 2, 'task 3');


--act_scores
INSERT INTO act_scores (act_score_id, student_id, act_id, score)
VALUES (1,1,1,10);
INSERT INTO act_scores (act_score_id, student_id, act_id, score)
VALUES (2,1,2,15);
INSERT INTO act_scores (act_score_id, student_id, act_id, score)
VALUES (3,2,1,20);
INSERT INTO act_scores (act_score_id, student_id, act_id, score)
VALUES (4,2,2,18);
INSERT INTO act_scores (act_score_id, student_id, act_id, score)
VALUES (5,2,3,32);