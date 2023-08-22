class 	Netflix {

	static String kannadaMovies[]={"Yuvarathnaa","Kode Muruga","Roberrt","Kotigobba 3","Pogaru","Madhagaja","Salaga","Badava Rascal","Amruthavahini","Mahishasura","Vikky ","Kathle Kaadu","Shadow","Annthamma","Kalavida","Kanasu Maratakkide","Nimmuru","Preethi Endarenu","Ambani Putra","Cyanide Mallika","Kartha","Kushka","Preman","Salt","Scary Forest"};
	static String englishSeries[]={"Stranger Things","Game of Thrones","The Umbrella Academy","Friends","Arcane","Money Heist","Breaking Bad","The Boys","The Wheel of Time","Wayne","Hawkeye","Dark","Paranormal","House of Cards","Westworld","Squid Game","Veronica Mars","Cobra Kai","Batman: The Animated Series","The 100"};
	static String hindiSeries[]={"Sacred Games","Mirzapur","Scam 1992: The Harshad Mehta Story","The Family Man","Aspirants","Criminal Justice","Breathe","Kota Factory","Panchayat","Paatal Lok","Special OPS","Asur: Welcome to Your Dark Side","College Romance","Apharan","Flames"};
	static String teluguMovies[]={"Rangasthalam","Baahubali: The Beginning","Baahubali 2: The Conclusion","Ala Vaikunthapurramuloo","Sarileru Neekevvaru","Arjun Reddy","Mahanati","F2 - Fun and Frustration","Jersey","Geetha Govindam","Srimanthudu","Attarintiki Daredi","Eega","Raja The Great","Mirchi","Bharat Ane Nenu","Nannaku Prematho","Khaidi No. 150","A..Aa","Janatha Garage","RRR","Pushpa","Baby","DiscoRaja","Varisu"};
	static String malayalamMovies[]={"Drishyam","Premam","Bangalore Days","Maheshinte Prathikaaram","Kumbalangi Nights","Thondimuthalum Driksakshiyum","Take Off","Ustad Hotel","Charlie","North 24 Kaatham","Ee.Ma.Yau","Sudani from Nigeria","Traffic","Njan Prakashan","Virus","Action Hero Biju","Lucifer","Mumbai Police","Salt N' Pepper ","Ayyappanum Koshiyum","Drishyam 2","22 Female Kottayam","Thanneer Mathan Dinangal","Moothon","Pathemari"};
	public static void main(String[] args){
	
	System.out.println("");
	System.out.println("Kannada Movies");
	/*System.out.println(kannadaMovies[0]);
	System.out.println(kannadaMovies[1]);
	System.out.println(kannadaMovies[2]);
	System.out.println(kannadaMovies[3]);
	System.out.println(kannadaMovies[4]);
	System.out.println(kannadaMovies[5]);
	System.out.println(kannadaMovies[6]);
	System.out.println(kannadaMovies[7]);
	System.out.println(kannadaMovies[8]);
	System.out.println(kannadaMovies[9]);
	System.out.println(kannadaMovies[10]);
	System.out.println(kannadaMovies[11]);
	System.out.println(kannadaMovies[12]);
	System.out.println(kannadaMovies[13]);
	System.out.println(kannadaMovies[14]);
	System.out.println(kannadaMovies[15]);
	System.out.println(kannadaMovies[16]);
	System.out.println(kannadaMovies[17]);
	System.out.println(kannadaMovies[18]);
	System.out.println(kannadaMovies[19]);
	System.out.println(kannadaMovies[20]);
	System.out.println(kannadaMovies[21]);
	System.out.println(kannadaMovies[22]);
	System.out.println(kannadaMovies[23]);
	System.out.println(kannadaMovies[24]);*/
	
	for(int kannada=kannadaMovies.length-1;kannada >=0;kannada--){
		System.out.println(kannadaMovies[kannada]);
		
	}
	System.out.println("---------------------------------------------------");
	System.out.println("---------------------------------------------------");
	
	for(int kannada=0;kannada<kannadaMovies.length;kannada++){
		System.out.println(kannadaMovies[kannada]);
		
	}
	System.out.println("---------------------------------------------------");
	System.out.println("English Series");
	/*System.out.println(englishSeries[0]);
	System.out.println(englishSeries[1]);
	System.out.println(englishSeries[2]);
	System.out.println(englishSeries[3]);
	System.out.println(englishSeries[4]);
	System.out.println(englishSeries[5]);
	System.out.println(englishSeries[6]);
	System.out.println(englishSeries[7]);
	System.out.println(englishSeries[8]);
	System.out.println(englishSeries[9]);
	System.out.println(englishSeries[10]);
	System.out.println(englishSeries[11]);
	System.out.println(englishSeries[12]);
	System.out.println(englishSeries[13]);
	System.out.println(englishSeries[14]);
	System.out.println(englishSeries[15]);
	System.out.println(englishSeries[16]);
	System.out.println(englishSeries[17]);
	System.out.println(englishSeries[18]);
	System.out.println(englishSeries[19]);
	System.out.println("---------------------------------------------------");
	System.out.println("Hindi Series");
	System.out.println(hindiSeries[0]);
	System.out.println(hindiSeries[1]);
	System.out.println(hindiSeries[2]);
	System.out.println(hindiSeries[3]);
	System.out.println(hindiSeries[4]);
	System.out.println(hindiSeries[5]);
	System.out.println(hindiSeries[6]);
	System.out.println(hindiSeries[7]);
	System.out.println(hindiSeries[8]);
	System.out.println(hindiSeries[9]);
	System.out.println(hindiSeries[10]);
	System.out.println(hindiSeries[11]);
	System.out.println(hindiSeries[12]);
	System.out.println(hindiSeries[13]);
	System.out.println(hindiSeries[14]);*/
	for(int hindi=0;hindi<hindiSeries.length;hindi++){
		System.out.println(hindiSeries[hindi]);
	}
	System.out.println("---------------------------------------------------");
	System.out.println("Telugu Movies");
        for (int telugu = 0; telugu < teluguMovies.length; telugu++) {
            System.out.println(teluguMovies[telugu]);
        }
	System.out.println("---------------------------------------------------");
	System.out.println("Malayalam Movies");
	/*System.out.println(malayalamMovies[1]);
	System.out.println(malayalamMovies[2]);
	System.out.println(malayalamMovies[3]);
	System.out.println(malayalamMovies[4]);
	System.out.println(malayalamMovies[5]);
	System.out.println(malayalamMovies[6]);
	System.out.println(malayalamMovies[7]);
	System.out.println(malayalamMovies[8]);
	System.out.println(malayalamMovies[9]);
	System.out.println(malayalamMovies[10]);
	System.out.println(malayalamMovies[11]);
	System.out.println(malayalamMovies[12]);
	System.out.println(malayalamMovies[13]);
	System.out.println(malayalamMovies[14]);
	System.out.println(malayalamMovies[15]);
	System.out.println(malayalamMovies[16]);
	System.out.println(malayalamMovies[17]);
	System.out.println(malayalamMovies[18]);
	System.out.println(malayalamMovies[19]);
	System.out.println(malayalamMovies[20]);
	System.out.println(malayalamMovies[21]);
	System.out.println(malayalamMovies[22]);
	System.out.println(malayalamMovies[23]);
	System.out.println(malayalamMovies[24]);*/
	for(int malayalam=0;malayalam<malayalamMovies.length;malayalam++ ){
		System.out.println(malayalamMovies[malayalam]);
	}
	
	}
}