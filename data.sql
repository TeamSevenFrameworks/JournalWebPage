--Students
INSERT INTO students (id, name, lastname)
VALUES (1, 'Олена', 'Шинкаренко');
INSERT INTO students (id, name, lastname)
VALUES (2,  'Валентин', 'Романченко');
INSERT INTO students (id, name, lastname)
VALUES (3,  'Марина', 'Броваренко');
INSERT INTO students (id, name, lastname)
VALUES (4,  'Ярослав', 'Шевченко');
INSERT INTO students (id, name, lastname)
VALUES (5,  'Марина', 'Петренко');
INSERT INTO students (id, name, lastname)
VALUES (6,  'Максим', 'Гнатюк');
INSERT INTO students (id, name, lastname)
VALUES (7,  'Олександра', 'Романченко');
INSERT INTO students (id, name, lastname)
VALUES (8,  'Тарас', 'Іванченко');
INSERT INTO students (id, name, lastname)
VALUES (9,  'Валентин', 'Микитюк');
INSERT INTO students (id, name, lastname)
VALUES (10, 'Тарас', 'Сергієнко');

--subjects
INSERT INTO subjects (id, title)
VALUES (1, 'Web System Design and Development');
INSERT INTO subjects (id, title)
VALUES (2, 'Об''єктно-орієнтоване програмування на мові Java');
INSERT INTO subjects (id, title)
VALUES (3, 'Інформаційні та телекомунікаційні технології');
INSERT INTO subjects (id, title)
VALUES (4, 'Сучасні фреймворки');


--semesters
INSERT INTO semesters (id, title)
VALUES (1, '1 семестр');
INSERT INTO semesters (id, title)
VALUES (2, '2 семестр');

--modules
INSERT INTO modules (id, semester_id, title)
VALUES (1, 1, '1 модуль');
INSERT INTO modules (id, semester_id, title)
VALUES (2, 1, '2 модуль');
INSERT INTO modules (id, semester_id, title)
VALUES (3, 2, '1 модуль');
INSERT INTO modules (id, semester_id, title)
VALUES (4, 2, '2 модуль');

--activities
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (1, 1, 1, 'task 1');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (2, 1, 1, 'task 2');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (3, 1, 2, 'task 3');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (4, 1, 2, 'task 4');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (5, 1, 3, 'task 1');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (6, 1, 3, 'task 2');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (7, 1, 4, 'task 3');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (8, 1, 4, 'task 4');

INSERT INTO activities (id, subject_id, module_id, title)
VALUES (9, 2, 3, 'task 1');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (10, 2, 3, 'task 2');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (11, 2, 4, 'task 3');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (12, 2, 4, 'task 4');


INSERT INTO activities (id, subject_id, module_id, title)
VALUES (13, 3, 1, 'task 1');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (14, 3, 1, 'task 2');
INSERT INTO activities (id, subject_id, module_id, title)


VALUES (15, 4, 2, 'task 3');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (16, 4, 2, 'task 4');



--act_scores
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (1,1,1,7);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (2,1,2,6);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (3,1,3,20);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (4,1,4,18);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (5,1,5,32);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (6,1,6,10);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (7,1,7,15);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (8,1,8,20);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (9,1,9,18);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (10,1,10,32);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (11,1,11,10);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (12,1,12,15);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (13,1,13,20);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (14,1,14,18);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (15,1,15,32);

--act_scores
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (16,2,1,12);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (17,2,2,11);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (18,2,3,32);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (19,2,4,12);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (20,2,5,25);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (21,2,6,16);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (22,2,7,8);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (23,2,8,5);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (24,2,9,7);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (25,2,10,8);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (26,2,11,2);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (27,2,12,5);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (28,2,13,1);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (29,2,14,32);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (30,2,15,21);
