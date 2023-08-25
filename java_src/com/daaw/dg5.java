package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class dg5 implements o67 {
    public final /* synthetic */ fg5 a;

    public dg5(fg5 fg5Var) {
        this.a = fg5Var;
    }

    @Override // com.daaw.o67
    public final /* bridge */ /* synthetic */ void a(@Nullable Object obj) {
        long j;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.a.c = true;
            fg5 fg5Var = this.a;
            long b = zzt.zzB().b();
            j = this.a.d;
            fg5Var.v("com.google.android.gms.ads.MobileAds", true, "", (int) (b - j));
            executor = this.a.i;
            executor.execute(new Runnable() { // from class: com.daaw.cg5
                @Override // java.lang.Runnable
                public final void run() {
                    dg5 dg5Var = dg5.this;
                    fg5.j(dg5Var.a, str);
                }
            });
        }
    }

    @Override // com.daaw.o67
    public final void b(Throwable th) {
        long j;
        e14 e14Var;
        synchronized (this) {
            this.a.c = true;
            fg5 fg5Var = this.a;
            long b = zzt.zzB().b();
            j = this.a.d;
            fg5Var.v("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (b - j));
            e14Var = this.a.e;
            e14Var.c(new Exception());
        }
    }
}
