/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nikilaundry;

import java.awt.Dimension;
import jdk.nashorn.internal.codegen.CompilerConstants;
import view.LoginView;

/**
 *
 * @author Eling Supriyatno
 */
public class NikiLaundry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LoginView loginView = new LoginView();
        Dimension frame = loginView.getSize();
        loginView.setLocation (frame.width / 2, frame.height / 2);
        loginView.show();
    }
    
}
