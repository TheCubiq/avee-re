package com.daaw;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
/* loaded from: classes.dex */
public class b10 extends yg1<ParcelFileDescriptor> {

    /* renamed from: com.daaw.b10$a */
    /* loaded from: classes.dex */
    public static class C0801a implements nq0<String, ParcelFileDescriptor> {
        @Override // com.daaw.nq0
        /* renamed from: a */
        public mq0<String, ParcelFileDescriptor> mo3945a(Context context, d60 d60Var) {
            return new b10(d60Var.m24637a(Uri.class, ParcelFileDescriptor.class));
        }

        @Override // com.daaw.nq0
        /* renamed from: b */
        public void mo3944b() {
        }
    }

    public b10(mq0<Uri, ParcelFileDescriptor> mq0Var) {
        super(mq0Var);
    }
}
