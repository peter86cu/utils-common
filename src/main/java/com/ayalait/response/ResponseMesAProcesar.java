package com.ayalait.response;

import java.util.List;

import com.ayalait.modelo.Banco;
import com.ayalait.modelo.CalendarioMesAProcesar;
import com.ayalait.utils.ErrorState;

public class ResponseMesAProcesar {

	private boolean status;
	private int code;
	private CalendarioMesAProcesar mesProcesar;
	private String resultado;
	private ErrorState error;
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	

	public ErrorState getError() {
		return error;
	}

	public void setError(ErrorState error) {
		this.error = error;
	}

	
	public CalendarioMesAProcesar getMesProcesar() {
		return mesProcesar;
	}

	public void setMesProcesar(CalendarioMesAProcesar mesProcesar) {
		this.mesProcesar = mesProcesar;
	}

}
