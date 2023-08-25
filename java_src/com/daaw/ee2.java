package com.daaw;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class ee2 {
    public String a;
    public Uri b;
    public final ng2 c = new ng2();
    public final pn2 d = new pn2(null);
    public final List e = Collections.emptyList();
    public final y17 f = y17.u();
    public final ar2 g = new ar2();
    public final y13 h = y13.c;

    public final ee2 a(String str) {
        this.a = str;
        return this;
    }

    public final ee2 b(Uri uri) {
        this.b = uri;
        return this;
    }

    public final f53 c() {
        Uri uri = this.b;
        ny2 ny2Var = uri != null ? new ny2(uri, null, null, null, this.e, null, this.f, null, null) : null;
        String str = this.a;
        if (str == null) {
            str = "";
        }
        return new f53(str, new fl2(this.c, null), ny2Var, new ht2(this.g), gc3.v, this.h, null);
    }
}
