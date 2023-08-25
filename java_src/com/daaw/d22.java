package com.daaw;

import android.content.Context;
import android.util.SparseIntArray;
import com.daaw.k3;
/* loaded from: classes.dex */
public final class d22 {
    public final SparseIntArray a = new SparseIntArray();
    public x70 b;

    public d22(x70 x70Var) {
        ry0.j(x70Var);
        this.b = x70Var;
    }

    public final int a(Context context, int i) {
        return this.a.get(i, -1);
    }

    public final int b(Context context, k3.f fVar) {
        ry0.j(context);
        ry0.j(fVar);
        int i = 0;
        if (fVar.requiresGooglePlayServices()) {
            int minApkVersion = fVar.getMinApkVersion();
            int a = a(context, minApkVersion);
            if (a == -1) {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.a.size()) {
                        i = -1;
                        break;
                    }
                    int keyAt = this.a.keyAt(i2);
                    if (keyAt > minApkVersion && this.a.get(keyAt) == 0) {
                        break;
                    }
                    i2++;
                }
                a = i == -1 ? this.b.h(context, minApkVersion) : i;
                this.a.put(minApkVersion, a);
            }
            return a;
        }
        return 0;
    }

    public final void c() {
        this.a.clear();
    }
}
