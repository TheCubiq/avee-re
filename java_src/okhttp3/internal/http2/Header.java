package okhttp3.internal.http2;

import okhttp3.Headers;
import okhttp3.internal.Util;
import okio.ByteString;
/* loaded from: classes2.dex */
public final class Header {
    final int hpackSize;
    public final ByteString name;
    public final ByteString value;
    public static final ByteString PSEUDO_PREFIX = ByteString.encodeUtf8(":");
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final ByteString RESPONSE_STATUS = ByteString.encodeUtf8(RESPONSE_STATUS_UTF8);
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final ByteString TARGET_METHOD = ByteString.encodeUtf8(TARGET_METHOD_UTF8);
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final ByteString TARGET_PATH = ByteString.encodeUtf8(TARGET_PATH_UTF8);
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public static final ByteString TARGET_SCHEME = ByteString.encodeUtf8(TARGET_SCHEME_UTF8);
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final ByteString TARGET_AUTHORITY = ByteString.encodeUtf8(TARGET_AUTHORITY_UTF8);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public interface Listener {
        void onHeaders(Headers headers);
    }

    public Header(String str, String str2) {
        this(ByteString.encodeUtf8(str), ByteString.encodeUtf8(str2));
    }

    public Header(ByteString byteString, String str) {
        this(byteString, ByteString.encodeUtf8(str));
    }

    public Header(ByteString byteString, ByteString byteString2) {
        this.name = byteString;
        this.value = byteString2;
        this.hpackSize = byteString.size() + 32 + byteString2.size();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Header) {
            Header header = (Header) obj;
            return this.name.equals(header.name) && this.value.equals(header.value);
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.name.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return Util.format("%s: %s", this.name.utf8(), this.value.utf8());
    }
}
