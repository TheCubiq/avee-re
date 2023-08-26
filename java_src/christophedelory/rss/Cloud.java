package christophedelory.rss;
/* loaded from: classes.dex */
public class Cloud {
    private String _domain = null;
    private int _port = 0;
    private String _path = null;
    private String _registerProcedure = null;
    private String _protocol = null;

    public void setDomain(String str) {
        this._domain = str.trim();
    }

    public String getDomain() {
        return this._domain;
    }

    public void setPort(int i) {
        this._port = i;
    }

    public int getPort() {
        return this._port;
    }

    public String getPath() {
        return this._path;
    }

    public void setPath(String str) {
        this._path = str.trim();
    }

    public String getRegisterProcedure() {
        return this._registerProcedure;
    }

    public void setRegisterProcedure(String str) {
        this._registerProcedure = str.trim();
    }

    public String getProtocol() {
        return this._protocol;
    }

    public void setProtocol(String str) {
        this._protocol = str.trim();
    }
}
