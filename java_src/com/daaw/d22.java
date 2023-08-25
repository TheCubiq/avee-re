package com.daaw;

import android.content.Context;
import android.util.SparseIntArray;
import com.daaw.C1897k3;
/* loaded from: classes.dex */
public final class d22 {

    /* renamed from: a */
    public final SparseIntArray f6411a = new SparseIntArray();

    /* renamed from: b */
    public x70 f6412b;

    public d22(x70 x70Var) {
        ry0.m10830j(x70Var);
        this.f6412b = x70Var;
    }

    /* renamed from: a */
    public final int m24768a(Context context, int i) {
        return this.f6411a.get(i, -1);
    }

    /* renamed from: b */
    public final int m24767b(Context context, C1897k3.InterfaceC1906f interfaceC1906f) {
        ry0.m10830j(context);
        ry0.m10830j(interfaceC1906f);
        int i = 0;
        if (interfaceC1906f.requiresGooglePlayServices()) {
            int minApkVersion = interfaceC1906f.getMinApkVersion();
            int m24768a = m24768a(context, minApkVersion);
            if (m24768a == -1) {
                int i2 = 0;
                while (true) {
                    if (i2 >= this.f6411a.size()) {
                        i = -1;
                        break;
                    }
                    int keyAt = this.f6411a.keyAt(i2);
                    if (keyAt > minApkVersion && this.f6411a.get(keyAt) == 0) {
                        break;
                    }
                    i2++;
                }
                m24768a = i == -1 ? this.f6412b.mo5490h(context, minApkVersion) : i;
                this.f6411a.put(minApkVersion, m24768a);
            }
            return m24768a;
        }
        return 0;
    }

    /* renamed from: c */
    public final void m24766c() {
        this.f6411a.clear();
    }
}
