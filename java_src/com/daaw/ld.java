package com.daaw;

import android.graphics.Typeface;
import android.os.Handler;
import com.daaw.b30;
import com.daaw.z20;
/* loaded from: classes.dex */
public class ld {
    public final b30.c a;
    public final Handler b;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ b30.c p;
        public final /* synthetic */ Typeface q;

        public a(b30.c cVar, Typeface typeface) {
            this.p = cVar;
            this.q = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.p.b(this.q);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ b30.c p;
        public final /* synthetic */ int q;

        public b(b30.c cVar, int i) {
            this.p = cVar;
            this.q = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.p.a(this.q);
        }
    }

    public ld(b30.c cVar, Handler handler) {
        this.a = cVar;
        this.b = handler;
    }

    public final void a(int i) {
        this.b.post(new b(this.a, i));
    }

    public void b(z20.e eVar) {
        if (eVar.a()) {
            c(eVar.a);
        } else {
            a(eVar.b);
        }
    }

    public final void c(Typeface typeface) {
        this.b.post(new a(this.a, typeface));
    }
}
