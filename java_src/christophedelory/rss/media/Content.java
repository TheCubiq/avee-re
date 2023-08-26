package christophedelory.rss.media;

import java.net.URI;
import java.net.URISyntaxException;
/* loaded from: classes.dex */
public class Content extends BaseMedia {
    private URI _url = null;
    private Integer _duration = null;
    private Long _fileSize = null;
    private Integer _width = null;
    private Integer _height = null;
    private Integer _channels = null;
    private Integer _bitrate = null;
    private Integer _framerate = null;
    private Float _samplingrate = null;
    private String _type = null;
    private String _medium = null;
    private String _expression = null;
    private String _lang = null;
    private Boolean _isDefault = null;

    public void setURLString(String str) throws URISyntaxException {
        this._url = new URI(str);
    }

    public String getURLString() {
        URI uri = this._url;
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    public void setURL(URI uri) {
        this._url = uri;
    }

    public URI getURL() {
        return this._url;
    }

    public void setDuration(int i) {
        this._duration = Integer.valueOf(i);
    }

    public void setDuration(Integer num) {
        this._duration = num;
    }

    public Integer getDuration() {
        return this._duration;
    }

    public void setBitrate(Integer num) {
        this._bitrate = num;
    }

    public Integer getBitrate() {
        return this._bitrate;
    }

    public void setFramerate(Integer num) {
        this._framerate = num;
    }

    public Integer getFramerate() {
        return this._framerate;
    }

    public void setSamplingrate(Float f) {
        this._samplingrate = f;
    }

    public Float getSamplingrate() {
        return this._samplingrate;
    }

    public void setWidth(Integer num) {
        this._width = num;
    }

    public Integer getWidth() {
        return this._width;
    }

    public void setHeight(Integer num) {
        this._height = num;
    }

    public Integer getHeight() {
        return this._height;
    }

    public void setChannels(Integer num) {
        this._channels = num;
    }

    public Integer getChannels() {
        return this._channels;
    }

    public void setFileSize(Long l) {
        this._fileSize = l;
    }

    public Long getFileSize() {
        return this._fileSize;
    }

    public String getType() {
        return this._type;
    }

    public void setType(String str) {
        this._type = str;
    }

    public String getMedium() {
        return this._medium;
    }

    public void setMedium(String str) {
        this._medium = str;
    }

    public String getExpression() {
        return this._expression;
    }

    public void setExpression(String str) {
        this._expression = str;
    }

    public String getLang() {
        return this._lang;
    }

    public void setLang(String str) {
        this._lang = str;
    }

    public boolean isDefault() {
        Boolean bool = this._isDefault;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void setDefault(boolean z) {
        this._isDefault = Boolean.valueOf(z);
    }

    public Boolean getIsDefault() {
        return this._isDefault;
    }

    public void setIsDefault(Boolean bool) {
        this._isDefault = bool;
    }
}
