package by.clevertec.dataMigration.controller;

import by.clevertec.dataMigration.service.DataMigration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private DataMigration dataMigration;

    @GetMapping(value = "/{migration}")
    public void dataMigration() {
        dataMigration.doDataMigration();
    }
}
