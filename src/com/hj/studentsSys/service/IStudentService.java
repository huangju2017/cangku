package com.hj.studentsSys.service;

import com.hj.studentsSys.pojo.Student;

/**
 * student对象的服务接口
 * 
 * @author HuangJu
 */
public interface IStudentService {

	/**
	 * 注册学生对象
	 * 
	 * @param student
	 * @return：0表示注册失败，1表示注册成功
	 */
	int register(Student student);

	Student login(String sname, String spassword);

}
