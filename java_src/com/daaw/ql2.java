package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzba;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class ql2 extends pl2 {
    public static final Object N = new Object();
    public static boolean O;
    public static long P;
    public static wl2 Q;
    public static gn2 R;
    public static xm2 S;
    public boolean J;
    public final String K;
    public en2 L;
    public final Map M;

    public ql2(Context context, String str, boolean z) {
        super(context);
        this.J = false;
        this.M = new HashMap();
        this.K = str;
        this.J = z;
    }

    public static wm2 h(Context context, boolean z) {
        if (pl2.I == null) {
            synchronized (N) {
                if (pl2.I == null) {
                    wm2 g = wm2.g(context, "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", z);
                    if (g.r()) {
                        try {
                            if (((Boolean) zzba.zzc().b(g93.L2)).booleanValue()) {
                                g.t("JUzcgAa7QiZMDmYjeHwtF22qOBbojTFP/5L28xsdeCx9uYvsAo6FDNhapuA6bStH", "U55JZyt+fru+djXeCzNGPL143KELIHwp5RNEO07WiP4=", new Class[0]);
                            }
                        } catch (IllegalStateException unused) {
                        }
                        g.t("dJwO6Cl9MRqD0Gc5K3JTdZycyClQqkAPKU0XDLxQQPeGCWqiQha6f2rP1wtqtwx3", "rLNLoOjJQBnuvnCDgD+yaoADKoI2087E89SpHXw4yFg=", Context.class);
                        g.t("ATj3hbklxV/XiswqkLJ9VlaAJFBsAV/1VJ4eSTnw1AP/96KhgekAXYnIpmljK7wO", "rfBYaobM06JIPnbukgoyOwsb7bCc9rvkUNfR4KOQWHU=", Context.class);
                        g.t("S/SJ7YtODXxfB+6o9UyIgHiId71g3ksNaRMWqG3MsynbaW5fZJkURKKNBmxPvqKI", "TBTy2z6/sYWhl/djL8GAQh763EadMhWk9n5M3AmRbIg=", Context.class);
                        g.t("YC+pJVOZY25wDvtlWBPChLSjLU0iUh44DqTcbsbdAncZlcvrsOhFkSGXkkm3Hf4Z", "a17x9Lt/WQTGhUJAM6t8VqFWsXteADIsbbHvy7b7aMM=", Context.class);
                        g.t("qfI1DhKUvYvonhmDhl2HtQbINO0xIIYvKgMRQgz52nQi898Sh8QDGcMkGv/U7x7x", "dGQnAya6a12xEk9RZqxizYv1KQcB0awlyegaC3HNbmw=", Context.class);
                        Class cls = Boolean.TYPE;
                        g.t("Gdhi15k7cHPLVK8ak2AW2U8wWjJccRmTSeAAE7zSYYmR363nmijtloZo3WMMU3lH", "BmCZi3wg7cX26+HP9p5KWWgFeCy6CBwpe84PbqLu08A=", Context.class, cls);
                        g.t("n8eevinWOirOSPZe75LOlEw/rjd2yNw2EibrKlsvfLNOq/qV6IorYV+yJwJVSrU8", "z60w6+pWlGB4RCxkD/LDTBZ25WofjghjXXagNVA9cCM=", Context.class);
                        g.t("9iQ5YMaDdmXd2AE0qa10oJyqmGZHX7XNUzgm4wdKztIQI9jbAXaOTiv6toK0AOKU", "rCh66yJZbGwhYsjh3a4o4nMI5ui67q2Fs4U69kJBF3k=", Context.class);
                        g.t("Kjj/NWt5Xw530zWkhsqzO18XZPoLer8GCJYwlVW4Z2TDaLFXmLCWh2yD69kBis5q", "fBdzdgD1bofuaKTW6LUcH7mpQ3p8BVkg+3EYXR2IWu4=", MotionEvent.class, DisplayMetrics.class);
                        g.t("2VR7L/2srPLBbh3OPlGeS8Ru8uYXtYmourWjxCdZl0ZvDKChHNCuDLRy98nk4nFB", "ZDqFJ0I5g5uVDR0fSRJqwb59d8cP3p3/RbyvkYRlQc0=", MotionEvent.class, DisplayMetrics.class);
                        g.t("THnQW94FsCDUSM+XeJNpgUTCgMolxy7rl1LeD10r6fuFhGDZDxfkCa3f3R02TTfn", "RukHQ2QyoItYcCVOmbl/vMdZ4cajSx2BB5kPudfplwo=", new Class[0]);
                        g.t("EggzVxU0lX/1UlHAeEGUyUm45SOmio09y9T4hm0PM9xyGW0Fa8XV6zB35QkAF1yq", "13swnHoz78V4UQSpBM2KHvpNNnXpuWx8GAjTYu5TVQw=", new Class[0]);
                        g.t("azGRTaieBebLUCBtXxWiGC8ntdSjezuXnKrD7NOMrfVnrrLI+ziOvss+bqlk4xLN", "0tQXY1xo2ukrM9W+s0u6j2Mh+vSCsclEF17Hl/ROszM=", new Class[0]);
                        g.t("9MUQl4bkTrG/hbkOaiPEQeZR+Q1g5nerIUIYlLLAX+szyWBOaKlwxYudXHeApTjq", "w0yuMX287JAuExKzMpRTJqrOhPVTMBo6RInylnboEYs=", new Class[0]);
                        g.t("BL1uRQDu2iGGdqxtPT0UZ/lh1a1ebdj6ce5dHzXL9Xdh/V7EjoG/mOlN+ePhmCVj", "VbWvt5u3iV1e6mTKIEv50y8+Z2ekDgVJovyXyxeSHYc=", new Class[0]);
                        g.t("/nq0lRxQcGC1ASnfdnp1tRqKCtSvrxgzieToDPBUonPm4tHJx/5+TsZqcFW/70Mo", "myj1nOfIy7SmCD8TPLBSkg5Eqhpr16G4wLW5wXHtMTM=", new Class[0]);
                        g.t("JcyGK+UJP268FQFtTaGhQAzoKUodZulOKvzraNGT5p3xvR5cM9kMk5tDQLTCBUij", "f+92zzsRq9nsZjabs/oaBlCH7RtiJvk62T7dPsPTbRg=", Context.class, cls, String.class);
                        g.t("5Y5rtCIQhjVwnkrBvzpTMg0rZuVvyD2oudHeojlpiyRPt3QF1dIwn8qKzMnR3WrD", "L+eAMQBxQYtni61+5W3ps9X1nzCZQ5WzyUUXMjOuRZ4=", StackTraceElement[].class);
                        g.t("JgNevmfyr8lZxnvZfq3r729JgtxbLk039SjEVr1jMI7eztR3nd0tOgO6sMz+FJz+", "ylslQbtrjnaBQeIQLiG5TQpHgACRff6HBxNL0ysPa0Q=", View.class, DisplayMetrics.class, cls, cls);
                        g.t("UdRLZDfL4bVVU0VX3qg8hi1McU3FMuLhNf0tRNLophcguwloVZffIAQP6VRf+/uk", "yXOhM6UEm+Qz/JUey2l1+qI404D+W2SeSSnUBSRl6qI=", Context.class, cls);
                        g.t("rE+CHn9CLSmLsY/LfivBx+DmSmQMCqSMhAImHDd3dGWtfWUTJAZt/SbpXoR2i5+S", "XOTxexwsk5wzpmsanl+x8sPTZMmLepw+z7JZ/NtNU48=", View.class, Activity.class, cls);
                        g.t("yXY8/mGMSUXAD/doic4NhOcSiaIXIqWtQGozx2RibPkZkGDEn3zdgJKu8ncuIp2B", "lomf+VO0Ecj7WivSbw6aVWdgbo/lmDysFNgyXwY+gTY=", Long.TYPE);
                        g.t("wPLuRKbAvZPAiJqPYNBqgvUCesMc3+VTtpgM018gMz5F9Lz38uNUBeCfwu8TSv2X", "+DZ4rAqlxoGmt/vl5o0tqi0yaHBF48hUHJNY3yJnYpc=", new Class[0]);
                        try {
                            if (((Boolean) zzba.zzc().b(g93.Q2)).booleanValue()) {
                                g.t("q25n2/TPNEnWjiB7Eq/br1pf7I1+Pbd8JO4E5S/WFXDtJZ2FMIzDcDIeNK1YwkMp", "JTvnHx65Egq/4novhqSS3bMw+oihCNz02Yz4pG4S+kE=", Context.class);
                            }
                        } catch (IllegalStateException unused2) {
                        }
                        g.t("DZ4YQMGjiiG80De3h2RdExLJLCk1HXfUitSGB3xdLKjSzFe5jaVRnSWLaDfXmTZ6", "rN4de9ttzTEp3+iQIPyTFLSG8iLr2YuUXdQWnliGMSg=", Context.class);
                        try {
                            if (Build.VERSION.SDK_INT >= 26) {
                                if (((Boolean) zzba.zzc().b(g93.S2)).booleanValue()) {
                                    Class cls2 = Long.TYPE;
                                    g.t("uXer3UA11jv0SZxM8rEYS7HzXCd8ucSITS/VghhemVPtPpwzWKxJYN2vUPP5dw9E", "hs3/rpu0ZtoaPE+A6aRGA1SNmSKC7zzkLMT9t285eJ8=", NetworkCapabilities.class, cls2, cls2);
                                }
                            }
                        } catch (IllegalStateException unused3) {
                        }
                        try {
                            if (((Boolean) zzba.zzc().b(g93.l2)).booleanValue()) {
                                Class cls3 = Long.TYPE;
                                g.t("DEi5JrQn0pxSuKS2Ij/fpEA7I+0FPLXDsBWBfvVwt/zwZUJJ4fnydbsyET2LCYMF", "Jj1vyuWfy0iUak+iXdGffQYzyyVnoa3nOmSynhrPgns=", cls3, cls3, cls3, cls3);
                            }
                        } catch (IllegalStateException unused4) {
                        }
                        try {
                            if (((Boolean) zzba.zzc().b(g93.k2)).booleanValue()) {
                                g.t("FdWssDbNTznwvaSwEiy9othUceULqhXS0NiSaXeIdQIZaN4heVunXmsWFB1bgBsj", "TzSf4nrBofZD4sG4/0KqSG9VhwNKl95AgxoEIclkVIM=", long[].class, Context.class, View.class);
                            }
                        } catch (IllegalStateException unused5) {
                        }
                    }
                    pl2.I = g;
                }
            }
        }
        return pl2.I;
    }

    public static zm2 i(wm2 wm2Var, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method j = wm2Var.j("Kjj/NWt5Xw530zWkhsqzO18XZPoLer8GCJYwlVW4Z2TDaLFXmLCWh2yD69kBis5q", "fBdzdgD1bofuaKTW6LUcH7mpQ3p8BVkg+3EYXR2IWu4=");
        if (j == null || motionEvent == null) {
            throw new nm2();
        }
        try {
            return new zm2((String) j.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new nm2(e);
        }
    }

    public static synchronized void l(Context context, boolean z) {
        synchronized (ql2.class) {
            if (O) {
                return;
            }
            P = System.currentTimeMillis() / 1000;
            pl2.I = h(context, z);
            if (((Boolean) zzba.zzc().b(g93.S2)).booleanValue()) {
                Q = wl2.c(context);
            }
            ExecutorService k = pl2.I.k();
            if (((Boolean) zzba.zzc().b(g93.T2)).booleanValue() && k != null) {
                R = gn2.d(context, k);
            }
            if (((Boolean) zzba.zzc().b(g93.l2)).booleanValue()) {
                S = new xm2();
            }
            O = true;
        }
    }

    public static final void m(List list) {
        ExecutorService k;
        if (pl2.I == null || (k = pl2.I.k()) == null || list.isEmpty()) {
            return;
        }
        try {
            k.invokeAll(list, ((Long) zzba.zzc().b(g93.g2)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            String.format("class methods got exception: %s", an2.e(e));
        }
    }

    public static final void o() {
        gn2 gn2Var = R;
        if (gn2Var != null) {
            gn2Var.h();
        }
    }

    @Override // com.daaw.pl2
    public final long a(StackTraceElement[] stackTraceElementArr) {
        Method j = pl2.I.j("5Y5rtCIQhjVwnkrBvzpTMg0rZuVvyD2oudHeojlpiyRPt3QF1dIwn8qKzMnR3WrD", "L+eAMQBxQYtni61+5W3ps9X1nzCZQ5WzyUUXMjOuRZ4=");
        if (j == null || stackTraceElementArr == null) {
            throw new nm2();
        }
        try {
            return new om2((String) j.invoke(null, stackTraceElementArr)).a.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new nm2(e);
        }
    }

    @Override // com.daaw.pl2
    public final hi2 b(Context context, View view, Activity activity) {
        o();
        if (((Boolean) zzba.zzc().b(g93.l2)).booleanValue()) {
            S.i();
        }
        hi2 l0 = fj2.l0();
        if (!TextUtils.isEmpty(this.K)) {
            l0.f0(this.K);
        }
        k(h(context, this.J), l0, view, activity, true, context);
        return l0;
    }

    @Override // com.daaw.pl2
    public final hi2 c(Context context, ai2 ai2Var) {
        o();
        if (((Boolean) zzba.zzc().b(g93.l2)).booleanValue()) {
            S.j();
        }
        hi2 l0 = fj2.l0();
        if (!TextUtils.isEmpty(this.K)) {
            l0.f0(this.K);
        }
        wm2 h = h(context, this.J);
        if (h.k() != null) {
            m(j(h, context, l0, null));
        }
        return l0;
    }

    @Override // com.daaw.pl2
    public final hi2 d(Context context, View view, Activity activity) {
        o();
        if (((Boolean) zzba.zzc().b(g93.l2)).booleanValue()) {
            S.k(context, view);
        }
        hi2 l0 = fj2.l0();
        l0.f0(this.K);
        k(h(context, this.J), l0, view, activity, false, context);
        return l0;
    }

    @Override // com.daaw.pl2
    public final zm2 e(MotionEvent motionEvent) {
        Method j = pl2.I.j("2VR7L/2srPLBbh3OPlGeS8Ru8uYXtYmourWjxCdZl0ZvDKChHNCuDLRy98nk4nFB", "ZDqFJ0I5g5uVDR0fSRJqwb59d8cP3p3/RbyvkYRlQc0=");
        if (j == null || motionEvent == null) {
            throw new nm2();
        }
        try {
            return new zm2((String) j.invoke(null, motionEvent, this.H));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new nm2(e);
        }
    }

    public List j(wm2 wm2Var, Context context, hi2 hi2Var, ai2 ai2Var) {
        long j;
        long j2;
        int a = wm2Var.a();
        ArrayList arrayList = new ArrayList();
        if (!wm2Var.r()) {
            hi2Var.v(16384L);
            return arrayList;
        }
        arrayList.add(new ln2(wm2Var, "JcyGK+UJP268FQFtTaGhQAzoKUodZulOKvzraNGT5p3xvR5cM9kMk5tDQLTCBUij", "f+92zzsRq9nsZjabs/oaBlCH7RtiJvk62T7dPsPTbRg=", hi2Var, a, 27, context, null));
        arrayList.add(new rn2(wm2Var, "THnQW94FsCDUSM+XeJNpgUTCgMolxy7rl1LeD10r6fuFhGDZDxfkCa3f3R02TTfn", "RukHQ2QyoItYcCVOmbl/vMdZ4cajSx2BB5kPudfplwo=", hi2Var, P, a, 25));
        arrayList.add(new ao2(wm2Var, "azGRTaieBebLUCBtXxWiGC8ntdSjezuXnKrD7NOMrfVnrrLI+ziOvss+bqlk4xLN", "0tQXY1xo2ukrM9W+s0u6j2Mh+vSCsclEF17Hl/ROszM=", hi2Var, a, 1));
        arrayList.add(new do2(wm2Var, "S/SJ7YtODXxfB+6o9UyIgHiId71g3ksNaRMWqG3MsynbaW5fZJkURKKNBmxPvqKI", "TBTy2z6/sYWhl/djL8GAQh763EadMhWk9n5M3AmRbIg=", hi2Var, a, 31, context));
        arrayList.add(new io2(wm2Var, "EggzVxU0lX/1UlHAeEGUyUm45SOmio09y9T4hm0PM9xyGW0Fa8XV6zB35QkAF1yq", "13swnHoz78V4UQSpBM2KHvpNNnXpuWx8GAjTYu5TVQw=", hi2Var, a, 33));
        arrayList.add(new kn2(wm2Var, "ATj3hbklxV/XiswqkLJ9VlaAJFBsAV/1VJ4eSTnw1AP/96KhgekAXYnIpmljK7wO", "rfBYaobM06JIPnbukgoyOwsb7bCc9rvkUNfR4KOQWHU=", hi2Var, a, 29, context));
        arrayList.add(new mn2(wm2Var, "YC+pJVOZY25wDvtlWBPChLSjLU0iUh44DqTcbsbdAncZlcvrsOhFkSGXkkm3Hf4Z", "a17x9Lt/WQTGhUJAM6t8VqFWsXteADIsbbHvy7b7aMM=", hi2Var, a, 5));
        arrayList.add(new zn2(wm2Var, "qfI1DhKUvYvonhmDhl2HtQbINO0xIIYvKgMRQgz52nQi898Sh8QDGcMkGv/U7x7x", "dGQnAya6a12xEk9RZqxizYv1KQcB0awlyegaC3HNbmw=", hi2Var, a, 12));
        arrayList.add(new bo2(wm2Var, "Gdhi15k7cHPLVK8ak2AW2U8wWjJccRmTSeAAE7zSYYmR363nmijtloZo3WMMU3lH", "BmCZi3wg7cX26+HP9p5KWWgFeCy6CBwpe84PbqLu08A=", hi2Var, a, 3));
        arrayList.add(new qn2(wm2Var, "9MUQl4bkTrG/hbkOaiPEQeZR+Q1g5nerIUIYlLLAX+szyWBOaKlwxYudXHeApTjq", "w0yuMX287JAuExKzMpRTJqrOhPVTMBo6RInylnboEYs=", hi2Var, a, 44));
        arrayList.add(new wn2(wm2Var, "BL1uRQDu2iGGdqxtPT0UZ/lh1a1ebdj6ce5dHzXL9Xdh/V7EjoG/mOlN+ePhmCVj", "VbWvt5u3iV1e6mTKIEv50y8+Z2ekDgVJovyXyxeSHYc=", hi2Var, a, 22));
        arrayList.add(new jo2(wm2Var, "n8eevinWOirOSPZe75LOlEw/rjd2yNw2EibrKlsvfLNOq/qV6IorYV+yJwJVSrU8", "z60w6+pWlGB4RCxkD/LDTBZ25WofjghjXXagNVA9cCM=", hi2Var, a, 48));
        arrayList.add(new jn2(wm2Var, "9iQ5YMaDdmXd2AE0qa10oJyqmGZHX7XNUzgm4wdKztIQI9jbAXaOTiv6toK0AOKU", "rCh66yJZbGwhYsjh3a4o4nMI5ui67q2Fs4U69kJBF3k=", hi2Var, a, 49));
        arrayList.add(new go2(wm2Var, "/nq0lRxQcGC1ASnfdnp1tRqKCtSvrxgzieToDPBUonPm4tHJx/5+TsZqcFW/70Mo", "myj1nOfIy7SmCD8TPLBSkg5Eqhpr16G4wLW5wXHtMTM=", hi2Var, a, 51));
        arrayList.add(new eo2(wm2Var, "UdRLZDfL4bVVU0VX3qg8hi1McU3FMuLhNf0tRNLophcguwloVZffIAQP6VRf+/uk", "yXOhM6UEm+Qz/JUey2l1+qI404D+W2SeSSnUBSRl6qI=", hi2Var, a, 61));
        if (Build.VERSION.SDK_INT >= 24) {
            if (((Boolean) zzba.zzc().b(g93.S2)).booleanValue()) {
                gn2 gn2Var = R;
                if (gn2Var != null) {
                    j = gn2Var.c();
                    j2 = gn2Var.b();
                } else {
                    j = -1;
                    j2 = -1;
                }
                arrayList.add(new yn2(wm2Var, "uXer3UA11jv0SZxM8rEYS7HzXCd8ucSITS/VghhemVPtPpwzWKxJYN2vUPP5dw9E", "hs3/rpu0ZtoaPE+A6aRGA1SNmSKC7zzkLMT9t285eJ8=", hi2Var, a, 11, Q, j, j2));
            }
        }
        if (((Boolean) zzba.zzc().b(g93.Q2)).booleanValue()) {
            arrayList.add(new co2(wm2Var, "q25n2/TPNEnWjiB7Eq/br1pf7I1+Pbd8JO4E5S/WFXDtJZ2FMIzDcDIeNK1YwkMp", "JTvnHx65Egq/4novhqSS3bMw+oihCNz02Yz4pG4S+kE=", hi2Var, a, 73));
        }
        arrayList.add(new xn2(wm2Var, "DZ4YQMGjiiG80De3h2RdExLJLCk1HXfUitSGB3xdLKjSzFe5jaVRnSWLaDfXmTZ6", "rN4de9ttzTEp3+iQIPyTFLSG8iLr2YuUXdQWnliGMSg=", hi2Var, a, 76));
        if (((Boolean) zzba.zzc().b(g93.V2)).booleanValue()) {
            arrayList.add(new in2(wm2Var, "wPLuRKbAvZPAiJqPYNBqgvUCesMc3+VTtpgM018gMz5F9Lz38uNUBeCfwu8TSv2X", "+DZ4rAqlxoGmt/vl5o0tqi0yaHBF48hUHJNY3yJnYpc=", hi2Var, a, 89));
        }
        return arrayList;
    }

    public final void k(wm2 wm2Var, hi2 hi2Var, View view, Activity activity, boolean z, Context context) {
        List list;
        no2 un2Var;
        if (wm2Var.r()) {
            n(wm2Var, hi2Var);
            ArrayList arrayList = new ArrayList();
            if (wm2Var.k() != null) {
                int a = wm2Var.a();
                arrayList.add(new tn2(wm2Var, hi2Var));
                arrayList.add(new ao2(wm2Var, "azGRTaieBebLUCBtXxWiGC8ntdSjezuXnKrD7NOMrfVnrrLI+ziOvss+bqlk4xLN", "0tQXY1xo2ukrM9W+s0u6j2Mh+vSCsclEF17Hl/ROszM=", hi2Var, a, 1));
                arrayList.add(new rn2(wm2Var, "THnQW94FsCDUSM+XeJNpgUTCgMolxy7rl1LeD10r6fuFhGDZDxfkCa3f3R02TTfn", "RukHQ2QyoItYcCVOmbl/vMdZ4cajSx2BB5kPudfplwo=", hi2Var, P, a, 25));
                arrayList.add(new qn2(wm2Var, "9MUQl4bkTrG/hbkOaiPEQeZR+Q1g5nerIUIYlLLAX+szyWBOaKlwxYudXHeApTjq", "w0yuMX287JAuExKzMpRTJqrOhPVTMBo6RInylnboEYs=", hi2Var, a, 44));
                arrayList.add(new zn2(wm2Var, "qfI1DhKUvYvonhmDhl2HtQbINO0xIIYvKgMRQgz52nQi898Sh8QDGcMkGv/U7x7x", "dGQnAya6a12xEk9RZqxizYv1KQcB0awlyegaC3HNbmw=", hi2Var, a, 12));
                arrayList.add(new bo2(wm2Var, "Gdhi15k7cHPLVK8ak2AW2U8wWjJccRmTSeAAE7zSYYmR363nmijtloZo3WMMU3lH", "BmCZi3wg7cX26+HP9p5KWWgFeCy6CBwpe84PbqLu08A=", hi2Var, a, 3));
                arrayList.add(new wn2(wm2Var, "BL1uRQDu2iGGdqxtPT0UZ/lh1a1ebdj6ce5dHzXL9Xdh/V7EjoG/mOlN+ePhmCVj", "VbWvt5u3iV1e6mTKIEv50y8+Z2ekDgVJovyXyxeSHYc=", hi2Var, a, 22));
                arrayList.add(new mn2(wm2Var, "YC+pJVOZY25wDvtlWBPChLSjLU0iUh44DqTcbsbdAncZlcvrsOhFkSGXkkm3Hf4Z", "a17x9Lt/WQTGhUJAM6t8VqFWsXteADIsbbHvy7b7aMM=", hi2Var, a, 5));
                arrayList.add(new jo2(wm2Var, "n8eevinWOirOSPZe75LOlEw/rjd2yNw2EibrKlsvfLNOq/qV6IorYV+yJwJVSrU8", "z60w6+pWlGB4RCxkD/LDTBZ25WofjghjXXagNVA9cCM=", hi2Var, a, 48));
                arrayList.add(new jn2(wm2Var, "9iQ5YMaDdmXd2AE0qa10oJyqmGZHX7XNUzgm4wdKztIQI9jbAXaOTiv6toK0AOKU", "rCh66yJZbGwhYsjh3a4o4nMI5ui67q2Fs4U69kJBF3k=", hi2Var, a, 49));
                arrayList.add(new go2(wm2Var, "/nq0lRxQcGC1ASnfdnp1tRqKCtSvrxgzieToDPBUonPm4tHJx/5+TsZqcFW/70Mo", "myj1nOfIy7SmCD8TPLBSkg5Eqhpr16G4wLW5wXHtMTM=", hi2Var, a, 51));
                arrayList.add(new fo2(wm2Var, "5Y5rtCIQhjVwnkrBvzpTMg0rZuVvyD2oudHeojlpiyRPt3QF1dIwn8qKzMnR3WrD", "L+eAMQBxQYtni61+5W3ps9X1nzCZQ5WzyUUXMjOuRZ4=", hi2Var, a, 45, new Throwable().getStackTrace()));
                arrayList.add(new ko2(wm2Var, "JgNevmfyr8lZxnvZfq3r729JgtxbLk039SjEVr1jMI7eztR3nd0tOgO6sMz+FJz+", "ylslQbtrjnaBQeIQLiG5TQpHgACRff6HBxNL0ysPa0Q=", hi2Var, a, 57, view));
                arrayList.add(new eo2(wm2Var, "UdRLZDfL4bVVU0VX3qg8hi1McU3FMuLhNf0tRNLophcguwloVZffIAQP6VRf+/uk", "yXOhM6UEm+Qz/JUey2l1+qI404D+W2SeSSnUBSRl6qI=", hi2Var, a, 61));
                if (((Boolean) zzba.zzc().b(g93.h2)).booleanValue()) {
                    arrayList.add(new hn2(wm2Var, "rE+CHn9CLSmLsY/LfivBx+DmSmQMCqSMhAImHDd3dGWtfWUTJAZt/SbpXoR2i5+S", "XOTxexwsk5wzpmsanl+x8sPTZMmLepw+z7JZ/NtNU48=", hi2Var, a, 62, view, activity));
                }
                if (((Boolean) zzba.zzc().b(g93.V2)).booleanValue()) {
                    arrayList.add(new in2(wm2Var, "wPLuRKbAvZPAiJqPYNBqgvUCesMc3+VTtpgM018gMz5F9Lz38uNUBeCfwu8TSv2X", "+DZ4rAqlxoGmt/vl5o0tqi0yaHBF48hUHJNY3yJnYpc=", hi2Var, a, 89));
                }
                if (!z) {
                    try {
                        if (((Boolean) zzba.zzc().b(g93.k2)).booleanValue()) {
                            arrayList.add(new vn2(wm2Var, "FdWssDbNTznwvaSwEiy9othUceULqhXS0NiSaXeIdQIZaN4heVunXmsWFB1bgBsj", "TzSf4nrBofZD4sG4/0KqSG9VhwNKl95AgxoEIclkVIM=", hi2Var, a, 85, this.M, view, context));
                        }
                    } catch (IllegalStateException unused) {
                    }
                    try {
                        if (((Boolean) zzba.zzc().b(g93.l2)).booleanValue()) {
                            un2Var = new un2(wm2Var, "DEi5JrQn0pxSuKS2Ij/fpEA7I+0FPLXDsBWBfvVwt/zwZUJJ4fnydbsyET2LCYMF", "Jj1vyuWfy0iUak+iXdGffQYzyyVnoa3nOmSynhrPgns=", hi2Var, a, 85, S);
                        }
                    } catch (IllegalStateException unused2) {
                    }
                } else if (((Boolean) zzba.zzc().b(g93.j2)).booleanValue()) {
                    un2Var = new ho2(wm2Var, "yXY8/mGMSUXAD/doic4NhOcSiaIXIqWtQGozx2RibPkZkGDEn3zdgJKu8ncuIp2B", "lomf+VO0Ecj7WivSbw6aVWdgbo/lmDysFNgyXwY+gTY=", hi2Var, a, 53, this.L);
                }
                arrayList.add(un2Var);
            }
            list = arrayList;
        } else {
            hi2Var.v(16384L);
            list = Arrays.asList(new tn2(wm2Var, hi2Var));
        }
        m(list);
    }

    public final synchronized void n(wm2 wm2Var, hi2 hi2Var) {
        Long l;
        MotionEvent motionEvent;
        try {
            zm2 i = i(wm2Var, this.p, this.H);
            Long l2 = i.a;
            if (l2 != null) {
                hi2Var.F(l2.longValue());
            }
            Long l3 = i.b;
            if (l3 != null) {
                hi2Var.G(l3.longValue());
            }
            Long l4 = i.c;
            if (l4 != null) {
                hi2Var.D(l4.longValue());
            }
            if (this.G) {
                Long l5 = i.d;
                if (l5 != null) {
                    hi2Var.C(l5.longValue());
                }
                Long l6 = i.e;
                if (l6 != null) {
                    hi2Var.z(l6.longValue());
                }
            }
        } catch (nm2 unused) {
        }
        bj2 L = cj2.L();
        if (this.r > 0 && an2.h(this.H)) {
            L.v(an2.a(this.y, 1, this.H));
            L.I(an2.a(this.D - this.B, 1, this.H));
            L.J(an2.a(this.E - this.C, 1, this.H));
            L.B(an2.a(this.B, 1, this.H));
            L.D(an2.a(this.C, 1, this.H));
            if (this.G && (motionEvent = this.p) != null) {
                long a = an2.a(((this.B - this.D) + motionEvent.getRawX()) - this.p.getX(), 1, this.H);
                if (a != 0) {
                    L.G(a);
                }
                long a2 = an2.a(((this.C - this.E) + this.p.getRawY()) - this.p.getY(), 1, this.H);
                if (a2 != 0) {
                    L.H(a2);
                }
            }
        }
        try {
            zm2 e = e(this.p);
            Long l7 = e.a;
            if (l7 != null) {
                L.C(l7.longValue());
            }
            Long l8 = e.b;
            if (l8 != null) {
                L.E(l8.longValue());
            }
            L.A(e.c.longValue());
            if (this.G) {
                Long l9 = e.e;
                if (l9 != null) {
                    L.y(l9.longValue());
                }
                Long l10 = e.d;
                if (l10 != null) {
                    L.z(l10.longValue());
                }
                Long l11 = e.f;
                if (l11 != null) {
                    L.L(l11.longValue() != 0 ? 2 : 1);
                }
                if (this.s > 0) {
                    if (an2.h(this.H)) {
                        double d = this.x;
                        double d2 = this.s;
                        Double.isNaN(d);
                        Double.isNaN(d2);
                        l = Long.valueOf(Math.round(d / d2));
                    } else {
                        l = null;
                    }
                    if (l != null) {
                        L.t(l.longValue());
                    } else {
                        L.s();
                    }
                    double d3 = this.w;
                    double d4 = this.s;
                    Double.isNaN(d3);
                    Double.isNaN(d4);
                    L.u(Math.round(d3 / d4));
                }
                Long l12 = e.i;
                if (l12 != null) {
                    L.w(l12.longValue());
                }
                Long l13 = e.j;
                if (l13 != null) {
                    L.F(l13.longValue());
                }
                Long l14 = e.k;
                if (l14 != null) {
                    L.K(l14.longValue() != 0 ? 2 : 1);
                }
            }
        } catch (nm2 unused2) {
        }
        long j = this.v;
        if (j > 0) {
            L.x(j);
        }
        hi2Var.J((cj2) L.n());
        long j2 = this.r;
        if (j2 > 0) {
            hi2Var.A(j2);
        }
        long j3 = this.s;
        if (j3 > 0) {
            hi2Var.B(j3);
        }
        long j4 = this.t;
        if (j4 > 0) {
            hi2Var.E(j4);
        }
        long j5 = this.u;
        if (j5 > 0) {
            hi2Var.y(j5);
        }
        try {
            int size = this.q.size() - 1;
            if (size > 0) {
                hi2Var.Z();
                for (int i2 = 0; i2 < size; i2++) {
                    zm2 i3 = i(pl2.I, (MotionEvent) this.q.get(i2), this.H);
                    bj2 L2 = cj2.L();
                    L2.C(i3.a.longValue());
                    L2.E(i3.b.longValue());
                    hi2Var.S((cj2) L2.n());
                }
            }
        } catch (nm2 unused3) {
            hi2Var.Z();
        }
    }

    @Override // com.daaw.ol2
    public final void zzn(View view) {
        if (((Boolean) zzba.zzc().b(g93.j2)).booleanValue()) {
            if (this.L == null) {
                wm2 wm2Var = pl2.I;
                this.L = new en2(wm2Var.a, wm2Var.f());
            }
            this.L.d(view);
        }
    }
}
