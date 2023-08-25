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
/* renamed from: com.daaw.bo */
/* loaded from: classes.dex */
public class C0875bo {

    /* renamed from: a */
    public final yc0 f4986a;

    /* renamed from: b */
    public final ComponentName f4987b;

    /* renamed from: c */
    public final Context f4988c;

    /* renamed from: com.daaw.bo$a */
    /* loaded from: classes.dex */
    public class BinderC0876a extends xc0.AbstractBinderC3524a {

        /* renamed from: p */
        public Handler f4989p = new Handler(Looper.getMainLooper());

        public BinderC0876a(C0652ao c0652ao) {
        }

        @Override // com.daaw.xc0
        /* renamed from: J2 */
        public void mo5290J2(String str, Bundle bundle) {
        }

        @Override // com.daaw.xc0
        /* renamed from: P0 */
        public Bundle mo5289P0(String str, Bundle bundle) {
            return null;
        }

        @Override // com.daaw.xc0
        /* renamed from: Q1 */
        public void mo5288Q1(String str, Bundle bundle) {
        }

        @Override // com.daaw.xc0
        /* renamed from: R2 */
        public void mo5287R2(Bundle bundle) {
        }

        @Override // com.daaw.xc0
        /* renamed from: T2 */
        public void mo5286T2(int i, Uri uri, boolean z, Bundle bundle) {
        }

        @Override // com.daaw.xc0
        /* renamed from: m2 */
        public void mo5285m2(int i, Bundle bundle) {
        }
    }

    public C0875bo(yc0 yc0Var, ComponentName componentName, Context context) {
        this.f4986a = yc0Var;
        this.f4987b = componentName;
        this.f4988c = context;
    }

    /* renamed from: a */
    public static boolean m25971a(Context context, String str, AbstractServiceConnectionC1116do abstractServiceConnectionC1116do) {
        abstractServiceConnectionC1116do.m24198b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, abstractServiceConnectionC1116do, 33);
    }

    /* renamed from: b */
    public final xc0.AbstractBinderC3524a m25970b(C0652ao c0652ao) {
        return new BinderC0876a(c0652ao);
    }

    /* renamed from: c */
    public C1203eo m25969c(C0652ao c0652ao) {
        return m25968d(c0652ao, null);
    }

    /* renamed from: d */
    public final C1203eo m25968d(C0652ao c0652ao, PendingIntent pendingIntent) {
        boolean mo3865o0;
        xc0.AbstractBinderC3524a m25970b = m25970b(c0652ao);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                mo3865o0 = this.f4986a.mo3866h2(m25970b, bundle);
            } else {
                mo3865o0 = this.f4986a.mo3865o0(m25970b);
            }
            if (mo3865o0) {
                return new C1203eo(this.f4986a, m25970b, this.f4987b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public boolean m25967e(long j) {
        try {
            return this.f4986a.mo3867e1(j);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
