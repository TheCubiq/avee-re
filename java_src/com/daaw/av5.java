package com.daaw;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class av5 implements w57 {

    /* renamed from: a */
    public final en6 f3682a;

    /* renamed from: b */
    public final nq4 f3683b;

    /* renamed from: c */
    public final kp6 f3684c;

    /* renamed from: d */
    public final op6 f3685d;

    /* renamed from: e */
    public final Executor f3686e;

    /* renamed from: f */
    public final ScheduledExecutorService f3687f;

    /* renamed from: g */
    public final cm4 f3688g;

    /* renamed from: h */
    public final vu5 f3689h;

    /* renamed from: i */
    public final vq5 f3690i;

    /* renamed from: j */
    public final Context f3691j;

    /* renamed from: k */
    public final to6 f3692k;

    public av5(Context context, en6 en6Var, vu5 vu5Var, nq4 nq4Var, kp6 kp6Var, op6 op6Var, cm4 cm4Var, Executor executor, ScheduledExecutorService scheduledExecutorService, vq5 vq5Var, to6 to6Var) {
        this.f3691j = context;
        this.f3682a = en6Var;
        this.f3689h = vu5Var;
        this.f3683b = nq4Var;
        this.f3684c = kp6Var;
        this.f3685d = op6Var;
        this.f3688g = cm4Var;
        this.f3686e = executor;
        this.f3687f = scheduledExecutorService;
        this.f3690i = vq5Var;
        this.f3692k = to6Var;
    }

    /* renamed from: b */
    public final /* synthetic */ f77 m26955b(th6 th6Var, fi6 fi6Var, qq5 qq5Var, Throwable th) {
        io6 m20568a = ho6.m20568a(this.f3691j, 12);
        m20568a.mo17583l(th6Var.f27659F);
        m20568a.zzh();
        vu5 vu5Var = this.f3689h;
        f77 m10628o = s67.m10628o(qq5Var.mo1904b(fi6Var, th6Var), th6Var.f27672S, TimeUnit.MILLISECONDS, this.f3687f);
        vu5Var.m6778e(fi6Var, th6Var, m10628o, this.f3684c);
        so6.m10114a(m10628o, this.f3692k, m20568a);
        return m10628o;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    @Override // com.daaw.w57
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ f77 zza(Object obj) {
        String str;
        vh6 vh6Var;
        int i;
        final fi6 fi6Var = (fi6) obj;
        int i2 = fi6Var.f9624b.f8508b.f31255e;
        if (i2 != 0) {
            if (i2 < 200 || i2 >= 300) {
                str = (i2 < 300 || i2 >= 400) ? "Received error HTTP response code: " + i2 : "No location header to follow redirect or too many redirects.";
            } else if (!((Boolean) zzba.zzc().m23658b(g93.f10566U4)).booleanValue()) {
                str = "No fill.";
            }
            wh6 wh6Var = fi6Var.f9624b.f8508b;
            vh6Var = wh6Var.f31259i;
            if (vh6Var != null) {
                str = vh6Var.m7141a();
            }
            this.f3690i.m6909g(wh6Var);
            if (((Boolean) zzba.zzc().m23658b(g93.f10893y7)).booleanValue() || (i = fi6Var.f9624b.f8508b.f31255e) == 0 || (i >= 200 && i < 300)) {
                gm6 m7037a = lm6.m16719c(s67.m10635h(new yu5(3, str)), ym6.RENDER_CONFIG_INIT, this.f3682a).m7037a();
                for (th6 th6Var : fi6Var.f9624b.f8507a) {
                    this.f3690i.m6912d(th6Var);
                    Iterator it = th6Var.f27680a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            this.f3690i.m6911e(th6Var, 0L, tj6.m9071d(1, null, null));
                            break;
                        }
                        qq5 mo19170a = this.f3688g.mo19170a(th6Var.f27682b, (String) it.next());
                        if (mo19170a == null || !mo19170a.mo1905a(fi6Var, th6Var)) {
                        }
                    }
                }
                this.f3683b.m17376n0(new fg4(fi6Var, this.f3685d, this.f3684c), this.f3686e);
                int i3 = 0;
                for (final th6 th6Var2 : fi6Var.f9624b.f8507a) {
                    Iterator it2 = th6Var2.f27680a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String str2 = (String) it2.next();
                        final qq5 mo19170a2 = this.f3688g.mo19170a(th6Var2.f27682b, str2);
                        if (mo19170a2 != null && mo19170a2.mo1905a(fi6Var, th6Var2)) {
                            m7037a = this.f3682a.m5975b(ym6.RENDER_CONFIG_WATERFALL, m7037a).m7030h("render-config-" + i3 + "-" + str2).m7035c(Throwable.class, new w57() { // from class: com.daaw.zu5
                                @Override // com.daaw.w57
                                public final f77 zza(Object obj2) {
                                    return av5.this.m26955b(th6Var2, fi6Var, mo19170a2, (Throwable) obj2);
                                }
                            }).m7037a();
                            break;
                        }
                    }
                    i3++;
                }
                return m7037a;
            }
            return s67.m10635h(new yu5(3, str));
        }
        str = "No ad config.";
        wh6 wh6Var2 = fi6Var.f9624b.f8508b;
        vh6Var = wh6Var2.f31259i;
        if (vh6Var != null) {
        }
        this.f3690i.m6909g(wh6Var2);
        if (((Boolean) zzba.zzc().m23658b(g93.f10893y7)).booleanValue()) {
        }
        gm6 m7037a2 = lm6.m16719c(s67.m10635h(new yu5(3, str)), ym6.RENDER_CONFIG_INIT, this.f3682a).m7037a();
        while (r1.hasNext()) {
        }
        this.f3683b.m17376n0(new fg4(fi6Var, this.f3685d, this.f3684c), this.f3686e);
        int i32 = 0;
        while (r1.hasNext()) {
        }
        return m7037a2;
    }
}
