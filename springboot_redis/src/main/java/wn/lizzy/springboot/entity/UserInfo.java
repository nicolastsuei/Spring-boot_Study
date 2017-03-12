package wn.lizzy.springboot.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 测试实体类
 * UserInfo.java
 * @author nicolas 2017年3月7日--下午8:58:42
 *
 *
 */
@Entity
public class UserInfo  implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue
    private long id;
    private String name;
    private String pwd;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "UserInfo [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}
}
