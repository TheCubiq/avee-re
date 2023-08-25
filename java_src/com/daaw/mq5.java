package com.daaw;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class mq5 implements nq5 {
    /* renamed from: e */
    public static yp6 m15846e(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 112202875) {
            if (hashCode == 714893483 && str.equals("nativeDisplay")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (str.equals("video")) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    return null;
                }
                return yp6.VIDEO;
            }
            return yp6.NATIVE_DISPLAY;
        }
        return yp6.HTML_DISPLAY;
    }

    /* renamed from: f */
    public static dq6 m15845f(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1104128070) {
            if (str.equals("beginToRender")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 1318088141) {
            if (hashCode == 1988248512 && str.equals("onePixel")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("definedByJavascript")) {
                c = 1;
            }
            c = 65535;
        }
        return c != 0 ? c != 1 ? c != 2 ? dq6.UNSPECIFIED : dq6.ONE_PIXEL : dq6.DEFINED_BY_JAVASCRIPT : dq6.BEGIN_TO_RENDER;
    }

    /* renamed from: g */
    public static eq6 m15844g(String str) {
        return "native".equals(str) ? eq6.NATIVE : "javascript".equals(str) ? eq6.JAVASCRIPT : eq6.NONE;
    }

    @Override // com.daaw.nq5
    /* renamed from: a */
    public final yd0 mo14879a(String str, WebView webView, String str2, String str3, String str4, String str5, pq5 pq5Var, oq5 oq5Var, String str6) {
        String valueOf;
        String str7;
        String concat;
        if (((Boolean) zzba.zzc().m23658b(g93.f10890y4)).booleanValue() && rp6.m11081b()) {
            fq6 m22402a = fq6.m22402a(str5, str);
            eq6 m15844g = m15844g("javascript");
            eq6 m15844g2 = m15844g(str4);
            yp6 m15846e = m15846e(oq5Var.toString());
            eq6 eq6Var = eq6.NONE;
            if (m15844g == eq6Var) {
                concat = "Omid js session error; Unable to parse impression owner: javascript";
            } else {
                if (m15846e == null) {
                    valueOf = String.valueOf(oq5Var);
                    str7 = "Omid js session error; Unable to parse creative type: ";
                } else if (m15846e != yp6.VIDEO || m15844g2 != eq6Var) {
                    return nt0.m14830g3(tp6.m8889a(up6.m7838a(m15846e, m15845f(pq5Var.toString()), m15844g, m15844g2, true), vp6.m6949c(m22402a, webView, str6, "")));
                } else {
                    valueOf = String.valueOf(str4);
                    str7 = "Omid js session error; Video events owner unknown for video creative: ";
                }
                concat = str7.concat(valueOf);
            }
            k04.zzj(concat);
            return null;
        }
        return null;
    }

    @Override // com.daaw.nq5
    /* renamed from: b */
    public final void mo14878b(yd0 yd0Var, View view) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10890y4)).booleanValue() && rp6.m11081b()) {
            Object m14831M = nt0.m14831M(yd0Var);
            if (m14831M instanceof tp6) {
                ((tp6) m14831M).mo4834d(view);
            }
        }
    }

    @Override // com.daaw.nq5
    /* renamed from: c */
    public final yd0 mo14877c(String str, WebView webView, String str2, String str3, String str4, pq5 pq5Var, oq5 oq5Var, String str5) {
        String valueOf;
        String str6;
        String concat;
        if (((Boolean) zzba.zzc().m23658b(g93.f10890y4)).booleanValue() && rp6.m11081b()) {
            fq6 m22402a = fq6.m22402a("Google", str);
            eq6 m15844g = m15844g("javascript");
            yp6 m15846e = m15846e(oq5Var.toString());
            eq6 eq6Var = eq6.NONE;
            if (m15844g == eq6Var) {
                concat = "Omid html session error; Unable to parse impression owner: javascript";
            } else {
                if (m15846e == null) {
                    valueOf = String.valueOf(oq5Var);
                    str6 = "Omid html session error; Unable to parse creative type: ";
                } else {
                    eq6 m15844g2 = m15844g(str4);
                    if (m15846e != yp6.VIDEO || m15844g2 != eq6Var) {
                        return nt0.m14830g3(tp6.m8889a(up6.m7838a(m15846e, m15845f(pq5Var.toString()), m15844g, m15844g2, true), vp6.m6950b(m22402a, webView, str5, "")));
                    }
                    valueOf = String.valueOf(str4);
                    str6 = "Omid html session error; Video events owner unknown for video creative: ";
                }
                concat = str6.concat(valueOf);
            }
            k04.zzj(concat);
            return null;
        }
        return null;
    }

    @Override // com.daaw.nq5
    /* renamed from: d */
    public final boolean mo14876d(Context context) {
        if (!((Boolean) zzba.zzc().m23658b(g93.f10890y4)).booleanValue()) {
            k04.zzj("Omid flag is disabled");
            return false;
        } else if (rp6.m11081b()) {
            return true;
        } else {
            rp6.m11082a(context);
            return rp6.m11081b();
        }
    }

    @Override // com.daaw.nq5
    public final void zzd(yd0 yd0Var) {
        if (((Boolean) zzba.zzc().m23658b(g93.f10890y4)).booleanValue() && rp6.m11081b()) {
            Object m14831M = nt0.m14831M(yd0Var);
            if (m14831M instanceof tp6) {
                ((tp6) m14831M).mo4833e();
            }
        }
    }
}
