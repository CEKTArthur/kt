package at.jku.ce;

public class DomainObject {
private String comment;
public String uuid = UUID.randomUUID().toString();
private String name;


/** * Default constructor */	

	protected DomainObject() {
		super();
	}
	public DomainObject(String name, String comment){
		super(); this.name = name;
	}
	public String getId() { return id; }
	
public String getComment() { return comment;
}

	public void setComment(final String comment) { this.comment = comment;
}

	
	public String getName() { return name;
}
	
public void setName(final String pname) { this.name = pname;
}
	public String toString() 
	{ return "DomainObject [name=" + name + ", comment=" + comment + ", uuid=" + uuid + "]"; }

