package com.ayalait.utils;

import java.util.HashMap;
import java.util.Map;

public class Messages {
	
	/********************MENSAJE PRODUCTO INICIO******************************/
	//MENSAJE SATISFACTORIOS
    public static final String CODE_SERVICE_PRODUCT_ADD_OK="0001";
    public static final String CODE_SERVICE_PRODUCT_DELETE="0002";
    public static final String CODE_SERVICE_PRODUCT_UPDATE="0003";


    //MENSAJES NO OK
    public static final String CODE_SERVICE_PRODUCT_SEARCH_NOOK="0004";
    public static final String CODE_SERVICE_PRODUCT_NOOK="0005";

	/********************MENSAJE PRODUCTO FIN******************************/


    public static Map<String, String> listMessagesHTTP() {
        Map<String,String> message= new HashMap<>();
        message.put("200","OK");
        return message;
    }
    
    public static Map<String, String> listMessagesService() {
        Map<String,String> message= new HashMap<>();
        message.put("0001","El producto fue creado correptamente.");
        message.put("0002","El producto ha sido eliminado correptamente.");
        message.put("0003","El producto se actualizó correptamente.");

        message.put("0004","No existe el producto.");
        message.put("0005","Ocurrio un error, intente de nuevo o pongase en contacto con un Administrador.");

        return message;
    }
    
    /********************MENSAJE API DE PAGO**************************/
    public static Map<String, String> listMessagesApiPago() {
        Map<String,String> message= new HashMap<>();
        message.put("3001","Credenciales no válidas.");
        message.put("3003","El comerciante no tiene autorización para utilizar esta API.");
        message.put("4000","Pago no encontrado.");

        message.put("5000","Solicitud no válida.");
        message.put("5001","Parametro invalido.");
        message.put("5003","País no admitido.");
        message.put("5007","Cantidad excedida.");
        message.put("5009","La identificación del pedido está duplicada.");
        message.put("5010","Método de pago no disponible.");
        message.put("5016","Cantidad demasiado baja.");
        message.put("6000","Demasiadas solicitudes a la API.");
        message.put("7000","No se pudo procesar la solicitud.");
        message.put("7001","Pide tiempo fuera.");

        return message;
    }
    
}
