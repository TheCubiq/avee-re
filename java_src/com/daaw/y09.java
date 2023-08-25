package com.daaw;

import com.google.android.gms.internal.ads.zzacx;
import com.google.android.gms.internal.ads.zzadg;
import com.google.android.gms.internal.ads.zzbp;
import com.google.android.gms.internal.ads.zzbq;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class y09 {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a() {
        return (this.a == -1 || this.b == -1) ? false : true;
    }

    public final boolean b(zzbq zzbqVar) {
        for (int i = 0; i < zzbqVar.a(); i++) {
            zzbp b = zzbqVar.b(i);
            if (b instanceof zzacx) {
                zzacx zzacxVar = (zzacx) b;
                if ("iTunSMPB".equals(zzacxVar.r) && c(zzacxVar.s)) {
                    return true;
                }
            } else if (b instanceof zzadg) {
                zzadg zzadgVar = (zzadg) b;
                if ("com.apple.iTunes".equals(zzadgVar.q) && "iTunSMPB".equals(zzadgVar.r) && c(zzadgVar.s)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final boolean c(String str) {
        Matcher matcher = c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i = it5.a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.a = parseInt;
                    this.b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }
}
