import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Display extends JFrame implements ActionListener
{
   int[][] data;
   JPanel[][] panels;
   JLabel[][] labels;
   
   Color[] color = {Color.WHITE, Color.RED, Color.GREEN, Color.BLUE, 
                  Color.YELLOW, Color.ORANGE, Color.CYAN, Color.PINK, 
                  Color.GRAY, Color.MAGENTA}; 
   public Display(int w, int h, int[][] data)
   {
      this.setSize(h, w);
      this.setBackground(Color.WHITE);
      this.data = data;
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setLayout( new GridLayout(data.length, data[0].length));
      this.setTitle("Backtracking Demo");
      panels = new JPanel[data.length][data[0].length];
      labels = new JLabel[data.length][data[0].length];
      
      for( int i=0; i<data.length; i++ )
      {
         for( int j=0; j<data[i].length; j++ ) 
         {
            panels[i][j] = new JPanel();
            panels[i][j].setBackground(color[(int)(Math.random() * color.length)]);
            panels[i][j].setSize(h/data.length, w/data[0].length);
            this.add(panels[i][j]);
            labels[i][j] = new JLabel();
            labels[i][j].setFont( new Font("Verdana", 1, 60));
            panels[i][j].add(labels[i][j]);
         }
      }
      Timer t = new Timer(50, this);
      this.setVisible(true);
      t.start();
   }
   
   public void actionPerformed( ActionEvent ae )
   {
      update();
   }
   public void update()
   {
      for( int i=0; i<data.length; i++ ) 
      {
         for( int j=0; j<data[i].length; j++ ) 
         {
            panels[i][j].setBackground( color[data[i][j]] );     
            //if( data[i][j] > 0 )       
               labels[i][j].setText("" + data[i][j]);
            //else
            //   labels[i][j].setText("");  //don't draw the 0s
         }
      }
   }
   public static void main(String[] args) throws Exception
   {
      //Display disp = new Display(1000, 1000, new int[9][9]);
      Sudoku.main(args);
   }
}