class InteriorExe{
	public static void main(String[] inte){
	Interior materal=new Interior();
	materal.addMeterialNames("Granite");
	materal.addMeterialNames("Wood");
	materal.addMeterialNames("Copper");
	materal.addMeterialNames("Fabrics");
	materal.addMeterialNames("Renewable materials");
	materal.addMeterialNames("Tile");
	materal.addMeterialNames("Synthetic materials");
	materal.addMeterialNames("Fevicol");
	//materal.addMeterialNames("Mattress");
	materal.addMeterialNames("Light");
	materal.addMeterialNames("pipes");
	//materal.addMeterialNames("pipes");
	
	materal.getDisplay();
	materal.searchMeterialName("Copper");
	materal.deleteMeterialNames("Copper");
	
	}
}