package com.daaw;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.security.MessageDigest;
import java.util.Objects;
import java.util.UUID;
/* loaded from: classes.dex */
public class x60 {
    public final c a;
    public final r60 b;
    public final Handler c;
    public boolean d;
    public boolean e;
    public f60<r60, r60, Bitmap, Bitmap> f;
    public b g;
    public boolean h;

    /* loaded from: classes.dex */
    public static class b extends ld1<Bitmap> {
        public final Handler s;
        public final int t;
        public final long u;
        public Bitmap v;

        public b(Handler handler, int i, long j) {
            this.s = handler;
            this.t = i;
            this.u = j;
        }

        public Bitmap m() {
            return this.v;
        }

        @Override // com.daaw.pj1
        /* renamed from: n */
        public void c(Bitmap bitmap, f70<? super Bitmap> f70Var) {
            this.v = bitmap;
            this.s.sendMessageAtTime(this.s.obtainMessage(1, this), this.u);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(int i);
    }

    /* loaded from: classes.dex */
    public class d implements Handler.Callback {
        public d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                x60.this.e((b) message.obj);
                return true;
            } else if (i == 2) {
                e70.h((b) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class e implements hi0 {
        public final UUID a;

        public e() {
            this(UUID.randomUUID());
        }

        public e(UUID uuid) {
            this.a = uuid;
        }

        @Override // com.daaw.hi0
        public void a(MessageDigest messageDigest) {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.daaw.hi0
        public boolean equals(Object obj) {
            if (obj instanceof e) {
                return ((e) obj).a.equals(this.a);
            }
            return false;
        }

        @Override // com.daaw.hi0
        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public x60(Context context, c cVar, r60 r60Var, int i, int i2) {
        this(cVar, r60Var, null, c(context, r60Var, i, i2, e70.j(context).k()));
    }

    public x60(c cVar, r60 r60Var, Handler handler, f60<r60, r60, Bitmap, Bitmap> f60Var) {
        this.d = false;
        this.e = false;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new d()) : handler;
        this.a = cVar;
        this.b = r60Var;
        this.c = handler;
        this.f = f60Var;
    }

    public static f60<r60, r60, Bitmap, Bitmap> c(Context context, r60 r60Var, int i, int i2, bc bcVar) {
        z60 z60Var = new z60(bcVar);
        y60 y60Var = new y60();
        return e70.t(context).A(y60Var, r60.class).c(r60Var).a(Bitmap.class).z(it0.b()).i(z60Var).y(true).j(wt.NONE).v(i, i2);
    }

    public void a() {
        h();
        b bVar = this.g;
        if (bVar != null) {
            e70.h(bVar);
            this.g = null;
        }
        this.h = true;
    }

    public Bitmap b() {
        b bVar = this.g;
        if (bVar != null) {
            return bVar.m();
        }
        return null;
    }

    public final void d() {
        if (!this.d || this.e) {
            return;
        }
        this.e = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.b.h();
        this.b.a();
        this.f.x(new e()).r(new b(this.c, this.b.d(), uptimeMillis));
    }

    public void e(b bVar) {
        if (this.h) {
            this.c.obtainMessage(2, bVar).sendToTarget();
            return;
        }
        b bVar2 = this.g;
        this.g = bVar;
        this.a.a(bVar.t);
        if (bVar2 != null) {
            this.c.obtainMessage(2, bVar2).sendToTarget();
        }
        this.e = false;
        d();
    }

    public void f(cn1<Bitmap> cn1Var) {
        Objects.requireNonNull(cn1Var, "Transformation must not be null");
        this.f = this.f.A(cn1Var);
    }

    public void g() {
        if (this.d) {
            return;
        }
        this.d = true;
        this.h = false;
        d();
    }

    public void h() {
        this.d = false;
    }
}
