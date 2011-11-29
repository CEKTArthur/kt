package at.jku.ce;

public class DomainObject {
private String name;
public String id;
public DomainObject(String id) { super(); this.id = id;
}
	public DomainObject() {
		super();
	}
	public String getId() { return id; }
}
