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
    public final Context a;
    public final Executor b;
    public final es6 c;
    public final js6 d;
    public final zs6 e;
    public final zs6 f;
    public rj1 g;
    public rj1 h;

    public at6(Context context, Executor executor, es6 es6Var, js6 js6Var, xs6 xs6Var, ys6 ys6Var) {
        this.a = context;
        this.b = executor;
        this.c = es6Var;
        this.d = js6Var;
        this.e = xs6Var;
        this.f = ys6Var;
    }

    public static at6 e(Context context, Executor executor, es6 es6Var, js6 js6Var) {
        final at6 at6Var = new at6(context, executor, es6Var, js6Var, new xs6(), new ys6());
        at6Var.g = at6Var.d.d() ? at6Var.h(new Callable() { // from class: com.daaw.us6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return at6.this.c();
            }
        }) : dk1.e(at6Var.e.zza());
        at6Var.h = at6Var.h(new Callable() { // from class: com.daaw.vs6
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return at6.this.d();
            }
        });
        return at6Var;
    }

    public static fj2 g(rj1 rj1Var, fj2 fj2Var) {
        return !rj1Var.n() ? fj2Var : (fj2) rj1Var.k();
    }

    public final fj2 a() {
        return g(this.g, this.e.zza());
    }

    public final fj2 b() {
        return g(this.h, this.f.zza());
    }

    public final /* synthetic */ fj2 c() {
        Context context = this.a;
        hi2 l0 = fj2.l0();
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
            l0.q0(id);
            l0.p0(advertisingIdInfo.isLimitAdTrackingEnabled());
            l0.U(6);
        }
        return (fj2) l0.n();
    }

    public final /* synthetic */ fj2 d() {
        Context context = this.a;
        return ps6.a(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.c.c(2025, -1L, exc);
    }

    public final rj1 h(Callable callable) {
        return dk1.c(this.b, callable).d(this.b, new gu0() { // from class: com.daaw.ws6
            @Override // com.daaw.gu0
            public final void c(Exception exc) {
                at6.this.f(exc);
            }
        });
    }
}
