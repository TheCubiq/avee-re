package com.daaw;

import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class dg5 implements o67 {

    /* renamed from: a */
    public final /* synthetic */ fg5 f7048a;

    public dg5(fg5 fg5Var) {
        this.f7048a = fg5Var;
    }

    @Override // com.daaw.o67
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2151a(@Nullable Object obj) {
        long j;
        Executor executor;
        final String str = (String) obj;
        synchronized (this) {
            this.f7048a.f9563c = true;
            fg5 fg5Var = this.f7048a;
            long mo15859b = zzt.zzB().mo15859b();
            j = this.f7048a.f9564d;
            fg5Var.m22668v("com.google.android.gms.ads.MobileAds", true, "", (int) (mo15859b - j));
            executor = this.f7048a.f9569i;
            executor.execute(new Runnable() { // from class: com.daaw.cg5
                @Override // java.lang.Runnable
                public final void run() {
                    dg5 dg5Var = dg5.this;
                    fg5.m22680j(dg5Var.f7048a, str);
                }
            });
        }
    }

    @Override // com.daaw.o67
    /* renamed from: b */
    public final void mo2150b(Throwable th) {
        long j;
        e14 e14Var;
        synchronized (this) {
            this.f7048a.f9563c = true;
            fg5 fg5Var = this.f7048a;
            long mo15859b = zzt.zzB().mo15859b();
            j = this.f7048a.f9564d;
            fg5Var.m22668v("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (mo15859b - j));
            e14Var = this.f7048a.f9565e;
            e14Var.m23796c(new Exception());
        }
    }
}
