-- TABELLE BASE
CREATE TABLE sessions(
	id BIGINT PRIMARY KEY,
	subject VARCHAR(50) NOT NULL CHECK(length(subject) BETWEEN 3 AND 50),
	date DATE NOT NULL,
	duration INT NOT NULL CHECK(duration BETWEEN 1 AND 600),
	focuslvl INT DEFAULT 2 CHECK(focuslvl BETWEEN 1 AND 5),
	note varchar(500)
);