
CREATE SEQUENCE ID_SEQ START WITH 1;

CREATE TABLE TIME_ZONE(
    ID bigint PRIMARY KEY,
    NAME VARCHAR NOT NULL);

CREATE TABLE SUBDIVISION_PU(
ID bigint PRIMARY KEY ,
NAME VARCHAR NOT NULL);

CREATE TABLE COMPANY(
id bigint PRIMARY KEY,
SHORT_NAME VARCHAR,
FULL_NAME VARCHAR,
LEGAL_ADRESS VARCHAR,
ACTUAL_ADRESS VARCHAR,
INN VARCHAR (12),
KPP VARCHAR (9),
FIAS VARCHAR,
PHONE VARCHAR (30),
ACTUAL BOOLEAN,
VIP VARCHAR,
TIME_ZONE_ID BIGINT,
WORK_FROM TIME,
WORK_UNTIL TIME,
LUNCH_FROM TIME,
LUNCH_UNTIL TIME,
SUBDIVISION_DE_ID BIGINT,
PU_ID BIGINT,
NOTE VARCHAR);

alter table COMPANY add constraint fk_1 foreign key (TIME_ZONE_ID) REFERENCES TIME_ZONE (ID);
alter table COMPANY add constraint fk_2 foreign key (PU_ID) REFERENCES SUBDIVISION_PU (ID);




);