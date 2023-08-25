package com.daaw;

import android.graphics.Typeface;
import android.os.Handler;
import com.daaw.b30;
import com.daaw.z20;
/* renamed from: com.daaw.ld */
/* loaded from: classes.dex */
public class C2027ld {

    /* renamed from: a */
    public final b30.C0806c f17261a;

    /* renamed from: b */
    public final Handler f17262b;

    /* renamed from: com.daaw.ld$a */
    /* loaded from: classes.dex */
    public class RunnableC2028a implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ b30.C0806c f17263p;

        /* renamed from: q */
        public final /* synthetic */ Typeface f17264q;

        public RunnableC2028a(b30.C0806c c0806c, Typeface typeface) {
            this.f17263p = c0806c;
            this.f17264q = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17263p.mo8907b(this.f17264q);
        }
    }

    /* renamed from: com.daaw.ld$b */
    /* loaded from: classes.dex */
    public class RunnableC2029b implements Runnable {

        /* renamed from: p */
        public final /* synthetic */ b30.C0806c f17266p;

        /* renamed from: q */
        public final /* synthetic */ int f17267q;

        public RunnableC2029b(b30.C0806c c0806c, int i) {
            this.f17266p = c0806c;
            this.f17267q = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f17266p.mo8908a(this.f17267q);
        }
    }

    public C2027ld(b30.C0806c c0806c, Handler handler) {
        this.f17261a = c0806c;
        this.f17262b = handler;
    }

    /* renamed from: a */
    public final void m17049a(int i) {
        this.f17262b.post(new RunnableC2029b(this.f17261a, i));
    }

    /* renamed from: b */
    public void m17048b(z20.C3798e c3798e) {
        if (c3798e.m2969a()) {
            m17047c(c3798e.f34357a);
        } else {
            m17049a(c3798e.f34358b);
        }
    }

    /* renamed from: c */
    public final void m17047c(Typeface typeface) {
        this.f17262b.post(new RunnableC2028a(this.f17261a, typeface));
    }
}
