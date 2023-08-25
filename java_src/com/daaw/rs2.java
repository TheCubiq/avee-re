package com.daaw;

import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxs;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class rs2 {

    /* renamed from: c */
    public static final ev2 f25568c = new qs2();

    /* renamed from: d */
    public static final Pattern f25569d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f25570a = -1;

    /* renamed from: b */
    public int f25571b = -1;

    /* renamed from: a */
    public final boolean m10977a() {
        return (this.f25570a == -1 || this.f25571b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean m10976b(zzaxo zzaxoVar) {
        for (int i = 0; i < zzaxoVar.m1117a(); i++) {
            zzaxn m1116b = zzaxoVar.m1116b(i);
            if (m1116b instanceof zzaxs) {
                zzaxs zzaxsVar = (zzaxs) m1116b;
                String str = zzaxsVar.f36814r;
                String str2 = zzaxsVar.f36815s;
                if ("iTunSMPB".equals(str)) {
                    Matcher matcher = f25569d.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int parseInt = Integer.parseInt(matcher.group(1), 16);
                            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                            if (parseInt > 0 || parseInt2 > 0) {
                                this.f25570a = parseInt;
                                this.f25571b = parseInt2;
                                return true;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }
}
