/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Imagens;

/**
 *
 * @author vjarr
 */
import java.awt.Color;
import javax.swing.JButton; 

/**
 *
 * @author ryanr
 */
public class Transparencia {
    public void aplicarTrans(JButton butt){
        //butt.setUndecorated(true);
        butt.setBackground(new Color(0,0,0,0)); 
    }

}