class Bank{
	private int bankId;
	private String bankName;
	private String branchName;
	private String Loc;
	private String ifscCode;
	private String managerName;
	private int noOfWorkers;
	private boolean isBankOpen;
	
	
	public void setBankId(int bankId){
		this.bankId=bankId;
	}
	public int getBankId(){
		return bankId;
	}
	
	public void setBankName(String bankName){
		this.bankName=bankName;
	}
	public String getBankName(){
		return bankName;
	}
	
	public void setBranchName(String branchName){
		this.branchName=branchName;
	}
	public String getBranchName(){
		return branchName;
	}
	
	public void setIfscCode(String ifscCode){
		this.ifscCode=ifscCode;
	}
	public String getIfscCode(){
		return ifscCode;
	}
	
	public void setManagerName(String managerName){
		this.managerName=managerName;
	}
	public String getManagerName(){
		return managerName;
	}
	
	public void setNoOfWorkers(int noOfWorkers){
		this.noOfWorkers=noOfWorkers;
	}
	public int getNoOfWorkers(){
		return noOfWorkers;
	}
	
	public void setIsBankOpen(boolean isBankOpen){
		this.isBankOpen=isBankOpen;
	}
	public boolean getIsBankOpen(){
		return isBankOpen;
	}
}