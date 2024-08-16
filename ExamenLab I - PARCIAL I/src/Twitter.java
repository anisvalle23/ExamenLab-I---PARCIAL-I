
public class Twitter extends SocialClass {

    public Twitter(String Username) {
        super(Username);
    }

    public String timeline() {
        String texto = "";
        for (String post : posts) {
            texto += post + "\n";
        }
        return texto;
    }
}
