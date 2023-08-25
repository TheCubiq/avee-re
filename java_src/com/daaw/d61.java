package com.daaw;

import android.database.Cursor;
import com.daaw.ki1;
import java.util.List;
/* loaded from: classes.dex */
public class d61 extends ki1.a {
    public sp b;
    public final a c;
    public final String d;
    public final String e;

    /* loaded from: classes.dex */
    public static abstract class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public abstract void a(ji1 ji1Var);

        public abstract void b(ji1 ji1Var);

        public abstract void c(ji1 ji1Var);

        public abstract void d(ji1 ji1Var);

        public abstract void e(ji1 ji1Var);

        public abstract void f(ji1 ji1Var);

        public abstract b g(ji1 ji1Var);
    }

    /* loaded from: classes.dex */
    public static class b {
        public final boolean a;
        public final String b;

        public b(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    public d61(sp spVar, a aVar, String str, String str2) {
        super(aVar.a);
        this.b = spVar;
        this.c = aVar;
        this.d = str;
        this.e = str2;
    }

    public static boolean j(ji1 ji1Var) {
        Cursor B = ji1Var.B("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (B.moveToFirst()) {
                if (B.getInt(0) == 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            B.close();
        }
    }

    public static boolean k(ji1 ji1Var) {
        Cursor B = ji1Var.B("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (B.moveToFirst()) {
                if (B.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            B.close();
        }
    }

    @Override // com.daaw.ki1.a
    public void b(ji1 ji1Var) {
        super.b(ji1Var);
    }

    @Override // com.daaw.ki1.a
    public void d(ji1 ji1Var) {
        boolean j = j(ji1Var);
        this.c.a(ji1Var);
        if (!j) {
            b g = this.c.g(ji1Var);
            if (!g.a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g.b);
            }
        }
        l(ji1Var);
        this.c.c(ji1Var);
    }

    @Override // com.daaw.ki1.a
    public void e(ji1 ji1Var, int i, int i2) {
        g(ji1Var, i, i2);
    }

    @Override // com.daaw.ki1.a
    public void f(ji1 ji1Var) {
        super.f(ji1Var);
        h(ji1Var);
        this.c.d(ji1Var);
        this.b = null;
    }

    @Override // com.daaw.ki1.a
    public void g(ji1 ji1Var, int i, int i2) {
        boolean z;
        List<gq0> c;
        sp spVar = this.b;
        if (spVar == null || (c = spVar.d.c(i, i2)) == null) {
            z = false;
        } else {
            this.c.f(ji1Var);
            for (gq0 gq0Var : c) {
                gq0Var.a(ji1Var);
            }
            b g = this.c.g(ji1Var);
            if (!g.a) {
                throw new IllegalStateException("Migration didn't properly handle: " + g.b);
            }
            this.c.e(ji1Var);
            l(ji1Var);
            z = true;
        }
        if (z) {
            return;
        }
        sp spVar2 = this.b;
        if (spVar2 != null && !spVar2.a(i, i2)) {
            this.c.b(ji1Var);
            this.c.a(ji1Var);
            return;
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }

    public final void h(ji1 ji1Var) {
        if (!k(ji1Var)) {
            b g = this.c.g(ji1Var);
            if (g.a) {
                this.c.e(ji1Var);
                l(ji1Var);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g.b);
        }
        Cursor I = ji1Var.I(new id1("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = I.moveToFirst() ? I.getString(0) : null;
            I.close();
            if (!this.d.equals(string) && !this.e.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            I.close();
            throw th;
        }
    }

    public final void i(ji1 ji1Var) {
        ji1Var.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    public final void l(ji1 ji1Var) {
        i(ji1Var);
        ji1Var.h(c61.a(this.d));
    }
}
