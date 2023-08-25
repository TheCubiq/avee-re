package com.daaw;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;
/* renamed from: com.daaw.tk */
/* loaded from: classes.dex */
public final class C3081tk {

    /* renamed from: a */
    public final InterfaceC3087f f27799a;

    /* renamed from: com.daaw.tk$a */
    /* loaded from: classes.dex */
    public static final class C3082a {

        /* renamed from: a */
        public final InterfaceC3084c f27800a;

        public C3082a(ClipData clipData, int i) {
            this.f27800a = Build.VERSION.SDK_INT >= 31 ? new C3083b(clipData, i) : new C3085d(clipData, i);
        }

        /* renamed from: a */
        public C3081tk m9060a() {
            return this.f27800a.mo9056a();
        }

        /* renamed from: b */
        public C3082a m9059b(Bundle bundle) {
            this.f27800a.setExtras(bundle);
            return this;
        }

        /* renamed from: c */
        public C3082a m9058c(int i) {
            this.f27800a.mo9054c(i);
            return this;
        }

        /* renamed from: d */
        public C3082a m9057d(Uri uri) {
            this.f27800a.mo9055b(uri);
            return this;
        }
    }

    /* renamed from: com.daaw.tk$b */
    /* loaded from: classes.dex */
    public static final class C3083b implements InterfaceC3084c {

        /* renamed from: a */
        public final ContentInfo.Builder f27801a;

        public C3083b(ClipData clipData, int i) {
            this.f27801a = new ContentInfo.Builder(clipData, i);
        }

        @Override // com.daaw.C3081tk.InterfaceC3084c
        /* renamed from: a */
        public C3081tk mo9056a() {
            return new C3081tk(new C3086e(this.f27801a.build()));
        }

        @Override // com.daaw.C3081tk.InterfaceC3084c
        /* renamed from: b */
        public void mo9055b(Uri uri) {
            this.f27801a.setLinkUri(uri);
        }

        @Override // com.daaw.C3081tk.InterfaceC3084c
        /* renamed from: c */
        public void mo9054c(int i) {
            this.f27801a.setFlags(i);
        }

        @Override // com.daaw.C3081tk.InterfaceC3084c
        public void setExtras(Bundle bundle) {
            this.f27801a.setExtras(bundle);
        }
    }

    /* renamed from: com.daaw.tk$c */
    /* loaded from: classes.dex */
    public interface InterfaceC3084c {
        /* renamed from: a */
        C3081tk mo9056a();

        /* renamed from: b */
        void mo9055b(Uri uri);

        /* renamed from: c */
        void mo9054c(int i);

        void setExtras(Bundle bundle);
    }

    /* renamed from: com.daaw.tk$d */
    /* loaded from: classes.dex */
    public static final class C3085d implements InterfaceC3084c {

        /* renamed from: a */
        public ClipData f27802a;

        /* renamed from: b */
        public int f27803b;

        /* renamed from: c */
        public int f27804c;

        /* renamed from: d */
        public Uri f27805d;

        /* renamed from: e */
        public Bundle f27806e;

        public C3085d(ClipData clipData, int i) {
            this.f27802a = clipData;
            this.f27803b = i;
        }

        @Override // com.daaw.C3081tk.InterfaceC3084c
        /* renamed from: a */
        public C3081tk mo9056a() {
            return new C3081tk(new C3088g(this));
        }

        @Override // com.daaw.C3081tk.InterfaceC3084c
        /* renamed from: b */
        public void mo9055b(Uri uri) {
            this.f27805d = uri;
        }

        @Override // com.daaw.C3081tk.InterfaceC3084c
        /* renamed from: c */
        public void mo9054c(int i) {
            this.f27804c = i;
        }

        @Override // com.daaw.C3081tk.InterfaceC3084c
        public void setExtras(Bundle bundle) {
            this.f27806e = bundle;
        }
    }

    /* renamed from: com.daaw.tk$e */
    /* loaded from: classes.dex */
    public static final class C3086e implements InterfaceC3087f {

