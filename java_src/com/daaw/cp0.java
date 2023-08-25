package com.daaw;

import android.os.Handler;
import android.os.Looper;
import com.daaw.bp0;
import com.google.android.exoplayer2.Format;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public interface cp0 {

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;
        public final bp0.a b;
        public final CopyOnWriteArrayList<j> c;
        public final long d;

        /* renamed from: com.daaw.cp0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0046a implements Runnable {
            public final /* synthetic */ cp0 p;

            public RunnableC0046a(cp0 cp0Var) {
                this.p = cp0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                cp0 cp0Var = this.p;
                a aVar = a.this;
                cp0Var.r(aVar.a, aVar.b);
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {
            public final /* synthetic */ cp0 p;

            public b(cp0 cp0Var) {
                this.p = cp0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                cp0 cp0Var = this.p;
                a aVar = a.this;
                cp0Var.h(aVar.a, aVar.b);
            }
        }

        /* loaded from: classes.dex */
        public class c implements Runnable {
            public final /* synthetic */ cp0 p;
            public final /* synthetic */ b q;
            public final /* synthetic */ c r;

            public c(cp0 cp0Var, b bVar, c cVar) {
                this.p = cp0Var;
                this.q = bVar;
                this.r = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                cp0 cp0Var = this.p;
                a aVar = a.this;
                cp0Var.w(aVar.a, aVar.b, this.q, this.r);
            }
        }

        /* loaded from: classes.dex */
        public class d implements Runnable {
            public final /* synthetic */ cp0 p;
            public final /* synthetic */ b q;
            public final /* synthetic */ c r;

            public d(cp0 cp0Var, b bVar, c cVar) {
                this.p = cp0Var;
                this.q = bVar;
                this.r = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                cp0 cp0Var = this.p;
                a aVar = a.this;
                cp0Var.l(aVar.a, aVar.b, this.q, this.r);
            }
        }

        /* loaded from: classes.dex */
        public class e implements Runnable {
            public final /* synthetic */ cp0 p;
            public final /* synthetic */ b q;
            public final /* synthetic */ c r;

            public e(cp0 cp0Var, b bVar, c cVar) {
                this.p = cp0Var;
                this.q = bVar;
                this.r = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                cp0 cp0Var = this.p;
                a aVar = a.this;
                cp0Var.E(aVar.a, aVar.b, this.q, this.r);
            }
        }

        /* loaded from: classes.dex */
        public class f implements Runnable {
            public final /* synthetic */ cp0 p;
            public final /* synthetic */ b q;
            public final /* synthetic */ c r;
            public final /* synthetic */ IOException s;
            public final /* synthetic */ boolean t;

            public f(cp0 cp0Var, b bVar, c cVar, IOException iOException, boolean z) {
                this.p = cp0Var;
                this.q = bVar;
                this.r = cVar;
                this.s = iOException;
                this.t = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                cp0 cp0Var = this.p;
                a aVar = a.this;
                cp0Var.F(aVar.a, aVar.b, this.q, this.r, this.s, this.t);
            }
        }

        /* loaded from: classes.dex */
        public class g implements Runnable {
            public final /* synthetic */ cp0 p;

            public g(cp0 cp0Var) {
                this.p = cp0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                cp0 cp0Var = this.p;
                a aVar = a.this;
                cp0Var.t(aVar.a, aVar.b);
            }
        }

        /* loaded from: classes.dex */
        public class h implements Runnable {
            public final /* synthetic */ cp0 p;
            public final /* synthetic */ c q;

            public h(cp0 cp0Var, c cVar) {
                this.p = cp0Var;
                this.q = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                cp0 cp0Var = this.p;
                a aVar = a.this;
                cp0Var.o(aVar.a, aVar.b, this.q);
            }
        }

        /* loaded from: classes.dex */
        public class i implements Runnable {
            public final /* synthetic */ cp0 p;
            public final /* synthetic */ c q;

            public i(cp0 cp0Var, c cVar) {
                this.p = cp0Var;
                this.q = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                cp0 cp0Var = this.p;
                a aVar = a.this;
                cp0Var.C(aVar.a, aVar.b, this.q);
            }
        }

        /* loaded from: classes.dex */
        public static final class j {
            public final Handler a;
            public final cp0 b;

            public j(Handler handler, cp0 cp0Var) {
                this.a = handler;
                this.b = cp0Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public a(CopyOnWriteArrayList<j> copyOnWriteArrayList, int i2, bp0.a aVar, long j2) {
            this.c = copyOnWriteArrayList;
            this.a = i2;
            this.b = aVar;
            this.d = j2;
        }

        public void a(Handler handler, cp0 cp0Var) {
            s6.a((handler == null || cp0Var == null) ? false : true);
            this.c.add(new j(handler, cp0Var));
        }

        public final long b(long j2) {
            long b2 = dd.b(j2);
            if (b2 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.d + b2;
        }

        public void c(int i2, Format format, int i3, Object obj, long j2) {
            d(new c(1, i2, format, i3, obj, b(j2), -9223372036854775807L));
        }

        public void d(c cVar) {
            Iterator<j> it = this.c.iterator();
            while (it.hasNext()) {
                j next = it.next();
                s(next.a, new i(next.b, cVar));
            }
        }

        public void e(pp ppVar, int i2, int i3, Format format, int i4, Object obj, long j2, long j3, long j4, long j5, long j6) {
            g(new b(ppVar, j4, j5, j6), new c(i2, i3, format, i4, obj, b(j2), b(j3)));
        }

        public void f(pp ppVar, int i2, long j2, long j3, long j4) {
            e(ppVar, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j2, j3, j4);
        }

        public void g(b bVar, c cVar) {
            Iterator<j> it = this.c.iterator();
            while (it.hasNext()) {
                j next = it.next();
                s(next.a, new e(next.b, bVar, cVar));
            }
        }

        public void h(pp ppVar, int i2, int i3, Format format, int i4, Object obj, long j2, long j3, long j4, long j5, long j6) {
            j(new b(ppVar, j4, j5, j6), new c(i2, i3, format, i4, obj, b(j2), b(j3)));
        }

        public void i(pp ppVar, int i2, long j2, long j3, long j4) {
            h(ppVar, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j2, j3, j4);
        }

        public void j(b bVar, c cVar) {
            Iterator<j> it = this.c.iterator();
            while (it.hasNext()) {
                j next = it.next();
                s(next.a, new d(next.b, bVar, cVar));
            }
        }

        public void k(pp ppVar, int i2, int i3, Format format, int i4, Object obj, long j2, long j3, long j4, long j5, long j6, IOException iOException, boolean z) {
            m(new b(ppVar, j4, j5, j6), new c(i2, i3, format, i4, obj, b(j2), b(j3)), iOException, z);
        }

        public void l(pp ppVar, int i2, long j2, long j3, long j4, IOException iOException, boolean z) {
            k(ppVar, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j2, j3, j4, iOException, z);
        }

        public void m(b bVar, c cVar, IOException iOException, boolean z) {
            Iterator<j> it = this.c.iterator();
            while (it.hasNext()) {
                j next = it.next();
                s(next.a, new f(next.b, bVar, cVar, iOException, z));
            }
        }

        public void n(pp ppVar, int i2, int i3, Format format, int i4, Object obj, long j2, long j3, long j4) {
            p(new b(ppVar, j4, 0L, 0L), new c(i2, i3, format, i4, obj, b(j2), b(j3)));
        }

        public void o(pp ppVar, int i2, long j2) {
            n(ppVar, i2, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j2);
        }

        public void p(b bVar, c cVar) {
            Iterator<j> it = this.c.iterator();
            while (it.hasNext()) {
                j next = it.next();
                s(next.a, new c(next.b, bVar, cVar));
            }
        }

        public void q() {
            s6.f(this.b != null);
            Iterator<j> it = this.c.iterator();
            while (it.hasNext()) {
                j next = it.next();
                s(next.a, new RunnableC0046a(next.b));
            }
        }

        public void r() {
            s6.f(this.b != null);
            Iterator<j> it = this.c.iterator();
            while (it.hasNext()) {
                j next = it.next();
                s(next.a, new b(next.b));
            }
        }

        public final void s(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        public void t() {
            s6.f(this.b != null);
            Iterator<j> it = this.c.iterator();
            while (it.hasNext()) {
                j next = it.next();
                s(next.a, new g(next.b));
            }
        }

        public void u(cp0 cp0Var) {
            Iterator<j> it = this.c.iterator();
            while (it.hasNext()) {
                j next = it.next();
                if (next.b == cp0Var) {
                    this.c.remove(next);
                }
            }
        }

        public void v(int i2, long j2, long j3) {
            w(new c(1, i2, null, 3, null, b(j2), b(j3)));
        }

        public void w(c cVar) {
            Iterator<j> it = this.c.iterator();
            while (it.hasNext()) {
                j next = it.next();
                s(next.a, new h(next.b, cVar));
            }
        }

        public a x(int i2, bp0.a aVar, long j2) {
            return new a(this.c, i2, aVar, j2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final pp a;
        public final long b;
        public final long c;
        public final long d;

        public b(pp ppVar, long j, long j2, long j3) {
            this.a = ppVar;
            this.b = j;
            this.c = j2;
            this.d = j3;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final int a;
        public final int b;
        public final Format c;
        public final int d;
        public final Object e;
        public final long f;
        public final long g;

        public c(int i, int i2, Format format, int i3, Object obj, long j, long j2) {
            this.a = i;
            this.b = i2;
            this.c = format;
            this.d = i3;
            this.e = obj;
            this.f = j;
            this.g = j2;
        }
    }

    void C(int i, bp0.a aVar, c cVar);

    void E(int i, bp0.a aVar, b bVar, c cVar);

    void F(int i, bp0.a aVar, b bVar, c cVar, IOException iOException, boolean z);

    void h(int i, bp0.a aVar);

    void l(int i, bp0.a aVar, b bVar, c cVar);

    void o(int i, bp0.a aVar, c cVar);

    void r(int i, bp0.a aVar);

    void t(int i, bp0.a aVar);

    void w(int i, bp0.a aVar, b bVar, c cVar);
}
