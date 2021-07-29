package Collections;

public class Item {

	private long id;
	private String title;
	private ClothesGroup group;

	public Item(long id, String title, ClothesGroup group) {
		this.id = id;
		this.title = title;
		this.group = group;
	}

	public Item(long id, String title) {
		this(id, title, ClothesGroup.CLOTHES);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ClothesGroup getGroup() {
		return group;
	}

	public void setGroup(ClothesGroup group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "{" +
				" id = " + id +
				", title = '" + title +
				"', group = " + group +
				" }" + '\n';
	}

}
