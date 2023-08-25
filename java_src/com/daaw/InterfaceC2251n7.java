package com.daaw;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
/* renamed from: com.daaw.n7 */
/* loaded from: classes.dex */
public interface InterfaceC2251n7 {

    /* renamed from: com.daaw.n7$a */
    /* loaded from: classes.dex */
    public static final class C2252a {

        /* renamed from: a */
        public final Handler f19534a;

        /* renamed from: b */
        public final InterfaceC2251n7 f19535b;

        /* renamed from: com.daaw.n7$a$a */
        /* loaded from: classes.dex */
        public class RunnableC2253a implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ C1321fq f19536p;

            public RunnableC2253a(C1321fq c1321fq) {
                this.f19536p = c1321fq;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2252a.this.f19535b.mo14643D(this.f19536p);
            }
        }

        /* renamed from: com.daaw.n7$a$b */
        /* loaded from: classes.dex */
        public class RunnableC2254b implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ String f19538p;

            /* renamed from: q */
            public final /* synthetic */ long f19539q;

            /* renamed from: r */
            public final /* synthetic */ long f19540r;

            public RunnableC2254b(String str, long j, long j2) {
                this.f19538p = str;
                this.f19539q = j;
                this.f19540r = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2252a.this.f19535b.mo14626n(this.f19538p, this.f19539q, this.f19540r);
            }
        }

        /* renamed from: com.daaw.n7$a$c */
        /* loaded from: classes.dex */
        public class RunnableC2255c implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ Format f19542p;

            public RunnableC2255c(Format format) {
                this.f19542p = format;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2252a.this.f19535b.mo14621z(this.f19542p);
            }
        }

        /* renamed from: com.daaw.n7$a$d */
        /* loaded from: classes.dex */
        public class RunnableC2256d implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ int f19544p;

            /* renamed from: q */
            public final /* synthetic */ long f19545q;

            /* renamed from: r */
            public final /* synthetic */ long f19546r;

            public RunnableC2256d(int i, long j, long j2) {
                this.f19544p = i;
                this.f19545q = j;
                this.f19546r = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2252a.this.f19535b.mo14645B(this.f19544p, this.f19545q, this.f19546r);
            }
        }

        /* renamed from: com.daaw.n7$a$e */
        /* loaded from: classes.dex */
        public class RunnableC2257e implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ C1321fq f19548p;

            public RunnableC2257e(C1321fq c1321fq) {
                this.f19548p = c1321fq;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f19548p.m22418a();
                C2252a.this.f19535b.mo14629j(this.f19548p);
            }
        }

        /* renamed from: com.daaw.n7$a$f */
        /* loaded from: classes.dex */
        public class RunnableC2258f implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ int f19550p;

            public RunnableC2258f(int i) {
                this.f19550p = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2252a.this.f19535b.mo14631a(this.f19550p);
            }
        }

        public C2252a(Handler handler, InterfaceC2251n7 interfaceC2251n7) {
            this.f19534a = interfaceC2251n7 != null ? (Handler) C2914s6.m10686e(handler) : null;
            this.f19535b = interfaceC2251n7;
        }

        /* renamed from: b */
        public void m15488b(int i) {
            if (this.f19535b != null) {
                this.f19534a.post(new RunnableC2258f(i));
            }
        }

        /* renamed from: c */
        public void m15487c(int i, long j, long j2) {
            if (this.f19535b != null) {
                this.f19534a.post(new RunnableC2256d(i, j, j2));
            }
        }

        /* renamed from: d */
        public void m15486d(String str, long j, long j2) {
            if (this.f19535b != null) {
                this.f19534a.post(new RunnableC2254b(str, j, j2));
            }
        }

        /* renamed from: e */
        public void m15485e(C1321fq c1321fq) {
            if (this.f19535b != null) {
                this.f19534a.post(new RunnableC2257e(c1321fq));
            }
        }

        /* renamed from: f */
        public void m15484f(C1321fq c1321fq) {
            if (this.f19535b != null) {
                this.f19534a.post(new RunnableC2253a(c1321fq));
            }
        }

        /* renamed from: g */
        public void m15483g(Format format) {
            if (this.f19535b != null) {
                this.f19534a.post(new RunnableC2255c(format));
            }
        }
    }

    /* renamed from: B */
    void mo14645B(int i, long j, long j2);

    /* renamed from: D */
    void mo14643D(C1321fq c1321fq);

    /* renamed from: a */
    void mo14631a(int i);

    /* renamed from: j */
    void mo14629j(C1321fq c1321fq);

    /* renamed from: n */
    void mo14626n(String str, long j, long j2);

    /* renamed from: z */
    void mo14621z(Format format);
}
