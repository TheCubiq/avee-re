package androidx.work;

import android.os.Build;
import com.daaw.dg0;
import com.daaw.m61;
import com.daaw.pr;
import com.daaw.vf0;
import com.daaw.yy1;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class a {
    public final Executor a;
    public final Executor b;
    public final yy1 c;
    public final dg0 d;
    public final m61 e;
    public final vf0 f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;

    /* renamed from: androidx.work.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ThreadFactoryC0032a implements ThreadFactory {
        public final AtomicInteger a = new AtomicInteger(0);
        public final /* synthetic */ boolean b;

        public ThreadFactoryC0032a(boolean z) {
            this.b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str = this.b ? "WM.task-" : "androidx.work-";
            return new Thread(runnable, str + this.a.incrementAndGet());
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public Executor a;
        public yy1 b;
        public dg0 c;
        public Executor d;
        public m61 e;
        public vf0 f;
        public String g;
        public int h = 4;
        public int i = 0;
        public int j = Integer.MAX_VALUE;
        public int k = 20;

        public a a() {
            return new a(this);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        a a();
    }

    public a(b bVar) {
        Executor executor = bVar.a;
        this.a = executor == null ? a(false) : executor;
        Executor executor2 = bVar.d;
        if (executor2 == null) {
            this.l = true;
            executor2 = a(true);
        } else {
            this.l = false;
        }
        this.b = executor2;
        yy1 yy1Var = bVar.b;
        this.c = yy1Var == null ? yy1.c() : yy1Var;
        dg0 dg0Var = bVar.c;
        this.d = dg0Var == null ? dg0.c() : dg0Var;
        m61 m61Var = bVar.e;
        this.e = m61Var == null ? new pr() : m61Var;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.f = bVar.f;
        this.g = bVar.g;
    }

    public final Executor a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z));
    }

    public final ThreadFactory b(boolean z) {
        return new ThreadFactoryC0032a(z);
    }

    public String c() {
        return this.g;
    }

    public vf0 d() {
        return this.f;
    }

    public Executor e() {
        return this.a;
    }

    public dg0 f() {
        return this.d;
    }

    public int g() {
        return this.j;
    }

    public int h() {
        return Build.VERSION.SDK_INT == 23 ? this.k / 2 : this.k;
    }

    public int i() {
        return this.i;
    }

    public int j() {
        return this.h;
    }

    public m61 k() {
        return this.e;
    }

    public Executor l() {
        return this.b;
    }

    public yy1 m() {
        return this.c;
    }
}
