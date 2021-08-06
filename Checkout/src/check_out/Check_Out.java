package check_out;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Check_Out {
    String iSubTotal, iTotal, idiscount;
    double[] itemcost = new double[26];

    double aprice, bprice, cprice, dprice;

    private JFrame frmCheckOutSystem;
    private JTextField textFieldD;
    private JTextField textFieldA;
    private JTextField textFieldB;
    private JTextField textFieldC;
    private JTextField textdiscount;
    private JTextField textSubTotal;
    private JTextField txtTotal;

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Check_Out window = new Check_Out();
                    window.frmCheckOutSystem.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Check_Out() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmCheckOutSystem = new JFrame();
        frmCheckOutSystem.addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                // To disable the Text Field
                textFieldA.setEnabled(false);
                textFieldB.setEnabled(false);
                textFieldA.setEnabled(false);
                textFieldB.setEnabled(false);

            }
        });

        // ==========================FrameWork=====================
        frmCheckOutSystem.setTitle("Check Out System");
        frmCheckOutSystem.setBounds(0, 0, 1000, 500);
        frmCheckOutSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmCheckOutSystem.getContentPane()
                .setLayout(new GridLayout(1, 3, 3, 3));

        // =========================Panels=========================
        JPanel panel = new JPanel();
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
        frmCheckOutSystem.getContentPane().add(panel);
        panel.setLayout(new GridLayout(4, 2, 2, 2));

        JPanel panel_1 = new JPanel();
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
        frmCheckOutSystem.getContentPane().add(panel_1);
        panel_1.setLayout(new GridLayout(1, 4, 1, 1));

        JPanel panel_4 = new JPanel();
        panel_1.add(panel_4);
        panel_4.setLayout(new GridLayout(10, 2, 0, 0));

        // ======================CheckBoxs============================
        // Check Box A validation
        JCheckBox chckbxA = new JCheckBox("A");
        chckbxA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (chckbxA.isSelected()) {
                    textFieldA.setEnabled(true);
                    textFieldA.setText("");
                    textFieldA.requestFocus();
                } else {
                    textFieldA.setEnabled(false);
                    textFieldA.setText("0");

                }
            }
        });
        chckbxA.setEnabled(false);
        panel_4.add(chckbxA);

        // Check Box B validation
        JCheckBox chckbxB = new JCheckBox("B");
        chckbxB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (chckbxB.isSelected()) {
                    textFieldB.setEnabled(true);
                    textFieldB.setText("");
                    textFieldB.requestFocus();
                } else {
                    textFieldB.setEnabled(false);
                    textFieldB.setText("0");

                }
            }
        });
        chckbxB.setEnabled(false);
        panel_4.add(chckbxB);

        // Check Box C validation
        JCheckBox chckbxC = new JCheckBox("C");
        chckbxC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (chckbxC.isSelected()) {
                    textFieldC.setEnabled(true);
                    textFieldC.setText("");
                    textFieldC.requestFocus();
                } else {
                    textFieldC.setEnabled(false);
                    textFieldC.setText("0");

                }
            }
        });
        chckbxC.setEnabled(false);
        panel_4.add(chckbxC);

        // Check Box D validation
        JCheckBox chckbxD = new JCheckBox("D");
        chckbxD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (chckbxD.isSelected()) {
                    textFieldD.setEnabled(true);
                    textFieldD.setText("");
                    textFieldD.requestFocus();
                } else {
                    textFieldD.setEnabled(false);
                    textFieldD.setText("0");

                }
            }
        });
        chckbxD.setEnabled(false);
        panel_4.add(chckbxD);

        // ======================Panel 5 ========================
        JPanel panel_5 = new JPanel();
        panel_1.add(panel_5);
        panel_5.setLayout(new GridLayout(10, 2, 2, 2));

        // =============================== Text Field =========================
        textFieldA = new JTextField();
        textFieldA.setEnabled(false);
        textFieldA.setText("0");
        panel_5.add(textFieldA);
        textFieldA.setColumns(10);

        textFieldB = new JTextField();
        textFieldB.setEnabled(false);
        textFieldB.setText("0");
        panel_5.add(textFieldB);
        textFieldB.setColumns(10);

        textFieldC = new JTextField();
        textFieldC.setEnabled(false);
        textFieldC.setText("0");
        panel_5.add(textFieldC);
        textFieldC.setColumns(10);

        textFieldD = new JTextField();
        textFieldD.setEnabled(false);
        textFieldD.setText("0");
        panel_5.add(textFieldD);
        textFieldD.setColumns(10);

        JPanel panel_2 = new JPanel();
        panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
        frmCheckOutSystem.getContentPane().add(panel_2);
        panel_2.setLayout(null);

        JLabel lblNewLabel = new JLabel("Discount");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel.setBounds(29, 109, 73, 14);
        panel_2.add(lblNewLabel);

        textdiscount = new JTextField();
        textdiscount.setEditable(false);
        textdiscount.setHorizontalAlignment(SwingConstants.CENTER);
        textdiscount.setText("0");
        textdiscount.setBounds(142, 106, 86, 20);
        panel_2.add(textdiscount);
        textdiscount.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Subtotal");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_1.setBounds(29, 66, 73, 14);
        panel_2.add(lblNewLabel_1);

        textSubTotal = new JTextField();
        textSubTotal.setEditable(false);
        textSubTotal.setHorizontalAlignment(SwingConstants.CENTER);
        textSubTotal.setText("0");
        textSubTotal.setBounds(142, 63, 86, 20);
        panel_2.add(textSubTotal);
        textSubTotal.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("Total");
        lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblNewLabel_2.setBounds(29, 149, 73, 14);
        panel_2.add(lblNewLabel_2);

        txtTotal = new JTextField();
        txtTotal.setEditable(false);
        txtTotal.setHorizontalAlignment(SwingConstants.CENTER);
        txtTotal.setText("0");
        txtTotal.setBounds(142, 146, 86, 20);
        panel_2.add(txtTotal);
        txtTotal.setColumns(10);

        // ============================Receipt Text Area ==================
        JTextArea textReceipt = new JTextArea();
        textReceipt.setBounds(10, 193, 306, 211);
        panel_2.add(textReceipt);

        // ======================== Total calculation Button =================
        JButton btnTotal = new JButton("Total");
        btnTotal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                // Getting the quantity and parsing double;
                itemcost[0] = Double.parseDouble(textFieldA.getText());
                itemcost[1] = Double.parseDouble(textFieldB.getText());
                itemcost[2] = Double.parseDouble(textFieldC.getText());
                itemcost[3] = Double.parseDouble(textFieldD.getText());

                // Multiplying quantity per unit;
                aprice = itemcost[0] * 0.50;
                bprice = itemcost[1] * 0.30;
                cprice = itemcost[2] * 0.20;
                dprice = itemcost[3] * 0.15;

                double subTotal = 0;
                double totalDiscount = 0;
                double discount = 0;
                double finalTotal = 0;

                // For loop and If the number is divisible by 3 gives 0.20
                // discount
                for (int i = 1; i <= itemcost[0]; i++) {
                    if (i > 1 && i % 3 == 0) {
                        totalDiscount += 0.20;
                    }
                }
                // For loop and If the number is divisible by 2 gives 0.15
                // discount
                for (int i = 1; i <= itemcost[1]; i++) {

                    if (i > 1 && i % 2 == 0) {
                        totalDiscount += 0.15;
                    }

                }

                // Sub Total without any Discount
                subTotal = aprice + bprice + cprice + dprice;

                // Final Total after taking away discount price from sub total
                // price
                finalTotal = (aprice + bprice + cprice + dprice)
                        - totalDiscount;

                iSubTotal = String.format("£ %.2f", subTotal);
                textSubTotal.setText(iSubTotal);

                idiscount = String.format("£ %.2f", totalDiscount);
                textdiscount.setText(idiscount);

                iTotal = String.format("£ %.2f", finalTotal);
                txtTotal.setText(iTotal);

                // =============================Receipt=========================
                textReceipt.setEnabled(true);
                // =============================================================
                int refs = 1325 + (int) (Math.random() * 4238);
                // =============================================================
                Calendar timer = Calendar.getInstance();
                timer.getTime();
                SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
                tTime.format(timer.getTime());
                SimpleDateFormat Tdate = new SimpleDateFormat("dd-MM-yy");
                Tdate.format(timer.getTime());
                // =============================================================

                textReceipt.append("\tPoint of Check Out System\n"
                        + "Reference:\t\t\t" + refs
                        + "\n===========================================\t "
                        + "\nSubTotal:\t\t\t" + iSubTotal + "\nDiscount:\t\t\t"
                        + idiscount + "\nTotal:\t\t\t" + iTotal
                        + "\n===========================================\t "
                        + "\nDate: " + Tdate.format(timer.getTime())
                        + "\t\tTime: " + tTime.format(timer.getTime())
                        + "\n\n\tThak you");

            }
        });
        btnTotal.setBounds(10, 415, 80, 20);
        panel_2.add(btnTotal);

        // ============================= Rest Button ===========================
        JButton btnReset = new JButton("Reset");
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                textReceipt.setText("");
                textReceipt.setEnabled(false);
                textFieldA.setText("0");
                textFieldB.setText("0");
                textFieldC.setText("0");
                textFieldD.setText("0");
                textSubTotal.setText("0");
                textdiscount.setText("0");
                txtTotal.setText("0");

                textFieldA.setEnabled(false);
                textFieldB.setEnabled(false);
                textFieldC.setEnabled(false);
                textFieldD.setEnabled(false);

                chckbxA.setSelected(false);
                chckbxB.setSelected(false);
                chckbxC.setSelected(false);
                chckbxD.setSelected(false);

            }
        });

        // =============================== Button A ============================
        JButton btnA = new JButton("A");
        btnA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chckbxA.setEnabled(true);
            }
        });

        btnReset.setBounds(100, 415, 80, 20);
        panel_2.add(btnReset);
        panel.add(btnA);

        // ================================= Button B ==========================
        JButton btnB = new JButton("B");
        btnB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chckbxB.setEnabled(true);
            }
        });
        panel.add(btnB);

        // ================================= Button C ==========================
        JButton btnC = new JButton("C");
        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chckbxC.setEnabled(true);
            }
        });
        panel.add(btnC);

        // ================================== Button D =========================
        JButton btnD = new JButton("D");
        btnD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chckbxD.setEnabled(true);
            }
        });
        panel.add(btnD);

        // ================================ Exit Button ========================
        JButton btnExit = new JButton("Exit");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame = new JFrame("Exit");
                if (JOptionPane.showConfirmDialog(frame,
                        "Confirm if you want to exit", "Point of sale",
                        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
                    System.exit(0);

                }

            }
        });

        btnExit.setBounds(187, 415, 80, 21);
        panel_2.add(btnExit);
    }

}
