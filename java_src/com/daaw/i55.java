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

    /* renamed from: a */
    public final ia5 f13281a;

    /* renamed from: b */
    public final u85 f13282b;

    /* renamed from: c */
    public ViewTreeObserver.OnScrollChangedListener f13283c = null;

    public i55(ia5 ia5Var, u85 u85Var) {
        this.f13281a = ia5Var;
        this.f13282b = u85Var;
    }

    /* renamed from: f */
    public static final int m20113f(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        zzay.zzb();
        return d04.m24833D(context, i);
    }

    /* renamed from: a */
    public final View m20118a(final View view, final WindowManager windowManager) {
        a74 m20001a = this.f13281a.m20001a(zzq.zzc(), null, null);
        View view2 = (View) m20001a;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        m20001a.mo6392y("/sendMessageToSdk", new zg3() { // from class: com.daaw.b55
            @Override // com.daaw.zg3
            /* renamed from: a */
            public final void mo2341a(Object obj, Map map) {
                i55.this.m20117b((a74) obj, map);
            }
        });
        m20001a.mo6392y("/hideValidatorOverlay", new zg3() { // from class: com.daaw.c55
            @Override // com.daaw.zg3
            /* renamed from: a */
            public final void mo2341a(Object obj, Map map) {
                i55.this.m20116c(windowManager, view, (a74) obj, map);
            }
        });
        m20001a.mo6392y("/open", new jh3(null, null, null, null, null));
        this.f13282b.m8424j(new WeakReference(m20001a), "/loadNativeAdPolicyViolations", new zg3() { // from class: com.daaw.d55
            @Override // com.daaw.zg3
            /* renamed from: a */
            public final void mo2341a(Object obj, Map map) {
                i55.this.m20114e(view, windowManager, (a74) obj, map);
            }
        });
        this.f13282b.m8424j(new WeakReference(m20001a), "/showValidatorOverlay", new zg3() { // from class: com.daaw.e55
            @Override // com.daaw.zg3
            /* renamed from: a */
            public final void mo2341a(Object obj, Map map) {
                k04.zze("Show native ad policy validator overlay.");
                ((a74) obj).mo6418g().setVisibility(0);
            }
        });
        return (View) m20001a;
    }

    /* renamed from: b */
    public final /* synthetic */ void m20117b(a74 a74Var, Map map) {
        this.f13282b.m8427g("sendMessageToNativeJs", map);
    }

    /* renamed from: c */
    public final /* synthetic */ void m20116c(WindowManager windowManager, View view, a74 a74Var, Map map) {
        k04.zze("Hide native ad policy validator overlay.");
        a74Var.mo6418g().setVisibility(8);
        if (a74Var.mo6418g().getWindowToken() != null) {
            windowManager.removeView(a74Var.mo6418g());
        }
        a74Var.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.f13283c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.f13283c);
    }

    /* renamed from: d */
    public final /* synthetic */ void m20115d(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f13282b.m8427g("sendMessageToNativeJs", hashMap);
    }

    /* renamed from: e */
    public final /* synthetic */ void m20114e(final View view, final WindowManager windowManager, final a74 a74Var, final Map map) {
        a74Var.zzP().mo9454E(new o84() { // from class: com.daaw.z45
            @Override // com.daaw.o84
            public final void zza(boolean z) {
                i55.this.m20115d(map, z);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int m20113f = m20113f(context, (String) map.get("validator_width"), ((Integer) zzba.zzc().m23658b(g93.f10761m7)).intValue());
        int m20113f2 = m20113f(context, (String) map.get("validator_height"), ((Integer) zzba.zzc().m23658b(g93.f10772n7)).intValue());
        int m20113f3 = m20113f(context, (String) map.get("validator_x"), 0);
        int m20113f4 = m20113f(context, (String) map.get("validator_y"), 0);
        a74Var.mo6440Q(v84.m7336b(m20113f, m20113f2));
        try {
            a74Var.mo6416h().getSettings().setUseWideViewPort(((Boolean) zzba.zzc().m23658b(g93.f10783o7)).booleanValue());
            a74Var.mo6416h().getSettings().setLoadWithOverviewMode(((Boolean) zzba.zzc().m23658b(g93.f10794p7)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams zzb = zzbx.zzb();
        zzb.x = m20113f3;
        zzb.y = m20113f4;
        windowManager.updateViewLayout(a74Var.mo6418g(), zzb);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = (("1".equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - m20113f4;
            this.f13283c = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.daaw.a55
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    View view2 = view;
                    a74 a74Var2 = a74Var;
                    String str2 = str;
                    WindowManager.LayoutParams layoutParams = zzb;
                    int i2 = i;
                    WindowManager windowManager2 = windowManager;
                    Rect rect2 = new Rect();
                    if (!view2.getGlobalVisibleRect(rect2) || a74Var2.mo6418g().getWindowToken() == null) {
                        return;
                    }
                    layoutParams.y = (("1".equals(str2) || "2".equals(str2)) ? rect2.bottom : rect2.top) - i2;
                    windowManager2.updateViewLayout(a74Var2.mo6418g(), layoutParams);
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.f13283c);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        a74Var.loadUrl(str2);
    }
}
