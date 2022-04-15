create table armeria_user (
                         oid VARCHAR(64) primary key,
                         user_id VARCHAR(64) unique,
                         username VARCHAR(64),
                         password VARCHAR(64),
                         cell_phone VARCHAR(64)
);