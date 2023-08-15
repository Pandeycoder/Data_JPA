package pandey.com.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_master")
public class UserEntities {
	
	@Id
	@Column(name="user_id")
	private Integer id;
	
	@Column(name="user_name")
	private String name;
     
	@Column(name="user_email")
	private String email;

	@Column(name="user_gender")
	private String gender;
	
	@Column(name="user_city")
	private String city;
	
	@Column(name="user_age")
	private Integer age;

	public synchronized Integer getId() {
		return id;
	}

	public synchronized void setId(Integer id) {
		this.id = id;
	}

	public synchronized String getName() {
		return name;
	}

	public synchronized void setName(String name) {
		this.name = name;
	}

	public synchronized String getEmail() {
		return email;
	}

	public synchronized void setEmail(String email) {
		this.email = email;
	}

	public synchronized String getGender() {
		return gender;
	}

	public synchronized void setGender(String gender) {
		this.gender = gender;
	}

	public synchronized String getCity() {
		return city;
	}

	public synchronized void setCity(String city) {
		this.city = city;
	}

	public synchronized Integer getAge() {
		return age;
	}

	public synchronized void setAge(Integer age) {
		this.age = age;
	}

	

	@Override
	public String toString() {
		return "UserEntities [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + ", city="
				+ city + ", age=" + age + ", getId()=" + getId() + ", getName()=" + getName() + ", getEmail()="
				+ getEmail() + ", getGender()=" + getGender() + ", getCity()=" + getCity() + ", getAge()=" + getAge()
				+ "]";
	}
	
	


	
}
