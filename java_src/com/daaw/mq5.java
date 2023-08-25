package com.daaw;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
/* loaded from: classes.dex */
public final class mq5 implements nq5 {
    public static yp6 e(String str) {
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

    public static dq6 f(String str) {
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

    public static eq6 g(String str) {
        return "native".equals(str) ? eq6.NATIVE : "javascript".equals(str) ? eq6.JAVASCRIPT : eq6.NONE;
    }

    @Override // com.daaw.nq5
    public final yd0 a(String str, WebView webView, String str2, String str3, String str4, String str5, pq5 pq5Var, oq5 oq5Var, String str6) {
        String valueOf;
        String str7;
        String concat;
        if (((Boolean) zzba.zzc().b(g93.y4)).booleanValue() && rp6.b()) {
            fq6 a = fq6.a(str5, str);
            eq6 g = g("javascript");
            eq6 g2 = g(str4);
            yp6 e = e(oq5Var.toString());
            eq6 eq6Var = eq6.NONE;
            if (g == eq6Var) {
                concat = "Omid js session error; Unable to parse impression owner: javascript";
            } else {
                if (e == null) {
                    valueOf = String.valueOf(oq5Var);
                    str7 = "Omid js session error; Unable to parse creative type: ";
                } else if (e != yp6.VIDEO || g2 != eq6Var) {
                    return nt0.g3(tp6.a(up6.a(e, f(pq5Var.toString()), g, g2, true), vp6.c(a, webView, str6, "")));
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
    public final void b(yd0 yd0Var, View view) {
        if (((Boolean) zzba.zzc().b(g93.y4)).booleanValue() && rp6.b()) {
            Object M = nt0.M(yd0Var);
            if (M instanceof tp6) {
                ((tp6) M).d(view);
            }
        }
    }

    @Override // com.daaw.nq5
    public final yd0 c(String str, WebView webView, String str2, String str3, String str4, pq5 pq5Var, oq5 oq5Var, String str5) {
        String valueOf;
        String str6;
        String concat;
        if (((Boolean) zzba.zzc().b(g93.y4)).booleanValue() && rp6.b()) {
            fq6 a = fq6.a("Google", str);
            eq6 g = g("javascript");
            yp6 e = e(oq5Var.toString());
            eq6 eq6Var = eq6.NONE;
            if (g == eq6Var) {
                concat = "Omid html session error; Unable to parse impression owner: javascript";
            } else {
                if (e == null) {
                    valueOf = String.valueOf(oq5Var);
                    str6 = "Omid html session error; Unable to parse creative type: ";
                } else {
                    eq6 g2 = g(str4);
                    if (e != yp6.VIDEO || g2 != eq6Var) {
                        return nt0.g3(tp6.a(up6.a(e, f(pq5Var.toString()), g, g2, true), vp6.b(a, webView, str5, "")));
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
    public final boolean d(Context context) {
        if (!((Boolean) zzba.zzc().b(g93.y4)).booleanValue()) {
            k04.zzj("Omid flag is disabled");
            return false;
        } else if (rp6.b()) {
            return true;
        } else {
            rp6.a(context);
            return rp6.b();
        }
    }

    @Override // com.daaw.nq5
    public final void zzd(yd0 yd0Var) {
        if (((Boolean) zzba.zzc().b(g93.y4)).booleanValue() && rp6.b()) {
            Object M = nt0.M(yd0Var);
            if (M instanceof tp6) {
                ((tp6) M).e();
            }
        }
    }
}
