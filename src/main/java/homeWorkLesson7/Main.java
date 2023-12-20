package homeWorkLesson7;

import java.time.OffsetDateTime;

public class Main {

    public static void main(String[] args) {

        RequestQuizResults requestQuizResults = new RequestQuizResults();
        requestQuizResults.setCreatedAt(OffsetDateTime.now());

        RequestQuizResults requestQuizResults1 = new RequestQuizResults();
        Pageable<RequestQuizResults> pageable = new Pageable<>();
        pageable.addElement(requestQuizResults1);
        pageable.addElement(requestQuizResults1);
        pageable.addElement(requestQuizResults1);


        ResponseGetAvatarListAvailableForProfile responseGetAvatarListAvailableForProfile =
                new ResponseGetAvatarListAvailableForProfile();

        Avatar avatar1 = new Avatar();
        avatar1.setId("avatar id");
        avatar1.setUrl("avater url");
        responseGetAvatarListAvailableForProfile.setAvatar(avatar1);

        Pageable<ResponseGetAvatarListAvailableForProfile> pageable1 = new Pageable<>();
        pageable1.addElement(responseGetAvatarListAvailableForProfile);

    }
}