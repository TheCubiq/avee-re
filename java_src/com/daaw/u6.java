package com.daaw;

import android.content.res.AssetManager;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class u6<T> implements ip<T> {
    public final String a;
    public final AssetManager b;
    public T c;

    public u6(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    @Override // com.daaw.ip
    public T a(dz0 dz0Var) {
        T d = d(this.b, this.a);
        this.c = d;
        return d;
    }

    @Override // com.daaw.ip
    public void b() {
        T t = this.c;
        if (t == null) {
            return;
        }
        try {
            c(t);
        } catch (IOException unused) {
        }
    }

    public abstract void c(T t);

    @Override // com.daaw.ip
    public void cancel() {
    }

    public abstract T d(AssetManager assetManager, String str);

    @Override // com.daaw.ip
    public String getId() {
        return this.a;
    }
}
