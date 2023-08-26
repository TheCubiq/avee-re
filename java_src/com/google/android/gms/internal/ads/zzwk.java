package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;
@zzadh
/* loaded from: classes2.dex */
public final class zzwk {
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    public static final zzwj<JSONObject> zzbrc = new zzwm();
    private static final zzwh<InputStream> zzbrd = zzwl.zzbre;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ InputStream zzf(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(UTF_8));
    }
}
