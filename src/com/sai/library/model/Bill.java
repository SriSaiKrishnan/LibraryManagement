package com.sai.library.model;

public class Bill {

	public int billNo;
	public String date;
	public int amount;

	public void setBillNo(int number) {
		billNo = number;
	}

	public int getBillNo() {
		return billNo;
	}

	public void setBillDate(String billDate) {
		date = billDate;
	}

	public String getBilldate() {
		return date;
	}

	public void setAmount(int billAmount) {
		amount = billAmount;
	}

	public int getAmount() {
		return amount;
	}
}
