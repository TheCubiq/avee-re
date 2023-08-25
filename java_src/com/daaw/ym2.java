package com.daaw;

import com.google.android.gms.ads.internal.client.zzba;
import java.lang.reflect.Method;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class ym2 {

    /* renamed from: a */
    public static l87 f33817a;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
        if (r0 != null) goto L9;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m3510a(wm2 wm2Var) {
        Method m5996j;
        l87 m15240a;
        if (f33817a != null) {
            return true;
        }
        String str = (String) zzba.zzc().m23658b(g93.f10484M2);
        if (str == null || str.length() == 0) {
            str = null;
            if (wm2Var != null && (m5996j = wm2Var.m5996j("JUzcgAa7QiZMDmYjeHwtF22qOBbojTFP/5L28xsdeCx9uYvsAo6FDNhapuA6bStH", "U55JZyt+fru+djXeCzNGPL143KELIHwp5RNEO07WiP4=")) != null) {
                str = (String) m5996j.invoke(null, new Object[0]);
            }
        }
        try {
            d97 m17935a = k97.m17935a(uj2.m8101b(str, true));
            for (ym7 ym7Var : kc7.f16186a.m25168N()) {
                if (ym7Var.m3501P().isEmpty()) {
                    throw new GeneralSecurityException("Missing type_url.");
                }
                if (ym7Var.m3502O().isEmpty()) {
                    throw new GeneralSecurityException("Missing primitive_name.");
                }
                if (ym7Var.m3503N().isEmpty()) {
                    throw new GeneralSecurityException("Missing catalogue_name.");
                }
                if (!ym7Var.m3503N().equals("TinkAead") && !ym7Var.m3503N().equals("TinkMac") && !ym7Var.m3503N().equals("TinkHybridDecrypt") && !ym7Var.m3503N().equals("TinkHybridEncrypt") && !ym7Var.m3503N().equals("TinkPublicKeySign") && !ym7Var.m3503N().equals("TinkPublicKeyVerify") && !ym7Var.m3503N().equals("TinkStreamingAead") && !ym7Var.m3503N().equals("TinkDeterministicAead")) {
                    d87 m6298a = w97.m6298a(ym7Var.m3503N());
                    w97.m6284o(m6298a.zza());
                    ym7Var.m3501P();
                    ym7Var.m3502O();
                    ym7Var.m3505L();
                    w97.m6286m(m6298a.zzb(), ym7Var.m3500Q());
                }
            }
            m15240a = nc7.m15240a(m17935a);
            f33817a = m15240a;
        } catch (IllegalArgumentException | GeneralSecurityException unused) {
        }
        return m15240a != null;
    }
}
