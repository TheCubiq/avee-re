package com.daaw;

import android.content.Context;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class at6 {

    /* renamed from: a */
    public final Context f3583a;

    /* renamed from: b */
    public final Executor f3584b;

    /* renamed from: c */
    public final es6 f3585c;

    /* renamed from: d */
    public final js6 f3586d;

    /* renamed from: e */
    public final zs6 f3587e;

    /* renamed from: f */
    public final zs6 f3588f;

    /* renamed from: g */
    public rj1 f3589g;

    /* renamed from: h */
    public rj1 f3590h;

    public at6(Context context, Executor executor, es6 es6Var, js6 js6Var, xs6 xs6Var, ys6 ys6Var) {
        this.f3583a = context;
        this.f3584b = executor;
        this.f3585c = es6Var;
        this.f3586d = js6Var;
        this.f3587e = xs6Var;
        this.f3588f = ys6Var;
    }

    /* renamed from: e */
    public static at6 m27037e(Context context, Executor executor, es6 es6Var, js6 js6Var) {
        final at6 at6Var = new at6(context, executor, es6Var, js6Var, new xs6(), new ys6());
        at6Var.f3589g = at6Var.f3586d.mo14841d() ? at6Var.m27034h(new Callable() { // from class: com.daaw.us6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return at6.this.m27039c();
            }
        }) : dk1.m24304e(at6Var.f3587e.zza());
        at6Var.f3590h = at6Var.m27034h(new Callable() { // from class: com.daaw.vs6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return at6.this.m27038d();
            }
        });
        return at6Var;
    }

    /* renamed from: g */
    public static fj2 m27035g(rj1 rj1Var, fj2 fj2Var) {
        return !rj1Var.mo11236n() ? fj2Var : (fj2) rj1Var.mo11239k();
    }

    /* renamed from: a */
    public final fj2 m27041a() {
        return m27035g(this.f3589g, this.f3587e.zza());
    }

    /* renamed from: b */
    public final fj2 m27040b() {
        return m27035g(this.f3590h, this.f3588f.zza());
    }

    /* renamed from: c */
    public final /* synthetic */ fj2 m27039c() {
        Context context = this.f3583a;
        hi2 m22548l0 = fj2.m22548l0();
        AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
        String id = advertisingIdInfo.getId();
        if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
            UUID fromString = UUID.fromString(id);
            byte[] bArr = new byte[16];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.putLong(fromString.getMostSignificantBits());
            wrap.putLong(fromString.getLeastSignificantBits());
            id = Base64.encodeToString(bArr, 11);
        }
        if (id != null) {
            m22548l0.m20749q0(id);
            m22548l0.m20750p0(advertisingIdInfo.isLimitAdTrackingEnabled());
            m22548l0.m20771U(6);
        }
        return (fj2) m22548l0.m22315n();
    }

    /* renamed from: d */
    public final /* synthetic */ fj2 m27038d() {
        Context context = this.f3583a;
        return ps6.m13162a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    /* renamed from: f */
    public final /* synthetic */ void m27036f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f3585c.m23229c(2025, -1L, exc);
    }

    /* renamed from: h */
    public final rj1 m27034h(Callable callable) {
        return dk1.m24306c(this.f3584b, callable).mo11246d(this.f3584b, new gu0() { // from class: com.daaw.ws6
            @Override // com.daaw.gu0
            /* renamed from: c */
            public final void mo5820c(Exception exc) {
                at6.this.m27036f(exc);
            }
        });
    }
}
