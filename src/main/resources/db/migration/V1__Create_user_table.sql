create table user
(
	ID int auto_increment,
	ACCOUNT_ID VARCHAR(100) null,
	NAME VARCHAR(50) null,
	TOKEN VARCHAR(36) null,
	GMT_CREATE BIGINT null,
	GMT_MODIFIED bigint null,
	constraint user_pk
		primary key (ID)
);

