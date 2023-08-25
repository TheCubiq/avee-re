package com.daaw;

import android.text.Html;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class qh1 extends jd1 {
    public static final Pattern p = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+),(\\d+))?\\s*");
    public final StringBuilder o;

    public qh1() {
        super("SubripDecoder");
        this.o = new StringBuilder();
    }

    public static long D(Matcher matcher, int i) {
        return ((Long.parseLong(matcher.group(i + 1)) * 60 * 60 * 1000) + (Long.parseLong(matcher.group(i + 2)) * 60 * 1000) + (Long.parseLong(matcher.group(i + 3)) * 1000) + Long.parseLong(matcher.group(i + 4))) * 1000;
    }

    @Override // com.daaw.jd1
    /* renamed from: C */
    public rh1 z(byte[] bArr, int i, boolean z) {
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        rl0 rl0Var = new rl0();
        rv0 rv0Var = new rv0(bArr, i);
        while (true) {
            String k = rv0Var.k();
            if (k == null) {
                break;
            } else if (k.length() != 0) {
                try {
                    Integer.parseInt(k);
                    k = rv0Var.k();
                } catch (NumberFormatException unused) {
                    sb = new StringBuilder();
                    str = "Skipping invalid index: ";
                }
                if (k == null) {
                    break;
                }
                Matcher matcher = p.matcher(k);
                if (matcher.matches()) {
                    boolean z2 = true;
                    rl0Var.a(D(matcher, 1));
                    if (TextUtils.isEmpty(matcher.group(6))) {
                        z2 = false;
                    } else {
                        rl0Var.a(D(matcher, 6));
                    }
                    this.o.setLength(0);
                    while (true) {
                        String k2 = rv0Var.k();
                        if (TextUtils.isEmpty(k2)) {
                            break;
                        }
                        if (this.o.length() > 0) {
                            this.o.append("<br>");
                        }
                        this.o.append(k2.trim());
                    }
                    arrayList.add(new ln(Html.fromHtml(this.o.toString())));
                    if (z2) {
                        arrayList.add(null);
                    }
                } else {
                    sb = new StringBuilder();
                    str = "Skipping invalid timing: ";
                    sb.append(str);
                    sb.append(k);
                }
            }
        }
        ln[] lnVarArr = new ln[arrayList.size()];
        arrayList.toArray(lnVarArr);
        return new rh1(lnVarArr, rl0Var.d());
    }
}
