package chap10;

public class MultiTabBrowser {
	private double version;
	private Tab[] tabs;
	
	public MultiTabBrowser() {
		setTabs(new Tab[1]);
		
	}

	public Tab[] getTabs() {
		return tabs;
	}

	public void setTabs(Tab[] tabs) {
		this.tabs = tabs;
	}
	
	

}