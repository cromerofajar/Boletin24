package boletin24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


/**
 *
 * @author cromerofajar
 */
public class Metodos implements ActionListener{
    JFrame marco;
    JPanel panel1,panel2,panel3;
    JButton boton1,boton2,boton3;
    JLabel etiqueta1,etiqueta2;
    JTextField areaTexto1,areaTexto3;
    JPasswordField areaTexto2;
    JList lista;
    String nombre,curso;
    int posicion;
    public void crear(){
        marco=new JFrame();
        panel1=new JPanel();
        panel2=new JPanel();
        panel3=new JPanel();
        boton1=new JButton("Premer");
        boton2=new JButton("Limpiar");
        boton3=new JButton("Boton");
        etiqueta1=new JLabel();
        etiqueta2=new JLabel();
        areaTexto1=new JTextField();
        areaTexto2=new JPasswordField();
        areaTexto3=new JTextField("Area de texto");
        lista=new JList();
        panel1.setLayout(null);
        marco.setBounds(300,300, 400, 600);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(3);
        panel1.setBounds(10, 10, 380, 270);
        panel1.setBorder(BorderFactory.createLineBorder(Color.black));
        panel2.setBounds(10, 290, 380, 270);
        panel2.setBorder(BorderFactory.createLineBorder(Color.black));
        panel3.setBounds(10,300,380,280);
        marco.add(panel1);
        marco.add(panel2);
        marco.add(panel3);
        etiqueta1.setText("NOME");
        etiqueta2.setText("PASSWORD");
        etiqueta1.setBounds(50,50,60,40);
        etiqueta2.setBounds(45,90, 90, 40);
        areaTexto1.setBounds(190, 50, 130, 35);
        areaTexto2.setBounds(190, 90, 130, 35);
        boton1.setBounds(55, 200, 120, 35);
        boton2.setBounds(205, 200, 120, 35);
        panel1.add(etiqueta1);
        panel1.add(areaTexto1);
        panel1.add(etiqueta2);
        panel1.add(areaTexto2);
        panel1.add(boton1);
        panel1.add(boton2);
        String[] datosL={"DAM1","ASIR1","DAM2","ASIR2"};
        lista.setListData(datosL);
        lista.setBounds(25, 20, 130, 170);
        lista.setBorder(BorderFactory.createLineBorder(Color.black));
        panel2.setLayout(null);
        boton3.setBounds(170,80,90,35);
        areaTexto3.setBounds(280, 60, 80, 133);
        panel2.add(lista);
        panel2.add(boton3);
        panel2.add(areaTexto3);
        
        boton2.addActionListener(this);
        boton3.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(boton2)){
            areaTexto1.setText("");
            areaTexto2.setText("");
        }
        if(e.getSource().equals(boton3)){
            nombre=areaTexto1.getText();
            areaTexto3.setText(nombre+"\n"+lista.getSelectedValuesList());
    
            }
    }
    
    
    
    
}
