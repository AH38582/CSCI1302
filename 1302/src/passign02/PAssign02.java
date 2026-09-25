package passign02;

public class PAssign02 {

	public static void main(String[] args) {
//references: brand = "OEM", model + "Basic", type = "integrated, connectType = "N/A", powerReq = 100, exPower = "N/A", memory = 1;

		// Computer instances
		Computer c1 = new Computer(); // default

		Computer c2 = new Computer();
		c2.setBrand("Dell");
		c2.setModel("Optiplex");
		c2.setVideoCard(new VideoCard("discrete", "PCIEx16", 575, "8-pin", 24));

		Computer c3 = new Computer();
		c3.setBrand("Lenovo");
		c3.setModel("IdeaCentre");
		c3.setVideoCard(new VideoCard("integrated", "N/A", 120, "N/A", 4));

		Computer c4 = new Computer();
		c4.setBrand("HP Omen");
		c4.setModel("Obelisk");
		c4.setVideoCard(new VideoCard("discrete", "PCIEx8", 150, "6-pin", 8));

		Computer c5 = new Computer();
		c5.setBrand("Lenovo");
		c5.setModel("IdeaCentre");
		c5.setVideoCard(new VideoCard("integrated", "N/A", -110, "N/A", 2));

		Computer[] computers = { c1, c2, c3, c4, c5 };
		printArray(computers);

	}

	// printArray()
	public static void printArray(Computer[] computers) {
		for (Computer computer : computers) {
			System.out.println(computer.getInfo());
		}
	}

}

class Computer {
	// data fields
	// brand, model, videoCard
	private String brand, model;
	private VideoCard videoCard;

	// default constructor
	// brand = "OEM", model + "Basic"
	public Computer() {
		this(new VideoCard());
	}

	// convenience constructor that uses videoCard as parameter
	public Computer(VideoCard videoCard) {
		setBrand("OEM");
		setModel("Basic");
		setVideoCard(new VideoCard());
	}

	// accessors and mutators

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public VideoCard getVideoCard() {
		return videoCard;
	}

	public void setVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}

	// getInfo() that returns brand, model, and calls VideoCard's getInfo()
	public String getInfo() {
		return String.format("%s %s%n%s", getBrand(), getModel(), getVideoCard().getInfo());
	}

}

class VideoCard {
	// data fields
	// type, connectionType, powerRequirement, externalPower, memorySize
	private String type, connectionType, externalPower;
	private int powerRequirement, memorySize;

	// default constructor
	// type = "integrated, connectType = "N/A", powerReq = 100, exPower = "N/A", memory = 1;
	public VideoCard() {
		this("integrated", "N/A", 100, "N/A", 1);
	}

	public VideoCard(String type, String connectionType, int powerRequirement, String externalPower, int memorySize) {
		setType(type);
		setConnectionType(connectionType);
		setExternalPower(externalPower);
		setPowerRequirement(powerRequirement);
		setMemorySize(memorySize);
	}

	// accessors and mutators

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public String getExternalPower() {
		return externalPower;
	}

	public void setExternalPower(String externalPower) {
		this.externalPower = externalPower;
	}

	public int getPowerRequirement() {
		return powerRequirement;
	}

	// range 1-500, 400 if above 500, 75 if below 1
	public void setPowerRequirement(int powerRequirement) {
		this.powerRequirement = powerRequirement > 500 ? 400 : powerRequirement < 1 ? 75 : powerRequirement;
	}

	public int getMemorySize() {
		return memorySize;
	}

	// range 1-16, 16 if above 16, 1 if below 1
	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize > 16 ? 16 : memorySize < 1 ? 1 : memorySize;
	}

	// getInfo() that returns type, connectionType, powerRequirement, externalPower, memorySize
	public String getInfo() {
		return String.format("Video Card Info:%nType: %s%nConnection: %s%nPower: %dW%nExt Power: %s%nMemory: %dGB%n",
				getType(), getConnectionType(), getPowerRequirement(), getExternalPower(), getMemorySize());
	}

}