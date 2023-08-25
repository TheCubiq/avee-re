package com.daaw;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class pv6 {
    public static final int a;
    public static final ClipData b;

    static {
        a = Build.VERSION.SDK_INT > 22 ? 67108864 : 0;
        b = ClipData.newIntent("", new Intent());
    }

    @Nullable
    public static PendingIntent a(Context context, int i, Intent intent, int i2, int i3) {
        boolean z = true;
        sy6.f((i2 & 95) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        sy6.f(intent.getComponent() != null, "Must set component on Intent.");
        if (b(0, 1)) {
            sy6.f(!b(i2, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !b(i2, 67108864)) {
                z = false;
            }
            sy6.f(z, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !b(i2, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!b(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!b(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!b(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!b(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(b);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i2);
    }

    public static boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
