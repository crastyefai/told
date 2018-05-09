package edu.fgu.dclab;

public class ChatMessage extends AbstractMessage {
    public final String MESSAGE;

    public ChatMessage(String source, String message) {
        this.source = source;
        this.MESSAGE = message;
    }

    public int getType() {
        if (this.MESSAGE.equals("time")){
            return Message.TIME;
        }
        else{
            return Message.CHAT;
        }
    }
}
