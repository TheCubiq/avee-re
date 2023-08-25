package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
/* loaded from: classes.dex */
public class a10 extends f51<ParcelFileDescriptor> {

    /* loaded from: classes.dex */
    public static class a implements nq0<Integer, ParcelFileDescriptor> {
        @Override // com.daaw.nq0
        public mq0<Integer, ParcelFileDescriptor> a(Context context, d60 d60Var) {
            return new a10(context, d60Var.a(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // com.daaw.nq0
        public void b() {
        }
    }

    public a10(Context context, mq0<Uri, ParcelFileDescriptor> mq0Var) {
        super(context, mq0Var);
    }
}
