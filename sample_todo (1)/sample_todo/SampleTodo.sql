--データベース作成
CREATE DATABASE kadai3; 

--テーブル作成
CREATE TABLE kadai3.todolist( 
    id int PRIMARY KEY AUTO_INCREMENT
    , todo varchar (20) not null
    , place varchar (20) not null
    , date_time DATETIME not null
    , memo varchar (20)
); 

--サンプルデータ
INSERT 
INTO kadai3.todolist(todo, place, date_time, memo) 
VALUES ('aiueoあいうえお', 'aiueoかきくけこ', '2023/9/9 12:00', 'あいうえおかきくけこ')
, ('勉強会', '恵比寿', '2023/9/16 13:00', 'C#')
, ('勉強会2', '恵比寿', '2023/9/23 13:00', 'Java');

SELECT *
FROM kadai3.todolist;