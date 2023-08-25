package com.daaw;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.IOException;
/* loaded from: classes.dex */
public abstract class qk0<T> implements InterfaceC1744ip<T> {

    /* renamed from: a */
    public final Uri f24102a;

    /* renamed from: b */
    public final Context f24103b;

    /* renamed from: c */
    public T f24104c;

    public qk0(Context context, Uri uri) {
        this.f24103b = context.getApplicationContext();
        this.f24102a = uri;
    }

    @Override // com.daaw.InterfaceC1744ip
    /* renamed from: a */
    public final T mo4085a(dz0 dz0Var) {
        T mo3009d = mo3009d(this.f24102a, this.f24103b.getContentResolver());
        this.f24104c = mo3009d;
        return mo3009d;
    }

    @Override // com.daaw.InterfaceC1744ip
    /* renamed from: b */
    public void mo4084b() {
        T t = this.f24104c;
        if (t != null) {
            try {
                mo3010c(t);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: c */
    public abstract void mo3010c(T t);

    @Override // com.daaw.InterfaceC1744ip
    public void cancel() {
    }

    /* renamed from: d */
    public abstract T mo3009d(Uri uri, ContentResolver contentResolver);

    @Override // com.daaw.InterfaceC1744ip
    public String getId() {
        return this.f24102a.toString();
    }
}
