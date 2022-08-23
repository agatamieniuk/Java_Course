INSERT INTO example.roles(id, name) VALUES(1, 'ADMIN');
INSERT INTO example.roles(id, name) VALUES(2, 'USER');

INSERT INTO example.users (id, username, password) VALUES (1, 'admin', '{bcrypt}$2a$10$PZomtrVYYPi4dB0vm5HYDOHib.O/WLXHmY41f4iHKKPCVdEDLJUvW');
INSERT INTO example.users (id, username, password) VALUES (2, 'user', '{bcrypt}$2a$10$ZKhlcv0ki4chQZhiUGupM.50BUfDavDXPfmHsn3np.IcA26IO8fSC');
INSERT INTO example.users (id, username, password) VALUES (3, 'noRole', '{bcrypt}$2a$10$ZKhlcv0ki4chQZhiUGupM.50BUfDavDXPfmHsn3np.IcA26IO8fSC');
INSERT INTO example.users (id, username, password) VALUES (4, 'user2', '{bcrypt}$2a$10$ZKhlcv0ki4chQZhiUGupM.50BUfDavDXPfmHsn3np.IcA26IO8fSC');

INSERT INTO example.users_roles (user_id, role_id) VALUES(1, 1);
INSERT INTO example.users_roles (user_id, role_id) VALUES(1, 2);
INSERT INTO example.users_roles (user_id, role_id) VALUES(2, 2);
INSERT INTO example.users_roles (user_id, role_id) VALUES(4, 2);

INSERT INTO orders (id, book_title, comment, price, username) VALUES (1, 'A book', 'comment', 25.25, 'user');
INSERT INTO orders (id, book_title, comment, price, username) VALUES (2, 'E-book', 'comment 2', 15.25, 'user');
INSERT INTO orders (id, book_title, comment, price, username) VALUES (3, 'Bike', 'comment 3', 1500.25, 'user2');
INSERT INTO orders (id, book_title, comment, price, username) VALUES (4, 'Car', 'comment 4', 240000.25, 'user2');
