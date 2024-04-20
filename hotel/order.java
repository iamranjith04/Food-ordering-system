package hotel;

import java.util.*;
import java.util.List;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

public class order
{
	public order(List<String> order_item,int total_amount_of_order_item,TextField CB,TextField SH,TextField VB,TextField CN,TextField Total)
	{
		order_item=new ArrayList<>();
		String item;
		if(Integer.parseInt(Total.getText())>0)
		{
			if(Integer.parseInt(CB.getText())>0)
			{
				item="";
				item+="Chiken Briyani=";
				item+=CB.getText();
				order_item.add(item);
				CB.setText("0");
			}
			if(Integer.parseInt(SH.getText())>0)
			{
				item="";
				item+="shawarma=";
				item+=SH.getText();
				order_item.add(item);
				SH.setText("0");

			}
			if(Integer.parseInt(VB.getText())>0)
			{
				item="";
				item+="Veg Briyani=";
				item+=VB.getText();
				order_item.add(item);
				VB.setText("0");

			}
			if(Integer.parseInt(CN.getText())>0)
			{
				item="";
				item+="Chiken Noodle=";
				item+=CN.getText();
				order_item.add(item);
				CN.setText("0");

			}
			total_amount_of_order_item=Integer.parseInt(Total.getText());
			Total.setText("0");

			int n=order_item.size();
			for(int i=0;i<n;i++)
			{
				System.out.println(order_item.get(i));
			}
			System.out.println("price:"+total_amount_of_order_item);
		}
	}
}
