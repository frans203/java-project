package volumeEsfera;
/*Elaborar um programa que calcule e apresente o valor do volume
de uma esfera. Utilize a fórmula VOLUME ← (4/3) * PI * RAIO3 */
import javax.swing.JOptionPane;
public class VolumeEsfera {
    public static void main(String[] args){
    
    String aux = null;
    double radius, volume, PI = 3.1415;

    aux = JOptionPane.showInputDialog("Digite o raio da esfera");
    radius = Double.parseDouble(aux);

    volume = (4/3.0) * PI * Math.pow(radius, 3);

    JOptionPane.showMessageDialog(null, "The sphere volume is: " + volume);




        

    }
    
}
