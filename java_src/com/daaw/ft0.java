package com.daaw;

import android.app.Notification;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import com.daaw.dt0;
import java.util.List;
/* loaded from: classes.dex */
public class ft0 {

    /* renamed from: a */
    public static final Object f9883a = new Object();

    /* renamed from: b */
    public static final Object f9884b = new Object();

    /* renamed from: a */
    public static SparseArray<Bundle> m22309a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: b */
    public static Bundle m22308b(dt0.C1133a c1133a) {
        Bundle bundle = new Bundle();
        IconCompat m23986e = c1133a.m23986e();
        bundle.putInt("icon", m23986e != null ? m23986e.m29725h() : 0);
        bundle.putCharSequence("title", c1133a.m23982i());
        bundle.putParcelable("actionIntent", c1133a.m23990a());
        Bundle bundle2 = c1133a.m23987d() != null ? new Bundle(c1133a.m23987d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", c1133a.m23989b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m22306d(c1133a.m23985f()));
        bundle.putBoolean("showsUserInterface", c1133a.m23983h());
        bundle.putInt("semanticAction", c1133a.m23984g());
        return bundle;
    }

    /* renamed from: c */
    public static Bundle m22307c(s31 s31Var) {
        new Bundle();
        throw null;
    }

    /* renamed from: d */
    public static Bundle[] m22306d(s31[] s31VarArr) {
        if (s31VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[s31VarArr.length];
        for (int i = 0; i < s31VarArr.length; i++) {
            s31 s31Var = s31VarArr[i];
            bundleArr[i] = m22307c(null);
        }
        return bundleArr;
    }

    /* renamed from: e */
    public static Bundle m22305e(Notification.Builder builder, dt0.C1133a c1133a) {
        IconCompat m23986e = c1133a.m23986e();
        builder.addAction(m23986e != null ? m23986e.m29725h() : 0, c1133a.m23982i(), c1133a.m23990a());
        Bundle bundle = new Bundle(c1133a.m23987d());
        if (c1133a.m23985f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m22306d(c1133a.m23985f()));
        }
        if (c1133a.m23988c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m22306d(c1133a.m23988c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", c1133a.m23989b());
        return bundle;
    }
}
