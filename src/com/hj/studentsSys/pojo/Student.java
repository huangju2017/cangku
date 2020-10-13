package com.hj.studentsSys.pojo;

import java.io.Serializable;

/**
 * 这是Student的实体类
 * @author HuangJu
 *
 */
@SuppressWarnings("serial")
public class Student implements Serializable{

	//id
	private Integer id;
	// 姓名
	private String sname;
	// 密码
	private String spassword;
	// 年龄
	private String age;
	
	/**
	 * 空参构造方法
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 有参构造方法
	 * @param id
	 * @param sname
	 * @param spassword
	 * @param age
	 */
	public Student(Integer id, String sname, String spassword, String age) {
		super();
		this.id = id;
		this.sname = sname;
		this.spassword = spassword;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSpassword() {
		return spassword;
	}

	public void setSpassword(String spassword) {
		this.spassword = spassword;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Student) {
			Student s = (Student) obj;
			if(this.getId()==s.getId()&&this.getSname().equals(s.getSname())) {
				return true;
			};

		}
		return false;
		
	}
	
	
	
	
	
	
}
