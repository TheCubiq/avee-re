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

    /* renamed from: com.daaw.cp0$a */
    /* loaded from: classes.dex */
    public static final class C0975a {

        /* renamed from: a */
        public final int f6018a;

        /* renamed from: b */
        public final bp0.C0880a f6019b;

        /* renamed from: c */
        public final CopyOnWriteArrayList<C0985j> f6020c;

        /* renamed from: d */
        public final long f6021d;

        /* renamed from: com.daaw.cp0$a$a */
        /* loaded from: classes.dex */
        public class RunnableC0976a implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ cp0 f6022p;

            public RunnableC0976a(cp0 cp0Var) {
                this.f6022p = cp0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                cp0 cp0Var = this.f6022p;
                C0975a c0975a = C0975a.this;
                cp0Var.mo14624r(c0975a.f6018a, c0975a.f6019b);
            }
        }

        /* renamed from: com.daaw.cp0$a$b */
        /* loaded from: classes.dex */
        public class RunnableC0977b implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ cp0 f6024p;

            public RunnableC0977b(cp0 cp0Var) {
                this.f6024p = cp0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                cp0 cp0Var = this.f6024p;
                C0975a c0975a = C0975a.this;
                cp0Var.mo14630h(c0975a.f6018a, c0975a.f6019b);
            }
        }

        /* renamed from: com.daaw.cp0$a$c */
        /* loaded from: classes.dex */
        public class RunnableC0978c implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ cp0 f6026p;

            /* renamed from: q */
            public final /* synthetic */ C0986b f6027q;

            /* renamed from: r */
            public final /* synthetic */ C0987c f6028r;

            public RunnableC0978c(cp0 cp0Var, C0986b c0986b, C0987c c0987c) {
                this.f6026p = cp0Var;
                this.f6027q = c0986b;
                this.f6028r = c0987c;
            }

            @Override // java.lang.Runnable
            public void run() {
                cp0 cp0Var = this.f6026p;
                C0975a c0975a = C0975a.this;
                cp0Var.mo14622w(c0975a.f6018a, c0975a.f6019b, this.f6027q, this.f6028r);
            }
        }

        /* renamed from: com.daaw.cp0$a$d */
        /* loaded from: classes.dex */
        public class RunnableC0979d implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ cp0 f6030p;

            /* renamed from: q */
            public final /* synthetic */ C0986b f6031q;

            /* renamed from: r */
            public final /* synthetic */ C0987c f6032r;

            public RunnableC0979d(cp0 cp0Var, C0986b c0986b, C0987c c0987c) {
                this.f6030p = cp0Var;
                this.f6031q = c0986b;
                this.f6032r = c0987c;
            }

            @Override // java.lang.Runnable
            public void run() {
                cp0 cp0Var = this.f6030p;
                C0975a c0975a = C0975a.this;
                cp0Var.mo14627l(c0975a.f6018a, c0975a.f6019b, this.f6031q, this.f6032r);
            }
        }

        /* renamed from: com.daaw.cp0$a$e */
        /* loaded from: classes.dex */
        public class RunnableC0980e implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ cp0 f6034p;

            /* renamed from: q */
            public final /* synthetic */ C0986b f6035q;

            /* renamed from: r */
            public final /* synthetic */ C0987c f6036r;

            public RunnableC0980e(cp0 cp0Var, C0986b c0986b, C0987c c0987c) {
                this.f6034p = cp0Var;
                this.f6035q = c0986b;
                this.f6036r = c0987c;
            }

            @Override // java.lang.Runnable
            public void run() {
                cp0 cp0Var = this.f6034p;
                C0975a c0975a = C0975a.this;
                cp0Var.mo14642E(c0975a.f6018a, c0975a.f6019b, this.f6035q, this.f6036r);
            }
        }

        /* renamed from: com.daaw.cp0$a$f */
        /* loaded from: classes.dex */
        public class RunnableC0981f implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ cp0 f6038p;

            /* renamed from: q */
            public final /* synthetic */ C0986b f6039q;

            /* renamed from: r */
            public final /* synthetic */ C0987c f6040r;

            /* renamed from: s */
            public final /* synthetic */ IOException f6041s;

            /* renamed from: t */
            public final /* synthetic */ boolean f6042t;

            public RunnableC0981f(cp0 cp0Var, C0986b c0986b, C0987c c0987c, IOException iOException, boolean z) {
                this.f6038p = cp0Var;
                this.f6039q = c0986b;
                this.f6040r = c0987c;
                this.f6041s = iOException;
                this.f6042t = z;
            }

            @Override // java.lang.Runnable
            public void run() {
                cp0 cp0Var = this.f6038p;
                C0975a c0975a = C0975a.this;
                cp0Var.mo14641F(c0975a.f6018a, c0975a.f6019b, this.f6039q, this.f6040r, this.f6041s, this.f6042t);
            }
        }

        /* renamed from: com.daaw.cp0$a$g */
        /* loaded from: classes.dex */
        public class RunnableC0982g implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ cp0 f6044p;

            public RunnableC0982g(cp0 cp0Var) {
                this.f6044p = cp0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                cp0 cp0Var = this.f6044p;
                C0975a c0975a = C0975a.this;
                cp0Var.mo14623t(c0975a.f6018a, c0975a.f6019b);
            }
        }

        /* renamed from: com.daaw.cp0$a$h */
        /* loaded from: classes.dex */
        public class RunnableC0983h implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ cp0 f6046p;

            /* renamed from: q */
            public final /* synthetic */ C0987c f6047q;

            public RunnableC0983h(cp0 cp0Var, C0987c c0987c) {
                this.f6046p = cp0Var;
                this.f6047q = c0987c;
            }

            @Override // java.lang.Runnable
            public void run() {
                cp0 cp0Var = this.f6046p;
                C0975a c0975a = C0975a.this;
                cp0Var.mo14625o(c0975a.f6018a, c0975a.f6019b, this.f6047q);
            }
        }

        /* renamed from: com.daaw.cp0$a$i */
        /* loaded from: classes.dex */
        public class RunnableC0984i implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ cp0 f6049p;

            /* renamed from: q */
            public final /* synthetic */ C0987c f6050q;

            public RunnableC0984i(cp0 cp0Var, C0987c c0987c) {
                this.f6049p = cp0Var;
                this.f6050q = c0987c;
            }

            @Override // java.lang.Runnable
            public void run() {
                cp0 cp0Var = this.f6049p;
                C0975a c0975a = C0975a.this;
                cp0Var.mo14644C(c0975a.f6018a, c0975a.f6019b, this.f6050q);
            }
        }

        /* renamed from: com.daaw.cp0$a$j */
        /* loaded from: classes.dex */
        public static final class C0985j {

            /* renamed from: a */
            public final Handler f6052a;

            /* renamed from: b */
            public final cp0 f6053b;

            public C0985j(Handler handler, cp0 cp0Var) {
                this.f6052a = handler;
                this.f6053b = cp0Var;
            }
        }

        public C0975a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        public C0975a(CopyOnWriteArrayList<C0985j> copyOnWriteArrayList, int i, bp0.C0880a c0880a, long j) {
            this.f6020c = copyOnWriteArrayList;
            this.f6018a = i;
            this.f6019b = c0880a;
            this.f6021d = j;
        }

        /* renamed from: a */
        public void m25167a(Handler handler, cp0 cp0Var) {
            C2914s6.m10690a((handler == null || cp0Var == null) ? false : true);
            this.f6020c.add(new C0985j(handler, cp0Var));
        }

        /* renamed from: b */
        public final long m25166b(long j) {
            long m24526b = C1075dd.m24526b(j);
            if (m24526b == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f6021d + m24526b;
        }

        /* renamed from: c */
        public void m25165c(int i, Format format, int i2, Object obj, long j) {
            m25164d(new C0987c(1, i, format, i2, obj, m25166b(j), -9223372036854775807L));
        }

        /* renamed from: d */
        public void m25164d(C0987c c0987c) {
            Iterator<C0985j> it = this.f6020c.iterator();
            while (it.hasNext()) {
                C0985j next = it.next();
                m25149s(next.f6052a, new RunnableC0984i(next.f6053b, c0987c));
            }
        }

        /* renamed from: e */
        public void m25163e(C2570pp c2570pp, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            m25161g(new C0986b(c2570pp, j3, j4, j5), new C0987c(i, i2, format, i3, obj, m25166b(j), m25166b(j2)));
        }

        /* renamed from: f */
        public void m25162f(C2570pp c2570pp, int i, long j, long j2, long j3) {
            m25163e(c2570pp, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        /* renamed from: g */
        public void m25161g(C0986b c0986b, C0987c c0987c) {
            Iterator<C0985j> it = this.f6020c.iterator();
            while (it.hasNext()) {
                C0985j next = it.next();
                m25149s(next.f6052a, new RunnableC0980e(next.f6053b, c0986b, c0987c));
            }
        }

        /* renamed from: h */
        public void m25160h(C2570pp c2570pp, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
            m25158j(new C0986b(c2570pp, j3, j4, j5), new C0987c(i, i2, format, i3, obj, m25166b(j), m25166b(j2)));
        }

        /* renamed from: i */
        public void m25159i(C2570pp c2570pp, int i, long j, long j2, long j3) {
            m25160h(c2570pp, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3);
        }

        /* renamed from: j */
        public void m25158j(C0986b c0986b, C0987c c0987c) {
            Iterator<C0985j> it = this.f6020c.iterator();
            while (it.hasNext()) {
                C0985j next = it.next();
                m25149s(next.f6052a, new RunnableC0979d(next.f6053b, c0986b, c0987c));
            }
        }

        /* renamed from: k */
        public void m25157k(C2570pp c2570pp, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
            m25155m(new C0986b(c2570pp, j3, j4, j5), new C0987c(i, i2, format, i3, obj, m25166b(j), m25166b(j2)), iOException, z);
        }

        /* renamed from: l */
        public void m25156l(C2570pp c2570pp, int i, long j, long j2, long j3, IOException iOException, boolean z) {
            m25157k(c2570pp, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j, j2, j3, iOException, z);
        }

        /* renamed from: m */
        public void m25155m(C0986b c0986b, C0987c c0987c, IOException iOException, boolean z) {
            Iterator<C0985j> it = this.f6020c.iterator();
            while (it.hasNext()) {
                C0985j next = it.next();
                m25149s(next.f6052a, new RunnableC0981f(next.f6053b, c0986b, c0987c, iOException, z));
            }
        }

        /* renamed from: n */
        public void m25154n(C2570pp c2570pp, int i, int i2, Format format, int i3, Object obj, long j, long j2, long j3) {
            m25152p(new C0986b(c2570pp, j3, 0L, 0L), new C0987c(i, i2, format, i3, obj, m25166b(j), m25166b(j2)));
        }

        /* renamed from: o */
        public void m25153o(C2570pp c2570pp, int i, long j) {
            m25154n(c2570pp, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, j);
        }

        /* renamed from: p */
        public void m25152p(C0986b c0986b, C0987c c0987c) {
            Iterator<C0985j> it = this.f6020c.iterator();
            while (it.hasNext()) {
                C0985j next = it.next();
                m25149s(next.f6052a, new RunnableC0978c(next.f6053b, c0986b, c0987c));
            }
        }

        /* renamed from: q */
        public void m25151q() {
            C2914s6.m10685f(this.f6019b != null);
            Iterator<C0985j> it = this.f6020c.iterator();
            while (it.hasNext()) {
                C0985j next = it.next();
                m25149s(next.f6052a, new RunnableC0976a(next.f6053b));
            }
        }

        /* renamed from: r */
        public void m25150r() {
            C2914s6.m10685f(this.f6019b != null);
            Iterator<C0985j> it = this.f6020c.iterator();
            while (it.hasNext()) {
                C0985j next = it.next();
                m25149s(next.f6052a, new RunnableC0977b(next.f6053b));
            }
        }

        /* renamed from: s */
        public final void m25149s(Handler handler, Runnable runnable) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }

        /* renamed from: t */
        public void m25148t() {
            C2914s6.m10685f(this.f6019b != null);
            Iterator<C0985j> it = this.f6020c.iterator();
            while (it.hasNext()) {
                C0985j next = it.next();
                m25149s(next.f6052a, new RunnableC0982g(next.f6053b));
            }
        }

        /* renamed from: u */
        public void m25147u(cp0 cp0Var) {
            Iterator<C0985j> it = this.f6020c.iterator();
            while (it.hasNext()) {
                C0985j next = it.next();
                if (next.f6053b == cp0Var) {
                    this.f6020c.remove(next);
                }
            }
        }

        /* renamed from: v */
        public void m25146v(int i, long j, long j2) {
            m25145w(new C0987c(1, i, null, 3, null, m25166b(j), m25166b(j2)));
        }

        /* renamed from: w */
        public void m25145w(C0987c c0987c) {
            Iterator<C0985j> it = this.f6020c.iterator();
            while (it.hasNext()) {
                C0985j next = it.next();
                m25149s(next.f6052a, new RunnableC0983h(next.f6053b, c0987c));
            }
        }

        /* renamed from: x */
        public C0975a m25144x(int i, bp0.C0880a c0880a, long j) {
            return new C0975a(this.f6020c, i, c0880a, j);
        }
    }

    /* renamed from: com.daaw.cp0$b */
    /* loaded from: classes.dex */
    public static final class C0986b {

        /* renamed from: a */
        public final C2570pp f6054a;

        /* renamed from: b */
        public final long f6055b;

        /* renamed from: c */
        public final long f6056c;

        /* renamed from: d */
        public final long f6057d;

        public C0986b(C2570pp c2570pp, long j, long j2, long j3) {
            this.f6054a = c2570pp;
            this.f6055b = j;
            this.f6056c = j2;
            this.f6057d = j3;
        }
    }

    /* renamed from: com.daaw.cp0$c */
    /* loaded from: classes.dex */
    public static final class C0987c {

        /* renamed from: a */
        public final int f6058a;

        /* renamed from: b */
        public final int f6059b;

        /* renamed from: c */
        public final Format f6060c;

        /* renamed from: d */
        public final int f6061d;

        /* renamed from: e */
        public final Object f6062e;

        /* renamed from: f */
        public final long f6063f;

        /* renamed from: g */
        public final long f6064g;

        public C0987c(int i, int i2, Format format, int i3, Object obj, long j, long j2) {
            this.f6058a = i;
            this.f6059b = i2;
            this.f6060c = format;
            this.f6061d = i3;
            this.f6062e = obj;
            this.f6063f = j;
            this.f6064g = j2;
        }
    }

    /* renamed from: C */
    void mo14644C(int i, bp0.C0880a c0880a, C0987c c0987c);

    /* renamed from: E */
    void mo14642E(int i, bp0.C0880a c0880a, C0986b c0986b, C0987c c0987c);

    /* renamed from: F */
    void mo14641F(int i, bp0.C0880a c0880a, C0986b c0986b, C0987c c0987c, IOException iOException, boolean z);

    /* renamed from: h */
    void mo14630h(int i, bp0.C0880a c0880a);

    /* renamed from: l */
    void mo14627l(int i, bp0.C0880a c0880a, C0986b c0986b, C0987c c0987c);

    /* renamed from: o */
    void mo14625o(int i, bp0.C0880a c0880a, C0987c c0987c);

    /* renamed from: r */
    void mo14624r(int i, bp0.C0880a c0880a);

    /* renamed from: t */
    void mo14623t(int i, bp0.C0880a c0880a);

    /* renamed from: w */
    void mo14622w(int i, bp0.C0880a c0880a, C0986b c0986b, C0987c c0987c);
}
