package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
/* loaded from: classes.dex */
public class y00 extends d10<ParcelFileDescriptor> {

    /* loaded from: classes.dex */
    public static class a implements nq0<File, ParcelFileDescriptor> {
        @Override // com.daaw.nq0
        public mq0<File, ParcelFileDescriptor> a(Context context, d60 d60Var) {
            return new y00(d60Var.a(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // com.daaw.nq0
        public void b() {
        }
    }

    public y00(mq0<Uri, ParcelFileDescriptor> mq0Var) {
        super(mq0Var);
    }
}
