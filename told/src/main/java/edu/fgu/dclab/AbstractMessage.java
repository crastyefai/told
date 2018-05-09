package edu.fgu.dclab;

public abstract class AbstractMessage implements Message {
    protected String source = "MurMur";

    public String getSource() {
        return this.source;
    }
}
