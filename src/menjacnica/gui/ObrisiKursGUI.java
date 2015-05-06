package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private JTextField textFieldSrednjiKurs;
	private JTextField textFieldSkraceniNaziv;
	private JLabel label_1;
	private JTextField textFieldKupovniKurs;
	private JTextField textFieldProdajniKurs;
	private JLabel label_2;
	private JLabel label_3;
	private JTextField textFieldSifra;
	private JLabel label_4;
	private JLabel label_5;
	private JTextField textFieldNaziv;
	private JButton btnObrisi;
	private JButton btnOdustani;
	private JLabel label_6;
	private JCheckBox chckbxZaistaObrisiKurs_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI() {
		setResizable(false);
		setTitle("Obrisi Kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 608, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 15, 20));
		contentPane.add(getLabel());
		contentPane.add(getLabel_1());
		contentPane.add(getTextFieldSrednjiKurs());
		contentPane.add(getTextFieldSkraceniNaziv());
		contentPane.add(getLabel_2());
		contentPane.add(getLabel_3());
		contentPane.add(getTextFieldKupovniKurs());
		contentPane.add(getTextFieldProdajniKurs());
		contentPane.add(getLabel_4());
		contentPane.add(getLabel_5());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getChckbxZaistaObrisiKurs_1());
		contentPane.add(getLabel_6());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Srednji kurs");
		}
		return label;
	}
	private JTextField getTextFieldSrednjiKurs() {
		if (textFieldSrednjiKurs == null) {
			textFieldSrednjiKurs = new JTextField();
			textFieldSrednjiKurs.setEditable(false);
			textFieldSrednjiKurs.setColumns(10);
		}
		return textFieldSrednjiKurs;
	}
	private JTextField getTextFieldSkraceniNaziv() {
		if (textFieldSkraceniNaziv == null) {
			textFieldSkraceniNaziv = new JTextField();
			textFieldSkraceniNaziv.setEditable(false);
			textFieldSkraceniNaziv.setColumns(10);
		}
		return textFieldSkraceniNaziv;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Skraceni naziv");
		}
		return label_1;
	}
	private JTextField getTextFieldKupovniKurs() {
		if (textFieldKupovniKurs == null) {
			textFieldKupovniKurs = new JTextField();
			textFieldKupovniKurs.setEditable(false);
			textFieldKupovniKurs.setColumns(10);
		}
		return textFieldKupovniKurs;
	}
	private JTextField getTextFieldProdajniKurs() {
		if (textFieldProdajniKurs == null) {
			textFieldProdajniKurs = new JTextField();
			textFieldProdajniKurs.setEditable(false);
			textFieldProdajniKurs.setColumns(10);
		}
		return textFieldProdajniKurs;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Kupovni kurs");
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("Prodajni kurs");
		}
		return label_3;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setEditable(false);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("Sifra");
		}
		return label_4;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("Naziv");
		}
		return label_5;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setEditable(false);
			textFieldNaziv.setColumns(10);
		}
		return textFieldNaziv;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String poruka = "nema sta da se prise kad polja ne mogu da se menjaju al evo neki tekst";
					MenjacnicaGUI.ubaciTekst(poruka);
					ObrisiKursGUI.this.dispose();
				}
			});
			btnObrisi.setEnabled(false);
		}
		return btnObrisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					ObrisiKursGUI.this.dispose();
				}
			});
		}
		return btnOdustani;
	}
	
	private JLabel getLabel_6() {
		if (label_6 == null) {
			label_6 = new JLabel("");
		}
		return label_6;
	}
	
	
	private JCheckBox getChckbxZaistaObrisiKurs_1() {
		if (chckbxZaistaObrisiKurs_1 == null) {
			chckbxZaistaObrisiKurs_1 = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisiKurs_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(chckbxZaistaObrisiKurs_1.isSelected() == true)
						btnObrisi.setEnabled(true);
					else btnObrisi.setEnabled(false);
				}
			});
		}
		return chckbxZaistaObrisiKurs_1;
	}
}
