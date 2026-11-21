
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class LatihanGui implements ActionListener {

    // Deklarasi komponen GUI
    JFrame frame;
    JPanel panel;
    JLabel labelNama, labelNim, labelProdi;
    JTextField inputNama, inputNim, inputProdi;
    JButton tombolSimpan, tombolHapus;

    // Constructor
    public LatihanGui() {

        // Membuat frame
        frame = new JFrame("Form Biodata Mahasiswa");

        // Membuat panel
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10)); 
        panel.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));
        // Membuat label
        labelNama = new JLabel("Nama:");
        labelNim = new JLabel("NIM:");
        labelProdi = new JLabel("Program Studi:");

        // Membuat text field
        inputNama = new JTextField();
        inputNim = new JTextField();
        inputProdi = new JTextField();

        // Membuat button
        tombolSimpan = new JButton("Simpan");
        tombolHapus = new JButton("Hapus");

        // Menambahkan komponen ke panel, panel akan otomatis mrngatur posiis dari kiri ke kanan dan dari atas ke bawah sesuai dengan urutan penambahan komponen. 
        panel.add(labelNama);
        panel.add(inputNama);

        panel.add(labelNim);
        panel.add(inputNim);

        panel.add(labelProdi);
        panel.add(inputProdi);

        panel.add(tombolSimpan);
        panel.add(tombolHapus);

        // Menambahkan panel ke frame
        frame.add(panel);

        // Mendaftarkan event listener
        tombolSimpan.addActionListener(this);
        tombolHapus.addActionListener(this);

        // Pengaturan frame
        frame.setSize(400, 250); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true); 
    }

    // Event Handling
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == tombolSimpan) {

            String nama = inputNama.getText();
            String nim = inputNim.getText();
            String prodi = inputProdi.getText();

           
            JOptionPane.showMessageDialog(frame,
                "Biodata Berhasil Disimpan!\n\n" +
                "Nama: " + nama +
                "\nNIM: " + nim +
                  "\nProgram Studi: " + prodi);
        

        } else if (e.getSource() == tombolHapus) {

            inputNama.setText("");
            inputNim.setText("");
            inputProdi.setText("");

        }
    }
    // Main Method
    public static void main(String[] args) {
        new LatihanGui();
    }
}
