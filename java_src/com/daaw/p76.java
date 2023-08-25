package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.concurrent.Callable;
/* loaded from: classes.dex */
public final class p76 implements i76 {
    public final g77 a;
    public final Context b;

    public p76(g77 g77Var, Context context) {
        this.a = g77Var;
        this.b = context;
    }

    public static ResolveInfo b(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(1:3)(1:60)|4|(1:6)(1:59)|7|(3:9|(2:12|10)|13)|14|(3:53|54|(14:56|17|18|19|(9:21|22|23|(1:25)(2:36|(3:39|(3:42|(2:45|46)(1:44)|40)|47))|26|27|(1:35)(1:31)|32|33)|49|23|(0)(0)|26|27|(1:29)|35|32|33))|16|17|18|19|(0)|49|23|(0)(0)|26|27|(0)|35|32|33) */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[Catch: Exception -> 0x00c3, TRY_LEAVE, TryCatch #1 {Exception -> 0x00c3, blocks: (B:26:0x009c, B:28:0x00aa), top: B:57:0x009c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.daaw.n76 a() {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.p76.a():com.daaw.n76");
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 38;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return this.a.M(new Callable() { // from class: com.daaw.o76
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return p76.this.a();
            }
        });
    }
}
