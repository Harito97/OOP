package patterns.iterator.pseudocode;

public class Application {
    SocialNetwork network;
    SocialSpammer spammer;

    public void cofig(){
        this.network = new Facebook();
        this.spammer = new SocialSpammer();
    }

    public void sendSpamToFriends(Profile profile){
        ProfileIterator iterator = network.createFriendsIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }

    public void sendSpamToCoworkers(Profile profile){
        ProfileIterator iterator = network.createCoworkersIterator(profile.getId());
        spammer.send(iterator, "Very important message");
    }

    public static void main(String[] args) {

    }
}
