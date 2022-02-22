package com.SuperApp.Main.entities;

import java.util.List;

public class Response {

	private int Status;
	private int ErrorCode;
	private String MessageType;
	private String Message;
	private List<Offers> OfferList;

	public Response() {
		// TODO Auto-generated constructor stub
	}

	
	public Response(int status, int errorCode, String messageType, String message, List<Offers> offerList) {
		super();
		Status = status;
		ErrorCode = errorCode;
		MessageType = messageType;
		Message = message;
		OfferList = offerList;
	}

	public int getStatus() {
		return Status;
	}

	public void setStatus(int status) {
		Status = status;
	}

	public int getErrorCode() {
		return ErrorCode;
	}

	public void setErrorCode(int errorCode) {
		ErrorCode = errorCode;
	}

	public String getMessageType() {
		return MessageType;
	}

	public void setMessageType(String messageType) {
		MessageType = messageType;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		Message = message;
	}

	public List<Offers> getOfferList() {
		return OfferList;
	}

	public void setOfferList(List<Offers> offerList) {
		OfferList = offerList;
	}
}