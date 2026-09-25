package chap10;

public class Tab {
	private String title, URL;
	
	public Tab() {
		this("www.home.com");
		setTitle("Home Page");
	}
	
	public Tab(String URL) {
		setURL(URL);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String URL) {
		this.URL = URL;
	}
	
	

}