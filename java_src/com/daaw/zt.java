package com.daaw;

import com.daaw.ut;
import java.io.File;
/* loaded from: classes.dex */
public class zt implements ut.a {
    public final int a;
    public final a b;

    /* loaded from: classes.dex */
    public interface a {
        File a();
    }

    public zt(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // com.daaw.ut.a
    public ut a() {
        File a2 = this.b.a();
        if (a2 == null) {
            return null;
        }
        if (a2.mkdirs() || (a2.exists() && a2.isDirectory())) {
            return au.d(a2, this.a);
        }
        return null;
    }
}
