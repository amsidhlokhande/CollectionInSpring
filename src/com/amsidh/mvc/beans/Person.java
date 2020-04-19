package com.amsidh.mvc.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Person {
	private Integer personId;
	private String name;
	private List<BankAccount> bankAccounts = new ArrayList<>();
	private Map<VehicleType, List<Vehicle>> vehicles = new HashMap<>();

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BankAccount> getBankAccounts() {
		return bankAccounts;
	}

	public void setBankAccounts(List<BankAccount> bankAccounts) {
		this.bankAccounts = bankAccounts;
	}

	public void addBankAccount(BankAccount bankAccount) {
		getBankAccounts().add(bankAccount);
	}

	public Map<VehicleType, List<Vehicle>> getVehicles() {
		return vehicles;
	}

	public void putVehicle(VehicleType vehicleType,Vehicle vehicle){
		if(getVehicles().containsKey(vehicleType)){
		      getVehicles().get(vehicleType).add(vehicle);	
		}
	}
	public void setVehicles(Map<VehicleType, List<Vehicle>> vehicles) {
		this.vehicles = vehicles;
	}

	
	
	//toString do display person details
	@Override
	public String toString() {
		StringBuilder strb=new StringBuilder();
		strb.append("PersonID:" + getPersonId());
		strb.append("PersonName:"+getName());
		strb.append("Bank Accounts [");
		for(BankAccount account:getBankAccounts()){
			strb.append("{Bank Account Number: "+account.getBankAccountNumber());
			strb.append(account.getBankName());
			strb.append(account.getBalance());
			strb.append("Nominees [");
			for(Nominee nominee:account.getNominee()){
				strb.append("{Nominee ID:"+nominee.getNomineeId());
				strb.append("Nominee Name:"+nominee.getNomineeName());
				strb.append("Nominee Address"+nominee.getAddress()+"},");
			}
			strb.append("]}");
		}
		strb.append("]");
		Set<VehicleType> keySet = getVehicles().keySet();
		strb.append("Vechiles :[");
		for(VehicleType vehicleType:keySet){
			List<Vehicle> vechiles = getVehicles().get(vehicleType);
			strb.append("{"+vehicleType+"[");
			  for(Vehicle vehicle:vechiles){
				  strb.append("{Vehicle ID:"+vehicle.getVehicleId());
				  strb.append("Vehicle Name:"+vehicle.getVehicleName());
				  strb.append("Vehicle Number"+vehicle.getVehicleNumber()+"},");
			  }
			  strb.append("],}");
		}
		strb.append("]");
		
		return strb.toString();
	}
}
