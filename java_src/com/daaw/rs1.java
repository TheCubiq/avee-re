package com.daaw;

import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
/* loaded from: classes.dex */
public interface rs1 {

    /* renamed from: com.daaw.rs1$a */
    /* loaded from: classes.dex */
    public static final class C2878a {

        /* renamed from: a */
        public final Handler f25546a;

        /* renamed from: b */
        public final rs1 f25547b;

        /* renamed from: com.daaw.rs1$a$a */
        /* loaded from: classes.dex */
        public class RunnableC2879a implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ C1321fq f25548p;

            public RunnableC2879a(C1321fq c1321fq) {
                this.f25548p = c1321fq;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2878a.this.f25547b.mo10986y(this.f25548p);
            }
        }

        /* renamed from: com.daaw.rs1$a$b */
        /* loaded from: classes.dex */
        public class RunnableC2880b implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ String f25550p;

            /* renamed from: q */
            public final /* synthetic */ long f25551q;

            /* renamed from: r */
            public final /* synthetic */ long f25552r;

            public RunnableC2880b(String str, long j, long j2) {
                this.f25550p = str;
                this.f25551q = j;
                this.f25552r = j2;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2878a.this.f25547b.mo10991f(this.f25550p, this.f25551q, this.f25552r);
            }
        }

        /* renamed from: com.daaw.rs1$a$c */
        /* loaded from: classes.dex */
        public class RunnableC2881c implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ Format f25554p;

            public RunnableC2881c(Format format) {
                this.f25554p = format;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2878a.this.f25547b.mo10987x(this.f25554p);
            }
        }

        /* renamed from: com.daaw.rs1$a$d */
        /* loaded from: classes.dex */
        public class RunnableC2882d implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ int f25556p;

            /* renamed from: q */
            public final /* synthetic */ long f25557q;

            public RunnableC2882d(int i, long j) {
                this.f25556p = i;
                this.f25557q = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2878a.this.f25547b.mo10989q(this.f25556p, this.f25557q);
            }
        }

        /* renamed from: com.daaw.rs1$a$e */
        /* loaded from: classes.dex */
        public class RunnableC2883e implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ int f25559p;

            /* renamed from: q */
            public final /* synthetic */ int f25560q;

            /* renamed from: r */
            public final /* synthetic */ int f25561r;

            /* renamed from: s */
            public final /* synthetic */ float f25562s;

            public RunnableC2883e(int i, int i2, int i3, float f) {
                this.f25559p = i;
                this.f25560q = i2;
                this.f25561r = i3;
                this.f25562s = f;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2878a.this.f25547b.mo10992b(this.f25559p, this.f25560q, this.f25561r, this.f25562s);
            }
        }

        /* renamed from: com.daaw.rs1$a$f */
        /* loaded from: classes.dex */
        public class RunnableC2884f implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ Surface f25564p;

            public RunnableC2884f(Surface surface) {
                this.f25564p = surface;
            }

            @Override // java.lang.Runnable
            public void run() {
                C2878a.this.f25547b.mo10990i(this.f25564p);
            }
        }

        /* renamed from: com.daaw.rs1$a$g */
        /* loaded from: classes.dex */
        public class RunnableC2885g implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ C1321fq f25566p;

            public RunnableC2885g(C1321fq c1321fq) {
                this.f25566p = c1321fq;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f25566p.m22418a();
                C2878a.this.f25547b.mo10988u(this.f25566p);
            }
        }

        public C2878a(Handler handler, rs1 rs1Var) {
            this.f25546a = rs1Var != null ? (Handler) C2914s6.m10686e(handler) : null;
            this.f25547b = rs1Var;
        }

        /* renamed from: b */
        public void m10984b(String str, long j, long j2) {
            if (this.f25547b != null) {
                this.f25546a.post(new RunnableC2880b(str, j, j2));
            }
        }

        /* renamed from: c */
        public void m10983c(C1321fq c1321fq) {
            if (this.f25547b != null) {
                this.f25546a.post(new RunnableC2885g(c1321fq));
            }
        }

        /* renamed from: d */
        public void m10982d(int i, long j) {
            if (this.f25547b != null) {
                this.f25546a.post(new RunnableC2882d(i, j));
            }
        }

        /* renamed from: e */
        public void m10981e(C1321fq c1321fq) {
            if (this.f25547b != null) {
                this.f25546a.post(new RunnableC2879a(c1321fq));
            }
        }

        /* renamed from: f */
        public void m10980f(Format format) {
            if (this.f25547b != null) {
                this.f25546a.post(new RunnableC2881c(format));
            }
        }

        /* renamed from: g */
        public void m10979g(Surface surface) {
            if (this.f25547b != null) {
                this.f25546a.post(new RunnableC2884f(surface));
            }
        }

        /* renamed from: h */
        public void m10978h(int i, int i2, int i3, float f) {
            if (this.f25547b != null) {
                this.f25546a.post(new RunnableC2883e(i, i2, i3, f));
            }
        }
    }

    /* renamed from: b */
    void mo10992b(int i, int i2, int i3, float f);

    /* renamed from: f */
    void mo10991f(String str, long j, long j2);

    /* renamed from: i */
    void mo10990i(Surface surface);

    /* renamed from: q */
    void mo10989q(int i, long j);

    /* renamed from: u */
    void mo10988u(C1321fq c1321fq);

    /* renamed from: x */
    void mo10987x(Format format);

    /* renamed from: y */
    void mo10986y(C1321fq c1321fq);
}