        /* renamed from: a */
        public final ContentInfo f27807a;

        public C3086e(ContentInfo contentInfo) {
            this.f27807a = (ContentInfo) ty0.m8699f(contentInfo);
        }

        @Override // com.daaw.C3081tk.InterfaceC3087f
        /* renamed from: a */
        public ClipData mo9053a() {
            return this.f27807a.getClip();
        }

        @Override // com.daaw.C3081tk.InterfaceC3087f
        /* renamed from: b */
        public int mo9052b() {
            return this.f27807a.getFlags();
        }

        @Override // com.daaw.C3081tk.InterfaceC3087f
        /* renamed from: c */
        public ContentInfo mo9051c() {
            return this.f27807a;
        }

        @Override // com.daaw.C3081tk.InterfaceC3087f
        /* renamed from: d */
        public int mo9050d() {
            return this.f27807a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f27807a + "}";
        }
    }

    /* renamed from: com.daaw.tk$f */
    /* loaded from: classes.dex */
    public interface InterfaceC3087f {
        /* renamed from: a */
        ClipData mo9053a();

        /* renamed from: b */
        int mo9052b();

        /* renamed from: c */
        ContentInfo mo9051c();

        /* renamed from: d */
        int mo9050d();
    }

    /* renamed from: com.daaw.tk$g */
    /* loaded from: classes.dex */
    public static final class C3088g implements InterfaceC3087f {

        /* renamed from: a */
        public final ClipData f27808a;

        /* renamed from: b */
        public final int f27809b;

        /* renamed from: c */
        public final int f27810c;

        /* renamed from: d */
        public final Uri f27811d;

        /* renamed from: e */
        public final Bundle f27812e;

        public C3088g(C3085d c3085d) {
            this.f27808a = (ClipData) ty0.m8699f(c3085d.f27802a);
            this.f27809b = ty0.m8703b(c3085d.f27803b, 0, 5, "source");
            this.f27810c = ty0.m8700e(c3085d.f27804c, 1);
            this.f27811d = c3085d.f27805d;
            this.f27812e = c3085d.f27806e;
        }

        @Override // com.daaw.C3081tk.InterfaceC3087f
        /* renamed from: a */
        public ClipData mo9053a() {
            return this.f27808a;
        }

        @Override // com.daaw.C3081tk.InterfaceC3087f
        /* renamed from: b */
        public int mo9052b() {
            return this.f27810c;
        }

        @Override // com.daaw.C3081tk.InterfaceC3087f
        /* renamed from: c */
        public ContentInfo mo9051c() {
            return null;
        }

        @Override // com.daaw.C3081tk.InterfaceC3087f
        /* renamed from: d */
        public int mo9050d() {
            return this.f27809b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f27808a.getDescription());
            sb.append(", source=");
            sb.append(C3081tk.m9063e(this.f27809b));
            sb.append(", flags=");
            sb.append(C3081tk.m9067a(this.f27810c));
            if (this.f27811d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f27811d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f27812e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    public C3081tk(InterfaceC3087f interfaceC3087f) {
        this.f27799a = interfaceC3087f;
    }

    /* renamed from: a */
    public static String m9067a(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    /* renamed from: e */
    public static String m9063e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    /* renamed from: g */
    public static C3081tk m9061g(ContentInfo contentInfo) {
        return new C3081tk(new C3086e(contentInfo));
    }

    /* renamed from: b */
    public ClipData m9066b() {
        return this.f27799a.mo9053a();
    }

    /* renamed from: c */
    public int m9065c() {
        return this.f27799a.mo9052b();
    }

    /* renamed from: d */
    public int m9064d() {
        return this.f27799a.mo9050d();
    }

    /* renamed from: f */
    public ContentInfo m9062f() {
        ContentInfo mo9051c = this.f27799a.mo9051c();
        Objects.requireNonNull(mo9051c);
        return mo9051c;
    }

    public String toString() {
        return this.f27799a.toString();
    }
}
