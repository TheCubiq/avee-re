package com.daaw;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ee2 {

    /* renamed from: a */
    public String f8404a;

    /* renamed from: b */
    public Uri f8405b;

    /* renamed from: c */
    public final ng2 f8406c = new ng2();

    /* renamed from: d */
    public final pn2 f8407d = new pn2(null);

    /* renamed from: e */
    public final List f8408e = Collections.emptyList();

    /* renamed from: f */
    public final y17 f8409f = y17.m4260u();

    /* renamed from: g */
    public final ar2 f8410g = new ar2();

    /* renamed from: h */
    public final y13 f8411h = y13.f33212c;

    /* renamed from: a */
    public final ee2 m23540a(String str) {
        this.f8404a = str;
        return this;
    }

    /* renamed from: b */
    public final ee2 m23539b(Uri uri) {
        this.f8405b = uri;
        return this;
    }

    /* renamed from: c */
    public final f53 m23538c() {
        Uri uri = this.f8405b;
        ny2 ny2Var = uri != null ? new ny2(uri, null, null, null, this.f8408e, null, this.f8409f, null, null) : null;
        String str = this.f8404a;
        if (str == null) {
            str = "";
        }
        return new f53(str, new fl2(this.f8406c, null), ny2Var, new ht2(this.f8410g), gc3.f11048v, this.f8411h, null);
    }
}
