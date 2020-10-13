package com.hj.studentsSys.dao;

import com.hj.studentsSys.pojo.Student;

/**
 * student的dao接口
 * @author HuangJu
 *
 */
public interface IStudentDao {

	/**
	 * 注册学生对象
	 * @param student
	 * @return
	 */
	int register(Student student);
	
	Student login(String sname,String spassword);

}
