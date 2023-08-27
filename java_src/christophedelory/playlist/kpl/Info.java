package christophedelory.playlist.kpl;

import christophedelory.lang.StringUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* loaded from: classes.dex */
public class Info {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
    private Date _creation_day = null;
    private Date _modified_day = null;
    private String _author = null;
    private String _player = null;
    private String _player_version = null;
    private String _kpl_version = "1";

    public String getCreationDayString() {
        String format;
        if (this._creation_day != null) {
            synchronized (DATE_FORMAT) {
                format = DATE_FORMAT.format(this._creation_day);
            }
            return format;
        }
        return null;
    }

    public void setCreationDayString(String str) throws ParseException {
        String normalize = StringUtils.normalize(str);
        if (normalize == null) {
            this._creation_day = null;
            return;
        }
        synchronized (DATE_FORMAT) {
            this._creation_day = DATE_FORMAT.parse(normalize);
        }
    }

    public Date getCreationDay() {
        return this._creation_day;
    }

    public void setCreationDay(Date date) {
        this._creation_day = date;
    }

    public String getModifiedDayString() {
        String format;
        if (this._modified_day != null) {
            synchronized (DATE_FORMAT) {
                format = DATE_FORMAT.format(this._modified_day);
            }
            return format;
        }
        return null;
    }

    public void setModifiedDayString(String str) throws ParseException {
        String normalize = StringUtils.normalize(str);
        if (normalize == null) {
            this._modified_day = null;
            return;
        }
        synchronized (DATE_FORMAT) {
            this._modified_day = DATE_FORMAT.parse(normalize);
        }
    }

    public Date getModifiedDay() {
        return this._modified_day;
    }

    public void setModifiedDay(Date date) {
        this._modified_day = date;
    }

    public String getAuthor() {
        return this._author;
    }

    public void setAuthor(String str) {
        this._author = StringUtils.normalize(str);
    }

    public String getPlayer() {
        return this._player;
    }

    public void setPlayer(String str) {
        this._player = StringUtils.normalize(str);
    }

    public String getPlayerVersion() {
        return this._player_version;
    }

    public void setPlayerVersion(String str) {
        this._player_version = StringUtils.normalize(str);
    }

    public String getKplVersion() {
        return this._kpl_version;
    }

    public void setKplVersion(String str) {
        this._kpl_version = StringUtils.normalize(str);
    }
}
