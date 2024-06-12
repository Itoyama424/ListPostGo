-- DB作成
CREATE DATABASE example;
-- 作成したDBに接続
\c example;
-- テーブル作成
DROP TABLE IF EXISTS usertable;

CREATE TABLE UserTable (
  id BIGINT NOT NULL,
  name VARCHAR(100) NOT NULL,
  address VARCHAR(255) NULL,
  phone VARCHAR(50) NULL,
  update_time DATE NOT NULL,
  PRIMARY KEY (id));


INSERT 
INTO usertable(id, name, address, phone, update_time) 
VALUES (1, 'a　b c', '佐賀', '0909999999', CURRENT_TIMESTAMP);

INSERT 
INTO usertable(id, name, address, phone, update_time) 
VALUES (2, 'e　　f  g', '東京', '0909999999', CURRENT_TIMESTAMP);

INSERT 
INTO usertable(id, name, address, phone, update_time) 
VALUES (3, 'hij', '群馬', '0909999999', CURRENT_TIMESTAMP);

INSERT 
INTO usertable(id, name, address, phone, update_time) 
VALUES (4, 'hij', '栃木', '0909999999', CURRENT_TIMESTAMP);