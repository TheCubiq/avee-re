package com.daaw;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.C2940si;
import com.daaw.C3076ti;
import com.daaw.avee.R;
import com.daaw.ts1;
import com.daaw.wc0;
import java.lang.ref.WeakReference;
/* renamed from: com.daaw.jk */
/* loaded from: classes.dex */
public class C1832jk extends AbstractC2454on {

    /* renamed from: com.daaw.jk$a */
    /* loaded from: classes.dex */
    public class C1833a implements C3076ti.InterfaceC3077a {

        /* renamed from: a */
        public final /* synthetic */ C1428gk f15142a;

        /* renamed from: b */
        public final /* synthetic */ C1577hk f15143b;

        public C1833a(C1428gk c1428gk, C1577hk c1577hk) {
            this.f15142a = c1428gk;
            this.f15143b = c1577hk;
        }

        @Override // com.daaw.C3076ti.InterfaceC3077a
        /* renamed from: a */
        public ts1 mo9099a(Context context, int i, wc0 wc0Var) {
            C2940si.C2942b[] c2942bArr = {new C2940si.C2942b(12), new C2940si.C2942b(12)};
            C1428gk c1428gk = this.f15142a;
            C1577hk c1577hk = this.f15143b;
            return new ts1(new d90(new C2940si(c2942bArr, new ts1.InterfaceC3115a[]{c1428gk, c1577hk}, new wc0[]{c1428gk, c1577hk}), wc0Var, 6, 1), wc0Var);
        }
    }

    public C1832jk(Context context, int i, WeakReference<wc0.InterfaceC3421b> weakReference) {
        super(context, "/", context.getString(R.string.menu_library), R.drawable.ic_library_2, i, weakReference);
        m14147V(context);
    }

    /* renamed from: Y */
    public static Cursor m18471Y(wc0.InterfaceC3421b interfaceC3421b) {
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", "", "", ""});
        matrixCursor.addRow(new String[]{"-1", "2131755322", "", "2131230990"});
        matrixCursor.addRow(new String[]{"0", "2131755331", "", "2131230995"});
        matrixCursor.addRow(new String[]{"1", "2131755318", "", "2131230925"});
        matrixCursor.addRow(new String[]{"2", "2131755320", "", "2131230926"});
        matrixCursor.addRow(new String[]{"3", "2131755325", "", "2131230977"});
        matrixCursor.addRow(new String[]{"4", "2131755328", "", "2131230990"});
        matrixCursor.addRow(new String[]{"5", "2131755323", "", "2131230954"});
        if (interfaceC3421b == null || interfaceC3421b.mo6185d() != 0) {
            matrixCursor.addRow(new String[]{"7", "2131755300", "dir.xiph.org", "2131231010"});
            matrixCursor.addRow(new String[]{"8", "2131755602", "www.shoutcast.com", "2131231010"});
        } else {
            matrixCursor.addRow(new String[]{"6", "2131755327", "", "2131230948"});
        }
        return matrixCursor;
    }

