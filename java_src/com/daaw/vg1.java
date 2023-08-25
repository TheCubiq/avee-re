package com.daaw;

import android.content.Context;
import android.net.Uri;
import java.io.InputStream;
/* loaded from: classes.dex */
public class vg1 extends hq1<InputStream> {

    /* loaded from: classes.dex */
    public static class a implements nq0<Uri, InputStream> {
        @Override // com.daaw.nq0
        public mq0<Uri, InputStream> a(Context context, d60 d60Var) {
            return new vg1(context, d60Var.a(o70.class, InputStream.class));
        }

        @Override // com.daaw.nq0
        public void b() {
        }
    }

    public vg1(Context context, mq0<o70, InputStream> mq0Var) {
        super(context, mq0Var);
    }

    @Override // com.daaw.hq1
    public ip<InputStream> b(Context context, String str) {
        return new ig1(context.getApplicationContext().getAssets(), str);
    }

    @Override // com.daaw.hq1
    public ip<InputStream> c(Context context, Uri uri) {
        return new qg1(context, uri);
    }
}
