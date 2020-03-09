package by.clevertec.dataMigration.dataMongoFotMigration;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ContactList {
    private ArrayList<Relation> relations = new ArrayList<Relation>();
}
