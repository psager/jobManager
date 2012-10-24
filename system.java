import java.util.ArrayList;
public class system
{
	ArrayList<client> clientList;
	ArrayList<vendor> vendorList;
	ArrayList<job> jobList;
	public ArrayList<client> getClientList()
	{
		return clientList;
	}
	public ArrayList<vendor> getVendorList()
	{
		return vendorList;
	}
	public ArrayList<job> getJobList()
	{
		return jobList;
	}
	public void addClient(client newClient)
	{
		clientList.add(newClient);
	}
	public void addVendor(vendor newVendor)
	{
		vendorList.add(newVendor);
	}
	public void addJob(job newJob)
	{
		jobList.add(newJob);
	}
}