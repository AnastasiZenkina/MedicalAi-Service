package com.ortopunkt.ai.templates;

public class SymptomsTemplate {
    public String getSymptomsGeneralWithoutPhoto(){
        return "Спасибо за сообщение! Можете подробнее описать, что именно болит? Фото тоже поможет точнее понять, в чём дело.";
    }

    public String getSymptomsGeneralWithPhoto(){
        return "Спасибо! Фото получено, врач изучит и ответит по вашей ситуации \uD83D\uDE4C";
    }
}
