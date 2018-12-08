/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisismatematico2;

import java.awt.Container;
import javax.swing.*;
/**
 *
 * @author dagyus
 */
public class GUIApplication extends JFrame{

    private JComboBox cmbSeleccion;
    private JTextField txtBase, txtAltura, txtProfundidad;
    private Container container;
    private JPanel pnlProblema1, pnlProblema2;
    private ImageIcon imgCubo, imgCilindro;
    
    public GUIApplication(){
        super("Analisis Matematico II");
        super.setSize(400, 400);
        super.setLocationRelativeTo(null);
        container=new Container();
        container=super.getContentPane();
        container.setLayout(null);
        
        //crear ComboBox
        cmbSeleccion=new JComboBox();
        cmbSeleccion.addItem("Problema 1");
        cmbSeleccion.addItem("Problema 2");
        cmbSeleccion.setBounds(10, 10, 150, 30);
        container.add(cmbSeleccion);
        
        //Creacion panel Problema Cubo
        pnlProblema1=new JPanel();
        pnlProblema1.setBounds(10, 50, 380, 340);
        
        imgCubo=new ImageIcon("images/cubo.png");
        
                
        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        GUIApplication gui=new GUIApplication();
    }
    
}
