package com.ayalait.response;

import java.util.List;

import com.ayalait.modelo.Producto;
import com.ayalait.utils.ErrorState;

public class ResponseListaProductos {
	
	private boolean status;
    private int code;
    private List<Producto> productos;
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

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	


}
