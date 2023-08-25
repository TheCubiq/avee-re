package com.daaw;

import android.text.Html;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class qh1 extends jd1 {

    /* renamed from: p */
    public static final Pattern f23953p = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");

    /* renamed from: o */
    public final StringBuilder f23954o;

    public qh1() {
        super("SubripDecoder");
        this.f23954o = new StringBuilder();
    }

    /* renamed from: D */
    public static long m12533D(Matcher matcher, int i) {
        return ((Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }

    @Override // com.daaw.jd1
    /* renamed from: C */
    public rh1 mo5845z(byte[] bArr, int i, boolean z) {
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        rl0 rl0Var = new rl0();
        rv0 rv0Var = new rv0(bArr, i);
        while (true) {
            String m10909k = rv0Var.m10909k();
            if (m10909k == null) {
                break;
            } else if (m10909k.length() != 0) {
                try {
                    Integer.parseInt(m10909k);
                    m10909k = rv0Var.m10909k();
                } catch (NumberFormatException unused) {
                    sb = new StringBuilder();
                    str = "Skipping invalid index: ";
                }
                if (m10909k == null) {
                    break;
                }
                Matcher matcher = f23953p.matcher(m10909k);
                if (matcher.matches()) {
                    boolean z2 = true;
                    rl0Var.m11204a(m12533D(matcher, 1));
                    if (TextUtils.isEmpty(matcher.group(6))) {
                        z2 = false;
                    } else {
                        rl0Var.m11204a(m12533D(matcher, 6));
                    }
                    this.f23954o.setLength(0);
                    while (true) {
                        String m10909k2 = rv0Var.m10909k();
                        if (TextUtils.isEmpty(m10909k2)) {
                            break;
                        }
                        if (this.f23954o.length() > 0) {
                            this.f23954o.append("<br>");
                        }
                        this.f23954o.append(m10909k2.trim());
                    }
                    arrayList.add(new C2099ln(Html.fromHtml(this.f23954o.toString())));
                    if (z2) {
                        arrayList.add(null);
                    }
                } else {
                    sb = new StringBuilder();
                    str = "Skipping invalid timing: ";
                    sb.append(str);
                    sb.append(m10909k);
                }
            }
        }
        C2099ln[] c2099lnArr = new C2099ln[arrayList.size()];
        arrayList.toArray(c2099lnArr);
        return new rh1(c2099lnArr, rl0Var.m11201d());
    }
}
