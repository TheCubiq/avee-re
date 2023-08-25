package com.daaw;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.si;
import com.daaw.ti;
import com.daaw.ts1;
import com.daaw.wc0;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class jk extends on {

    /* loaded from: classes.dex */
    public class a implements ti.a {
        public final /* synthetic */ gk a;
        public final /* synthetic */ hk b;

        public a(gk gkVar, hk hkVar) {
            this.a = gkVar;
            this.b = hkVar;
        }

        @Override // com.daaw.ti.a
        public ts1 a(Context context, int i, wc0 wc0Var) {
            si.b[] bVarArr = {new si.b(12), new si.b(12)};
            gk gkVar = this.a;
            hk hkVar = this.b;
            return new ts1(new d90(new si(bVarArr, new ts1.a[]{gkVar, hkVar}, new wc0[]{gkVar, hkVar}), wc0Var, 6, 1), wc0Var);
        }
    }

    public jk(Context context, int i, WeakReference<wc0.b> weakReference) {
        super(context, "/", context.getString(R.string.menu_library), R.drawable.ic_library_2, i, weakReference);
        V(context);
    }

    public static Cursor Y(wc0.b bVar) {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", "", "", ""});
        matrixCursor.addRow(new String[]{"-1", "2131755322", "", "2131230990"});
        matrixCursor.addRow(new String[]{"0", "2131755331", "", "2131230995"});
        matrixCursor.addRow(new String[]{"1", "2131755318", "", "2131230925"});
        matrixCursor.addRow(new String[]{"2", "2131755320", "", "2131230926"});
        matrixCursor.addRow(new String[]{"3", "2131755325", "", "2131230977"});
        matrixCursor.addRow(new String[]{"4", "2131755328", "", "2131230990"});
        matrixCursor.addRow(new String[]{"5", "2131755323", "", "2131230954"});
        if (bVar == null || bVar.d() != 0) {
            matrixCursor.addRow(new String[]{"7", "2131755300", "dir.xiph.org", "2131231010"});
            matrixCursor.addRow(new String[]{"8", "2131755602", "www.shoutcast.com", "2131231010"});
        } else {
            matrixCursor.addRow(new String[]{"6", "2131755327", "", "2131230948"});
        }
        return matrixCursor;
    }

    @Override // com.daaw.on, com.daaw.yj
    public boolean A() {
        Context e = dx0.e();
        if (e == null) {
            return true;
        }
        W(P(e).a, null);
        return true;
    }

    @Override // com.daaw.yj
    public ts1 E(Context context, int i) {
        return new ts1(new d90(this, this, 3, 16), this);
    }

    @Override // com.daaw.yj
    public String H(int i) {
        return U(i).getString(0);
    }

    @Override // com.daaw.on
    public lo1<Cursor, String> P(Context context) {
        return new lo1<>(Y(this.c.get()), null);
    }

    public void X(Cursor cursor, int i, uk ukVar) {
        ukVar.a0(this, J());
        ukVar.W(cursor.getInt(3));
        ukVar.V(this.i);
        ukVar.y.setVisibility(8);
        ukVar.z.setText(cursor.getInt(1));
        ukVar.z.setTextColor(this.g);
        ukVar.d0(8);
        ukVar.B.setText("");
        if (cursor.getString(0).equals("6")) {
            ukVar.W(cursor.getInt(3));
            ukVar.V(this.h);
            ukVar.z.setTextColor(this.h);
        } else if (cursor.getString(0).equals("7") || cursor.getString(0).equals("8")) {
            ukVar.d0(0);
            ukVar.c0(cursor.getString(2));
        }
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public void c(boolean z) {
        yj.v.a(Boolean.valueOf(z), jk.class);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r13.equals("3") == false) goto L6;
     */
    @Override // com.daaw.wc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.daaw.ts1 d(android.content.Context r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.jk.d(android.content.Context, java.lang.String):com.daaw.ts1");
    }

    @Override // com.daaw.ts1.a
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // com.daaw.ts1.a
    public void v(RecyclerView.c0 c0Var, int i) {
        Cursor U = U(i);
        uk ukVar = (uk) c0Var;
        ukVar.v = i;
        X(U, i, ukVar);
    }

    @Override // com.daaw.yj, com.daaw.wc0
    public boolean z() {
        return yj.u.a(jk.class, Boolean.FALSE).booleanValue();
    }
}
