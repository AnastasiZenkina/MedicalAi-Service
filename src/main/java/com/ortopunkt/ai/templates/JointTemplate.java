package com.ortopunkt.ai.templates;

public class JointTemplate {
    public String getFootSurgeryWithoutPhoto(){
        return "Да, врач проводит такие операции. " +
                "Вы можете прислать фото стопы — это поможет понять, какой подход лучше.";
    }

    public String getFootSurgeryWithPhoto(){
        return "Спасибо! Фото получено. Врач изучит его и ответит, когда освободится \uD83D\uDE4F";
    }

    public String getJointSurgeryWithoutPhoto(){
        return "Да, проводим такие операции. Напишите, что именно вас беспокоит — и можно прислать фото для оценки.";
    }

    public String getJointSurgeryWithPhoto(){
        return "Благодарим за фото! Врач его изучит и даст своё мнение по операции как только освободится✨";
    }

    public String getEndoprosthesisWithPhoto(){
        return "Благодарим за фото! Врач его рассмотрит и даст обратную связь по возможной операции.";
    }

    public String getEndoprosthesisWithoutPhoto(){
        return "Да, мы проводим такие операции. Напишите, какой сустав вас беспокоит и в каком городе вы находитесь?";
    }

    public String getRepeatSurgery(){
        return "Да, мы проводим повторные вмешательства. Расскажите, что у вас было, какие жалобы сейчас — врач обязательно это учтёт.";
    }

    public String getRheumatoidFootWithPhoto(){
        return "Фото принято. Врач посмотрит и даст комментарий \uD83D\uDE4C";
    }

    public String getRheumatoidFootWithoutPhoto(){
        return "Да, такие случаи мы ведём. Пришлите фото стопы и расскажите о текущем состоянии?";
    }

    public String getHeelSpurWithPhoto(){
        return "Спасибо за фото! Врач его посмотрит и даст обратную связь.";
    }

    public String getHeelSpurWithoutPhoto(){
        return "Да, врач смотрит такие случаи. Опишите симптомы и пришлите фото — это поможет быстрее оценить ваш случай.";
    }
}
