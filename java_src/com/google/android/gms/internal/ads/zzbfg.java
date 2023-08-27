package com.google.android.gms.internal.ads;

import com.mpatric.mp3agic.EncodedText;
import java.nio.charset.Charset;
/* loaded from: classes2.dex */
public final class zzbfg {
    protected static final Charset UTF_8 = Charset.forName("UTF-8");
    private static final Charset ISO_8859_1 = Charset.forName(EncodedText.CHARSET_ISO_8859_1);
    public static final Object zzebs = new Object();

    public static void zza(zzbfc zzbfcVar, zzbfc zzbfcVar2) {
        if (zzbfcVar.zzebk != null) {
            zzbfcVar2.zzebk = (zzbfe) zzbfcVar.zzebk.clone();
        }
    }
}
