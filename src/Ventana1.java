import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana1 {
    private JPanel principal;
    private JTextField textDatoEntero;
    private JButton btnInsertar;
    private JButton btnValorTope;
    private JLabel IblValorTope;
    private JButton btnExtraer;
    private JButton btnListar;
    private JTextArea textListadoElementos;

    private Pila coleccion=new Pila();
    public Ventana1(){

        btnInsertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                coleccion.ingresarElemneto(Integer.parseInt(textDatoEntero.getText()));
                JOptionPane.showMessageDialog(null,"Ingresado a la Pila");
            }
        });

        btnValorTope.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    IblValorTope.setText("EL VALOR DE TOPE ES: "+coleccion.elementoTop());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }

            }
        });
        btnExtraer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    JOptionPane.showMessageDialog(null,"SE ELIMINO EL ELEMENTO"+coleccion.extraerElemnto());
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null,ex.getMessage());
                }
            }
        });
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textListadoElementos.setText(coleccion.toString());

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana1");
        frame.setContentPane(new Ventana1().principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
