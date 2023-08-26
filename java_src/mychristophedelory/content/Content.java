package mychristophedelory.content;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
/* loaded from: classes2.dex */
public class Content {
    private transient Boolean _connected;
    private long _duration;
    private String _encoding;
    private int _height;
    private long _lastModified;
    private long _length;
    private String _type;
    private transient URI _uri;
    private transient URL _url;
    private final String _urlString;
    private int _width;

    public Content(String str) {
        this._uri = null;
        this._url = null;
        this._encoding = null;
        this._length = -1L;
        this._type = null;
        this._lastModified = 0L;
        this._duration = -1L;
        this._width = -1;
        this._height = -1;
        this._connected = null;
        this._urlString = str.trim().replace('\\', '/');
    }

    public Content(URI uri) {
        this._uri = null;
        this._url = null;
        this._encoding = null;
        this._length = -1L;
        this._type = null;
        this._lastModified = 0L;
        this._duration = -1L;
        this._width = -1;
        this._height = -1;
        this._connected = null;
        this._uri = uri.normalize();
        this._urlString = uri.toString();
    }

    public Content(URL url) {
        this._uri = null;
        this._url = null;
        this._encoding = null;
        this._length = -1L;
        this._type = null;
        this._lastModified = 0L;
        this._duration = -1L;
        this._width = -1;
        this._height = -1;
        this._connected = null;
        this._urlString = url.toString();
        this._url = url;
    }

    public URI getURI() throws URISyntaxException {
        URI uri;
        synchronized (this) {
            if (this._uri == null) {
                if (this._url == null) {
                    try {
                        uri = new URI(this._urlString);
                    } catch (URISyntaxException unused) {
                        uri = null;
                    }
                    if (uri == null || !uri.isAbsolute()) {
                        uri = new File(this._urlString).toURI();
                    }
                } else {
                    uri = this._url.toURI();
                }
                this._uri = uri.normalize();
            }
        }
        return this._uri;
    }

    public URL getURL() throws MalformedURLException {
        synchronized (this) {
            if (this._url == null) {
                try {
                    this._url = new URL(this._urlString);
                } catch (MalformedURLException unused) {
                    URI normalize = new File(this._urlString).toURI().normalize();
                    this._uri = normalize;
                    this._url = normalize.toURL();
                }
            }
        }
        return this._url;
    }

    public String getEncoding() {
        return this._encoding;
    }

    public void setEncoding(String str) {
        this._encoding = str;
    }

    public long getLength() {
        return this._length;
    }

    public void setLength(long j) {
        this._length = j;
    }

    public String getType() {
        return this._type;
    }

    public void setType(String str) {
        this._type = str;
    }

    public long getLastModified() {
        return this._lastModified;
    }

    public void setLastModified(long j) {
        this._lastModified = j;
    }

    public long getDuration() {
        return this._duration;
    }

    public void setDuration(long j) {
        this._duration = j;
    }

    public int getWidth() {
        return this._width;
    }

    public void setWidth(int i) {
        this._width = i;
    }

    public int getHeight() {
        return this._height;
    }

    public void setHeight(int i) {
        this._height = i;
    }

    public boolean isValid() {
        Boolean bool = this._connected;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void connect() throws IOException {
        boolean z;
        synchronized (this) {
            if (this._connected == null) {
                this._connected = Boolean.FALSE;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            URLConnection openConnection = getURL().openConnection();
            openConnection.setAllowUserInteraction(false);
            openConnection.setDoInput(true);
            openConnection.setDoOutput(false);
            openConnection.setUseCaches(true);
            openConnection.connect();
            String contentEncoding = openConnection.getContentEncoding();
            long contentLength = openConnection.getContentLength();
            String contentType = openConnection.getContentType();
            long lastModified = openConnection.getLastModified();
            if (contentEncoding != null) {
                this._encoding = contentEncoding;
            }
            if (contentLength >= 0) {
                this._length = contentLength;
            }
            if (contentType != null && !"content/unknown".equals(contentType)) {
                this._type = contentType;
            }
            if (lastModified > 0) {
                this._lastModified = lastModified;
            }
            this._connected = Boolean.TRUE;
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return this._urlString.equals(obj.toString());
    }

    public int hashCode() {
        return this._urlString.hashCode();
    }

    public String toString() {
        return this._urlString;
    }
}
