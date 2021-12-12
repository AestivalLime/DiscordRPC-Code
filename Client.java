
public class Client {
	
	public DiscordRP getDiscordRP() {
		return discordRP;
	}
	
	private static final Client INSTANCE = new Client();
	public static final Client getInstance() {
		return INSTANCE;
	}
	
	public void init() {
		discordRP.start();
		
	}
	
	public void shutdown() {
		discordRP.shutdown();
		
	}
	
	private DiscordRP discordRP = new DiscordRP();

}
