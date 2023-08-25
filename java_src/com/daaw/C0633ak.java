package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.database.MatrixCursor;
import androidx.recyclerview.widget.RecyclerView;
import com.daaw.avee.R;
import com.daaw.dh0;
import com.daaw.gh0;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.daaw.ak */
/* loaded from: classes.dex */
public class C0633ak extends AbstractC2454on {

    /* renamed from: E */
    public AbstractC2004l0[] f3233E;

    /* renamed from: F */
    public AbstractC2004l0[] f3234F;

    /* renamed from: com.daaw.ak$a */
    /* loaded from: classes.dex */
    public class C0634a extends gh0.C1413g.AbstractC1414a {
        public C0634a() {
        }

        @Override // com.daaw.gh0.C1413g.AbstractC1414a
        /* renamed from: c */
        public void mo2222c(Context context, Object obj, List<tx0> list) {
            C0633ak.this.m27428Y(context, ((C0641h) obj).f3243b, list);
        }
    }

    /* renamed from: com.daaw.ak$b */
    /* loaded from: classes.dex */
    public class C0635b extends gh0.C1411f.AbstractC1412a {
        public C0635b() {
        }

        @Override // com.daaw.gh0.C1411f.AbstractC1412a
        /* renamed from: c */
        public void mo2217c(Context context, Object obj, List<tx0> list) {
            C0633ak.this.m27428Y(context, ((C0641h) obj).f3243b, list);
        }
    }

    /* renamed from: com.daaw.ak$c */
    /* loaded from: classes.dex */
    public class C0636c extends gh0.C1404b.AbstractC1405a {
        public C0636c() {
        }

        @Override // com.daaw.gh0.C1404b.AbstractC1405a
        /* renamed from: c */
        public void mo2216c(Context context, Object obj, List<tx0> list) {
            C0633ak.this.m27428Y(context, ((C0641h) obj).f3243b, list);
        }
    }

    /* renamed from: com.daaw.ak$d */
    /* loaded from: classes.dex */
    public class C0637d extends gh0.C1406c.AbstractC1407a {
        public C0637d() {
        }

        @Override // com.daaw.gh0.C1406c.AbstractC1407a
        /* renamed from: c */
        public void mo2221c(Context context, Object obj, List<tx0> list) {
            C0633ak.this.m27428Y(context, ((C0641h) obj).f3243b, list);
        }
    }

    /* renamed from: com.daaw.ak$e */
    /* loaded from: classes.dex */
    public class C0638e extends gh0.C1415h.AbstractC1416a {
        public C0638e() {
        }

        @Override // com.daaw.gh0.C1415h.AbstractC1416a
        /* renamed from: c */
        public void mo2220c(Context context, Object obj, List<tx0> list) {
            C0633ak.this.m27428Y(context, ((C0641h) obj).f3243b, list);
        }
    }

    /* renamed from: com.daaw.ak$f */
    /* loaded from: classes.dex */
    public class C0639f extends dh0.C1086b.AbstractC1087a {
        public C0639f() {
        }

        @Override // com.daaw.dh0.C1086b.AbstractC1087a
        /* renamed from: c */
        public void mo24413c(Context context, Object obj, er0<String, String> er0Var) {
            C0641h c0641h = (C0641h) obj;
            er0Var.m23274f(c0641h.f3242a, c0641h.f3243b);
        }
    }

