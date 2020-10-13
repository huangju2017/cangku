package com.hj.studentsSys.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.hj.studentsSys.dao.IStudentDao;
import com.hj.studentsSys.pojo.Student;
import com.hj.studentsSys.utils.TxDBUtils;

/**
 * 这是student对象接口的实现类
 */
public class StudentDao implements IStudentDao {

	@Override
	public int register(Student student) {
		String sql = "insert into student values(null,?,?,?)";

		try {
			QueryRunner runner = new QueryRunner(TxDBUtils.getSource());
			int line = runner.update(sql, student.getSname(), student.getSpassword(), student.getAge());
			return line;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public Student login(String sname, String spassword) {
		String sql = "select * from student where sname=? and spassword=?";
		try {
			QueryRunner runner = new QueryRunner(TxDBUtils.getSource());
			Student query = runner.query(sql, new BeanHandler<Student>(Student.class), sname, spassword);
			return query;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
