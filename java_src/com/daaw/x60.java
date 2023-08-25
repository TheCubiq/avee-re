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

    /* renamed from: a */
    public final InterfaceC3508c f32129a;

    /* renamed from: b */
    public final r60 f32130b;

    /* renamed from: c */
    public final Handler f32131c;

    /* renamed from: d */
    public boolean f32132d;

    /* renamed from: e */
    public boolean f32133e;

    /* renamed from: f */
    public f60<r60, r60, Bitmap, Bitmap> f32134f;

    /* renamed from: g */
    public C3507b f32135g;

    /* renamed from: h */
    public boolean f32136h;

    /* renamed from: com.daaw.x60$b */
    /* loaded from: classes.dex */
    public static class C3507b extends ld1<Bitmap> {

        /* renamed from: s */
        public final Handler f32137s;

        /* renamed from: t */
        public final int f32138t;

        /* renamed from: u */
        public final long f32139u;

        /* renamed from: v */
        public Bitmap f32140v;

        public C3507b(Handler handler, int i, long j) {
            this.f32137s = handler;
            this.f32138t = i;
            this.f32139u = j;
        }

        /* renamed from: m */
        public Bitmap m5504m() {
            return this.f32140v;
        }

        @Override // com.daaw.pj1
        /* renamed from: n */
        public void mo5506c(Bitmap bitmap, f70<? super Bitmap> f70Var) {
            this.f32140v = bitmap;
            this.f32137s.sendMessageAtTime(this.f32137s.obtainMessage(1, this), this.f32139u);
        }
    }

    /* renamed from: com.daaw.x60$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3508c {
        /* renamed from: a */
        void mo5502a(int i);
    }

    /* renamed from: com.daaw.x60$d */
    /* loaded from: classes.dex */
    public class C3509d implements Handler.Callback {
        public C3509d() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                x60.this.m5510e((C3507b) message.obj);
                return true;
            } else if (i == 2) {
                e70.m23687h((C3507b) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    /* renamed from: com.daaw.x60$e */
    /* loaded from: classes.dex */
    public static class C3510e implements hi0 {

        /* renamed from: a */
        public final UUID f32142a;

        public C3510e() {
            this(UUID.randomUUID());
        }

        public C3510e(UUID uuid) {
            this.f32142a = uuid;
        }

        @Override // com.daaw.hi0
        /* renamed from: a */
        public void mo3222a(MessageDigest messageDigest) {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.daaw.hi0
        public boolean equals(Object obj) {
            if (obj instanceof C3510e) {
                return ((C3510e) obj).f32142a.equals(this.f32142a);
            }
            return false;
        }

        @Override // com.daaw.hi0
        public int hashCode() {
            return this.f32142a.hashCode();
        }
    }

    public x60(Context context, InterfaceC3508c interfaceC3508c, r60 r60Var, int i, int i2) {
        this(interfaceC3508c, r60Var, null, m5512c(context, r60Var, i, i2, e70.m23685j(context).m23684k()));
    }

    public x60(InterfaceC3508c interfaceC3508c, r60 r60Var, Handler handler, f60<r60, r60, Bitmap, Bitmap> f60Var) {
        this.f32132d = false;
        this.f32133e = false;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new C3509d()) : handler;
        this.f32129a = interfaceC3508c;
        this.f32130b = r60Var;
        this.f32131c = handler;
        this.f32134f = f60Var;
    }

    /* renamed from: c */
    public static f60<r60, r60, Bitmap, Bitmap> m5512c(Context context, r60 r60Var, int i, int i2, InterfaceC0832bc interfaceC0832bc) {
        z60 z60Var = new z60(interfaceC0832bc);
        y60 y60Var = new y60();
        return e70.m23675t(context).m11782A(y60Var, r60.class).m11761c(r60Var).m11760a(Bitmap.class).m22901z(it0.m19435b()).mo9858i(z60Var).mo9853y(true).mo9857j(EnumC3465wt.NONE).mo9855v(i, i2);
    }

    /* renamed from: a */
    public void m5514a() {
        m5507h();
        C3507b c3507b = this.f32135g;
        if (c3507b != null) {
            e70.m23687h(c3507b);
            this.f32135g = null;
        }
        this.f32136h = true;
    }

    /* renamed from: b */
    public Bitmap m5513b() {
        C3507b c3507b = this.f32135g;
        if (c3507b != null) {
            return c3507b.m5504m();
        }
        return null;
    }

    /* renamed from: d */
    public final void m5511d() {
        if (!this.f32132d || this.f32133e) {
            return;
        }
        this.f32133e = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f32130b.m11721h();
        this.f32130b.m11728a();
        this.f32134f.mo9854x(new C3510e()).m22906r(new C3507b(this.f32131c, this.f32130b.m11725d(), uptimeMillis));
    }

    /* renamed from: e */
    public void m5510e(C3507b c3507b) {
        if (this.f32136h) {
            this.f32131c.obtainMessage(2, c3507b).sendToTarget();
            return;
        }
        C3507b c3507b2 = this.f32135g;
        this.f32135g = c3507b;
        this.f32129a.mo5502a(c3507b.f32138t);
        if (c3507b2 != null) {
            this.f32131c.obtainMessage(2, c3507b2).sendToTarget();
        }
        this.f32133e = false;
        m5511d();
    }

    /* renamed from: f */
    public void m5509f(cn1<Bitmap> cn1Var) {
        Objects.requireNonNull(cn1Var, "Transformation must not be null");
        this.f32134f = this.f32134f.mo9879A(cn1Var);
    }

    /* renamed from: g */
    public void m5508g() {
        if (this.f32132d) {
            return;
        }
        this.f32132d = true;
        this.f32136h = false;
        m5511d();
    }

    /* renamed from: h */
    public void m5507h() {
        this.f32132d = false;
    }
}
