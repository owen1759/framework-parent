drop table if exists `sys_user`;
create table if not exists `sys_user` (
	`id` int not null auto_increment primary key comment '自增ID',
	`username` varchar(32) not null unique comment '用户名',
	`password` char(32) not null comment '密码',
	`name` varchar(4) not null comment '姓名',
	`nickname` varchar(32) not null comment '昵称',
	`gender` tinyint not null default 9 comment '性别(1-男/2女/9-未填)', #GB/T 2261.1-2003
	`mobile` char(11) null default null comment '手机号码',
	`email` varchar(100) null default null comment '电子邮箱',
	`birthday` date null default null comment '生日',
	`address` varchar(64) null default null comment '地址',
	`create_time` timestamp not null default current_timestamp comment '创建时间',
	`modify_time` timestamp not null default current_timestamp on update current_timestamp comment '修改时间'
) comment='用户信息表';
show create table `sys_user`;

