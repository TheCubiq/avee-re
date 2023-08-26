package christophedelory.rss;
/* loaded from: classes.dex */
public class RSS {
    public static final String VERSION_0_91 = "0.91";
    public static final String VERSION_0_92 = "0.92";
    public static final String VERSION_2_0 = "2.0";
    private Channel _channel;
    private String _version;

    public RSS() {
        Channel channel = new Channel();
        this._channel = channel;
        this._version = "2.0";
        channel.setRSS(this);
    }

    public String getVersion() {
        return this._version;
    }

    public void setVersion(String str) {
        this._version = str.trim();
    }

    public Channel getChannel() {
        return this._channel;
    }

    public void setChannel(Channel channel) {
        channel.setRSS(this);
        this._channel = channel;
    }
}
