DROP TABLE IF EXISTS t_director;
CREATE TABLE IF NOT EXISTS t_director (
	director_id char(8) NOT NULL PRIMARY KEY
	,name varchar(255) NOT NULL
	,real_name varchar(255)
	,birth_date date NOT NULL
	,overview text NOT NULL
	,remarks text
);

DROP TABLE IF EXISTS t_work;
CREATE TABLE IF NOT EXISTS t_work (
	director_id char(8) NOT NULL
	,work_id char(4) NOT NULL
	,work_name varchar(255) NOT NULL
	,work_type varchar(10) NOT NULL
	,year_of_release varchar(15) NOT NULL
	,position varchar(255) NOT NULL
	,memo varchar(255) NOT NULL
	, PRIMARY KEY(director_id, work_id)
);

DROP TABLE IF EXISTS m_work_type;
CREATE TABLE IF NOT EXISTS m_work_type (
	work_type varchar(10) NOT NULL PRIMARY KEY
	,work_type_ja varchar(10) NOT NULL
);
