package com.daaw;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.daaw.xc0;
/* loaded from: classes.dex */
public class bo {
    public final yc0 a;
    public final ComponentName b;
    public final Context c;

    /* loaded from: classes.dex */
    public class a extends xc0.a {
        public Handler p = new Handler(Looper.getMainLooper());

        public a(ao aoVar) {
        }

        @Override // com.daaw.xc0
        public void J2(String str, Bundle bundle) {
        }

        @Override // com.daaw.xc0
        public Bundle P0(String str, Bundle bundle) {
            return null;
        }

        @Override // com.daaw.xc0
        public void Q1(String str, Bundle bundle) {
        }

        @Override // com.daaw.xc0
        public void R2(Bundle bundle) {
        }

        @Override // com.daaw.xc0
        public void T2(int i, Uri uri, boolean z, Bundle bundle) {
        }

        @Override // com.daaw.xc0
        public void m2(int i, Bundle bundle) {
        }
    }

    public bo(yc0 yc0Var, ComponentName componentName, Context context) {
        this.a = yc0Var;
        this.b = componentName;
        this.c = context;
    }

    public static boolean a(Context context, String str, Cdo cdo) {
        cdo.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, cdo, 33);
    }

    public final xc0.a b(ao aoVar) {
        return new a(aoVar);
    }

    public eo c(ao aoVar) {
        return d(aoVar, null);
    }

    public final eo d(ao aoVar, PendingIntent pendingIntent) {
        boolean o0;
        xc0.a b = b(aoVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                o0 = this.a.h2(b, bundle);
            } else {
                o0 = this.a.o0(b);
            }
            if (o0) {
                return new eo(this.a, b, this.b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public boolean e(long j) {
        try {
            return this.a.e1(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
