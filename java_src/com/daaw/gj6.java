package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
/* loaded from: classes.dex */
public final class gj6 {
    public final Pattern a;

    public gj6() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) zzba.zzc().b(g93.o6));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.a = pattern;
    }

    public final String a(String str) {
        Pattern pattern = this.a;
        if (pattern != null && str != null) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
