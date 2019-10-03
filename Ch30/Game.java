public class Game {
	// need to review and improve the design here
	private double price; 
	private boolean gameType; 
	private String platform; 
	
	public Game() { } 
	
	public double getPrice() { 
		return this.price; 
	} 
	public double setPrice(double price) { 
		return this.price=price; 
	}
	public boolean getGameType() { 
		return this.gameType; 
	} 
	public boolean setGameType(boolean gameType) { 
		return this.gameType=gameType; 
	} 
	public String getPlatform() { 
		return this.platform; 
	} 
	public String setPlatform(String platform) { 
		return this.platform=platform; 
	} 
}
