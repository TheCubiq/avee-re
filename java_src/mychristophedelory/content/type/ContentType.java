package mychristophedelory.content.type;

import christophedelory.player.PlayerSupport;
import java.io.File;
import java.util.Locale;
/* loaded from: classes2.dex */
public class ContentType implements Cloneable {
    private String _description;
    private final String[] _extensions;
    private final String[] _mimeTypes;
    private final PlayerSupport[] _playerSupports;

    public ContentType(String[] strArr, String[] strArr2, PlayerSupport[] playerSupportArr, String str) {
        if (strArr.length <= 0) {
            throw new IllegalArgumentException("Empty extension array");
        }
        if (strArr2.length <= 0) {
            throw new IllegalArgumentException("Empty MIME type array");
        }
        this._extensions = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            this._extensions[i] = strArr[i].toLowerCase(Locale.ENGLISH);
        }
        this._mimeTypes = new String[strArr2.length];
        for (int i2 = 0; i2 < strArr2.length; i2++) {
            this._mimeTypes[i2] = strArr2[i2].toLowerCase(Locale.ENGLISH);
        }
        this._description = str;
        this._playerSupports = playerSupportArr == null ? new PlayerSupport[0] : (PlayerSupport[]) playerSupportArr.clone();
    }

    public String[] getExtensions() {
        return (String[]) this._extensions.clone();
    }

    public String[] getMimeTypes() {
        return (String[]) this._mimeTypes.clone();
    }

    public PlayerSupport[] getPlayerSupports() {
        return (PlayerSupport[]) this._playerSupports.clone();
    }

    public String getDescription() {
        return this._description;
    }

    public void setDescription(String str) {
        this._description = str;
    }

    public boolean matchExtension(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        boolean z = false;
        for (String str2 : this._extensions) {
            z = z || lowerCase.endsWith(str2);
        }
        return z;
    }

    public boolean accept(File file) {
        if (file.isDirectory()) {
            return true;
        }
        return matchExtension(file.getName());
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
