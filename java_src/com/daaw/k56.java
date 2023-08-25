package com.daaw;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
/* loaded from: classes.dex */
public final class k56 implements i76, h76 {

    /* renamed from: a */
    public final ApplicationInfo f15689a;

    /* renamed from: b */
    public final PackageInfo f15690b;

    public k56(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.f15689a = applicationInfo;
        this.f15690b = packageInfo;
    }

    @Override // com.daaw.h76
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2851b(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f15689a.packageName;
        PackageInfo packageInfo = this.f15690b;
        Integer valueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
        }
        PackageInfo packageInfo2 = this.f15690b;
        String str2 = packageInfo2 != null ? packageInfo2.versionName : null;
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
    }

    @Override // com.daaw.i76
    public final int zza() {
        return 29;
    }

    @Override // com.daaw.i76
    public final f77 zzb() {
        return s67.m10634i(this);
    }
}
