CREATE TABLE
    sys_user_info
    (
        user_id INT NOT NULL AUTO_INCREMENT COMMENT '用户ID',
        username VARCHAR(20) NOT NULL COMMENT '用户名称',
        password VARCHAR(20) NOT NULL COMMENT '用户密码',
        sex CHAR(2) NOT NULL COMMENT '性别',
        age INT COMMENT '年龄',
        create_time DATETIME COMMENT '创建时间',
        create_user INT COMMENT '创建用户',
        modify_time DATETIME COMMENT '修改时间',
        modify_user INT COMMENT '修改用户',
        PRIMARY KEY (user_id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';

CREATE TABLE
    sys_role_info
    (
        role_id INT NOT NULL AUTO_INCREMENT COMMENT '角色ID',
        rolename VARCHAR(20) NOT NULL COMMENT '角色名称',
		status CHAR(2) NOT NULL COMMENT '角色状态',
        create_time DATETIME COMMENT '创建时间',
        create_user INT COMMENT '创建用户',
        modify_time DATETIME COMMENT '修改时间',
        modify_user INT COMMENT '修改用户',
        PRIMARY KEY (role_id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色信息表';
	
CREATE TABLE
    sys_user_role
    (
		user_role_id INT NOT NULL AUTO_INCREMENT COMMENT '用户角色ID'
        role_id INT   COMMENT '角色ID',
        user_id INT   COMMENT '用户ID', 
        PRIMARY KEY (role_user_id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色用户关联表';
	
CREATE TABLE
    sys_menu_info
    (
        menu_id INT NOT NULL AUTO_INCREMENT COMMENT '菜单ID',
		parent_menu_id INT COMMENT '父菜单ID',
        menu_name VARCHAR(20) NOT NULL COMMENT '菜单名称', 
		url VARCHAR(20) NOT NULL COMMENT '菜单URL',
		status CHAR(2) NOT NULL COMMENT '菜单状态',
        create_time DATETIME COMMENT '创建时间',
        create_user INT COMMENT '创建用户',
        modify_time DATETIME COMMENT '修改时间',
        modify_user INT COMMENT '修改用户',
        PRIMARY KEY (menu_id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='菜单信息表';

CREATE TABLE
    sys_role_menu
    (
		role_menu_id INT NOT NULL AUTO_INCREMENT COMMENT '角色菜单ID'
        role_id INT   COMMENT '角色ID',
        menu_id INT   COMMENT '用户ID', 
        PRIMARY KEY (role_menu_id)
    )
    ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色菜单关联表';