package com.infosys.aggregation;

public class TraineeClass_Priv {

	private int emplyId;
	private String emplyName;
	
	TraineeClass_Priv(int emplyId, String emplyName)
	{
		this.emplyId=emplyId;
		this.emplyName=emplyName;
	}

	public int getEmplyId() {
		return emplyId;
	}

	public void setEmplyId(int emplyId) {
		this.emplyId = emplyId;
	}

	public String getEmplyName() {
		return emplyName;
	}

	public void setEmplyName(String emplyName) {
		this.emplyName = emplyName;
	}
}
