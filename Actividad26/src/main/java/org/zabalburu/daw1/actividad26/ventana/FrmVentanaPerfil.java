/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.zabalburu.daw1.actividad26.ventana;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author DAW1
 */
public class FrmVentanaPerfil extends JFrame {
    
    // Define el tamaño de la ventana (ancho: 500, alto: 500)
    private Dimension dmVentana = new Dimension(500,500);
    
    // Etiqueta principal como título del formulario
    private JLabel lblTitulo = new JLabel("Actualiza tu Perfil");

    // Etiqueta y campo de texto para el nombre
    private JLabel lblNombre = new JLabel("Nombre completo");
    private JTextField txtNombre = new JTextField();

    // Etiqueta y campo de texto para el correo electrónico
    private JLabel lblCorreo = new JLabel("Correo electrónico");
    private JTextField txtCorreo = new JTextField();

    // Etiqueta y campo de texto para el telefono
    private JLabel lblTelefono = new JLabel("teléfono");
    private JTextField txtTelefono = new JTextField();
    
    // Etiqueta y campo de texto para la dirección
    private JLabel lblDireccion = new JLabel("Dirección");
    private JTextField txtDireccion = new JTextField();
    
    // Etiqueta y campo de texto para el Sitio Web
    private JLabel lblSitioWeb = new JLabel("Sitio web");
    private JTextField txtSitioWeb = new JTextField();
    
    private JButton btnGuardar = new JButton("Guardar Cambios");
    private JButton btnCancelar = new JButton("Cancelar");
    //creamos los paneles o cajas
    private JPanel pnlDatos = new JPanel(new GridLayout(12,1,0,10));
    private JPanel pnlBotones = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    private final Color COLOR_FONDO = new Color(173,216,230);
    private final Color COLOR_TEXTO = new Color(255, 0, 128);
    private final Font FUENTE = new Font("Calibri", Font.PLAIN,22);
    
    public FrmVentanaPerfil() {
        this.setSize(dmVentana);
        this.setTitle("Mi Perfil");
        //Le ponemos caracteristicas al titulo
        lblTitulo.setFont( new Font("serif", Font.BOLD, 32));
        //posicionamos el texto que hay dentro de la label
        lblTitulo.setHorizontalAlignment(JLabel.CENTER); //ponemos el titulo a la izquierda
        lblTitulo.setForeground(COLOR_TEXTO); //cambiamos el color del texto
        lblTitulo.setOpaque(true); //para que se vea el fondo
        lblTitulo.setBackground(COLOR_FONDO); //cambiamos el color al fondo
        lblTitulo.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        
        //Ponemos el título en la parte superior de la ventana (movemos la label)
        this.add(lblTitulo, BorderLayout.NORTH);
        //agregamos un borde inferior a todos los campos texto
        //cremaos el borde y le damos el color y la anchura
        Border bordeInferior = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLUE);
        //especificamos a que textos le queremos dar esa caracteristica
        txtNombre.setBorder(bordeInferior);
        txtCorreo.setBorder(bordeInferior);
        txtTelefono.setBorder(bordeInferior);
        txtDireccion.setBorder(bordeInferior);
        txtSitioWeb.setBorder(bordeInferior);

        // Agrega campos al panel de datos 
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        pnlDatos.add(lblCorreo);
        pnlDatos.add(txtCorreo);
        pnlDatos.add(lblTelefono);
        pnlDatos.add(txtTelefono);
        pnlDatos.add(lblDireccion);
        pnlDatos.add(txtDireccion);
        pnlDatos.add(lblSitioWeb);
        pnlDatos.add(txtSitioWeb);
        // Aplicamos fondo al panel de datos
        pnlDatos.setBackground(COLOR_FONDO);
        
        //posicionamos el panel de datos
        this.add(pnlDatos, BorderLayout.CENTER);
        
        //Agrego los botones al panel de botones
        btnGuardar.setFont(FUENTE);
        btnCancelar.setFont(FUENTE);
        pnlBotones.add(btnCancelar);
        pnlBotones.add(btnGuardar);
        
        // Aplica fuente personalizada a los botones
        btnCancelar.setFont(FUENTE);
        btnGuardar.setFont(FUENTE);
        
        //fondo de panel de botones
        pnlBotones.setBackground(Color.LIGHT_GRAY);

        //espujo los botones a la derecha
        pnlBotones.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 20));
        this.add(pnlBotones, BorderLayout.SOUTH);
        
        //para que el programa termine cuando se cierra
         this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }


}
