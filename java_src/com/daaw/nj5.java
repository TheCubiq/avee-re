package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzccb;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class nj5 implements ok5 {
    public static final Pattern h = Pattern.compile("Received error HTTP response code: (.*)");
    public final ki5 a;
    public final g77 b;
    public final ri6 c;
    public final ScheduledExecutorService d;
    public final zo5 e;
    public final to6 f;
    public final Context g;

    public nj5(Context context, ri6 ri6Var, ki5 ki5Var, g77 g77Var, ScheduledExecutorService scheduledExecutorService, zo5 zo5Var, to6 to6Var) {
        this.g = context;
        this.c = ri6Var;
        this.a = ki5Var;
        this.b = g77Var;
        this.d = scheduledExecutorService;
        this.e = zo5Var;
        this.f = to6Var;
    }

    @Override // com.daaw.ok5
    public final f77 a(zzccb zzccbVar) {
        f77 b = this.a.b(zzccbVar);
        io6 a = ho6.a(this.g, 11);
        so6.d(b, a);
        f77 n = s67.n(b, new w57() { // from class: com.daaw.kj5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return nj5.this.c((InputStream) obj);
            }
        }, this.b);
        if (((Boolean) zzba.zzc().b(g93.V4)).booleanValue()) {
            n = s67.g(s67.o(n, ((Integer) zzba.zzc().b(g93.W4)).intValue(), TimeUnit.SECONDS, this.d), TimeoutException.class, new w57() { // from class: com.daaw.lj5
                @Override // com.daaw.w57
                public final f77 zza(Object obj) {
                    TimeoutException timeoutException = (TimeoutException) obj;
                    return s67.h(new gi5(5));
                }
            }, z04.f);
        }
        so6.a(n, this.f, a);
        s67.r(n, new mj5(this), z04.f);
        return n;
    }

    public final /* synthetic */ f77 c(InputStream inputStream) {
        return s67.i(new fi6(new ci6(this.c), ei6.a(new InputStreamReader(inputStream))));
    }
}
