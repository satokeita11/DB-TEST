package jp.co.aforce.beans;

public class User {
	private String login_id;
	private String password;
	private String last_name;
	private String first_name;
	private char gender;
	private int birth_year;
	private int birth_month;
	private int birth_day;
	private String job;
	private String phone_number;
	private String email;

	public User() {
	}

	public User(String login_id, String password, String last_name, String first_name, char gender, int birth_year,
			int birth_month, int birth_day, String job, String phone_number, String email) {
		this.login_id = login_id;
		this.password = password;
		this.last_name = last_name;
		this.first_name = first_name;
		this.gender = gender;
		this.birth_year = birth_year;
		this.birth_month = birth_month;
		this.birth_day = birth_day;
		this.job = job;
		this.phone_number = phone_number;
		this.email = email;
	}

	public String getLogin_id() {
		return login_id;
	}

	public void setlogin_id(String login_id) {
		this.login_id = login_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(int birth_year) {
		this.birth_year = birth_year;
	}

	public int getBirth_month() {
		return birth_month;
	}

	public void setBirth_month(int birth_month) {
		this.birth_month = birth_month;
	}

	public int getBirth_day() {
		return birth_day;
	}

	public void setBirth_day(int birth_day) {
		this.birth_day = birth_day;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;

	}
}
