package at.jku.ce;

public class DomainObject {
private String comment;
public String uuid = UUID.randomUUID().toString();
private String name;


/** * Default constructor */	

	public DomainObject() {
		super();
	}
	public DomainObject(String name, String comment){
		super(); this.name = name;
	}
	public String getId() { return id; }
	
public String getComment() { return comment;}
	public void setComment(String comment) { this.comment = comment;}
}
