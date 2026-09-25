package chap10;

public class BrowserTest {
	public static void main(String[] args) {
		Browser b = new Browser();
		b.getTab().setURL("www.google.com");
		b.getTab().setTitle("Google");

		System.out.println("Title:" + b.getTab().getTitle());
		System.out.println("URL:" + b.getTab().getURL());

	}

}

class Browser {
	private double version;
	private Tab tab;

	public Browser() {
		setVersion(1.0);
		setTab(new Tab()); // aggregated/composed objects must be instantiated
		System.out.println("Tab is created");
	}

	public double getVersion() {
		return version;
	}

	public void setVersion(double version) {
		this.version = version;
	}

	public Tab getTab() {
		return tab;
	}

	public void setTab(Tab tab) {
		this.tab = tab;
	}
}