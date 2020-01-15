package com.sai.library.model;

public class MemberRecord {

	public int memberId;
	public String type;
	public String dateOfMemberShip;
	public int noOfBookIssued;
	public int maximumBookLimit;
	public String name;
	public String address;
	public String phoneno;

	public void setMemberID(int memId) {
		memberId = memId;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setType(String Type) {
		type = Type;
	}

	public String getType() {
		return type;
	}

	public void setDateOfMembership(String dateMembership) {
		dateOfMemberShip = dateMembership;
	}

	public String getDateofMembership() {
		return dateOfMemberShip;
	}

	public void setNoOfBookIssued(int number) {
		noOfBookIssued = number;
	}

	public int getNoOfBookIssued() {
		return noOfBookIssued;
	}

	public void setMaximumBookLimit(int limit) {
		maximumBookLimit = limit;
	}

	public int getMaximumBookLimit() {
		return maximumBookLimit;
	}

	public void setName(String memberName) {
		name = memberName;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String memberAddress) {
		address = memberAddress;
	}

	public String getAddress() {
		return address;
	}

	public void setPhoneNo(String number) {
		phoneno = number;
	}

	public String getPhoneNo() {
		return phoneno;
	}
}
