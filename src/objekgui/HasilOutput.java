package objekgui;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class HasilOutput extends JFrame //inheritance 
{

    //deklarasi atribut
    String outNama, outNim, outJk, outAgama, outHobi, outAlamat;

    final JTextField fnama = new JTextField();
    
    //deklarasi buat form
    JLabel lnama = new JLabel(" Nama Mahasiswa ");
    JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");
    
    JLabel lnim = new JLabel(" NIM ");
    JTextField fnim = new JTextField();
    
    JRadioButton rbPria = new JRadioButton(" Laki-Laki ");
    JRadioButton rbWanita = new JRadioButton("perempuan ");
    
    JLabel lagama = new JLabel(" Agama ");
    String[] namaAgama
            = {"Islam", "Kristen", "Katolik", "Hindu", "Budha"};
    JComboBox cmbAgama = new JComboBox(namaAgama);

    JLabel lhobby = new JLabel(" Hobby ");

    JCheckBox cbSepakbola = new JCheckBox(" Sepakbola ");
    JCheckBox cbBasket = new JCheckBox(" Basket ");

    JTextField falamat = new JTextField();
    JLabel lalamat = new JLabel (" Alamat ");
    
    JButton btnSave = new JButton("OK");

    public HasilOutput(String nama, String nim, String jk, String agama, String hobi, String alamat) {

        this.outNama = nama;
        this.outNim = nim;
        this.outJk = jk;
        this.outAgama = agama;
        this.outHobi = hobi;
        this.outAlamat = alamat;

        setTitle("Data Mahasiswa");
        setDefaultCloseOperation(3);
        setSize(500,400);

        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);

        //ukuran setiap variabel
        setLayout(null);
        add(lnama);
        lnama.setBounds(10, 10, 200, 20);
        add(lnim);
        lnim.setBounds(10, 35, 120, 20);
        add(ljeniskelamin);
        ljeniskelamin.setBounds(10, 60, 190, 20);
        rbPria.setSelected(true);
        add(lagama);
        lagama.setBounds(10, 85, 120, 20);
        add(lhobby);
        lhobby.setBounds(10, 110, 120, 20);
        add(lalamat);
        lalamat.setBounds(10, 135, 120, 20);
        setVisible(true);

         //output-an
        lnama.setText("Nama : " + outNama);
        lnim.setText("NIM   : " + outNim);
        ljeniskelamin.setText("Jenis Kelamin : " + outJk);
        lagama.setText("Agama : " + outAgama);
        lhobby.setText("Hobi : " + outHobi);
        lalamat.setText("Alamat : " + outAlamat);
    }
}

