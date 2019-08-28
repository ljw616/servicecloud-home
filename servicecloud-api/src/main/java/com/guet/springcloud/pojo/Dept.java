package com.guet.springcloud.pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

// 全参构造函数
@AllArgsConstructor
@NoArgsConstructor           // 无参构造函数
@Data                        // 生成getter和setter函数
@Accessors(chain=true)       // 访问，链式访问
public class Dept implements Serializable {
	
	private Long 	deptno; // 主键
	private String 	dname; // 部门名称
	private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库	
	
//	public Dept() {
//		super();
//	}
//	
//	public Dept(Long deptno, String dname, String db_source) {
//		super();
//		this.deptno = deptno;
//		this.dname = dname;
//		this.db_source = db_source;
//	}
//
//	public Long getDeptno() {
//		return deptno;
//	}
//
//	public void setDeptno(Long deptno) {
//		this.deptno = deptno;
//	}
//
//	public String getDname() {
//		return dname;
//	}
//
//	public void setDname(String dname) {
//		this.dname = dname;
//	}
//
//	public String getDb_source() {
//		return db_source;
//	}
//
//	public void setDb_source(String db_source) {
//		this.db_source = db_source;
//	}
	
}
