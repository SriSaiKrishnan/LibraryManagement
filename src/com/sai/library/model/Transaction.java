package com.sai.library.model;

public class Transaction {

	public int transId;
	public int memberId;
	public String dateOfIssue;
	public String dueDate;

	public void setTransId(int TId) {
		transId = TId;
	}

	public int getTransId() {
		return transId;
	}

	public void setMemberId(int MId) {
		memberId = MId;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setDateOfIssue(String issueDate) {
		dateOfIssue = issueDate;
	}

	public String getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDueDate(String dateDue) {
		dueDate = dateDue;
	}

	public String getDueDate() {
		return dueDate;
	}
}
