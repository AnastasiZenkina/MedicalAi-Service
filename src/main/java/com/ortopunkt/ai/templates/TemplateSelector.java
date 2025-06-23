package com.ortopunkt.ai.templates;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class TemplateSelector {
    private final Map<String, BiFunction<String, Boolean, String>> templateMap = new HashMap<>();
    public TemplateSelector(){
        FlatfootTemplate flatfoot = new FlatfootTemplate();
        JointTemplate joint = new JointTemplate();
        SymptomsTemplate symptoms = new SymptomsTemplate();
        RegulationTemplate regulation = new RegulationTemplate();
        CommonTemplate common = new CommonTemplate();
        SpecialCasesTemplate special = new SpecialCasesTemplate();

        templateMap.put("flatfoot", (t, hasPhoto) ->
                hasPhoto ? flatfoot.getWithPhoto() : flatfoot.getWithoutPhoto());

        templateMap.put("joinsurgery", (t, hasPhoto) ->
                hasPhoto ? joint.getJointSurgeryWithPhoto() : joint.getJointSurgeryWithoutPhoto());

        templateMap.put("endoprosthesis", (t, hasPhoto) ->
                hasPhoto ? joint.getEndoprosthesisWithPhoto() : joint.getEndoprosthesisWithoutPhoto());

        templateMap.put("repeat", (t, hasPhoto) ->
                joint.getRepeatSurgery());

        templateMap.put("rheumatoid", (t, hasPhoto) ->
                hasPhoto ? joint.getRheumatoidFootWithPhoto() : joint.getRheumatoidFootWithoutPhoto());

        templateMap.put("heelspur", (t, hasPhoto) ->
                hasPhoto ? joint.getHeelSpurWithPhoto() : joint.getHeelSpurWithoutPhoto());

        templateMap.put("symptom", (t, hasPhoto) ->
                hasPhoto ? symptoms.getSymptomsGeneralWithPhoto() : symptoms.getSymptomsGeneralWithoutPhoto());

        templateMap.put("ganglion", (t, hasPhoto) ->
                hasPhoto ? special.getGanglionWithPhoto() : special.getGanglionWithoutPhoto());

        templateMap.put("dupuytren", (t, hasPhoto) ->
                hasPhoto ? special.getDupuytrenWithPhoto() : special.getDupuytrenWithoutPhoto());

        templateMap.put("morton", (t, hasPhoto) ->
                hasPhoto ? special.getMortonWithPhoto() : special.getMortonWithoutPhoto());

        templateMap.put("haglund", (t, hasPhoto) ->
                hasPhoto ? special.getHaglundWithPhoto() : special.getHaglundWithoutPhoto());
        templateMap.put("quota", (t, hasPhoto) -> regulation.getQuotaInfo());
        templateMap.put("paid", (t, hasPhoto) -> regulation.getPaidInfo());
        templateMap.put("region", (t, hasPhoto) -> regulation.getLocationInfo());
        templateMap.put("online", (t, hasPhoto) -> regulation.getOnlineConsultationInfo());
        templateMap.put("age", (t, hasPhoto) -> regulation.getAgeInfo());
        templateMap.put("rehab", (t, hasPhoto) -> regulation.getRehabInfo());

        // Общие
        templateMap.put("common", (t, hasPhoto) -> common.getWaitingMessage());
        templateMap.put("partner", (t, hasPhoto) -> common.getPartnerQuestion());
    }

    public String getReply(String topic, boolean hasPhoto) {
        return templateMap
                .getOrDefault(topic.toLowerCase(), (t, h) -> "Спасибо за сообщение! Врач посмотрит и даст ответ 🌿")
                .apply(topic, hasPhoto);
    }

}