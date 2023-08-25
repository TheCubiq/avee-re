package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.daaw.cr;
import com.daaw.ds;
import com.daaw.kj0;
import com.daaw.li0;
import com.daaw.vh;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    public static /* synthetic */ String f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    public static /* synthetic */ String g(Context context) {
        int i = Build.VERSION.SDK_INT;
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : (i < 20 || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) ? (i < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded" : "auto" : "watch";
    }

    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : "";
    }

    public static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<vh<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ds.c());
        arrayList.add(cr.f());
        arrayList.add(kj0.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(kj0.b("fire-core", "20.3.0"));
        arrayList.add(kj0.b("device-name", i(Build.PRODUCT)));
        arrayList.add(kj0.b("device-model", i(Build.DEVICE)));
        arrayList.add(kj0.b("device-brand", i(Build.BRAND)));
        arrayList.add(kj0.c("android-target-sdk", new kj0.a() { // from class: com.daaw.u10
            @Override // com.daaw.kj0.a
            public final String a(Object obj) {
                String e;
                e = FirebaseCommonRegistrar.e((Context) obj);
                return e;
            }
        }));
        arrayList.add(kj0.c("android-min-sdk", new kj0.a() { // from class: com.daaw.v10
            @Override // com.daaw.kj0.a
            public final String a(Object obj) {
                String f;
                f = FirebaseCommonRegistrar.f((Context) obj);
                return f;
            }
        }));
        arrayList.add(kj0.c("android-platform", new kj0.a() { // from class: com.daaw.w10
            @Override // com.daaw.kj0.a
            public final String a(Object obj) {
                String g;
                g = FirebaseCommonRegistrar.g((Context) obj);
                return g;
            }
        }));
        arrayList.add(kj0.c("android-installer", new kj0.a() { // from class: com.daaw.t10
            @Override // com.daaw.kj0.a
            public final String a(Object obj) {
                String h;
                h = FirebaseCommonRegistrar.h((Context) obj);
                return h;
            }
        }));
        String a = li0.a();
        if (a != null) {
            arrayList.add(kj0.b("kotlin", a));
        }
        return arrayList;
    }
}
