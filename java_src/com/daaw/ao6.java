package com.daaw;

import android.net.Uri;
import java.util.Map;
/* loaded from: classes.dex */
public final class ao6 {
    public final String a = (String) ua3.b.e();

    public final String a(Map map) {
        Uri.Builder buildUpon = Uri.parse(this.a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
