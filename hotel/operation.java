package hotel;
import java.util.*;
import java.util.List;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;


public class operation
{
	public void ForPlus(Map<String,Integer>price,String item,TextField TFbox,TextField total_price)
	{
			int quantity=Integer.parseInt(TFbox.getText());
			int current_total =Integer.parseInt(total_price.getText());
			int add_price=price.get(item);
			quantity++;
			current_total=current_total+add_price;
			TFbox.setText(Integer.toString(quantity));
			total_price.setText(Integer.toString(current_total));
			return;
	}
	public void Forminus(Map<String,Integer>price,String item,TextField TFbox,TextField total_price)
	{
		int quantity=Integer.parseInt(TFbox.getText());
		int current_total =Integer.parseInt(total_price.getText());
		int sub_price=price.get(item);
		if(quantity>0)
		{
			quantity--;
			current_total=current_total-sub_price;
			TFbox.setText(Integer.toString(quantity));
			total_price.setText(Integer.toString(current_total));
		}
		return;
	}
}