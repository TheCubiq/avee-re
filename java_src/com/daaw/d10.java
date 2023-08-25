package com.daaw;

import android.net.Uri;
import java.io.File;
/* loaded from: classes.dex */
public class d10<T> implements mq0<File, T> {

    /* renamed from: a */
    public final mq0<Uri, T> f6359a;

    public d10(mq0<Uri, T> mq0Var) {
        this.f6359a = mq0Var;
    }

    @Override // com.daaw.mq0
    /* renamed from: b */
    public InterfaceC1744ip<T> mo3764a(File file, int i, int i2) {
        return this.f6359a.mo3764a(Uri.fromFile(file), i, i2);
    }
}
