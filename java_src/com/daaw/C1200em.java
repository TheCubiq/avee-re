package com.daaw;

import java.io.File;
import java.io.IOException;
/* renamed from: com.daaw.em */
/* loaded from: classes2.dex */
public class C1200em {

    /* renamed from: a */
    public final String f8570a;

    /* renamed from: b */
    public final h10 f8571b;

    public C1200em(String str, h10 h10Var) {
        this.f8570a = str;
        this.f8571b = h10Var;
    }

    /* renamed from: a */
    public boolean m23379a() {
        try {
            return m23378b().createNewFile();
        } catch (IOException e) {
            ml0 m15976f = ml0.m15976f();
            m15976f.m15977e("Error creating marker: " + this.f8570a, e);
            return false;
        }
    }

    /* renamed from: b */
    public final File m23378b() {
        return this.f8571b.m21107e(this.f8570a);
    }

    /* renamed from: c */
    public boolean m23377c() {
        return m23378b().exists();
    }

    /* renamed from: d */
    public boolean m23376d() {
        return m23378b().delete();
    }
}
