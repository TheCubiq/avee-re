package christophedelory.plist;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
/* loaded from: classes.dex */
public class Date extends PlistObject {
    private static final DateFormat DATETIME_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
    private java.util.Date _value;

    public Date() {
        this._value = null;
    }

    public Date(java.util.Date date) {
        this._value = null;
        if (date == null) {
            throw new NullPointerException("no date");
        }
        this._value = date;
    }

    public java.lang.String getValueString() {
        java.lang.String format;
        synchronized (DATETIME_FORMAT) {
            format = DATETIME_FORMAT.format(this._value);
        }
        return format;
    }

    public void setValueString(java.lang.String str) throws ParseException {
        synchronized (DATETIME_FORMAT) {
            this._value = DATETIME_FORMAT.parse(str);
        }
    }

    public java.util.Date getValue() {
        return this._value;
    }

    public void setValue(java.util.Date date) {
        if (date == null) {
            throw new NullPointerException("no date");
        }
        this._value = date;
    }
}
