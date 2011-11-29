package at.jku.ce;

public class DomainObject {
public String id = UUID.randomUUID().toString();
private String name;


/** * Default constructor */	

	public DomainObject() {
		super();
	}
	public String getId() { return id; }
}
