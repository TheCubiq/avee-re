package com.daaw;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzbx;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class i55 {
    public final ia5 a;
    public final u85 b;
    public ViewTreeObserver.OnScrollChangedListener c = null;

    public i55(ia5 ia5Var, u85 u85Var) {
        this.a = ia5Var;
        this.b = u85Var;
    }

    public static final int f(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        zzay.zzb();
        return d04.D(context, i);
    }

    public final View a(final View view, final WindowManager windowManager) {
        a74 a = this.a.a(zzq.zzc(), null, null);
        View view2 = (View) a;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        a.y("/sendMessageToSdk", new zg3() { // from class: com.daaw.b55
            @Override // com.daaw.zg3
            public final void a(Object obj, Map map) {
                i55.this.b((a74) obj, map);
            }
        });
        a.y("/hideValidatorOverlay", new zg3() { // from class: com.daaw.c55
            @Override // com.daaw.zg3
            public final void a(Object obj, Map map) {
                i55.this.c(windowManager, view, (a74) obj, map);
            }
        });
        a.y("/open", new jh3(null, null, null, null, null));
        this.b.j(new WeakReference(a), "/loadNativeAdPolicyViolations", new zg3() { // from class: com.daaw.d55
            @Override // com.daaw.zg3
            public final void a(Object obj, Map map) {
                i55.this.e(view, windowManager, (a74) obj, map);
            }
        });
        this.b.j(new WeakReference(a), "/showValidatorOverlay", new zg3() { // from class: com.daaw.e55
            @Override // com.daaw.zg3
            public final void a(Object obj, Map map) {
                k04.zze("Show native ad policy validator overlay.");
                ((a74) obj).g().setVisibility(0);
            }
        });
        return (View) a;
    }

    public final /* synthetic */ void b(a74 a74Var, Map map) {
        this.b.g("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void c(WindowManager windowManager, View view, a74 a74Var, Map map) {
        k04.zze("Hide native ad policy validator overlay.");
        a74Var.g().setVisibility(8);
        if (a74Var.g().getWindowToken() != null) {
            windowManager.removeView(a74Var.g());
        }
        a74Var.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.c);
    }

    public final /* synthetic */ void d(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.b.g("sendMessageToNativeJs", hashMap);
    }

    public final /* synthetic */ void e(final View view, final WindowManager windowManager, final a74 a74Var, final Map map) {
        a74Var.zzP().E(new o84() { // from class: com.daaw.z45
            @Override // com.daaw.o84
            public final void zza(boolean z) {
                i55.this.d(map, z);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int f = f(context, (String) map.get("validator_width"), ((Integer) zzba.zzc().b(g93.m7)).intValue());
        int f2 = f(context, (String) map.get("validator_height"), ((Integer) zzba.zzc().b(g93.n7)).intValue());
        int f3 = f(context, (String) map.get("validator_x"), 0);
        int f4 = f(context, (String) map.get("validator_y"), 0);
        a74Var.Q(v84.b(f, f2));
        try {
            a74Var.h().getSettings().setUseWideViewPort(((Boolean) zzba.zzc().b(g93.o7)).booleanValue());
            a74Var.h().getSettings().setLoadWithOverviewMode(((Boolean) zzba.zzc().b(g93.p7)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams zzb = zzbx.zzb();
        zzb.x = f3;
        zzb.y = f4;
        windowManager.updateViewLayout(a74Var.g(), zzb);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - f4;
            this.c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.daaw.a55
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = view;
                    a74 a74Var2 = a74Var;
                    String str2 = str;
                    WindowManager.LayoutParams layoutParams = zzb;
                    int i2 = i;
                    WindowManager windowManager2 = windowManager;
                    Rect rect2 = new Rect();
                    if (!view2.getGlobalVisibleRect(rect2) || a74Var2.g().getWindowToken() == null) {
                        return;
                    }
                    layoutParams.y = (("1".equals(str2) || "2".equals(str2)) ? rect2.bottom : rect2.top) - i2;
                    windowManager2.updateViewLayout(a74Var2.g(), layoutParams);
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.c);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        a74Var.loadUrl(str2);
    }
}
