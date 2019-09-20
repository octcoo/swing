package objekgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class ObjekGUI {

    public static void main(String[] args) { //main class
        Mahasiswa g = new Mahasiswa();
    }
}
class Mahasiswa extends JFrame {
    
    //deklarasi form
    final JTextField fnama = new JTextField();
    JLabel lnama = new JLabel(" Nama Mahasiswa ");

    JLabel lnim = new JLabel(" NIM ");
    JTextField fnim = new JTextField();

    JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");

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
    JLabel lalamat = new JLabel(" Alamat ");

    JButton btnSave = new JButton("OK");

    public Mahasiswa() {
        setTitle("FORM Mahasiswa");
        setDefaultCloseOperation(3);
        setSize(500, 300); //ukuran layout frame

        ButtonGroup group = new ButtonGroup();
        group.add(rbPria);
        group.add(rbWanita);

        setLayout(null);
        add(lnama); //memanggil variabel kedalam frame java
        lnama.setBounds(10, 10, 120, 20); //ukuran setiap variabel
        add(fnama);
        fnama.setBounds(130, 10, 150, 20);
        add(lnim);
        lnim.setBounds(10, 35, 120, 20);
        add(fnim);
        fnim.setBounds(130, 35, 150, 20);
        add(ljeniskelamin);
        ljeniskelamin.setBounds(10, 60, 150, 20);
        add(rbPria);
        rbPria.setBounds(130, 60, 100, 20);
        rbPria.setSelected(true);
        add(rbWanita);
        rbWanita.setBounds(230, 60, 150, 20);
        add(lagama);
        lagama.setBounds(10, 85, 120, 20);
        add(cmbAgama);
        cmbAgama.setBounds(130, 85, 150, 20);
        add(lhobby);
        lhobby.setBounds(10, 110, 120, 20);
        add(cbSepakbola);
        cbSepakbola.setBounds(130, 110, 100, 20);
        add(cbBasket);
        cbBasket.setBounds(230, 110, 150, 20);
        add(lalamat);
        lalamat.setBounds(10, 140, 120, 20);
        add(falamat);
        falamat.setBounds(130, 140, 150, 20);
        add(btnSave);
        btnSave.setBounds(100, 180, 120, 20);
        setVisible(true);

        btnSave.addActionListener(new ActionListener() { //aksi
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String nama = "", nim = "", jk = "", agama = "", hobi = "", alamat = "";

                    if (fnama.getText().equals("")) { //kondisi jika nama kosong
                        JOptionPane.showMessageDialog(null, "Input Nama Tidak Boleh Kosong");
                        System.exit(0); //keluar program
                    } else {
                        nama = fnama.getText(); //menyimpan nama hasil input
                    }
                    if (fnim.getText().equals("")) { //kondisi jika nim kosong
                        JOptionPane.showMessageDialog(null, "NIM kosong!");
                    } else {
                        nim = fnim.getText();
                    }

                    if (rbPria.isSelected()) {
                        jk = "Laki-laki";
                    } else {
                        jk = "Perempuan";
                    }

                    agama = cmbAgama.getSelectedItem().toString();

                    if (cbSepakbola.isSelected()) {
                        hobi = hobi + " Sepak Bola";
                    }

                    if (cbBasket.isSelected()) {
                        hobi = hobi + " Basket";
                    }
                    if (falamat.getText().equals("")) { //kondisi jika alamat kosong
                        JOptionPane.showMessageDialog(null, "isi alamatnya woy!");
                    } else {
                        alamat = falamat.getText();
                    }
                    
                    //output-an
                    System.out.println("nama : " + nama); 
                    System.out.println("NIM : " + nim);
                    System.out.println("jk : " + jk);
                    System.out.println("agama : " + agama);
                    System.out.println("hobi : " + hobi);
                    System.out.println("alamat : " + alamat);

                    HasilOutput hasilOutput = new HasilOutput(nama, nim, jk, agama, hobi, alamat); //memanggil class output

                    //hasilOutput.getHasil(nama, jk, agama, hobi);
                    dispose();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Input Tidak Boleh Kosong");
                }
            }
        }
        );
    }
}
