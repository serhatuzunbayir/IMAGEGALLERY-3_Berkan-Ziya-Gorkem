package views;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ImageView extends JFrame {

    private ImageIcon myImage1 = new ImageIcon ("C:\\Users\\Gorkem\\workspace\\Image Gallery\\src\\resources\\image_1.jpg");
    private ImageIcon myImage2 = new ImageIcon ("C:\\Users\\Gorkem\\workspace\\Image Gallery\\src\\resources\\image_2.png");
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImageView frame = new ImageView();
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
	public ImageView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel header = new JPanel();
		header.setBounds(0, 0, 784, 80);
		header.setBackground(new Color(25, 75, 25));
		contentPane.add(header);
		
		JLabel title = new JLabel("View Image");
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 32));
		
		JLabel name = new JLabel("Image_00001.jpg");
		name.setForeground(new Color(105, 165, 105));
		name.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 18));
		
		JLabel settings = new JLabel("");
		settings.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\Image Gallery\\src\\resources\\settings_1.png"));
		
		JLabel list = new JLabel("");
		list.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\Image Gallery\\src\\resources\\list_1.png"));
		GroupLayout gl_header = new GroupLayout(header);
		gl_header.setHorizontalGroup(
			gl_header.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_header.createSequentialGroup()
					.addGap(39)
					.addComponent(title)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(name)
					.addPreferredGap(ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
					.addComponent(list)
					.addGap(18)
					.addComponent(settings)
					.addGap(21))
		);
		gl_header.setVerticalGroup(
			gl_header.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_header.createSequentialGroup()
					.addGroup(gl_header.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_header.createSequentialGroup()
							.addGap(19)
							.addGroup(gl_header.createParallelGroup(Alignment.BASELINE)
								.addComponent(title)
								.addComponent(name)))
						.addGroup(gl_header.createSequentialGroup()
							.addGap(24)
							.addGroup(gl_header.createParallelGroup(Alignment.LEADING)
								.addComponent(list)
								.addComponent(settings))))
					.addContainerGap(18, Short.MAX_VALUE))
		);
		header.setLayout(gl_header);
		
		JPanel content = new JPanel();
		content.setBackground(new Color(25, 69, 25));
		content.setBounds(0, 80, 784, 401);
		contentPane.add(content);
		
		JLabel image = new JLabel("");
		image.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\Image Gallery\\src\\resources\\image_1.jpg"));
		GroupLayout gl_content = new GroupLayout(content);
		gl_content.setHorizontalGroup(
			gl_content.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_content.createSequentialGroup()
					.addGap(92)
					.addComponent(image)
					.addContainerGap(92, Short.MAX_VALUE))
		);
		
		gl_content.setVerticalGroup(
			gl_content.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_content.createSequentialGroup()
					.addGap(50)
					.addComponent(image)
					.addContainerGap(51, Short.MAX_VALUE))
		);
		
		content.setLayout(gl_content);
		
		JPanel footer = new JPanel();
		footer.setBackground(new Color(25, 75, 25));
		footer.setBounds(0, 481, 784, 80);
		contentPane.add(footer);
		
		JLabel hr_2 = new JLabel("");
		hr_2.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\Image Gallery\\src\\resources\\hr.png"));
		
		JLabel facebook = new JLabel("");
		facebook.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\Image Gallery\\src\\resources\\fb2.png"));
		
		JLabel google = new JLabel("");
		google.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\Image Gallery\\src\\resources\\google.png"));
		
		JLabel hr_3 = new JLabel("");
		hr_3.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\Image Gallery\\src\\resources\\hr.png"));
		
		JLabel hr = new JLabel("");
		hr.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\Image Gallery\\src\\resources\\hr.png"));
		
		JLabel previous = new JLabel("");
		previous.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\Image Gallery\\src\\resources\\arrow-left.png"));
		
		JLabel next = new JLabel("");
		next.setIcon(new ImageIcon("C:\\Users\\Gorkem\\workspace\\Image Gallery\\src\\resources\\arrow-right.png"));
		
		GroupLayout gl_footer = new GroupLayout(footer);
		gl_footer.setHorizontalGroup(
			gl_footer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_footer.createSequentialGroup()
					.addGap(211)
					.addComponent(previous)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(hr, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(google)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(hr_2)
					.addGap(10)
					.addComponent(facebook)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(hr_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(next)
					.addContainerGap(206, Short.MAX_VALUE))
		);
		
		gl_footer.setVerticalGroup(
			gl_footer.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_footer.createSequentialGroup()
					.addGroup(gl_footer.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_footer.createSequentialGroup()
							.addGap(18)
							.addComponent(hr_2))
						.addGroup(gl_footer.createSequentialGroup()
							.addGap(16)
							.addComponent(facebook))
						.addGroup(gl_footer.createSequentialGroup()
							.addGap(16)
							.addGroup(gl_footer.createParallelGroup(Alignment.TRAILING)
								.addComponent(google)
								.addComponent(previous)))
						.addGroup(gl_footer.createSequentialGroup()
							.addGap(18)
							.addComponent(hr, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_footer.createSequentialGroup()
							.addGap(18)
							.addComponent(hr_3, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_footer.createSequentialGroup()
							.addGap(16)
							.addComponent(next)))
					.addContainerGap(16, Short.MAX_VALUE))
		);
		
		footer.setLayout(gl_footer);
	}
}
