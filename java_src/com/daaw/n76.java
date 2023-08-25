package com.daaw;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class n76 implements h76 {

    /* renamed from: a */
    public final boolean f19555a;

    /* renamed from: b */
    public final boolean f19556b;

    /* renamed from: c */
    public final String f19557c;

    /* renamed from: d */
    public final boolean f19558d;

    /* renamed from: e */
    public final boolean f19559e;

    /* renamed from: f */
    public final boolean f19560f;

    /* renamed from: g */
    public final String f19561g;

    /* renamed from: h */
    public final ArrayList f19562h;

    /* renamed from: i */
    public final String f19563i;

    /* renamed from: j */
    public final String f19564j;

    /* renamed from: k */
    public final String f19565k;

    /* renamed from: l */
    public final boolean f19566l;

    /* renamed from: m */
    public final String f19567m;

    /* renamed from: n */
    public final long f19568n;

    /* renamed from: o */
    public final boolean f19569o;

    public n76(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z6, String str6, long j, boolean z7) {
        this.f19555a = z;
        this.f19556b = z2;
        this.f19557c = str;
        this.f19558d = z3;
        this.f19559e = z4;
        this.f19560f = z5;
        this.f19561g = str2;
        this.f19562h = arrayList;
        this.f19563i = str3;
        this.f19564j = str4;
        this.f19565k = str5;
        this.f19566l = z6;
        this.f19567m = str6;
        this.f19568n = j;
        this.f19569o = z7;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.f19555a);
        bundle.putBoolean("coh", this.f19556b);
        bundle.putString("gl", this.f19557c);
        bundle.putBoolean("simulator", this.f19558d);
        bundle.putBoolean("is_latchsky", this.f19559e);
        bundle.putBoolean("is_sidewinder", this.f19560f);
        bundle.putString("hl", this.f19561g);
        if (!this.f19562h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.f19562h);
        }
        bundle.putString("mv", this.f19563i);
        bundle.putString("submodel", this.f19567m);
        Bundle m25318a = cj6.m25318a(bundle, "device");
        bundle.putBundle("device", m25318a);
        m25318a.putString("build", this.f19565k);
        m25318a.putLong("remaining_data_partition_space", this.f19568n);
        Bundle m25318a2 = cj6.m25318a(m25318a, "browser");
        m25318a.putBundle("browser", m25318a2);
        m25318a2.putBoolean("is_browser_custom_tabs_capable", this.f19566l);
        if (!TextUtils.isEmpty(this.f19564j)) {
            Bundle m25318a3 = cj6.m25318a(m25318a, "play_store");
            m25318a.putBundle("play_store", m25318a3);
            m25318a3.putString("package_version", this.f19564j);
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10829s9)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.f19569o);
        }
        if (((Boolean) zzba.zzc().m23658b(g93.f10807q9)).booleanValue()) {
            bundle.putBoolean("gotmt_l", ((Boolean) zzba.zzc().m23658b(g93.f10774n9)).booleanValue());
            bundle.putBoolean("gotmt_i", ((Boolean) zzba.zzc().m23658b(g93.f10763m9)).booleanValue());
        }
    }
}