    @Override // com.daaw.AbstractC2454on, com.daaw.AbstractC3711yj
    /* renamed from: A */
    public boolean mo2264A() {
        Context m23837e = dx0.m23837e();
        if (m23837e == null) {
            return true;
        }
        m14146W(mo5056P(m23837e).f17576a, null);
        return true;
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: E */
    public ts1 mo2263E(Context context, int i) {
        return new ts1(new d90(this, this, 3, 16), this);
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: H */
    public String mo2262H(int i) {
        return m14148U(i).getString(0);
    }

    @Override // com.daaw.AbstractC2454on
    /* renamed from: P */
    public lo1<Cursor, String> mo5056P(Context context) {
        return new lo1<>(m18471Y(this.f33713c.get()), null);
    }

    /* renamed from: X */
    public void m18472X(Cursor cursor, int i, C3223uk c3223uk) {
        c3223uk.m8087a0(this, m3678J());
        c3223uk.m8091W(cursor.getInt(3));
        c3223uk.m8092V(this.f33719i);
        c3223uk.f29123y.setVisibility(8);
        c3223uk.f29124z.setText(cursor.getInt(1));
        c3223uk.f29124z.setTextColor(this.f33717g);
        c3223uk.m8084d0(8);
        c3223uk.f29112B.setText("");
        if (cursor.getString(0).equals("6")) {
            c3223uk.m8091W(cursor.getInt(3));
            c3223uk.m8092V(this.f33718h);
            c3223uk.f29124z.setTextColor(this.f33718h);
        } else if (cursor.getString(0).equals("7") || cursor.getString(0).equals("8")) {
            c3223uk.m8084d0(0);
            c3223uk.m8085c0(cursor.getString(2));
        }
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: c */
    public void mo3671c(boolean z) {
        AbstractC3711yj.f33706v.m10862a(Boolean.valueOf(z), C1832jk.class);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r13.equals("3") == false) goto L6;
     */
    @Override // com.daaw.wc0
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ts1 mo2246d(Context context, String str) {
        String str2;
        int i;
        int m14150S = m14150S("_id", str);
        char c = 3;
        if (m14150S >= 0) {
            String string = context.getString(m14148U(m14150S).getInt(1));
            i = m14148U(m14150S).getInt(3);
            str2 = string;
        } else {
            str2 = "";
            i = 0;
        }
        str.hashCode();
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 49:
                if (str.equals("1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 50:
                if (str.equals("2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 51:
                break;
            case 52:
                if (str.equals("4")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 53:
                if (str.equals("5")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 55:
                if (str.equals("7")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 56:
                if (str.equals("8")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1444:
                if (str.equals("-1")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                C1713ik c1713ik = new C1713ik(context, mo3664p(str), str2, i, this.f33722l);
                c1713ik.mo3663q(this.f33713c);
                return c1713ik.m3680G(context, 0);
            case 1:
                C3334vj c3334vj = new C3334vj(context, mo3664p(str), str2, i, this.f33722l);
                c3334vj.mo3663q(this.f33713c);
                return c3334vj.m3681F(context);
            case 2:
                C3544xj c3544xj = new C3544xj(context, mo3664p(str), str2, i, this.f33722l);
                c3544xj.mo3663q(this.f33713c);
                return c3544xj.m3681F(context);
            case 3:
                C0846bk c0846bk = new C0846bk(context, mo3664p(str), str2, i, this.f33722l);
                c0846bk.mo3663q(this.f33713c);
                return c0846bk.m3681F(context);
            case 4:
                C1428gk c1428gk = new C1428gk(context, mo3664p(str), this.f33722l);
                C1577hk c1577hk = new C1577hk(context, mo3664p(str), this.f33722l);
                C3076ti c3076ti = new C3076ti(new wc0[]{c1428gk, c1577hk}, new tr1(context.getResources().getString(R.string.libContainer_Playlists)), R.drawable.ic_playlist4, new C1833a(c1428gk, c1577hk));
                c3076ti.mo3663q(this.f33713c);
                return c3076ti.m9102r(context);
            case 5:
                C0633ak c0633ak = new C0633ak(context, mo3664p(str), str2, i, this.f33722l);
                c0633ak.mo3663q(this.f33713c);
                return c0633ak.m3681F(context);
            case 6:
                C1091dk c1091dk = new C1091dk(context, mo3664p(str), context.getString(R.string.icecast_name), R.drawable.ic_stream0, this.f33722l);
                c1091dk.mo3663q(this.f33713c);
                return c1091dk.m3681F(context);
            case 7:
                C2181mk m16004X = C2181mk.m16004X(context, mo3664p(str), new tr1(context.getString(R.string.shoutcast_name)), R.drawable.ic_stream0, this.f33722l);
                m16004X.mo3663q(this.f33713c);
                return m16004X.m3681F(context);
            case '\b':
                C3442wj c3442wj = new C3442wj(context, mo3664p(str), str2, i, this.f33722l);
                c3442wj.mo3663q(this.f33713c);
                return c3442wj.m3680G(context, 0);
            default:
                return null;
        }
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // com.daaw.ts1.InterfaceC3115a
    /* renamed from: v */
    public void mo2231v(RecyclerView.AbstractC0376c0 abstractC0376c0, int i) {
        Cursor m14148U = m14148U(i);
        C3223uk c3223uk = (C3223uk) abstractC0376c0;
        c3223uk.f29120v = i;
        m18472X(m14148U, i, c3223uk);
    }

    @Override // com.daaw.AbstractC3711yj, com.daaw.wc0
    /* renamed from: z */
    public boolean mo3658z() {
        return AbstractC3711yj.f33705u.m5753a(C1832jk.class, Boolean.FALSE).booleanValue();
    }
}
