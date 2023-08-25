package com.daaw;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.File;
/* loaded from: classes.dex */
public final class wt6 {
    public final File a;
    public final File b;
    public final SharedPreferences c;
    public final int d;

    public wt6(Context context, int i) {
        this.c = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        xt6.a(dir, false);
        this.a = dir;
        File dir2 = context.getDir("tmppccache", 0);
        xt6.a(dir2, true);
        this.b = dir2;
        this.d = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x016a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(com.daaw.xo2 r8, com.daaw.au6 r9) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.wt6.a(com.daaw.xo2, com.daaw.au6):boolean");
    }

    public final ap2 b(int i) {
        SharedPreferences sharedPreferences;
        String e;
        if (i == 1) {
            sharedPreferences = this.c;
            e = f();
        } else {
            sharedPreferences = this.c;
            e = e();
        }
        String string = sharedPreferences.getString(e, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            ap2 R = ap2.R(yq7.F(db0.c(string)));
            String U = R.U();
            File b = xt6.b(U, "pcam.jar", d());
            if (!b.exists()) {
                b = xt6.b(U, "pcam", d());
            }
            File b2 = xt6.b(U, "pcbc", d());
            if (b.exists()) {
                if (b2.exists()) {
                    return R;
                }
            }
        } catch (xs7 unused) {
        }
        return null;
    }

    public final vt6 c(int i) {
        ap2 b = b(1);
        if (b == null) {
            return null;
        }
        String U = b.U();
        File b2 = xt6.b(U, "pcam.jar", d());
        if (!b2.exists()) {
            b2 = xt6.b(U, "pcam", d());
        }
        return new vt6(b, b2, xt6.b(U, "pcbc", d()), xt6.b(U, "pcopt", d()));
    }

    public final File d() {
        File file = new File(this.a, Integer.toString(this.d - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public final String e() {
        int i = this.d;
        StringBuilder sb = new StringBuilder();
        sb.append("FBAMTD");
        sb.append(i - 1);
        return sb.toString();
    }

    public final String f() {
        int i = this.d;
        StringBuilder sb = new StringBuilder();
        sb.append("LATMTD");
        sb.append(i - 1);
        return sb.toString();
    }
}
