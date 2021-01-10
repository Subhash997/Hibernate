package xworks.college;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name= "collegedb_table")
public class CollegeDTO implements java.io.Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name= "CLGID")
	private int collegeID;
	
	@Column(name="CNAME")
	private String cName;
	
	@Column(name="CLOCATION")
	private String cLocation;
	
	@Column(name="NO_OF_STUDENTS")
	private int noOfStudents;
	
	@Column(name="NO_OF_ROOMS")
	private int noOfRooms;
	
	@Column(name="NO_OF_BRANCHES")
	private int noOfBranches;
	
	public CollegeDTO() {
		System.out.println(this.getClass().getSimpleName() + "Default constructor");
	}

	public CollegeDTO(int collegeID, String cName, String cLocation, int noOfStudents, int noOfRooms,
			int noOfBranches) {
		super();
		this.collegeID = collegeID;
		this.cName = cName;
		this.cLocation = cLocation;
		this.noOfStudents = noOfStudents;
		this.noOfRooms = noOfRooms;
		this.noOfBranches = noOfBranches;
	}

	public int getCollegeID() {
		return collegeID;
	}

	public void setCollegeID(int collegeID) {
		this.collegeID = collegeID;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcLocation() {
		return cLocation;
	}

	public void setcLocation(String cLocation) {
		this.cLocation = cLocation;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public int getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public int getNoOfBranches() {
		return noOfBranches;
	}

	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}

	@Override
	public String toString() {
		return "CollegeDTO [collegeID=" + collegeID + ", cName=" + cName + ", cLocation=" + cLocation
				+ ", noOfStudents=" + noOfStudents + ", noOfRooms=" + noOfRooms + ", noOfBranches=" + noOfBranches
				+ "]";
	}
	
	
	
}

