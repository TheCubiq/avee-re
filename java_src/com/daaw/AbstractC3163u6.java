package com.daaw;

import android.content.res.AssetManager;
import java.io.IOException;
/* renamed from: com.daaw.u6 */
/* loaded from: classes.dex */
public abstract class AbstractC3163u6<T> implements InterfaceC1744ip<T> {

    /* renamed from: a */
    public final String f28585a;

    /* renamed from: b */
    public final AssetManager f28586b;

    /* renamed from: c */
    public T f28587c;

    public AbstractC3163u6(AssetManager assetManager, String str) {
        this.f28586b = assetManager;
        this.f28585a = str;
    }

    @Override // com.daaw.InterfaceC1744ip
    /* renamed from: a */
    public T mo4085a(dz0 dz0Var) {
        T mo7563d = mo7563d(this.f28586b, this.f28585a);
        this.f28587c = mo7563d;
        return mo7563d;
    }

    @Override // com.daaw.InterfaceC1744ip
    /* renamed from: b */
    public void mo4084b() {
        T t = this.f28587c;
        if (t == null) {
            return;
        }
        try {
            mo7564c(t);
        } catch (IOException unused) {
        }
    }

    /* renamed from: c */
    public abstract void mo7564c(T t);

    @Override // com.daaw.InterfaceC1744ip
    public void cancel() {
    }

    /* renamed from: d */
    public abstract T mo7563d(AssetManager assetManager, String str);

    @Override // com.daaw.InterfaceC1744ip
    public String getId() {
        return this.f28585a;
    }
}
