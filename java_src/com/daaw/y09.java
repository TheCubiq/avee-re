package com.daaw;

import com.google.android.gms.internal.ads.zzacx;
import com.google.android.gms.internal.ads.zzadg;
import com.google.android.gms.internal.ads.zzbp;
import com.google.android.gms.internal.ads.zzbq;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class y09 {

    /* renamed from: c */
    public static final Pattern f33207c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f33208a = -1;

    /* renamed from: b */
    public int f33209b = -1;

    /* renamed from: a */
    public final boolean m4275a() {
        return (this.f33208a == -1 || this.f33209b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean m4274b(zzbq zzbqVar) {
        for (int i = 0; i < zzbqVar.m1103a(); i++) {
            zzbp m1102b = zzbqVar.m1102b(i);
            if (m1102b instanceof zzacx) {
                zzacx zzacxVar = (zzacx) m1102b;
                if ("iTunSMPB".equals(zzacxVar.f36741r) && m4273c(zzacxVar.f36742s)) {
                    return true;
                }
            } else if (m1102b instanceof zzadg) {
                zzadg zzadgVar = (zzadg) m1102b;
                if ("com.apple.iTunes".equals(zzadgVar.f36748q) && "iTunSMPB".equals(zzadgVar.f36749r) && m4273c(zzadgVar.f36750s)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m4273c(String str) {
        Matcher matcher = f33207c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i = it5.f13991a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f33208a = parseInt;
                    this.f33209b = parseInt2;
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
