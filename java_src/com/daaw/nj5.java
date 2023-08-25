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

    /* renamed from: h */
    public static final Pattern f20161h = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a */
    public final ki5 f20162a;

    /* renamed from: b */
    public final g77 f20163b;

    /* renamed from: c */
    public final ri6 f20164c;

    /* renamed from: d */
    public final ScheduledExecutorService f20165d;

    /* renamed from: e */
    public final zo5 f20166e;

    /* renamed from: f */
    public final to6 f20167f;

    /* renamed from: g */
    public final Context f20168g;

    public nj5(Context context, ri6 ri6Var, ki5 ki5Var, g77 g77Var, ScheduledExecutorService scheduledExecutorService, zo5 zo5Var, to6 to6Var) {
        this.f20168g = context;
        this.f20164c = ri6Var;
        this.f20162a = ki5Var;
        this.f20163b = g77Var;
        this.f20165d = scheduledExecutorService;
        this.f20166e = zo5Var;
        this.f20167f = to6Var;
    }

    @Override // com.daaw.ok5
    /* renamed from: a */
    public final f77 mo14208a(zzccb zzccbVar) {
        f77 m17714b = this.f20162a.m17714b(zzccbVar);
        io6 m20568a = ho6.m20568a(this.f20168g, 11);
        so6.m10111d(m17714b, m20568a);
        f77 m10629n = s67.m10629n(m17714b, new w57() { // from class: com.daaw.kj5
            @Override // com.daaw.w57
            public final f77 zza(Object obj) {
                return nj5.this.m15148c((InputStream) obj);
            }
        }, this.f20163b);
        if (((Boolean) zzba.zzc().m23658b(g93.f10576V4)).booleanValue()) {
            m10629n = s67.m10636g(s67.m10628o(m10629n, ((Integer) zzba.zzc().m23658b(g93.f10586W4)).intValue(), TimeUnit.SECONDS, this.f20165d), TimeoutException.class, new w57() { // from class: com.daaw.lj5
                @Override // com.daaw.w57
                public final f77 zza(Object obj) {
                    TimeoutException timeoutException = (TimeoutException) obj;
                    return s67.m10635h(new gi5(5));
                }
            }, z04.f34310f);
        }
        so6.m10114a(m10629n, this.f20167f, m20568a);
        s67.m10625r(m10629n, new mj5(this), z04.f34310f);
        return m10629n;
    }

    /* renamed from: c */
    public final /* synthetic */ f77 m15148c(InputStream inputStream) {
        return s67.m10634i(new fi6(new ci6(this.f20164c), ei6.m23453a(new InputStreamReader(inputStream))));
    }
}
