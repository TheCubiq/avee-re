package com.daaw;

import java.io.File;
import java.io.IOException;
/* loaded from: classes2.dex */
public class em {
    public final String a;
    public final h10 b;

    public em(String str, h10 h10Var) {
        this.a = str;
        this.b = h10Var;
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e) {
            ml0 f = ml0.f();
            f.e("Error creating marker: " + this.a, e);
            return false;
        }
    }

    public final File b() {
        return this.b.e(this.a);
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
