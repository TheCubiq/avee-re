package com.google.android.gms.ads.internal.client;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
/* loaded from: classes.dex */
public final class zzek extends ContentProvider {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0028 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.content.ContentProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void attachInfo(android.content.Context r6, android.content.pm.ProviderInfo r7) {
        /*
            r5 = this;
            r0 = 0
            com.daaw.iv0 r1 = com.daaw.ez1.a(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12 java.lang.NullPointerException -> L16
            java.lang.String r2 = r6.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12 java.lang.NullPointerException -> L16
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r1.c(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12 java.lang.NullPointerException -> L16
            android.os.Bundle r0 = r1.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L12 java.lang.NullPointerException -> L16
            goto L1c
        L12:
            r1 = move-exception
            java.lang.String r2 = "Failed to load metadata: Package name not found."
            goto L19
        L16:
            r1 = move-exception
            java.lang.String r2 = "Failed to load metadata: Null pointer exception."
        L19:
            com.daaw.k04.zzh(r2, r1)
        L1c:
            com.daaw.tm3 r1 = com.daaw.tm3.a()
            if (r0 != 0) goto L28
            java.lang.String r1 = "Metadata was null."
            com.daaw.k04.zzg(r1)
            goto L7a
        L28:
            java.lang.String r2 = "com.google.android.gms.ads.APPLICATION_ID"
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.ClassCastException -> Lb6
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.ClassCastException -> Lb6
            java.lang.String r3 = "com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT"
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.ClassCastException -> Lad
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.ClassCastException -> Lad
            java.lang.String r4 = "com.google.android.gms.ads.INTEGRATION_MANAGER"
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.ClassCastException -> La4
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.ClassCastException -> La4
            if (r2 == 0) goto L67
            java.lang.String r4 = "^ca-app-pub-[0-9]{16}~[0-9]{10}$"
            boolean r4 = r2.matches(r4)
            if (r4 == 0) goto L5f
            java.lang.String r4 = "Publisher provided Google AdMob App ID in manifest: "
            java.lang.String r4 = r4.concat(r2)
            com.daaw.k04.zze(r4)
            if (r3 == 0) goto L5b
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L7a
        L5b:
            r1.b(r6, r2)
            goto L7a
        L5f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "\n\n******************************************************************************\n* Invalid application ID. Follow instructions here:                          *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to find your app ID.                                                       *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n"
            r6.<init>(r7)
            throw r6
        L67:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L9c
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r2 = "The Google Mobile Ads SDK is integrated by "
            java.lang.String r1 = r2.concat(r1)
            com.daaw.k04.zze(r1)
        L7a:
            if (r0 != 0) goto L7d
            goto L98
        L7d:
            java.lang.String r1 = "com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION"
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            java.lang.String r3 = "com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING"
            boolean r0 = r0.getBoolean(r3, r2)
            if (r1 == 0) goto L91
            java.lang.String r1 = "com.google.android.gms.ads.flag.OPTIMIZE_INITIALIZATION is enabled"
            com.daaw.k04.zze(r1)
        L91:
            if (r0 == 0) goto L98
            java.lang.String r0 = "com.google.android.gms.ads.flag.OPTIMIZE_AD_LOADING is enabled"
            com.daaw.k04.zze(r0)
        L98:
            super.attachInfo(r6, r7)
            return
        L9c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "\n\n******************************************************************************\n* The Google Mobile Ads SDK was initialized incorrectly. AdMob publishers    *\n* should follow the instructions here:                                       *\n* https://googlemobileadssdk.page.link/admob-android-update-manifest         *\n* to add a valid App ID inside the AndroidManifest.                          *\n* Google Ad Manager publishers should follow instructions here:              *\n* https://googlemobileadssdk.page.link/ad-manager-android-update-manifest.   *\n******************************************************************************\n\n"
            r6.<init>(r7)
            throw r6
        La4:
            r6 = move-exception
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "The com.google.android.gms.ads.INTEGRATION_MANAGER metadata must have a String value."
            r7.<init>(r0, r6)
            throw r7
        Lad:
            r6 = move-exception
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "The com.google.android.gms.ads.DELAY_APP_MEASUREMENT_INIT metadata must have a boolean value."
            r7.<init>(r0, r6)
            throw r7
        Lb6:
            r6 = move-exception
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "The com.google.android.gms.ads.APPLICATION_ID metadata must have a String value."
            r7.<init>(r0, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.zzek.attachInfo(android.content.Context, android.content.pm.ProviderInfo):void");
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
