package com.ayalait.utils;

import java.util.Map;

public class MessageCodeImpl {

    public static String getMensajeHttp(String code) {
        String resultMenssage="No se ha definido mensaje para el codigo: "+code;
        Map<String,String> message= Messages.listMessagesHTTP();
        if(message.containsKey(code)){
            return message.get(code);
        }
        return resultMenssage;
    }
    
    public static String getMensajeService(String code) {
        String resultMenssage="No se ha definido mensaje para el codigo: "+code;
        Map<String,String> message= Messages.listMessagesService();
        if(message.containsKey(code)){
            return message.get(code);
        }
        return resultMenssage;
    }

}