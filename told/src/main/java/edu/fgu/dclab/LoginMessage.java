package edu.fgu.dclab;

public class LoginMessage extends AbstractMessage {
    public final String ID;
    public final String PASSWORD;

    public LoginMessage(String id, String password) {
        this.ID = id;
        this.PASSWORD = password;
    }

    public int getType() {
        return Message.LOGIN;
    }
}
