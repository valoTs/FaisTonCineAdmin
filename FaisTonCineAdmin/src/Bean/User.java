package Bean;

public class User {
	
	private  int idUser;
	private  String firstName;
	private String lastName;
	private String email;
	private int nombreIdee;
	
	
	
	public User() {
		super();
	}
	
	
	public User(int idUser, String firstName, String lastName, String email, int nombreIdee) {
		super();
		this.idUser = idUser;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.nombreIdee = nombreIdee;
	}


	public User(int idUser, String firstName, String lastName, String email) {
		super();
		this.idUser = idUser;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public User(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public int getNombreIdee() {
		return nombreIdee;
	}


	public void setNombreIdee(int nombreIdee) {
		this.nombreIdee = nombreIdee;
	}


	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", nombreIdee=" + nombreIdee + "]";
	}


	

}
