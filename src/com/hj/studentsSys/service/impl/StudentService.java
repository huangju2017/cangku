package com.hj.studentsSys.service.impl;

import com.hj.studentsSys.dao.IStudentDao;
import com.hj.studentsSys.dao.impl.StudentDao;
import com.hj.studentsSys.pojo.Student;
import com.hj.studentsSys.service.IStudentService;

/**
 * 实现类
 * 
 * @author HuangJu
 *
 */
public class StudentService implements IStudentService {

	private IStudentDao dao = new StudentDao();

	@Override
	public int register(Student student) {
		return dao.register(student);
	}

	@Override
	public Student login(String sname, String spassword) {
		return dao.login(sname, spassword);
	}

}
