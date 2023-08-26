package okhttp3.internal.http;

import androidx.browser.trusted.sharing.ShareTarget;
/* loaded from: classes2.dex */
public final class HttpMethod {
    public static boolean invalidatesCache(String str) {
        return str.equals(ShareTarget.METHOD_POST) || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public static boolean requiresRequestBody(String str) {
        return str.equals(ShareTarget.METHOD_POST) || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    public static boolean permitsRequestBody(String str) {
        return (str.equals(ShareTarget.METHOD_GET) || str.equals("HEAD")) ? false : true;
    }

    public static boolean redirectsWithBody(String str) {
        return str.equals("PROPFIND");
    }

    public static boolean redirectsToGet(String str) {
        return !str.equals("PROPFIND");
    }

    private HttpMethod() {
    }
}
