package jstarcraft.net.socket;

import jstarcraft.net.datagram.IconInfo;
import jstarcraft.net.datagram.MoveInfo;
import jstarcraft.net.datagram.PlayerInfo;
import jstarcraft.net.datagram.PlayerList;
import jstarcraft.net.datagram.SpriteInfo;

public class ClientEvent {
	
	private PlayerInfo playerInfo;
	
	private PlayerList playerList;
	
	private IconInfo iconInfo;
	
	private SpriteInfo spriteInfo;
	
	private MoveInfo moveInfo;
	
	
	public ClientEvent(PlayerInfo playerInfo) {
		super();
		this.playerInfo = playerInfo;
	}
	
	
	public ClientEvent(PlayerList playerList) {
		super();
		this.playerList = playerList;
	}
	
	public ClientEvent(MoveInfo moveInfo) {
		super();
		this.moveInfo = moveInfo;
	}
	


	public ClientEvent(IconInfo iconInfo) {
		super();
		this.iconInfo = iconInfo;
	}
 

	public ClientEvent(SpriteInfo spriteInfo) {
		super();
		this.spriteInfo = spriteInfo;
	}

	public MoveInfo getMoveInfo() {
		return moveInfo;
	}

	public PlayerInfo getPlayerInfo() {
		return playerInfo;
	}


	public PlayerList getPlayerList() {
		return playerList;
	}


	public IconInfo getIconInfo() {
		return iconInfo;
	}

	public SpriteInfo getSpriteInfo() {
		return spriteInfo;
	}
	
}
