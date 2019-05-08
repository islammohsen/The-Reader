import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JInternalFrame;

public class UserProfile extends JFrame {
	


	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserProfile frame = new UserProfile();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void Display_friends(User u) // function that takes a user and display Names and books of the friends
    {
    	JFrame frame = new JFrame("Friends");  
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        JLabel label = new JLabel("My Friends  "); 
        panel.add(label);  
      // panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        for(int i=0;i<u.Followers.size();i++)
 	   {
 		    JTextField textField = new JTextField(u.Followers.get(i).Name);
 		    panel.add(textField);
 		    for(int j=0;j<u.Followers.get(i).Read_Books.size();j++)
 		    {
 		    	JTextField textField_2 = new JTextField(u.Followers.get(i).Read_Books.get(j).Name);
 		    	panel.add(textField_2);
 		    }
 	   }
        frame.getContentPane().add(panel);  
        frame.setSize(200, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  
    }
    
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public void Display_Read_Books(User u) // function that takes a user and display Publications Read By the User
{
	JFrame frame = new JFrame("Publications");  
	JPanel panel = new JPanel();  
	panel.setLayout(new FlowLayout());  
	JLabel label = new JLabel("My Publications  "); 
	panel.add(label);  
	// panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	for(int i=0;i<u.Read_Books.size();i++)
	{
		 JTextField textField = new JTextField(u.Read_Books.get(i).Name);
		 panel.add(textField);
		 JTextField textField_2 = new JTextField(u.Read_Books.get(i).Description);
		 panel.add(textField_2);
		
	}
		frame.getContentPane().add(panel);  
		frame.setSize(200, 300);  
		frame.setLocationRelativeTo(null);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		frame.setVisible(true);  
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * Create the frame.
	 */
    //////////dummy data for testing ///////////
	User u=new User("Ahmed","Ahmd","1234");
	User u2=new User("Mohammed","m7md","12345");
	User u3=new User("Emad","E123","12345");
	
	/////////////////////////////////////////////
	public UserProfile() {
		u.Followers.add(u2);
		u.Followers.add(u3);
		User U1= new User("Ahmed","Ahmed_123","12345");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 867, 520);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img= new ImageIcon(this.getClass().getResource("/22.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(0, 0, 214, 106);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Home");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home h=new Home();
				h.setVisible(true);
			}
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBounds(214, 82, 115, 33);
		btnNewButton.setOpaque(false);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		contentPane.add(btnNewButton);
		
		JButton btnMyBooks = new JButton("My Books");
		btnMyBooks.setForeground(Color.DARK_GRAY);
		btnMyBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				Display_Read_Books(u);
				/* DefaultListModel<String> l1 = new DefaultListModel<>();  
		          l1.addElement("The Secret");  
		          l1.addElement("History Of Egypt");
		          l1.addElement("The Fault In Our Stars");
		             JList<String> list = new JList<>(l1);
				   JFrame f= new JFrame("My Books Pannel");    
			        JPanel panel=new JPanel();  
			        panel.setSize(400,400);    
			        panel.setBackground(Color.gray);  
			        JButton b1=new JButton("Back");     
			        b1.setBounds(50,100,80,30);       
			        b1.setOpaque(false);
					b1.setContentAreaFilled(false);
					b1.setBorderPainted(false);
			        panel.add(b1);
			        panel.add(list); 
			        f.getContentPane().add(panel);  
			                f.setSize(400,400);    
			                f.getContentPane().setLayout(null);    
			                f.setVisible(true);  */  
			}
		});
		btnMyBooks.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 20));
		btnMyBooks.setOpaque(false);
		btnMyBooks.setContentAreaFilled(false);
		btnMyBooks.setBorderPainted(false);
		btnMyBooks.setBounds(300, 79, 140, 39);
		contentPane.add(btnMyBooks);
		
		JButton btnFindBooks = new JButton("Find Books");
		btnFindBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
			}
		});
		btnFindBooks.setForeground(Color.DARK_GRAY);
		btnFindBooks.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 20));
		btnFindBooks.setOpaque(false);
		btnFindBooks.setContentAreaFilled(false);
		btnFindBooks.setBorderPainted(false);
		btnFindBooks.setBounds(410, 79, 150, 39);
		contentPane.add(btnFindBooks);
		
		JButton btnFriends = new JButton("Friends");
		btnFriends.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				 
				Display_friends(u);
			}
		});
		btnFriends.setForeground(Color.DARK_GRAY);
		btnFriends.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 20));
		btnFriends.setOpaque(false);
		btnFriends.setContentAreaFilled(false);
		btnFriends.setBorderPainted(false);
		btnFriends.setBounds(518, 77, 140, 42);
		contentPane.add(btnFriends);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(Color.DARK_GRAY);
		comboBox .setOpaque(false);
		comboBox.addItem("Explore");
		comboBox.addItem("None");
		 comboBox.addItem("Action and adventure");  
		 comboBox.addItem("Art");  
		 comboBox.addItem("Drama");  
		 comboBox.addItem("Children"); 
		 comboBox.addItem("Biography");
		 comboBox.addItem("Health");
		 comboBox.addItem("Fantasy");
		 comboBox.addItem("Grapic Novel");
		 comboBox.addItem("Romance");
		 comboBox.addItem("History");
		comboBox .setEditable(true);
		comboBox.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 20));
		comboBox.setBounds(646, 82, 195, 32);
		contentPane.add(comboBox);
		
		JLabel welcomelabel = new JLabel("Welcome  " + U1.Name);
		welcomelabel.setForeground(Color.DARK_GRAY);
		welcomelabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		welcomelabel.setBounds(10, 125, 150, 33);
		contentPane.add(welcomelabel);
		
		JButton btnNewButton_1 = new JButton("Inbox");
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setOpaque(false);
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_1.setBounds(22, 184, 99, 42);
		contentPane.add(btnNewButton_1);
		
		JButton btnSignout = new JButton("Sign Out");
		btnSignout.setForeground(Color.DARK_GRAY);
		btnSignout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{   
			    contentPane.setVisible(false);
				The_Reader reader=new The_Reader();
				reader.main(null);
			}
		});
		btnSignout.setOpaque(false);
		btnSignout.setContentAreaFilled(false);
		btnSignout.setBorderPainted(false);
		btnSignout.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		btnSignout.setBounds(10, 256, 123, 39);
		contentPane.add(btnSignout);
		
		JButton btnNewButton_2 = new JButton("Go !");
		btnNewButton_2.setForeground(Color.DARK_GRAY);
		btnNewButton_2.setOpaque(false);
		btnNewButton_2.setContentAreaFilled(false);
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setFont(new Font("Traditional Arabic", Font.BOLD | Font.ITALIC, 20));
		btnNewButton_2.setBounds(742, 113, 99, 33);
		contentPane.add(btnNewButton_2);
		
		JButton btnNoti ;
		btnNoti = new JButton();
		btnNoti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNoti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/notify2.jpg")));
		btnNoti.setBorderPainted(false);
		btnNoti.setFocusPainted(false);
		btnNoti.setContentAreaFilled(false);
		btnNoti.setBounds(772, 0, 79, 80);
		contentPane.add(btnNoti);
		
		JButton newsfeed = new JButton("");
		newsfeed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				NewsFeed news=new NewsFeed();
				news.setVisible(true);
			}
		});
		newsfeed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/newsfeed.jpg")));
		newsfeed.setBorderPainted(false);
		newsfeed.setFocusPainted(false);
		newsfeed.setContentAreaFilled(false);
		newsfeed.setBounds(687, 0, 93, 71);
		contentPane.add(newsfeed);
		Image imgage= new ImageIcon(this.getClass().getResource("/bookshelf.jpg")).getImage();
		
		
		
		
		
	
		
		
	}
}
