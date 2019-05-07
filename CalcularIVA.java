import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;
   

public class CalcularIVA extends JFrame implements ActionListener
{
    private JOptionPane mensaje;
    private JButton boton;
    private JTextField caja;
    private JTextField caja2;

    public CalcularIVA() 
    {
        super();
        configurarVentana();
        crearComponente();
    }

    private void configurarVentana() {
        this.setTitle("Calculadora de IVA"); 
        this.setSize(400, 300); 
        this.setLocationRelativeTo(null);
        this.setLayout(null); 
        this.setResizable(true); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void crearComponente() {
    	mensaje = new JOptionPane();
        mensaje.setMessage("Valor");
        mensaje.setBounds(50, 30, 100, 30);
        this.add(mensaje);

        caja = new JTextField();
        caja.setBounds(50, 60, 100, 30);
        this.add(caja);
        
        mensaje = new JOptionPane();
        mensaje.setMessage("Agregar IVA: 8% - 16%");
        mensaje.setBounds(50, 90, 1000, 30);
        this.add(mensaje);

        caja2 = new JTextField();
        caja2.setBounds(50, 120, 100, 30);
        this.add(caja2);

        boton = new JButton();
        boton.setText("Calcular");
        boton.setBounds(50, 160, 100, 30);
        boton.addActionListener(this);
        this.add(boton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        float valor1 = Float.parseFloat(caja.getText());
        float iva = Float.parseFloat(caja2.getText());
        float totalIva = (iva * valor1) / 100;
        float resultado = valor1 + totalIva;
        JOptionPane.showMessageDialog(this, "Resultado con IVA: " + resultado);
    }

    public static void main(String[] args) {
        CalcularIVA ventana = new CalcularIVA();
        ventana.setVisible(true);
    }
}