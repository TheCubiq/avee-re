package com.daaw;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import com.daaw.zn;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class co {
    public final Intent a;
    public final Bundle b;

    /* loaded from: classes.dex */
    public static final class a {
        public ArrayList<Bundle> c;
        public Bundle d;
        public ArrayList<Bundle> e;
        public SparseArray<Bundle> f;
        public Bundle g;
        public final Intent a = new Intent("android.intent.action.VIEW");
        public final zn.a b = new zn.a();
        public int h = 0;
        public boolean i = true;

        public a() {
        }

        public a(eo eoVar) {
            if (eoVar != null) {
                b(eoVar);
            }
        }

        public co a() {
            if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c(null, null);
            }
            ArrayList<Bundle> arrayList = this.c;
            if (arrayList != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.e;
            if (arrayList2 != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.i);
            this.a.putExtras(this.b.a().a());
            Bundle bundle = this.g;
            if (bundle != null) {
                this.a.putExtras(bundle);
            }
            if (this.f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f);
                this.a.putExtras(bundle2);
            }
            this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.h);
            return new co(this.a, this.d);
        }

        public a b(eo eoVar) {
            this.a.setPackage(eoVar.b().getPackageName());
            c(eoVar.a(), eoVar.c());
            return this;
        }

        public final void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            yc.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.a.putExtras(bundle);
        }
    }

    public co(Intent intent, Bundle bundle) {
        this.a = intent;
        this.b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.a.setData(uri);
        zk.i(context, this.a, this.b);
    }
}
