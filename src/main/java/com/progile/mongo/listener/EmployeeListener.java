package com.progile.mongo.listener;

import com.progile.mongo.model.Employee;
import com.progile.mongo.service.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeConvertEvent;
import org.springframework.stereotype.Component;

@Component
public class EmployeeListener extends AbstractMongoEventListener<Employee> {

    private SequenceGeneratorService sequenceGeneratorService;

    @Autowired
    public EmployeeListener(SequenceGeneratorService sequenceGeneratorService) {
        this.sequenceGeneratorService = sequenceGeneratorService;
    }

    @Override
    public void onBeforeConvert(BeforeConvertEvent<Employee> event) {
//        if (Integer.parseInt(event.getSource().getId()) < 1) {
            event.getSource().setId(sequenceGeneratorService.generateSequence(Employee.SEQUENCE_NAME));
//        }
    }
}