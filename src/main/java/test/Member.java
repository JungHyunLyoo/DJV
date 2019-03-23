package test;import javax.persistence.*;

@Entity
@Table(name="MEMBER") //Table 어노테이션이 생략되면 클래스 이름을 테이블(정확히는 엔티티) 이름으로 매핑함
public class Member {
	@Id//식별자 어노테이션
	@Column(name="ID")
	private String id;
	
	@Column(name="NAME")
	private String name;
	
	//매핑 정보가 없는 필드
	//필드명을 이용해 db 컬럼과 매핑
	private Integer age;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
}
