package practic;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JCalendar;
import com.toedter.components.JSpinField;
import com.toedter.calendar.JYearChooser;
import com.toedter.components.JLocaleChooser;

public class Reporte extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reporte frame = new Reporte();
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
	public Reporte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReporteDeVentas = new JLabel("Reporte de Ventas");
		lblReporteDeVentas.setBounds(20, 11, 122, 14);
		contentPane.add(lblReporteDeVentas);
		
		JLabel lblDesde = new JLabel("Desde:");
		lblDesde.setBounds(20, 36, 69, 14);
		contentPane.add(lblDesde);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(30, 52, 184, 153);
		contentPane.add(calendar);
	}
}
