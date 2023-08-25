package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
/* loaded from: classes.dex */
public class z00 extends qk0<ParcelFileDescriptor> {
    public z00(Context context, Uri uri) {
        super(context, uri);
    }

    @Override // com.daaw.qk0
    /* renamed from: e */
    public void mo3010c(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }

    @Override // com.daaw.qk0
    /* renamed from: f */
    public ParcelFileDescriptor mo3009d(Uri uri, ContentResolver contentResolver) {
        return contentResolver.openAssetFileDescriptor(uri, "r").getParcelFileDescriptor();
    }
}
