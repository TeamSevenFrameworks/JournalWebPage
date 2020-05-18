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


--semesters
INSERT INTO semesters (id, title)
VALUES (1, '1 семестр');
INSERT INTO semesters (id, title)
VALUES (2, '2 семестр');
INSERT INTO semesters (id, title)
VALUES (3, '3 семестр');

--modules
INSERT INTO modules (id, semester_id, title)
VALUES (1, 1, '1 модуль');
INSERT INTO modules (id, semester_id, title)
VALUES (2, 1, '2 модуль');
INSERT INTO modules (id, semester_id, title)
VALUES (3, 2, '1 модуль');
INSERT INTO modules (id, semester_id, title)
VALUES (4, 2, '2 модуль');
INSERT INTO modules (id, semester_id, title)
VALUES (5, 3, '1 модуль');
INSERT INTO modules (id, semester_id, title)
VALUES (6, 3, '2 модуль');

--activities
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (1, 1, 1, 'task 1');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (2, 1, 1, 'task 2');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (3, 1, 1, 'task 3');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (4, 1, 2, 'task 4');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (5, 1, 2, 'task 5');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (6, 1, 2, 'task 6');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (7, 1, 2, 'task 7');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (8, 2, 1, 'task 1');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (9, 2, 1, 'task 2');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (10, 2, 2, 'task 3');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (11, 3, 1, 'task 1');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (12, 3, 1, 'task 2');
INSERT INTO activities (id, subject_id, module_id, title)
VALUES (13, 3, 2, 'task 3');


--act_scores
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (1,1,1,7);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (2,1,2,6);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (3,1,3,20);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (4,1,4,1);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (5,1,5,0);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (6,1,6,2);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (7,1,7,15);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (8,1,8,0);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (9,1,9,18);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (10,1,10,12);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (11,2,1,10);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (12,2,2,2);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (13,2,3,0);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (14,2,4,18);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (15,2,5,3);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (16,2,6,10);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (17,2,7,12);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (18,2,8,20);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (19,2,9,0);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (20,3,11,0);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (21,3,1,0);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (22,3,2,5);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (23,3,3,10);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (24,3,4,0);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (25,3,5,2);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (26,3,6,10);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (27,3,7,15);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (28,3,8,20);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (29,3,9,10);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (30,3,12,3);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (31,4,1,9);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (32,4,2,2);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (33,4,3,32);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (34,4,4,4);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (35,4,5,5);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (36,4,6,2);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (37,4,7,9);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (38,4,8,10);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (39,4,9,11);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (40,4,13,2);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (41,5,1,10);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (42,5,2,15);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (43,5,3,20);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (44,5,4,18);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (45,5,5,0);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (46,5,6,10);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (47,5,7,15);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (48,5,8,20);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (49,5,9,18);
INSERT INTO act_scores (id, student_id, activity_id, score)
VALUES (50,5,10,0);