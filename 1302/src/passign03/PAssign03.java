package passign03;

public class PAssign03 {

	public static void main(String[] args) {
		// Computer instances
		Computer c1 = new Computer(new IntegratedVideoCard()); // default

		Computer c2 = new Computer(new DiscreteVideoCard("PCIEx16", "8-pin"));
		c2.setBrand("Dell");
		c2.setModel("Optiplex");
		c2.getVideoCard().setPowerRequirement(400);
		c2.getVideoCard().setMemorySize(16);
		c2.getVideoCard().setType("discrete");

		Computer c3 = new Computer(new IntegratedVideoCard(2, false));
		c3.setBrand("Lenovo");
		c3.setModel("IdeaCentre");
		c3.getVideoCard().setPowerRequirement(120);
		c3.getVideoCard().setMemorySize(4);
		c3.getVideoCard().setType("integrated");

		Computer c4 = new Computer(new DiscreteVideoCard("PCIEx8", "6-pin"));
		c4.setBrand("HP Omen");
		c4.setModel("Obelisk");
		c4.getVideoCard().setPowerRequirement(150);
		c4.getVideoCard().setMemorySize(8);
		c4.getVideoCard().setType("discrete");

		Computer c5 = new Computer(new IntegratedVideoCard(2, false));
		c5.setBrand("Lenovo");
		c5.setModel("IdeaCentre");
		c5.getVideoCard().setPowerRequirement(75);
		c5.getVideoCard().setMemorySize(3);
		c5.getVideoCard().setType("integrated");

		Computer[] computers = { c1, c2, c3, c4, c5 };
		printArray(computers);

	}

	// printArray()
	public static void printArray(Computer[] computers) {
		for (Computer computer : computers) {
			System.out.println(computer); //changed to implicitly call toString()
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
		this(new IntegratedVideoCard()); // now sets default VideoCard() to IntegratedVideoCard
	}

	// convenience constructor that uses videoCard as parameter
	public Computer(VideoCard videoCard) {
		setBrand("OEM");
		setModel("Basic");
		setVideoCard(videoCard);
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

	// toString(): String that returns brand, model, and calls VideoCard's getInfo()
	public String toString() {
		return String.format("%s %s%n%s%n", getBrand(), getModel(), getVideoCard().toString());
	}
}

class VideoCard {
	// data fields
	// type, powerRequirement, memorySize
	private String type;
	private int powerRequirement, memorySize;

	// default constructor
	// type = "integrated, powerReq = 100, memory = 1;
	public VideoCard() {
		this("integrated", 100, 1);
	}

	// convenience constructor
	public VideoCard(String type, int powerRequirement, int memorySize) {
		setType(type);
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

	// toString(): String that returns info about type, powerRequirement, memorySize
	public String toString() {
		return String.format("Video Card Info:%nType: %s%nPower: %d W%nMemory: %d GB", getType(), getPowerRequirement(), getMemorySize());
	}
}

// subclass DiscreteVideoCard class extends VideoCard, 
class DiscreteVideoCard extends VideoCard {
	// data fields
	// connectionType, usesExternalPower
	private String connectionType, usesExternalPower;

	// default constructor
	// connectionType = "PCIEx8", usesExternalPower = "6-pin"
	public DiscreteVideoCard() {
		this("PCIEx8", "6-pin");
	}

	// convenience constructor
	public DiscreteVideoCard(String connectionType, String usesExternalPower) {
		super("discrete", 100, 1);
		setConnectionType(connectionType);
		setUsesExternalPower(usesExternalPower);
	}

	// accesors and mutators
	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public String getUsesExternalPower() {
		return usesExternalPower;
	}

	public void setUsesExternalPower(String usesExternalPower) {
		this.usesExternalPower = usesExternalPower;
	}

	@Override
	// toString(): String method that returns info about connectionType and usesExternalPower, overrides
	public String toString() {
		return String.format("%s%n%nConnection: %s%nExternal Power: %s", super.toString(), getConnectionType(), getUsesExternalPower());
	}
}

//subclass IntegratedVideoCard class extends VideoCard
class IntegratedVideoCard extends VideoCard {
	// data fields
	// sharedMemory, usesComputerRAM
	private int sharedMemory;
	private boolean usesComputerRAM;

	// default constructor
	// sharedMemory = 2, usesComputerRAM = false
	public IntegratedVideoCard() {
		this(2, false);
	}

	// convenience constructor
	public IntegratedVideoCard(int sharedMemory, boolean usesComputerRAM) {
		super("integrated", 100, 1);
		setSharedMemory(sharedMemory);
		setUsesComputerRAM(usesComputerRAM);
	}

	// accesors and mutators lines
	public int getSharedMemory() {
		return sharedMemory;
	}

	public void setSharedMemory(int sharedMemory) {
		this.sharedMemory = sharedMemory;
	}

	public boolean getUsesComputerRAM() {
		return usesComputerRAM;
	}

	public void setUsesComputerRAM(boolean usesComputerRAM) {
		this.usesComputerRAM = usesComputerRAM;
	}

	// toString(): String method that returns info about connectionType and usesComputerRam
	public String toString() {
		return String.format("%s%n%nShared Memory: %d GB%nComputer RAM: %b", super.toString(), getSharedMemory(), getUsesComputerRAM());
	}

}