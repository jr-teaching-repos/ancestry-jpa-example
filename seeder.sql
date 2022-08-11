USE ancestry_db;

SET foreign_key_checks = 0;
TRUNCATE TABLE users;
SET foreign_key_checks = 1;

insert into users (name, sex) VALUES
                             ('Justin', 'M'),
                             ('William', 'M'),
                             ('Sharon', 'F'),
                             ('Ernest', 'M'),
                             ('Brenda', 'F'),
                             ('Mary', 'F'),
                             ('Leo', 'M'),
                             ('Ernest''s Mother', 'F'),
                             ('Ernest''s Father', 'M'),
                             ('Brenda''s Mother', 'F'),
                             ('Brenda''s Father', 'M'),
                             ('Mary''s Mother', 'F'),
                             ('Mary''s Father', 'M'),
                             ('Leo''s Mother', 'F'),
                             ('Leo''s Father', 'M');


insert into ancestry (user_id, parent_id) VALUES (1, 2),
                                                 (1, 3),
                                                 (2, 4),
                                                 (2, 5),
                                                 (3, 6),
                                                 (3, 7),
                                                 (4, 8),
                                                 (4, 9),
                                                 (5, 10),
                                                 (5, 11),
                                                 (6, 12),
                                                 (6, 13),
                                                 (7, 14),
                                                 (7, 15);

