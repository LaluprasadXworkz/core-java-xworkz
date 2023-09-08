class PatientExecutor{
	public static void main(String patientDetails[]){
		Patient patient=new Patient();
		patient.setPatientId(1);
		patient.setName("patinet hasaru");
		patient.setNurseName("Nurse hasaru");
		patient.setage(23);
		patient.setDiseaseName("headack");
		patient.setWardNo(5);
		patient.setAdmittedDate("07/09/2023");
		patient.setHospitalName("GOv hospital");
		patient.setPatientAddress("Basam circle");
		patient.setGender("Male");
		patient.setConsultantDoctor("DOctor name");
		
		
		System.out.println("Patient Id : "+patient.getPatientId());
		System.out.println("Patient Name : "+patient.getName());
		System.out.println("Nurse Name : "+patient.getNurseName());
		System.out.println("Patient age : "+patient.getAge());
		System.out.println("Patient disease  : "+patient.getDiseaseName());
		System.out.println("Patient Ward No : "+patient.getWardNo());
		System.out.println("Patient Admitted Date : "+patient.getAdmittedDate());
		System.out.println("Patient Hospital Name : "+patient.getHospitalName());
		System.out.println("Patient Address : "+patient.getPatientAddress());
		System.out.println("Patient Gender : "+patient.getGender());
		System.out.println("Consultant Doctor : "+patient.getConsultantDoctor());
	}
}