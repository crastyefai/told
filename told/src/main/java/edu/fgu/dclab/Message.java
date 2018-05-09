package edu.fgu.dclab;

import java.io.Serializable;

public interface Message extends Serializable {
    int LOGIN = 0;
    int ROOM_STATE = 1;
    int CHAT = 2;
    int TIME = 3;

    String getSource();
    int getType();
}
