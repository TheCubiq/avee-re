package com.daaw;

import android.app.Notification;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import com.daaw.dt0;
import java.util.List;
/* loaded from: classes.dex */
public class ft0 {
    public static final Object a = new Object();
    public static final Object b = new Object();

    public static SparseArray<Bundle> a(List<Bundle> list) {
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

    public static Bundle b(dt0.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat e = aVar.e();
        bundle.putInt("icon", e != null ? e.h() : 0);
        bundle.putCharSequence("title", aVar.i());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", d(aVar.f()));
        bundle.putBoolean("showsUserInterface", aVar.h());
        bundle.putInt("semanticAction", aVar.g());
        return bundle;
    }

    public static Bundle c(s31 s31Var) {
        new Bundle();
        throw null;
    }

    public static Bundle[] d(s31[] s31VarArr) {
        if (s31VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[s31VarArr.length];
        for (int i = 0; i < s31VarArr.length; i++) {
            s31 s31Var = s31VarArr[i];
            bundleArr[i] = c(null);
        }
        return bundleArr;
    }

    public static Bundle e(Notification.Builder builder, dt0.a aVar) {
        IconCompat e = aVar.e();
        builder.addAction(e != null ? e.h() : 0, aVar.i(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", d(aVar.f()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", d(aVar.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        return bundle;
    }
}
