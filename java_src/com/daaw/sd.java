package com.daaw;

import android.graphics.Typeface;
/* loaded from: classes2.dex */
public final class sd extends kk1 {
    public final Typeface a;
    public final a b;
    public boolean c;

    /* loaded from: classes2.dex */
    public interface a {
        void a(Typeface typeface);
    }

    public sd(a aVar, Typeface typeface) {
        this.a = typeface;
        this.b = aVar;
    }

    @Override // com.daaw.kk1
    public void a(int i) {
        d(this.a);
    }

    @Override // com.daaw.kk1
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.c = true;
    }

    public final void d(Typeface typeface) {
        if (this.c) {
            return;
        }
        this.b.a(typeface);
    }
}
