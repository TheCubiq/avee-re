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
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final ArrayList h;
    public final String i;
    public final String j;
    public final String k;
    public final boolean l;
    public final String m;
    public final long n;
    public final boolean o;

    public n76(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z6, String str6, long j, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = str2;
        this.h = arrayList;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = z6;
        this.m = str6;
        this.n = j;
        this.o = z7;
    }

    @Override // com.daaw.h76
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.a);
        bundle.putBoolean("coh", this.b);
        bundle.putString("gl", this.c);
        bundle.putBoolean("simulator", this.d);
        bundle.putBoolean("is_latchsky", this.e);
        bundle.putBoolean("is_sidewinder", this.f);
        bundle.putString("hl", this.g);
        if (!this.h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.h);
        }
        bundle.putString("mv", this.i);
        bundle.putString("submodel", this.m);
        Bundle a = cj6.a(bundle, "device");
        bundle.putBundle("device", a);
        a.putString("build", this.k);
        a.putLong("remaining_data_partition_space", this.n);
        Bundle a2 = cj6.a(a, "browser");
        a.putBundle("browser", a2);
        a2.putBoolean("is_browser_custom_tabs_capable", this.l);
        if (!TextUtils.isEmpty(this.j)) {
            Bundle a3 = cj6.a(a, "play_store");
            a.putBundle("play_store", a3);
            a3.putString("package_version", this.j);
        }
        if (((Boolean) zzba.zzc().b(g93.s9)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.o);
        }
        if (((Boolean) zzba.zzc().b(g93.q9)).booleanValue()) {
            bundle.putBoolean("gotmt_l", ((Boolean) zzba.zzc().b(g93.n9)).booleanValue());
            bundle.putBoolean("gotmt_i", ((Boolean) zzba.zzc().b(g93.m9)).booleanValue());
        }
    }
}
