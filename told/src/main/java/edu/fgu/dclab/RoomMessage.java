package edu.fgu.dclab;

public class RoomMessage extends AbstractMessage {
    public final int NUMBER_OF_GUESTS;
    public final int ROOM_NUMBER;

    public RoomMessage(int roomNumber, int guests) {
        this.ROOM_NUMBER = roomNumber;
        this.NUMBER_OF_GUESTS = guests;
    }

    public int getType() {
        return Message.ROOM_STATE;
    }
}