    /* renamed from: com.daaw.ak$g */
    /* loaded from: classes.dex */
    public class C0640g extends BroadcastReceiver {
        public C0640g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18930d();
            C0633ak.this.m14146W(C0633ak.m27425b0(context, null).f17576a, null);
        }
    }

    /* renamed from: com.daaw.ak$h */
    /* loaded from: classes.dex */
    public static class C0641h {

        /* renamed from: a */
        public final String f3242a;

        /* renamed from: b */
        public final String f3243b;

        public C0641h(String str, String str2) {
            this.f3242a = str;
            this.f3243b = str2;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0641h) && this.f3242a.equals(((C0641h) obj).f3242a);
        }

        public int hashCode() {
            return this.f3242a.hashCode();
        }
    }

    public C0633ak(Context context, String str, String str2, int i, int i2) {
        super(context, str, str2, i, i2);
        AbstractC2004l0[] abstractC2004l0Arr = {new C0634a(), new C0635b(), new C0636c(), new C0637d(), new C0638e(), new C0639f()};
        this.f3233E = abstractC2004l0Arr;
        this.f3234F = (AbstractC2004l0[]) Arrays.copyOf(abstractC2004l0Arr, abstractC2004l0Arr.length - 1);
        m14147V(context);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_CHECKING");
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTABLE");
        intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
        intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
        intentFilter.addDataScheme("file");
        context.registerReceiver(new C0640g(), intentFilter);
    }

    /* renamed from: Z */
    public static int m27427Z(String str) {
        return str != null ? !str.equals("-01") ? !str.equals("-03") ? str.startsWith("-02") ? R.drawable.ic_sd_card : R.drawable.ic_folder4 : R.drawable.ic_phone : R.drawable.ic_usb : R.drawable.ic_folder4;
    }

    /* renamed from: b0 */
    public static lo1<Cursor, String> m27425b0(Context context, sd0 sd0Var) {
        er0<String, String> m18956G = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18956G(context);
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", "path", "icon", "name"});
        Iterator<lo1<String, String>> it = m18956G.iterator();
        while (it.hasNext()) {
            lo1<String, String> next = it.next();
            String[] split = next.f17577b.split(":");
            String[] strArr = new String[4];
            strArr[0] = next.f17576a;
            strArr[1] = split[0];
            strArr[2] = "" + m27427Z(next.f17576a);
            strArr[3] = split.length > 1 ? split[1] : null;
            matrixCursor.addRow(strArr);
        }
        return new lo1<>(matrixCursor, "");
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: E */
    public ts1 mo2263E(Context context, int i) {
        return new ts1(new d90(this, this, 5, 1), this);
    }

    @Override // com.daaw.AbstractC3711yj
    /* renamed from: H */
    public String mo2262H(int i) {
        return m14148U(i).getString(0);
    }

    @Override // com.daaw.AbstractC2454on
    /* renamed from: P */
    public lo1<Cursor, String> mo5056P(Context context) {
        return m27425b0(context, m3678J());
    }

    @Override // com.daaw.AbstractC2454on
    /* renamed from: Q */
    public lo1<Cursor, String> mo5055Q(Context context, String str) {
        return m27425b0(context, m3678J());
    }

    /* renamed from: Y */
    public List<tx0> m27428Y(Context context, String str, List<tx0> list) {
        return C3845zj.m2247c0(context, this.f33722l, m3678J(), str, list);
    }

    /* renamed from: a0 */
    public void m27426a0(Cursor cursor, int i, C3223uk c3223uk) {
        c3223uk.m8086b0(this, new C0641h(m14148U(i).getString(0), m14148U(i).getString(1)), m3678J());
        String string = cursor.getString(0);
        boolean startsWith = string.startsWith("-");
        c3223uk.f29121w.setSelected(AbstractC3711yj.f33708x.m5753a(c3223uk.f29118t, Boolean.FALSE).booleanValue());
        c3223uk.m8090X(startsWith ? this.f3234F : this.f3233E, -1, this);
        c3223uk.f29122x.setVisibility(0);
        c3223uk.m8092V(this.f33719i);
        c3223uk.m8091W(cursor.getInt(2));
        c3223uk.f29123y.setVisibility(8);
        String string2 = cursor.getString(1);
        c3223uk.f29124z.setText(cursor.isNull(3) ? C1100dl.m24291c(string, string2, c3223uk.f1947a.getContext()) : cursor.getString(3));
        c3223uk.f29124z.setTextColor(this.f33717g);
        c3223uk.m8084d0(0);
        c3223uk.m8085c0(string2);
        c3223uk.f29112B.setText("");
    }

    @Override // com.daaw.wc0
    /* renamed from: d */
    public ts1 mo2246d(Context context, String str) {
        int m14150S = m14150S("_id", str);
        String string = m14150S >= 0 ? m14148U(m14150S).getString(1) : "";
        if (string.length() > 0) {
            C3845zj c3845zj = new C3845zj(context, new File(string), mo3664p(str), this.f33722l);
            c3845zj.mo3663q(this.f33713c);
            return c3845zj.m3681F(context);
        }
        return null;
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
        m27426a0(m14148U, i, c3223uk);
    }
}
