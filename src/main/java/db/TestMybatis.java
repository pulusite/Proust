package db;

import db.bean.User;
import db.mapper.UserMapper;
import db.sqlSession.MySqlsession;

public class TestMybatis {
	
    public static void main(String[] args) {  
        MySqlsession sqlsession=new MySqlsession();  
        UserMapper mapper = sqlsession.getMapper(UserMapper.class);  
        User user = mapper.getUserById("1");
        System.out.println(user);
    } 

}
