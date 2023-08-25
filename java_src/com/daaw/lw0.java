package com.daaw;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;
/* loaded from: classes.dex */
public class lw0 {
    public CharSequence a;
    public IconCompat b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;

    /* loaded from: classes.dex */
    public static class a {
        public static lw0 a(Person person) {
            return new b().f(person.getName()).c(person.getIcon() != null ? IconCompat.a(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
        }

        public static Person b(lw0 lw0Var) {
            return new Person.Builder().setName(lw0Var.c()).setIcon(lw0Var.a() != null ? lw0Var.a().o() : null).setUri(lw0Var.d()).setKey(lw0Var.b()).setBot(lw0Var.e()).setImportant(lw0Var.f()).build();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public CharSequence a;
        public IconCompat b;
        public String c;
        public String d;
        public boolean e;
        public boolean f;

        public lw0 a() {
            return new lw0(this);
        }

        public b b(boolean z) {
            this.e = z;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.b = iconCompat;
            return this;
        }

        public b d(boolean z) {
            this.f = z;
            return this;
        }

        public b e(String str) {
            this.d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        public b g(String str) {
            this.c = str;
            return this;
        }
    }

    public lw0(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
    }

    public IconCompat a() {
        return this.b;
    }

    public String b() {
        return this.d;
    }

    public CharSequence c() {
        return this.a;
    }

    public String d() {
        return this.c;
    }

    public boolean e() {
        return this.e;
    }

    public boolean f() {
        return this.f;
    }

    public String g() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        if (this.a != null) {
            return "name:" + ((Object) this.a);
        }
        return "";
    }

    public Person h() {
        return a.b(this);
    }
}
