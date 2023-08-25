package android.support.p000v4.media;

import android.media.MediaDescription;
import android.net.Uri;
/* renamed from: android.support.v4.media.b */
/* loaded from: classes.dex */
public class C0007b {

    /* renamed from: android.support.v4.media.b$a */
    /* loaded from: classes.dex */
    public static class C0008a {
        /* renamed from: a */
        public static void m30462a(Object obj, Uri uri) {
            ((MediaDescription.Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m30463a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
