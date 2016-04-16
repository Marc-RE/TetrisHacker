
import java.io.IOException;
import java.util.Timer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Traquall
 */
public class Main {
    private static Tetrimino currentTetrimino;
    private Timer timer;
    
    int curX;
    int curY;
    int boardX = 10;
    int boardY = 10;
   
    
    public static void main(String[] args) throws InterruptedException, IOException {
		
		
    }
    
    
    private void newTetriminos(){
        
        currentTetrimino = new Tetrimino();
        curX = boardX/2+1;
        curY = boardY-1;
    
    }
    
}
