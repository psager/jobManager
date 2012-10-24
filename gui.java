import java.awt.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class gui
{
	private JFrame frame;
	private	JPanel jobPanel;
	private	JTable jobTable;
	private	JScrollPane jobScrollPane;
	private	JPanel clientPanel;
	private	JTable clientTable;
	private	JScrollPane clientScrollPane;
	private	JPanel vendorPanel;
	private	JTable vendorTable;
	private	JScrollPane vendorScrollPane;
	private	JPanel equipPanel;
	private	JTable equipTable;
	private	JScrollPane equipScrollPane;
	JTabbedPane tabPane;
	
	public static void main(String[] args)
	{
		try 
		{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e) 
		{
            System.err.println("Look and feel not set.");
        }
		new gui();
	}
	public gui()
	{
		frame = new JFrame("Job Tracking System");
		frame.setSize(300,200);
		jobPanel = new JPanel();
		jobPanel.setLayout(new BorderLayout());
		JPanel jobButtonPanel = new JPanel();
		jobButtonPanel.setLayout(new FlowLayout());
		jobButtonPanel.add(new JButton("View"));
		jobButtonPanel.add(new JButton("Edit"));
		jobButtonPanel.add(new JButton("Add"));
		jobPanel.add(jobButtonPanel, BorderLayout.SOUTH);
		jobTable = new JTable();
		jobScrollPane = new JScrollPane(jobTable);
		jobPanel.add(jobScrollPane, BorderLayout.CENTER);
		clientPanel = new JPanel();
		clientPanel.setLayout(new BorderLayout());
		JPanel clientButtonPanel = new JPanel();
		clientButtonPanel.setLayout(new FlowLayout());
		clientButtonPanel.add(new JButton("View"));
		clientButtonPanel.add(new JButton("Edit"));
		clientButtonPanel.add(new JButton("Add"));
		clientPanel.add(clientButtonPanel, BorderLayout.SOUTH);
		clientTable = new JTable();
		clientScrollPane = new JScrollPane(clientTable);
		clientPanel.add(clientScrollPane, BorderLayout.CENTER);
		vendorPanel = new JPanel();
		vendorPanel.setLayout(new BorderLayout());
		JPanel vendorButtonPanel = new JPanel();
		vendorButtonPanel.setLayout(new FlowLayout());
		vendorButtonPanel.add(new JButton("View"));
		vendorButtonPanel.add(new JButton("Edit"));
		vendorButtonPanel.add(new JButton("Add"));
		vendorPanel.add(vendorButtonPanel, BorderLayout.SOUTH);
		vendorTable = new JTable();
		vendorScrollPane = new JScrollPane(vendorTable);
		vendorPanel.add(vendorScrollPane, BorderLayout.CENTER);
		equipPanel = new JPanel();
		equipPanel.setLayout(new BorderLayout());
		JPanel equipButtonPanel = new JPanel();
		equipButtonPanel.setLayout(new FlowLayout());
		equipButtonPanel.add(new JButton("View"));
		equipButtonPanel.add(new JButton("Edit"));
		equipButtonPanel.add(new JButton("Add"));
		equipPanel.add(equipButtonPanel, BorderLayout.SOUTH);
		equipTable = new JTable();
		equipScrollPane = new JScrollPane(equipTable);
		equipPanel.add(equipScrollPane, BorderLayout.CENTER);
		tabPane = new JTabbedPane();
		tabPane.addTab("Jobs", jobPanel);
		tabPane.addTab("Customers", clientPanel);
		tabPane.addTab("Vendors", vendorPanel);
		tabPane.addTab("Equipment", equipPanel);
		tabPane.addChangeListener(new ChangeListener()
		{
		    public void stateChanged(ChangeEvent evt) 
		    {
		        JTabbedPane pane = (JTabbedPane)evt.getSource();
		        int sel = pane.getSelectedIndex();
		        if(sel == 0)
		        {
		        	showJobs();
		        }
		        else if(sel == 1)
		        {
		        	showClients();
		        }
		        else if(sel == 2)
		        {
		        	showVendors();
		        }
		        else if(sel == 3)
		        {
		        	showEquipment();
		        }
		    }
		});
		frame.add(tabPane);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.showJobs();
	}
	public void showClients()
	{
		System.out.println("ShowClients");
	}
	public void showVendors()
	{
		System.out.println("ShowVendors");
	}
	public void showJobs()
	{
		System.out.println("ShowJobs");
	}
	public void showEquipment()
	{
		System.out.println("ShowEquipment");
	}
	public void viewClient()
	{
		
	}
	public void viewVendor()
	{
		
	}
	public void viewJob()
	{
		
	}
	public void viewEquipment()
	{
		
	}
	public void editClient()
	{
		
	}
	public void editVendor()
	{
		
	}
	public void editJob()
	{
		
	}
	public void editEquipment()
	{
		
	}
	public void addClient()
	{
		
	}
	public void addVendor()
	{
		
	}
	public void addJob()
	{
		
	}
	public void addEquipment()
	{
		
	}
}