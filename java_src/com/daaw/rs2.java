package com.daaw;

import com.google.android.gms.internal.ads.zzaxn;
import com.google.android.gms.internal.ads.zzaxo;
import com.google.android.gms.internal.ads.zzaxs;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class rs2 {
    public static final ev2 c = new qs2();
    public static final Pattern d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a() {
        return (this.a == -1 || this.b == -1) ? false : true;
    }

    public final boolean b(zzaxo zzaxoVar) {
        for (int i = 0; i < zzaxoVar.a(); i++) {
            zzaxn b = zzaxoVar.b(i);
            if (b instanceof zzaxs) {
                zzaxs zzaxsVar = (zzaxs) b;
                String str = zzaxsVar.r;
                String str2 = zzaxsVar.s;
                if ("iTunSMPB".equals(str)) {
                    Matcher matcher = d.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int parseInt = Integer.parseInt(matcher.group(1), 16);
                            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                            if (parseInt > 0 || parseInt2 > 0) {
                                this.a = parseInt;
                                this.b = parseInt2;
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
