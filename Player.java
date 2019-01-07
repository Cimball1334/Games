import java.awt.Color;
import java.awt.Graphics;




 class Player extends GameObject{

	public Player(float x, float y, ID id) {
		super(x, y, id);
	}
	
	@Override
	public void tick() {
		velX = KeyInput.Xchange;
		velY = KeyInput.Ychange;
		
		x+= velX;	
		y+= velY;
		
		if(x > Game.WIDTH) x = 0; 
		if(y > Game.HEIGHT) y = 0;
		
	 
	}
	
	
	
	

	public void render(Graphics g) {
		
		if(id == ID.Player) g.setColor(Color.black);
		else if(id == ID.Player2) g.setColor(Color.white);
		
		g.fillRect((int)x, (int)y, 32, 32);
		
	}


	


	
}
	
		
		


	

	






	
