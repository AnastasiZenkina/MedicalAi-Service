package com.ortopunkt.ai.templates;

public class SpecialCasesTemplate {

    public String getGanglionWithoutPhoto() {
        return "Да, мы занимаемся гигромами. Уточните, где она расположена и есть ли фото — это поможет врачу.";
    }

    public String getGanglionWithPhoto() {
        return "Фото принято — врач обязательно его посмотрит. Спасибо за доверие 🌷";
    }

    public String getDupuytrenWithoutPhoto() {
        return "Да, мы проводим операции при этой патологии. Можете описать ваш случай или прислать фото?";
    }

    public String getDupuytrenWithPhoto() {
        return "Спасибо! Врач сейчас на операции — как освободится, изучит фото и даст обратную связь.";
    }

    public String getMortonWithoutPhoto() {
        return "Да, врач занимается этим. Опишите, что чувствуете — и, если есть возможность, пришлите фото.";
    }

    public String getMortonWithPhoto() {
        return "Спасибо! Фото получено, ждём ответ врача 🌿";
    }

    public String getHaglundWithoutPhoto() {
        return "Да, такие случаи мы рассматриваем. Расскажите, когда появились симптомы? Фото стоп поможет сориентироваться.";
    }

    public String getHaglundWithPhoto() {
        return "Врач обязательно посмотрит фото и даст своё мнение, как только освободится.";
    }
}
