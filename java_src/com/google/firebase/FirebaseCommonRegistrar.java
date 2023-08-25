package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.daaw.C0989cr;
import com.daaw.C1131ds;
import com.daaw.C3330vh;
import com.daaw.kj0;
import com.daaw.li0;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* renamed from: e */
    public static /* synthetic */ String m91e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* renamed from: f */
    public static /* synthetic */ String m90f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    /* renamed from: g */
    public static /* synthetic */ String m89g(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : (i < 20 || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) ? (i < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded" : "auto" : "watch";
    }

    /* renamed from: h */
    public static /* synthetic */ String m88h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? m87i(installerPackageName) : "";
    }

    /* renamed from: i */
    public static String m87i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C3330vh<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C1131ds.m24017c());
        arrayList.add(C0989cr.m25102f());
        arrayList.add(kj0.m17708b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(kj0.m17708b("fire-core", "20.3.0"));
        arrayList.add(kj0.m17708b("device-name", m87i(Build.PRODUCT)));
        arrayList.add(kj0.m17708b("device-model", m87i(Build.DEVICE)));
        arrayList.add(kj0.m17708b("device-brand", m87i(Build.BRAND)));
        arrayList.add(kj0.m17707c("android-target-sdk", new kj0.InterfaceC1954a() { // from class: com.daaw.u10
            @Override // com.daaw.kj0.InterfaceC1954a
            /* renamed from: a */
            public final String mo6592a(Object obj) {
                String m91e;
                m91e = FirebaseCommonRegistrar.m91e((Context) obj);
                return m91e;
            }
        }));
        arrayList.add(kj0.m17707c("android-min-sdk", new kj0.InterfaceC1954a() { // from class: com.daaw.v10
            @Override // com.daaw.kj0.InterfaceC1954a
            /* renamed from: a */
            public final String mo6592a(Object obj) {
                String m90f;
                m90f = FirebaseCommonRegistrar.m90f((Context) obj);
                return m90f;
            }
        }));
        arrayList.add(kj0.m17707c("android-platform", new kj0.InterfaceC1954a() { // from class: com.daaw.w10
            @Override // com.daaw.kj0.InterfaceC1954a
            /* renamed from: a */
            public final String mo6592a(Object obj) {
                String m89g;
                m89g = FirebaseCommonRegistrar.m89g((Context) obj);
                return m89g;
            }
        }));
        arrayList.add(kj0.m17707c("android-installer", new kj0.InterfaceC1954a() { // from class: com.daaw.t10
            @Override // com.daaw.kj0.InterfaceC1954a
            /* renamed from: a */
            public final String mo6592a(Object obj) {
                String m88h;
                m88h = FirebaseCommonRegistrar.m88h((Context) obj);
                return m88h;
            }
        }));
        String m16943a = li0.m16943a();
        if (m16943a != null) {
            arrayList.add(kj0.m17708b("kotlin", m16943a));
        }
        return arrayList;
    }
}
