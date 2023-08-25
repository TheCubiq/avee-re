package com.daaw;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;
/* loaded from: classes.dex */
public final class tk {
    public final f a;

    /* loaded from: classes.dex */
    public static final class a {
        public final c a;

        public a(ClipData clipData, int i) {
            this.a = Build.VERSION.SDK_INT >= 31 ? new b(clipData, i) : new d(clipData, i);
        }

        public tk a() {
            return this.a.a();
        }

        public a b(Bundle bundle) {
            this.a.setExtras(bundle);
            return this;
        }

        public a c(int i) {
            this.a.c(i);
            return this;
        }

        public a d(Uri uri) {
            this.a.b(uri);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements c {
        public final ContentInfo.Builder a;

        public b(ClipData clipData, int i) {
            this.a = new ContentInfo.Builder(clipData, i);
        }

        @Override // com.daaw.tk.c
        public tk a() {
            return new tk(new e(this.a.build()));
        }

        @Override // com.daaw.tk.c
        public void b(Uri uri) {
            this.a.setLinkUri(uri);
        }

        @Override // com.daaw.tk.c
        public void c(int i) {
            this.a.setFlags(i);
        }

        @Override // com.daaw.tk.c
        public void setExtras(Bundle bundle) {
            this.a.setExtras(bundle);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        tk a();

        void b(Uri uri);

        void c(int i);

        void setExtras(Bundle bundle);
    }

    /* loaded from: classes.dex */
    public static final class d implements c {
        public ClipData a;
        public int b;
        public int c;
        public Uri d;
        public Bundle e;

        public d(ClipData clipData, int i) {
            this.a = clipData;
            this.b = i;
        }

        @Override // com.daaw.tk.c
        public tk a() {
            return new tk(new g(this));
        }

        @Override // com.daaw.tk.c
        public void b(Uri uri) {
            this.d = uri;
        }

        @Override // com.daaw.tk.c
        public void c(int i) {
            this.c = i;
        }

        @Override // com.daaw.tk.c
        public void setExtras(Bundle bundle) {
            this.e = bundle;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements f {
        public final ContentInfo a;

        public e(ContentInfo contentInfo) {
            this.a = (ContentInfo) ty0.f(contentInfo);
        }

        @Override // com.daaw.tk.f
        public ClipData a() {
            return this.a.getClip();
        }

        @Override // com.daaw.tk.f
        public int b() {
            return this.a.getFlags();
        }

        @Override // com.daaw.tk.f
        public ContentInfo c() {
            return this.a;
        }

        @Override // com.daaw.tk.f
        public int d() {
            return this.a.getSource();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.a + "}";
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        ClipData a();

        int b();

        ContentInfo c();

        int d();
    }

    /* loaded from: classes.dex */
    public static final class g implements f {
        public final ClipData a;
        public final int b;
        public final int c;
        public final Uri d;
        public final Bundle e;

        public g(d dVar) {
            this.a = (ClipData) ty0.f(dVar.a);
            this.b = ty0.b(dVar.b, 0, 5, "source");
            this.c = ty0.e(dVar.c, 1);
            this.d = dVar.d;
            this.e = dVar.e;
        }

        @Override // com.daaw.tk.f
        public ClipData a() {
            return this.a;
        }

        @Override // com.daaw.tk.f
        public int b() {
            return this.c;
        }

        @Override // com.daaw.tk.f
        public ContentInfo c() {
            return null;
        }

        @Override // com.daaw.tk.f
        public int d() {
            return this.b;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.a.getDescription());
            sb.append(", source=");
            sb.append(tk.e(this.b));
            sb.append(", flags=");
            sb.append(tk.a(this.c));
            if (this.d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    public tk(f fVar) {
        this.a = fVar;
    }

    public static String a(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    public static String e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? String.valueOf(i) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public static tk g(ContentInfo contentInfo) {
        return new tk(new e(contentInfo));
    }

    public ClipData b() {
        return this.a.a();
    }

    public int c() {
        return this.a.b();
    }

    public int d() {
        return this.a.d();
    }

    public ContentInfo f() {
        ContentInfo c2 = this.a.c();
        Objects.requireNonNull(c2);
        return c2;
    }

    public String toString() {
        return this.a.toString();
    }
}
