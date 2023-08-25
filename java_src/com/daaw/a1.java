package com.daaw;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;
/* loaded from: classes.dex */
public final class a1 {
    public static final a a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(pq pqVar) {
            this();
        }

        public final RequestConfiguration a() {
            RequestConfiguration build = new RequestConfiguration.Builder().build();
            ug0.e(build, "Builder().build()");
            return build;
        }

        public final AdRequest b() {
            AdRequest build = new AdRequest.Builder().build();
            ug0.e(build, "Builder().build()");
            return build;
        }
    }
}
