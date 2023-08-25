package com.daaw;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
/* loaded from: classes.dex */
public final class bg0 {

    /* renamed from: a */
    public final InterfaceC0840c f4776a;

    /* renamed from: com.daaw.bg0$a */
    /* loaded from: classes.dex */
    public static final class C0838a implements InterfaceC0840c {

        /* renamed from: a */
        public final InputContentInfo f4777a;

        public C0838a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f4777a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public C0838a(Object obj) {
            this.f4777a = (InputContentInfo) obj;
        }

        @Override // com.daaw.bg0.InterfaceC0840c
        /* renamed from: a */
        public Uri mo26179a() {
            return this.f4777a.getContentUri();
        }

        @Override // com.daaw.bg0.InterfaceC0840c
        /* renamed from: b */
        public void mo26178b() {
            this.f4777a.requestPermission();
        }

        @Override // com.daaw.bg0.InterfaceC0840c
        /* renamed from: c */
        public Uri mo26177c() {
            return this.f4777a.getLinkUri();
        }

        @Override // com.daaw.bg0.InterfaceC0840c
        /* renamed from: d */
        public Object mo26176d() {
            return this.f4777a;
        }

        @Override // com.daaw.bg0.InterfaceC0840c
        public ClipDescription getDescription() {
            return this.f4777a.getDescription();
        }
    }

    /* renamed from: com.daaw.bg0$b */
    /* loaded from: classes.dex */
    public static final class C0839b implements InterfaceC0840c {

        /* renamed from: a */
        public final Uri f4778a;

        /* renamed from: b */
        public final ClipDescription f4779b;

        /* renamed from: c */
        public final Uri f4780c;

        public C0839b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f4778a = uri;
            this.f4779b = clipDescription;
            this.f4780c = uri2;
        }

        @Override // com.daaw.bg0.InterfaceC0840c
        /* renamed from: a */
        public Uri mo26179a() {
            return this.f4778a;
        }

        @Override // com.daaw.bg0.InterfaceC0840c
        /* renamed from: b */
        public void mo26178b() {
        }

        @Override // com.daaw.bg0.InterfaceC0840c
        /* renamed from: c */
        public Uri mo26177c() {
            return this.f4780c;
        }

        @Override // com.daaw.bg0.InterfaceC0840c
        /* renamed from: d */
        public Object mo26176d() {
            return null;
        }

        @Override // com.daaw.bg0.InterfaceC0840c
        public ClipDescription getDescription() {
            return this.f4779b;
        }
    }

    /* renamed from: com.daaw.bg0$c */
    /* loaded from: classes.dex */
    public interface InterfaceC0840c {
        /* renamed from: a */
        Uri mo26179a();

        /* renamed from: b */
        void mo26178b();

        /* renamed from: c */
        Uri mo26177c();

        /* renamed from: d */
        Object mo26176d();

        ClipDescription getDescription();
    }

    public bg0(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f4776a = Build.VERSION.SDK_INT >= 25 ? new C0838a(uri, clipDescription, uri2) : new C0839b(uri, clipDescription, uri2);
    }

    public bg0(InterfaceC0840c interfaceC0840c) {
        this.f4776a = interfaceC0840c;
    }

    /* renamed from: f */
    public static bg0 m26180f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new bg0(new C0838a(obj));
        }
        return null;
    }

    /* renamed from: a */
    public Uri m26185a() {
        return this.f4776a.mo26179a();
    }

    /* renamed from: b */
    public ClipDescription m26184b() {
        return this.f4776a.getDescription();
    }

    /* renamed from: c */
    public Uri m26183c() {
        return this.f4776a.mo26177c();
    }

    /* renamed from: d */
    public void m26182d() {
        this.f4776a.mo26178b();
    }

    /* renamed from: e */
    public Object m26181e() {
        return this.f4776a.mo26176d();
    }
}
