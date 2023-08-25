package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
/* loaded from: classes.dex */
public class c10 extends hq1<ParcelFileDescriptor> {

    /* loaded from: classes.dex */
    public static class a implements nq0<Uri, ParcelFileDescriptor> {
        @Override // com.daaw.nq0
        public mq0<Uri, ParcelFileDescriptor> a(Context context, d60 d60Var) {
            return new c10(context, d60Var.a(o70.class, ParcelFileDescriptor.class));
        }

        @Override // com.daaw.nq0
        public void b() {
        }
    }

    public c10(Context context, mq0<o70, ParcelFileDescriptor> mq0Var) {
        super(context, mq0Var);
    }

    @Override // com.daaw.hq1
    public ip<ParcelFileDescriptor> b(Context context, String str) {
        return new v00(context.getApplicationContext().getAssets(), str);
    }

    @Override // com.daaw.hq1
    public ip<ParcelFileDescriptor> c(Context context, Uri uri) {
        return new z00(context, uri);
    }
}
