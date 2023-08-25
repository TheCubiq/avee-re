package com.daaw;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class x45 {

    /* renamed from: a */
    public final ia5 f32093a;

    /* renamed from: b */
    public final u85 f32094b;

    /* renamed from: c */
    public final nh4 f32095c;

    /* renamed from: d */
    public final r35 f32096d;

    public x45(ia5 ia5Var, u85 u85Var, nh4 nh4Var, r35 r35Var) {
        this.f32093a = ia5Var;
        this.f32094b = u85Var;
        this.f32095c = nh4Var;
        this.f32096d = r35Var;
    }

    /* renamed from: a */
    public final View m5539a() {
        a74 m20001a = this.f32093a.m20001a(zzq.zzc(), null, null);
        ((View) m20001a).setVisibility(8);
        m20001a.mo6392y("/sendMessageToSdk", new zg3() { // from class: com.daaw.r45
            @Override // com.daaw.zg3
            /* renamed from: a */
            public final void mo2341a(Object obj, Map map) {
                x45.this.m5538b((a74) obj, map);
            }
        });
        m20001a.mo6392y("/adMuted", new zg3() { // from class: com.daaw.s45
            @Override // com.daaw.zg3
            /* renamed from: a */
            public final void mo2341a(Object obj, Map map) {
                x45.this.m5537c((a74) obj, map);
            }
        });
        this.f32094b.m8424j(new WeakReference(m20001a), "/loadHtml", new zg3() { // from class: com.daaw.t45
            @Override // com.daaw.zg3
            /* renamed from: a */
            public final void mo2341a(Object obj, final Map map) {
                final x45 x45Var = x45.this;
                a74 a74Var = (a74) obj;
                a74Var.zzP().mo9454E(new o84() { // from class: com.daaw.w45
                    @Override // com.daaw.o84
                    public final void zza(boolean z) {
                        x45.this.m5536d(map, z);
                    }
                });
                String str = (String) map.get("overlayHtml");
                String str2 = (String) map.get("baseUrl");
                if (TextUtils.isEmpty(str2)) {
                    a74Var.loadData(str, "text/html", "UTF-8");
                } else {
                    a74Var.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                }
            }
        });
        this.f32094b.m8424j(new WeakReference(m20001a), "/showOverlay", new zg3() { // from class: com.daaw.u45
            @Override // com.daaw.zg3
            /* renamed from: a */
            public final void mo2341a(Object obj, Map map) {
                x45.this.m5535e((a74) obj, map);
            }
        });
        this.f32094b.m8424j(new WeakReference(m20001a), "/hideOverlay", new zg3() { // from class: com.daaw.v45
            @Override // com.daaw.zg3
            /* renamed from: a */
            public final void mo2341a(Object obj, Map map) {
                x45.this.m5534f((a74) obj, map);
            }
        });
        return (View) m20001a;
    }

    /* renamed from: b */
    public final /* synthetic */ void m5538b(a74 a74Var, Map map) {
        this.f32094b.m8427g("sendMessageToNativeJs", map);
    }

    /* renamed from: c */
    public final /* synthetic */ void m5537c(a74 a74Var, Map map) {
        this.f32096d.zzg();
    }

    /* renamed from: d */
    public final /* synthetic */ void m5536d(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.f32094b.m8427g("sendMessageToNativeJs", hashMap);
    }

    /* renamed from: e */
    public final /* synthetic */ void m5535e(a74 a74Var, Map map) {
        k04.zzi("Showing native ads overlay.");
        a74Var.mo6418g().setVisibility(0);
        this.f32095c.m15171f(true);
    }

    /* renamed from: f */
    public final /* synthetic */ void m5534f(a74 a74Var, Map map) {
        k04.zzi("Hiding native ads overlay.");
        a74Var.mo6418g().setVisibility(8);
        this.f32095c.m15171f(false);
    }
}
