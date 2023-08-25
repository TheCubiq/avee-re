package com.daaw;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class x45 {
    public final ia5 a;
    public final u85 b;
    public final nh4 c;
    public final r35 d;

    public x45(ia5 ia5Var, u85 u85Var, nh4 nh4Var, r35 r35Var) {
        this.a = ia5Var;
        this.b = u85Var;
        this.c = nh4Var;
        this.d = r35Var;
    }

    public final View a() {
        a74 a = this.a.a(zzq.zzc(), null, null);
        ((View) a).setVisibility(8);
        a.y("/sendMessageToSdk", new zg3() { // from class: com.daaw.r45
            @Override // com.daaw.zg3
            public final void a(Object obj, Map map) {
                x45.this.b((a74) obj, map);
            }
        });
        a.y("/adMuted", new zg3() { // from class: com.daaw.s45
            @Override // com.daaw.zg3
            public final void a(Object obj, Map map) {
                x45.this.c((a74) obj, map);
            }
        });
        this.b.j(new WeakReference(a), "/loadHtml", new zg3() { // from class: com.daaw.t45
            @Override // com.daaw.zg3
            public final void a(Object obj, final Map map) {
                final x45 x45Var = x45.this;
                a74 a74Var = (a74) obj;
                a74Var.zzP().E(new o84() { // from class: com.daaw.w45
                    @Override // com.daaw.o84
                    public final void zza(boolean z) {
                        x45.this.d(map, z);
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
        this.b.j(new WeakReference(a), "/showOverlay", new zg3() { // from class: com.daaw.u45
            @Override // com.daaw.zg3
            public final void a(Object obj, Map map) {
                x45.this.e((a74) obj, map);
            }
        });
        this.b.j(new WeakReference(a), "/hideOverlay", new zg3() { // from class: com.daaw.v45
            @Override // com.daaw.zg3
            public final void a(Object obj, Map map) {
                x45.this.f((a74) obj, map);
            }
        });
        return (View) a;
    }

    public final /* synthetic */ void b(a74 a74Var, Map map) {
        this.b.g("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void c(a74 a74Var, Map map) {
        this.d.zzg();
    }

    public final /* synthetic */ void d(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.b.g("sendMessageToNativeJs", hashMap);
    }

    public final /* synthetic */ void e(a74 a74Var, Map map) {
        k04.zzi("Showing native ads overlay.");
        a74Var.g().setVisibility(0);
        this.c.f(true);
    }

    public final /* synthetic */ void f(a74 a74Var, Map map) {
        k04.zzi("Hiding native ads overlay.");
        a74Var.g().setVisibility(8);
        this.c.f(false);
    }
}
