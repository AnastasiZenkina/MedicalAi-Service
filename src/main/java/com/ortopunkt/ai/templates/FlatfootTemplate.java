package com.ortopunkt.ai.templates;

public class FlatfootTemplate {
    public String getWithPhoto(){
        return "Спасибо! Врач сейчас на приёме, он изучит фото и даст своё заключение, " +
                "как только освободится \uD83C\uDF3F\n";
    }

    public String getWithoutPhoto(){
        return "Спасибо за ваше сообщение! Мы занимаемся лечением плоскостопия. " +
                "Врач посмотрит ваш запрос и расскажет, какие есть подходы. " +
                "Можете прислать фото стопы для более точного ответа?\n";
    }
}
