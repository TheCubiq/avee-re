package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
/* loaded from: classes.dex */
public class b10 extends yg1<ParcelFileDescriptor> {

    /* loaded from: classes.dex */
    public static class a implements nq0<String, ParcelFileDescriptor> {
        @Override // com.daaw.nq0
        public mq0<String, ParcelFileDescriptor> a(Context context, d60 d60Var) {
            return new b10(d60Var.a(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // com.daaw.nq0
        public void b() {
        }
    }

    public b10(mq0<Uri, ParcelFileDescriptor> mq0Var) {
        super(mq0Var);
    }
}
