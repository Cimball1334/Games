import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

	public static float Xchange = 0;
	
	public static float Ychange = 0;
	private Handler handler;
	
	
	
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	
	
	
	public void keyPressed(KeyEvent e) {
	
		int key = e.getKeyCode();
		
		

		System.out.println(key);
		if(key == KeyEvent.VK_W && ID.Player != null) System.out.println("W"); 
		if(key == KeyEvent.VK_W && ID.Player != null) Ychange = -2 ; 
		if(key == KeyEvent.VK_S && ID.Player != null) System.out.println("S"); 
		if(key == KeyEvent.VK_S && ID.Player != null) Ychange = 2 ; 
		if(key == KeyEvent.VK_D && ID.Player != null) System.out.println("D"); 
		if(key == KeyEvent.VK_D && ID.Player != null) Xchange = 2 ; 
		if(key == KeyEvent.VK_A && ID.Player != null) System.out.println("A"); 
		if(key == KeyEvent.VK_A && ID.Player != null) Xchange = -2 ; 
		
//		for( int i = 0; i < handler.object.size(); i++) {
//			System.out.println(i);
//			GameObject tempObject = handler.object.get(i);
//			
//			if(tempObject.getId() == ID.Player) {
//				//all key events for player 1
//				if(key == KeyEvent.VK_W) tempObject.setVelY(-5);
//				if(key == KeyEvent.VK_S) tempObject.setVelY(5);
//				if(key == KeyEvent.VK_D) tempObject.setVelX(5);
//				if(key == KeyEvent.VK_A) tempObject.setVelX(-5);
//			}
//			
//			if(tempObject.getId() == ID.Player2) {
//				//all key events for player 2
//				if(key == KeyEvent.VK_UP) tempObject.setVelY(-5);
//				if(key == KeyEvent.VK_DOWN) tempObject.setVelY(5);
//				if(key == KeyEvent.VK_RIGHT) tempObject.setVelX(5);
//				if(key == KeyEvent.VK_LEFT) tempObject.setVelX(-5);
//				
//		}
//	}
}
	
	public void keyReleased(KeyEvent e) {
		
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_W && ID.Player != null) System.out.println("W"); 
		if(key == KeyEvent.VK_W && ID.Player != null) Ychange = 0 ; 
		if(key == KeyEvent.VK_S && ID.Player != null) System.out.println("S"); 
		if(key == KeyEvent.VK_S && ID.Player != null) Ychange = 0 ; 
		if(key == KeyEvent.VK_D && ID.Player != null) System.out.println("D"); 
		if(key == KeyEvent.VK_D && ID.Player != null) Xchange = 0 ; 
		if(key == KeyEvent.VK_A && ID.Player != null) System.out.println("A"); 
		if(key == KeyEvent.VK_A && ID.Player != null) Xchange = 0 ; 
//for( int i = 0; i < handler.object.size(); i++) {
//			
//			GameObject tempObject = handler.object.get(i);
//			
//			if(tempObject.getId() == ID.Player) {
//				//all key events for player 1
//				if(key == KeyEvent.VK_W) tempObject.setVelY(0);
//				if(key == KeyEvent.VK_S) tempObject.setVelY(0);
//				if(key == KeyEvent.VK_D) tempObject.setVelX(0);
//				if(key == KeyEvent.VK_A) tempObject.setVelX(0);
//			}
//			
//			if(tempObject.getId() == ID.Player2) {
//				//all key events for player 2
//				if(key == KeyEvent.VK_UP) tempObject.setVelY(0);
//				if(key == KeyEvent.VK_DOWN) tempObject.setVelY(0);
//				if(key == KeyEvent.VK_RIGHT) tempObject.setVelX(0);
//				if(key == KeyEvent.VK_LEFT) tempObject.setVelX(0);
//				
//		}
//		
//	}
	
}
	}
