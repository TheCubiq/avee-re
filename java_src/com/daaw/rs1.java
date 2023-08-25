package com.daaw;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public interface rs1 {

    /* loaded from: classes.dex */
    public static final class a {
        public final Handler a;
        public final rs1 b;

        /* renamed from: com.daaw.rs1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0087a implements Runnable {
            public final /* synthetic */ fq p;

            public RunnableC0087a(fq fqVar) {
                this.p = fqVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.y(this.p);
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {
            public final /* synthetic */ String p;
            public final /* synthetic */ long q;
            public final /* synthetic */ long r;

            public b(String str, long j, long j2) {
                this.p = str;
                this.q = j;
                this.r = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.f(this.p, this.q, this.r);
            }
        }

        /* loaded from: classes.dex */
        public class c implements Runnable {
            public final /* synthetic */ Format p;

            public c(Format format) {
                this.p = format;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.x(this.p);
            }
        }

        /* loaded from: classes.dex */
        public class d implements Runnable {
            public final /* synthetic */ int p;
            public final /* synthetic */ long q;

            public d(int i, long j) {
                this.p = i;
                this.q = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.q(this.p, this.q);
            }
        }

        /* loaded from: classes.dex */
        public class e implements Runnable {
            public final /* synthetic */ int p;
            public final /* synthetic */ int q;
            public final /* synthetic */ int r;
            public final /* synthetic */ float s;

            public e(int i, int i2, int i3, float f) {
                this.p = i;
                this.q = i2;
                this.r = i3;
                this.s = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.b(this.p, this.q, this.r, this.s);
            }
        }

        /* loaded from: classes.dex */
        public class f implements Runnable {
            public final /* synthetic */ Surface p;

            public f(Surface surface) {
                this.p = surface;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.i(this.p);
            }
        }

        /* loaded from: classes.dex */
        public class g implements Runnable {
            public final /* synthetic */ fq p;

            public g(fq fqVar) {
                this.p = fqVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.p.a();
                a.this.b.u(this.p);
            }
        }

        public a(Handler handler, rs1 rs1Var) {
            this.a = rs1Var != null ? (Handler) s6.e(handler) : null;
            this.b = rs1Var;
        }

        public void b(String str, long j, long j2) {
            if (this.b != null) {
                this.a.post(new b(str, j, j2));
            }
        }

        public void c(fq fqVar) {
            if (this.b != null) {
                this.a.post(new g(fqVar));
            }
        }

        public void d(int i, long j) {
            if (this.b != null) {
                this.a.post(new d(i, j));
            }
        }

        public void e(fq fqVar) {
            if (this.b != null) {
                this.a.post(new RunnableC0087a(fqVar));
            }
        }

        public void f(Format format) {
            if (this.b != null) {
                this.a.post(new c(format));
            }
        }

        public void g(Surface surface) {
            if (this.b != null) {
                this.a.post(new f(surface));
            }
        }

        public void h(int i, int i2, int i3, float f2) {
            if (this.b != null) {
                this.a.post(new e(i, i2, i3, f2));
            }
        }
    }

    void b(int i, int i2, int i3, float f);

    void f(String str, long j, long j2);

    void i(Surface surface);

    void q(int i, long j);

    void u(fq fqVar);

    void x(Format format);

    void y(fq fqVar);
}
