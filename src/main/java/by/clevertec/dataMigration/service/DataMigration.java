package by.clevertec.dataMigration.service;

import by.clevertec.dataMigration.dataMongoFotMigration.File;
import by.clevertec.dataMigration.dataPostgresFotMigration.*;
import by.clevertec.dataMigration.repositoryMongoFotMigration.FileRepository;
import by.clevertec.dataMigration.repositoryPostgresFotMigration.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataMigration {
    private final FileRepository fileRepository;

    private final ImageInfoRepository imageInfoRepository;
    private final AccessTokensRepository accessTokensRepository;
    private final BikeTypesRepository bikeTypesRepository;
    private final ProfileBikesRepository profileBikesRepository;
    private final ProfileRepository profileRepository;
    private final ProfileStatsRepository profileStatsRepository;
    private final RefreshTokensRepository refreshTokensRepository;
    private final RegistrationStatusRepository registrationStatusRepository;
    private final RelationRepository relationRepository;
    private final RoleRepository roleRepository;
    private final UserDataRepository userDataRepository;
    private final UserDataRolesRepository userDataRolesRepository;
    private final UserDataVkRepository userDataVkRepository;
    private final UserRefreshTokenRepository userRefreshTokenRepository;

        public DataMigration(FileRepository fileRepository,
                         ImageInfoRepository imageInfoRepository,
                         AccessTokensRepository accessTokensRepository,
                         BikeTypesRepository bikeTypesRepository,
                         ProfileBikesRepository profileBikesRepository,
                         ProfileRepository profileRepository,
                         ProfileStatsRepository profileStatsRepository,
                         RefreshTokensRepository refreshTokensRepository,
                         RegistrationStatusRepository registrationStatusRepository,
                         RelationRepository relationRepository,
                         RoleRepository roleRepository,
                         UserDataRepository userDataRepository,
                         UserDataRolesRepository userDataRolesRepository,
                         UserDataVkRepository userDataVkRepository,
                         UserRefreshTokenRepository userRefreshTokenRepository) {
        this.fileRepository = fileRepository;
        this.imageInfoRepository = imageInfoRepository;
        this.accessTokensRepository = accessTokensRepository;
        this.bikeTypesRepository = bikeTypesRepository;
        this.profileBikesRepository = profileBikesRepository;
        this.profileRepository = profileRepository;
        this.profileStatsRepository = profileStatsRepository;
        this.refreshTokensRepository = refreshTokensRepository;
        this.registrationStatusRepository = registrationStatusRepository;
        this.relationRepository = relationRepository;
        this.roleRepository = roleRepository;
        this.userDataRepository = userDataRepository;
        this.userDataRolesRepository = userDataRolesRepository;
        this.userDataVkRepository = userDataVkRepository;
        this.userRefreshTokenRepository = userRefreshTokenRepository;
    }

    public void doDataMigration() {
        List<File> files = fileRepository.findAll();

        for (int i = 0; i < files.size(); i++) {

            // WriteImageInfo
            ImageInfo imageInfos = new ImageInfo(
                            files.get(i).getUserProfile().getImage().get_id(),
                            files.get(i).getUserProfile().getImage().getImgURL());
            imageInfoRepository.save(imageInfos);
            ImageInfo imageInfos2 = new ImageInfo(
                            files.get(i).getUserProfile().getPreviewImage().get_id(),
                            files.get(i).getUserProfile().getPreviewImage().getImgURL());
            imageInfoRepository.save(imageInfos2);


            // WriteRegistrationStatus
            if (registrationStatusRepository.findByStatus(files.get(i).getRegistrationStatus()).size() == 0){
                RegistrationStatus registrationStatuses = new RegistrationStatus(
                        files.get(i).getRegistrationStatus()
                );
                registrationStatusRepository.save(registrationStatuses);
            }



            // WriteRole
            if (roleRepository.findByRole(files.get(i).get_class()).size() == 0){
                Role roles = new Role(
                        files.get(i).get_class()
                );
                roleRepository.save(roles);
            }


            // WriteBikeTypes
            for (int j = 0; j <files.get(i).getUserProfile().getBikes().size(); j++){
                if (bikeTypesRepository.findByBikeType(files.get(i).getUserProfile().getBikes().get(j)).size() == 0){
                    BikeTypes bikeTypes = new BikeTypes(
                            files.get(i).getUserProfile().getBikes().get(j)
                    );
                    bikeTypesRepository.save(bikeTypes);
                }
            }


            // WriteUserData
            UserData userDates = new UserData(
                    files.get(i).get_id(),
                    files.get(i).getEmail(),
                    files.get(i).getEmailVerified(),
                    files.get(i).getImgURL(),
                    files.get(i).getName(),
                    registrationStatusRepository.findByStatus(files.get(i).getRegistrationStatus()).get(0).getRegistrationStatusId()
            );
            userDataRepository.save(userDates);



            // WriteUserDataVk
            UserDataVk userDataVk = new UserDataVk(
                    files.get(i).getPageId(),
                    files.get(i).getVkEmail(),
                    files.get(i).getFirstName(),
                    files.get(i).getLastName()
            );
            userDataVkRepository.save(userDataVk);



            // WriteRefreshTokens
            RefreshTokens refreshTokens = new RefreshTokens(
                    null,
                    null,
                    files.get(i).getRefreshToken()
            );
            refreshTokensRepository.save(refreshTokens);



            // WriteUserDataRoles
            List<Role> roles = roleRepository.findByRole(files.get(i).get_class());
            UserDataRoles userDataRoles = new UserDataRoles(
                    files.get(i).get_id(),
                    roles.get(0).getRoleId()
            );
            userDataRolesRepository.save(userDataRoles);



            // WriteUserRefreshToken
            List<RefreshTokens> refreshToken = refreshTokensRepository.findByTokenValue(files.get(i).getRefreshToken());
            UserRefreshToken userRefreshToken = new UserRefreshToken(
                    files.get(i).get_id(),
                    refreshToken.get(0).getTokenId()
            );
            userRefreshTokenRepository.save(userRefreshToken);



            // WriteProfileStats
            ProfileStats profileStats = new ProfileStats(
                    files.get(i).getUserProfile().getStats().getFriends(),
                    files.get(i).getUserProfile().getStats().getPosts(),
                    files.get(i).getUserProfile().getStats().getSubscribers()
            );
            profileStatsRepository.save(profileStats);





            // WriteAccessTokens
            List<RefreshTokens> refreshToken2 = refreshTokensRepository.findByTokenValue(files.get(i).getRefreshToken());
            AccessTokens accessTokensTokens = new AccessTokens(
                    null,
                    null,
                    files.get(i).getAccessToken(),
                    refreshToken2.get(0).getTokenId(),
                    files.get(i).get_id()
            );
            accessTokensRepository.save(accessTokensTokens);


            // WriteProfile
            Profile profile = new Profile(
                    files.get(i).get_id(),
                    null,
                    files.get(i).getUserProfile().getBirthDate(),
                    files.get(i).getUserProfile().getFirstName(),
                    files.get(i).getUserProfile().getGender(),
                    files.get(i).getUserProfile().getHeight(),
                    files.get(i).getUserProfile().getLastName(),
                    files.get(i).getUserProfile().getLocation(),
                    files.get(i).getUserProfile().getWeight(),
                    imageInfoRepository.findByImgUrl(files.get(i).getUserProfile().getImage().getImgURL()).get(0).getId(),
                    imageInfoRepository.findByImgUrl(files.get(i).getUserProfile().getPreviewImage().getImgURL()).get(0).getId(),
                    profileStatsRepository.findByFriendsAndPostsAndSubscribers(files.get(i).getUserProfile().getStats().getFriends(),
                            files.get(i).getUserProfile().getStats().getPosts(),
                            files.get(i).getUserProfile().getStats().getSubscribers()
                            ).get(0).getUid()
            );
            profileRepository.save(profile);




            // WriteRelation
            for (int j = 0; j <files.get(i).getContactList().getRelations().size(); j++){
                Relation relations = new Relation(
                        files.get(i).getContactList().getRelations().get(j).getType(),
                        files.get(i).getContactList().getRelations().get(j).getUid(),
                        files.get(i).get_id()
                );
                relationRepository.save(relations);
            }


            // WriteProfileBikes
            for (int j = 0; j <files.get(i).getUserProfile().getBikes().size(); j++) {
                List<BikeTypes> bikeType = bikeTypesRepository.findByBikeType(files.get(i).getUserProfile().getBikes().get(j));
                ProfileBikes profileBikes = new ProfileBikes(
                        files.get(i).get_id(),
                        bikeType.get(0).getId()
                );
                profileBikesRepository.save(profileBikes);
            }
        }
    }
}
