package com.daaw;

import android.net.Uri;
import java.io.File;
/* loaded from: classes.dex */
public class d10<T> implements mq0<File, T> {
    public final mq0<Uri, T> a;

    public d10(mq0<Uri, T> mq0Var) {
        this.a = mq0Var;
    }

    @Override // com.daaw.mq0
    /* renamed from: b */
    public ip<T> a(File file, int i, int i2) {
        return this.a.a(Uri.fromFile(file), i, i2);
    }
}
