package by.clevertec.dataMigration.dataMongoFotMigration;

import lombok.Data;

import java.math.BigInteger;
import java.util.ArrayList;

@Data
public class UserProfile {
    private String uid;

    private String firstName;

    private String lastName;

    private BigInteger birthDate;

    private Double height;

    private Double weight;

    private String gender;

    private String location;

    private Image image;

    private Image previewImage;

    private Stats stats;

    private ArrayList<String> bikes = new ArrayList<>();
}
