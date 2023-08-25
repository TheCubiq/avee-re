package com.daaw;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
/* loaded from: classes.dex */
public final class qh3 implements zg3 {
    public final Context a;

    public qh3(Context context) {
        this.a = context;
    }

    @Override // com.daaw.zg3
    public final void a(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        zze.zza("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey("title")) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
        }
        try {
            zzt.zzp();
            zzs.zzQ(this.a, intent);
        } catch (ActivityNotFoundException e) {
            zzt.zzo().u(e, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
