package com.daaw;

import android.net.Uri;
import java.util.Map;
/* loaded from: classes.dex */
public final class ao6 {

    /* renamed from: a */
    public final String f3358a = (String) ua3.f28851b.m16137e();

    /* renamed from: a */
    public final String m27313a(Map map) {
        Uri.Builder buildUpon = Uri.parse(this.f3358a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
