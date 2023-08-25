package androidx.lifecycle;

import android.os.Handler;
import androidx.lifecycle.c;
import com.daaw.sj0;
/* loaded from: classes.dex */
public class j {
    public final e a;
    public final Handler b = new Handler();
    public a c;

    /* loaded from: classes.dex */
    public static class a implements Runnable {
        public final e p;
        public final c.b q;
        public boolean r = false;

        public a(e eVar, c.b bVar) {
            this.p = eVar;
            this.q = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.r) {
                return;
            }
            this.p.h(this.q);
            this.r = true;
        }
    }

    public j(sj0 sj0Var) {
        this.a = new e(sj0Var);
    }

    public c a() {
        return this.a;
    }

    public void b() {
        f(c.b.ON_START);
    }

    public void c() {
        f(c.b.ON_CREATE);
    }

    public void d() {
        f(c.b.ON_STOP);
        f(c.b.ON_DESTROY);
    }

    public void e() {
        f(c.b.ON_START);
    }

    public final void f(c.b bVar) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.a, bVar);
        this.c = aVar2;
        this.b.postAtFrontOfQueue(aVar2);
    }
}
