package com.daaw;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
/* loaded from: classes.dex */
public final class bg0 {
    public final c a;

    /* loaded from: classes.dex */
    public static final class a implements c {
        public final InputContentInfo a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.a = (InputContentInfo) obj;
        }

        @Override // com.daaw.bg0.c
        public Uri a() {
            return this.a.getContentUri();
        }

        @Override // com.daaw.bg0.c
        public void b() {
            this.a.requestPermission();
        }

        @Override // com.daaw.bg0.c
        public Uri c() {
            return this.a.getLinkUri();
        }

        @Override // com.daaw.bg0.c
        public Object d() {
            return this.a;
        }

        @Override // com.daaw.bg0.c
        public ClipDescription getDescription() {
            return this.a.getDescription();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c {
        public final Uri a;
        public final ClipDescription b;
        public final Uri c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.a = uri;
            this.b = clipDescription;
            this.c = uri2;
        }

        @Override // com.daaw.bg0.c
        public Uri a() {
            return this.a;
        }

        @Override // com.daaw.bg0.c
        public void b() {
        }

        @Override // com.daaw.bg0.c
        public Uri c() {
            return this.c;
        }

        @Override // com.daaw.bg0.c
        public Object d() {
            return null;
        }

        @Override // com.daaw.bg0.c
        public ClipDescription getDescription() {
            return this.b;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        Uri a();

        void b();

        Uri c();

        Object d();

        ClipDescription getDescription();
    }

    public bg0(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public bg0(c cVar) {
        this.a = cVar;
    }

    public static bg0 f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new bg0(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.a.a();
    }

    public ClipDescription b() {
        return this.a.getDescription();
    }

    public Uri c() {
        return this.a.c();
    }

    public void d() {
        this.a.b();
    }

    public Object e() {
        return this.a.d();
    }
}
