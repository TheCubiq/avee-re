package com.daaw;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import com.daaw.C3880zn;
import java.util.ArrayList;
/* renamed from: com.daaw.co */
/* loaded from: classes.dex */
public final class C0972co {

    /* renamed from: a */
    public final Intent f5979a;

    /* renamed from: b */
    public final Bundle f5980b;

    /* renamed from: com.daaw.co$a */
    /* loaded from: classes.dex */
    public static final class C0973a {

        /* renamed from: c */
        public ArrayList<Bundle> f5983c;

        /* renamed from: d */
        public Bundle f5984d;

        /* renamed from: e */
        public ArrayList<Bundle> f5985e;

        /* renamed from: f */
        public SparseArray<Bundle> f5986f;

        /* renamed from: g */
        public Bundle f5987g;

        /* renamed from: a */
        public final Intent f5981a = new Intent("android.intent.action.VIEW");

        /* renamed from: b */
        public final C3880zn.C3881a f5982b = new C3880zn.C3881a();

        /* renamed from: h */
        public int f5988h = 0;

        /* renamed from: i */
        public boolean f5989i = true;

        public C0973a() {
        }

        public C0973a(C1203eo c1203eo) {
            if (c1203eo != null) {
                m25192b(c1203eo);
            }
        }

        /* renamed from: a */
        public C0972co m25193a() {
            if (!this.f5981a.hasExtra("android.support.customtabs.extra.SESSION")) {
                m25191c(null, null);
            }
            ArrayList<Bundle> arrayList = this.f5983c;
            if (arrayList != null) {
                this.f5981a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f5985e;
            if (arrayList2 != null) {
                this.f5981a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f5981a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f5989i);
            this.f5981a.putExtras(this.f5982b.m2105a().m2106a());
            Bundle bundle = this.f5987g;
            if (bundle != null) {
                this.f5981a.putExtras(bundle);
            }
            if (this.f5986f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f5986f);
                this.f5981a.putExtras(bundle2);
            }
            this.f5981a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f5988h);
            return new C0972co(this.f5981a, this.f5984d);
        }

        /* renamed from: b */
        public C0973a m25192b(C1203eo c1203eo) {
            this.f5981a.setPackage(c1203eo.m23342b().getPackageName());
            m25191c(c1203eo.m23343a(), c1203eo.m23341c());
            return this;
        }

        /* renamed from: c */
        public final void m25191c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            C3686yc.m3872b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f5981a.putExtras(bundle);
        }
    }

    public C0972co(Intent intent, Bundle bundle) {
        this.f5979a = intent;
        this.f5980b = bundle;
    }

    /* renamed from: a */
    public void m25194a(Context context, Uri uri) {
        this.f5979a.setData(uri);
        C3866zk.m2174i(context, this.f5979a, this.f5980b);
    }
}
