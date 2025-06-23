package com.ortopunkt.ai.templates;

public class RegulationTemplate {
    public String getQuotaInfo(){
        return "С 1 сентября 2025 г. по новым правилам операции по квоте возможны только в вашем регионе. " +
                "В нашей клинике такие операции теперь проводятся только платно.";
    }

    public String getPaidInfo(){
        return "Да, операции проводятся на платной основе. Цены можно посмотреть здесь: https://medsi.ru/services/";
    }

    public String getLocationInfo(){
        return "Как только врач планирует выезд на консультации в конкретный город, мы тут же сообщаем об этом в новостях группы: https://vk.com/ortopunkt \uD83D\uDE4C";
    }

    public String getOnlineConsultationInfo(){
        return "Да, врач проводит онлайн-консультации. Следите за новостями в группе ✨";
    }

    public String getAgeInfo(){
        return "Да, мы оперируем и пациентов старшего возраста. Врач учитывает индивидуальные особенности и даст обратную связь по вашему случаю.";
    }

    public String getRehabInfo(){
        return "Если вас интересует что-то конкретное (например, боль, срок восстановления, стельки, обувь) — напишите, и мы передадим вопрос врачу";
    }
}
