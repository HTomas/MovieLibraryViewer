/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mlv;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author vbook
 */
public class MainController {
    
    private MainView mainView;
    private JPanel cardPanel;
    
    public MainController(MainView mv){
        mainView = mv;
        //cardPanel = mainView.getCardPanel();
        initMovies();
    }
    
    /**
     * Changes the featurepanel
     * @param s the name of the panel
     */
    public void changeCard(String s) {
        CardLayout cl = ((CardLayout) mainView.getCardPanel().getLayout());
        
        cl.show(mainView.getCardPanel(),s);
    }
    
    private void initMovies(){
        MovieItem[] movieItems = new MovieItem[10];
        
        for(int i=0; i<movieItems.length;i++){
            movieItems[i] = new MovieItem(new ImageIcon("/images/seven.png"));
        }
        
        //System.out.print("");      
        addMoviesToBrowsePanel(movieItems);
    }
    
    private void addMoviesToBrowsePanel(MovieItem[] movieItems){
        
        for(MovieItem mi : movieItems){
           // mainView.getBrowseCardPanel().add(mi);
        }
    }
}
