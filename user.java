import java.util.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;



class RestaurantBooking extends Frame 
{
	Button order,cart,CBplus,CBminus;
	Button Shplus,Shminus,CNplus,CNminus;
	Label chik_bri,sh,chik_nod;
	TextField CBbox,Shbox,CNbox;
	Image chicken_briyani,shawarma,ChickenNoodles;
	int booking_id;
	String address;

	RestaurantBooking()
	{
		setTitle("HUNGER G0");
		
		order=new Button("ORDER");
		cart=new Button("CART");
		chik_bri=new Label("Chicken Briyani");
		CBplus=new Button("+");
		CBminus=new Button("-");
		CBbox=new TextField(0);
		sh=new Label("Shawarma");
		Shplus=new Button("+");
		Shminus=new Button("-");
		Shbox=new TextField(0);
		chik_nod=new Label("Chicken Noodles");
		CNplus=new Button("+");
		CNminus=new Button("-");
		CNbox=new TextField(0);


		addWindowListener(new WindowAdapter() {
            		public void windowClosing(WindowEvent e) {
                		dispose();
            		}
        	});

		order.setBounds(1100,40,80,40);
		order.setBackground(Color.blue);
		cart.setBounds(1200,40,80,40);
		cart.setBackground(Color.green);
		chik_bri.setBounds(100,180,150,20);
		CBplus.setBounds(230,210,20,20);
		CBminus.setBounds(150,210,20,20);
		CBbox.setBounds(190,210,30,20);
		CBbox.setText("0");
		sh.setBounds(400,180,150,20);
		Shplus.setBounds(530,210,20,20);
		Shminus.setBounds(450,210,20,20);
		Shbox.setBounds(490,210,30,20);
		Shbox.setText("0");
		chik_nod.setBounds(700,180,150,20);
		CNplus.setBounds(830,210,20,20);
		CNminus.setBounds(750,210,20,20);
		CNbox.setBounds(790,210,30,20);
		CNbox.setText("0");

		


		try{
			URL chikken_briyaniURL = new URL("file:D:/pictures/chikken briyani.jpg");
			URL shawarmaURL=new URL("file:D:/pictures/shawarma.png");
			chicken_briyani=Toolkit.getDefaultToolkit().getImage(chikken_briyaniURL);
			shawarma=Toolkit.getDefaultToolkit().getImage(shawarmaURL);
			URL CNURL=new URL("file:D:/pictures/chikken noodles.jpg");
			ChickenNoodles=Toolkit.getDefaultToolkit().getImage(CNURL);
		}
		catch (MalformedURLException e) {
           		 e.printStackTrace();
        	}
		add(order);
		add(CBplus);
		add(CBminus);
		add(CBbox);
		add(cart);
		add(chik_bri);
		add(sh);
		add(Shplus);
		add(Shminus);
		add(Shbox);
		add(chik_nod);
		add(CNplus);
		add(CNminus);
		add(CNbox);

		setSize(800,700);
		setLayout(null);
		setVisible(true);
		
		
	}
	
	public void paint(Graphics g)
	{
		if(chicken_briyani!=null && shawarma!=null && ChickenNoodles!=null)
		{
			g.drawImage(chicken_briyani,100,100,200,100,this);
			g.drawImage(shawarma,400,100,200,100,this);
			g.drawImage(ChickenNoodles,700,100,200,100,this);

		}
	}
	
	

	public static void main(String[] argu)
	{
		new RestaurantBooking();
	}
}