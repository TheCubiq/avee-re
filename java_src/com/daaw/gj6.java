package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* loaded from: classes.dex */
public final class gj6 {

    /* renamed from: a */
    public final Pattern f11367a;

    public gj6() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) zzba.zzc().m23658b(g93.f10782o6));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f11367a = pattern;
    }

    /* renamed from: a */
    public final String m21558a(String str) {
        Pattern pattern = this.f11367a;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
