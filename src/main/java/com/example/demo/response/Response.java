package com.example.demo.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Response {
	
    private String message;
    private String date;

    public Response(String message) {
        this.message = message;
        this.date = new Date(System.currentTimeMillis()).toString();
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
