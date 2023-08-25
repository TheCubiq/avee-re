package com.daaw;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public interface n7 {

    /* loaded from: classes.dex */
    public static final class a {
        public final Handler a;
        public final n7 b;

        /* renamed from: com.daaw.n7$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0078a implements Runnable {
            public final /* synthetic */ fq p;

            public RunnableC0078a(fq fqVar) {
                this.p = fqVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.D(this.p);
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
                a.this.b.n(this.p, this.q, this.r);
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
                a.this.b.z(this.p);
            }
        }

        /* loaded from: classes.dex */
        public class d implements Runnable {
            public final /* synthetic */ int p;
            public final /* synthetic */ long q;
            public final /* synthetic */ long r;

            public d(int i, long j, long j2) {
                this.p = i;
                this.q = j;
                this.r = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.B(this.p, this.q, this.r);
            }
        }

        /* loaded from: classes.dex */
        public class e implements Runnable {
            public final /* synthetic */ fq p;

            public e(fq fqVar) {
                this.p = fqVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.p.a();
                a.this.b.j(this.p);
            }
        }

        /* loaded from: classes.dex */
        public class f implements Runnable {
            public final /* synthetic */ int p;

            public f(int i) {
                this.p = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.a(this.p);
            }
        }

        public a(Handler handler, n7 n7Var) {
            this.a = n7Var != null ? (Handler) s6.e(handler) : null;
            this.b = n7Var;
        }

        public void b(int i) {
            if (this.b != null) {
                this.a.post(new f(i));
            }
        }

        public void c(int i, long j, long j2) {
            if (this.b != null) {
                this.a.post(new d(i, j, j2));
            }
        }

        public void d(String str, long j, long j2) {
            if (this.b != null) {
                this.a.post(new b(str, j, j2));
            }
        }

        public void e(fq fqVar) {
            if (this.b != null) {
                this.a.post(new e(fqVar));
            }
        }

        public void f(fq fqVar) {
            if (this.b != null) {
                this.a.post(new RunnableC0078a(fqVar));
            }
        }

        public void g(Format format) {
            if (this.b != null) {
                this.a.post(new c(format));
            }
        }
    }

    void B(int i, long j, long j2);

    void D(fq fqVar);

    void a(int i);

    void j(fq fqVar);

    void n(String str, long j, long j2);

    void z(Format format);
}
