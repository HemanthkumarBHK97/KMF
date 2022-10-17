class Account
{
	private int psd;
	private  double balance;
	Account (int psd,double balance)
	{
		this.psd=psd;
		this.balance=balance;
	}
	public void setpsd(int psd ,int newpsd)
	{
	if(psd==this.psd)
	{
		this.psd=newpsd;
	}
	}
	public int getpsd()
	{
		return psd;
	}
	public void setBalance (int psd ,double amount)
{
	
	if(psd == this.psd)
	{
		balance=balance+amount;
		
	}
}
public double getBalance() 
{
return balance;
}
}
		
	