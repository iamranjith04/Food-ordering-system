import java.util.*;
import java.util.List;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;
import hotel.operation;
import hotel.order;

class RestaurantBooking extends Frame implements ActionListener
{
	
	Button order,cart,CBplus,CBminus;
	Button Shplus,Shminus,CNplus,CNminus,VBplus,VBminus;
	Label chik_bri,sh,chik_nod,veg_bri;
	TextField CBbox,Shbox,CNbox,VBbox;
	Image chicken_briyani,shawarma,ChickenNoodles,VegBriyani;
	Image background_img;
	TextField total_price;
	int customer_id=637980;
	String address;
	Map<String,Integer> price;
	List<String> order_item;
	int total_amount_of_order_item;
	operation op;

	RestaurantBooking(Map<String,Integer> price)
	{
		this.price=price;
		op=new operation();
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
		veg_bri=new Label("VEG Briyani");
		VBplus=new Button("+");
		VBminus=new Button("-");
		VBbox=new TextField(0);

		total_price=new TextField(0);



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
		veg_bri.setBounds(100,480,150,20);
		VBplus.setBounds(230,510,20,20);
		VBminus.setBounds(180,510,20,20);
		VBbox.setBounds(200,510,30,20);
		VBbox.setText("0");
		total_price.setBounds(1200,650,100,30);
		total_price.setText("0");

		CBplus.addActionListener(this);
		CBminus.addActionListener(this);
		Shplus.addActionListener(this);
		Shminus.addActionListener(this);
		CNplus.addActionListener(this);
		CNminus.addActionListener(this);
		VBplus.addActionListener(this);
		VBminus.addActionListener(this);
		order.addActionListener(this);

		


		try{
			URL chikken_briyaniURL = new URL("file:D:/pictures/chikken briyani.jpg");
			URL shawarmaURL=new URL("file:D:/pictures/shawarma.png");
			chicken_briyani=Toolkit.getDefaultToolkit().getImage(chikken_briyaniURL);
			shawarma=Toolkit.getDefaultToolkit().getImage(shawarmaURL);
			URL CNURL=new URL("file:D:/pictures/chikken noodles.jpg");
			ChickenNoodles=Toolkit.getDefaultToolkit().getImage(CNURL);
			URL VB=new URL("file:D:/pictures/vegBriyani.jpg");
			VegBriyani=Toolkit.getDefaultToolkit().getImage(VB);
			URL BK=new URL("file:D:/pictures/background.png");
			background_img=Toolkit.getDefaultToolkit().getImage(BK);
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
		add(veg_bri);
		add(VBplus);
		add(VBminus);
		add(VBbox);
		add(total_price);


		setSize(800,700);
		setLayout(null);
		setVisible(true);
		
		
	}


	public void actionPerformed(ActionEvent e)
	{

		if(e.getSource()==CBplus)
		{
			op.ForPlus(price,"chiken briyani",CBbox,total_price);
		}
		else if(e.getSource()==Shplus)
		{
			op.ForPlus(price,"shawarma",Shbox,total_price);
		}
		else if(e.getSource()==VBplus)
		{
			op.ForPlus(price,"veg briyani",VBbox,total_price);
		}
		else if(e.getSource()==CNplus)
		{
			op.ForPlus(price,"chiken noodles",CNbox,total_price);
		}
		else if(e.getSource()==CBminus)
		{
			op.Forminus(price,"chiken briyani",CBbox,total_price);
		}
		else if(e.getSource()==Shminus)
		{
			op.Forminus(price,"shawarma",Shbox,total_price);
		}
		else if(e.getSource()==VBminus)
		{
			op.Forminus(price,"veg briyani",VBbox,total_price);
		}
		else if(e.getSource()==CNminus)
		{
			op.Forminus(price,"chiken noodles",CNbox,total_price);
		}
		else if(e.getSource()==order)
		{
			order fdorder=new order(order_item,total_amount_of_order_item,CBbox,Shbox,VBbox,CNbox,total_price);
			 JOptionPane.showMessageDialog(this, "Your order has been placed successfully!", "Order Confirmation",
                    JOptionPane.INFORMATION_MESSAGE);	
		}

	}

	
	public void paint(Graphics g)
	{
		if(background_img!=null)
		{
			g.drawImage(background_img,0,0,getWidth(),getHeight(),this);
		}
		if(chicken_briyani!=null && shawarma!=null && ChickenNoodles!=null)
		{
			g.drawImage(chicken_briyani,100,100,200,100,this);
			g.drawImage(shawarma,400,100,200,100,this);
			g.drawImage(ChickenNoodles,700,100,200,100,this);
			

		}
		else
		{
			g.drawString("IMAGE NOT FOUND",100,300);
			g.drawString("IMAGE NOT FOUND",400,300);
			g.drawString("IMAGE NOT FOUND",700,300);
		}
		if(VegBriyani!=null)
		{
			g.drawImage(VegBriyani,100,400,200,100,this);
		}
		else
		{
			g.drawString("IMAGE NOT FOUND",100,400);

		}
	}
	
	

	public static void main(String[] argu)
	{
		
		Map<String,Integer> price=new HashMap<>();
		price.put("chiken briyani",190);
		price.put("veg briyani",120);
		price.put("chiken noodles",90);
		price.put("shawarma",130);
		new RestaurantBooking(price);
	}
}
