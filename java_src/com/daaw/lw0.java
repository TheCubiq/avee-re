package com.daaw;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public class lw0 {

    /* renamed from: a */
    public CharSequence f17837a;

    /* renamed from: b */
    public IconCompat f17838b;

    /* renamed from: c */
    public String f17839c;

    /* renamed from: d */
    public String f17840d;

    /* renamed from: e */
    public boolean f17841e;

    /* renamed from: f */
    public boolean f17842f;

    /* renamed from: com.daaw.lw0$a */
    /* loaded from: classes.dex */
    public static class C2125a {
        /* renamed from: a */
        public static lw0 m16464a(Person person) {
            return new C2126b().m16457f(person.getName()).m16460c(person.getIcon() != null ? IconCompat.m29732a(person.getIcon()) : null).m16456g(person.getUri()).m16458e(person.getKey()).m16461b(person.isBot()).m16459d(person.isImportant()).m16462a();
        }

        /* renamed from: b */
        public static Person m16463b(lw0 lw0Var) {
            return new Person.Builder().setName(lw0Var.m16470c()).setIcon(lw0Var.m16472a() != null ? lw0Var.m16472a().m29718o() : null).setUri(lw0Var.m16469d()).setKey(lw0Var.m16471b()).setBot(lw0Var.m16468e()).setImportant(lw0Var.m16467f()).build();
        }
    }

    /* renamed from: com.daaw.lw0$b */
    /* loaded from: classes.dex */
    public static class C2126b {

        /* renamed from: a */
        public CharSequence f17843a;

        /* renamed from: b */
        public IconCompat f17844b;

        /* renamed from: c */
        public String f17845c;

        /* renamed from: d */
        public String f17846d;

        /* renamed from: e */
        public boolean f17847e;

        /* renamed from: f */
        public boolean f17848f;

        /* renamed from: a */
        public lw0 m16462a() {
            return new lw0(this);
        }

        /* renamed from: b */
        public C2126b m16461b(boolean z) {
            this.f17847e = z;
            return this;
        }

        /* renamed from: c */
        public C2126b m16460c(IconCompat iconCompat) {
            this.f17844b = iconCompat;
            return this;
        }

        /* renamed from: d */
        public C2126b m16459d(boolean z) {
            this.f17848f = z;
            return this;
        }

        /* renamed from: e */
        public C2126b m16458e(String str) {
            this.f17846d = str;
            return this;
        }

        /* renamed from: f */
        public C2126b m16457f(CharSequence charSequence) {
            this.f17843a = charSequence;
            return this;
        }

        /* renamed from: g */
        public C2126b m16456g(String str) {
            this.f17845c = str;
            return this;
        }
    }

    public lw0(C2126b c2126b) {
        this.f17837a = c2126b.f17843a;
        this.f17838b = c2126b.f17844b;
        this.f17839c = c2126b.f17845c;
        this.f17840d = c2126b.f17846d;
        this.f17841e = c2126b.f17847e;
        this.f17842f = c2126b.f17848f;
    }

    /* renamed from: a */
    public IconCompat m16472a() {
        return this.f17838b;
    }

    /* renamed from: b */
    public String m16471b() {
        return this.f17840d;
    }

    /* renamed from: c */
    public CharSequence m16470c() {
        return this.f17837a;
    }

    /* renamed from: d */
    public String m16469d() {
        return this.f17839c;
    }

    /* renamed from: e */
    public boolean m16468e() {
        return this.f17841e;
    }

    /* renamed from: f */
    public boolean m16467f() {
        return this.f17842f;
    }

    /* renamed from: g */
    public String m16466g() {
        String str = this.f17839c;
        if (str != null) {
            return str;
        }
        if (this.f17837a != null) {
            return "name:" + ((Object) this.f17837a);
        }
        return "";
    }

    /* renamed from: h */
    public Person m16465h() {
        return C2125a.m16463b(this);
    }
}
