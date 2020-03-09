package by.clevertec.dataMigration.dataMongoFotMigration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "testCollection")
public class File {

    private String _id;

    private String name;

    private String email;

    private String imgURL;

    private Boolean emailVerified;

    private String registrationStatus;

    private String accessToken;

    private String refreshToken;

    private String _class;

    private ContactList contactList;

    private UserProfile userProfile;

    private String pageId;

    private String vkEmail;

    private String firstName;

    private String lastName;

}
