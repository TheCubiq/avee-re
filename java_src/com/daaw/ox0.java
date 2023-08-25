package com.daaw;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import com.daaw.avee.R;
import com.daaw.ox0;
import com.daaw.tx0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class ox0 extends DialogFragment {
    public LinearLayout p;
    public LinearLayout q;
    public boolean r = false;
    public boolean s = false;
    public g0<long[], ArrayList<String>, ArrayList<tx0>> t = null;
    public ArrayList<tx0> u = new ArrayList<>(0);
    public long[] v = new long[0];
    public ArrayList<String> w = new ArrayList<>(0);
    public static uw1<Context, Long, long[], List<String>, Boolean> x = new uw1<>();
    public static uw1<String, String, List<tx0>, Boolean, Boolean> y = new uw1<>();
    public static vw1<er0<String, String>> z = new vw1<>();
    public static sw1<long[], List<String>, al> A = new sw1<>();

    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {
        public final /* synthetic */ boolean p;
        public final /* synthetic */ CheckBox q;
        public final /* synthetic */ List r;

        public a(boolean z, CheckBox checkBox, List list) {
            this.p = z;
            this.q = checkBox;
            this.r = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Activity activity, long j, boolean z, long[] jArr, ArrayList arrayList, ArrayList arrayList2) {
            gr1.j(ox0.this);
            ox0.x.a(activity, Long.valueOf(j), jArr, arrayList, Boolean.valueOf(z));
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            final boolean z = this.p && this.q.isChecked();
            if (i < 0 || i >= this.r.size()) {
                return;
            }
            final long longValue = ((Long) this.r.get(i)).longValue();
            final Activity activity = ox0.this.getActivity();
            ox0.this.d(new g0() { // from class: com.daaw.nx0
                @Override // com.daaw.g0
                public final void a(Object obj, Object obj2, Object obj3) {
                    ox0.a.this.b(activity, longValue, z, (long[]) obj, (ArrayList) obj2, (ArrayList) obj3);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public class b implements AdapterView.OnItemClickListener {
        public final /* synthetic */ boolean p;
        public final /* synthetic */ CheckBox q;
        public final /* synthetic */ CheckBox r;
        public final /* synthetic */ er0 s;

        public b(boolean z, CheckBox checkBox, CheckBox checkBox2, er0 er0Var) {
            this.p = z;
            this.q = checkBox;
            this.r = checkBox2;
            this.s = er0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(lo1 lo1Var, boolean z, boolean z2, long[] jArr, ArrayList arrayList, ArrayList arrayList2) {
            gr1.j(ox0.this);
            ox0.y.a((String) lo1Var.a, (String) lo1Var.b, arrayList2, Boolean.valueOf(z), Boolean.valueOf(z2));
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            final boolean z = this.p && this.q.isChecked();
            final boolean isChecked = this.r.isChecked();
            if (i < 0 || i >= this.s.size()) {
                return;
            }
            final lo1 lo1Var = this.s.get(i);
            ox0.this.d(new g0() { // from class: com.daaw.px0
                @Override // com.daaw.g0
                public final void a(Object obj, Object obj2, Object obj3) {
                    ox0.b.this.b(lo1Var, z, isChecked, (long[]) obj, (ArrayList) obj2, (ArrayList) obj3);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        public static /* synthetic */ void b(Activity activity, long[] jArr, ArrayList arrayList, ArrayList arrayList2) {
            ox0.A.a(jArr, arrayList, new al(activity));
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ox0 ox0Var = ox0.this;
            if (!ox0Var.s) {
                ox0Var.r = true;
                return;
            }
            final Activity activity = ox0Var.getActivity();
            ox0.this.d(new g0() { // from class: com.daaw.qx0
                @Override // com.daaw.g0
                public final void a(Object obj, Object obj2, Object obj3) {
                    ox0.c.b(activity, (long[]) obj, (ArrayList) obj2, (ArrayList) obj3);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ox0.this.r = true;
        }
    }

    /* loaded from: classes.dex */
    public class e implements tx0.d {
        public final /* synthetic */ int[] a;
        public final /* synthetic */ ArrayList b;

        public e(int[] iArr, ArrayList arrayList) {
            this.a = iArr;
            this.b = arrayList;
        }

        @Override // com.daaw.tx0.d
        public void a(tx0.b bVar, Object obj, Object obj2) {
            int[] iArr = this.a;
            iArr[0] = iArr[0] + 1;
            if (iArr[0] >= this.b.size()) {
                ox0 ox0Var = ox0.this;
                ox0Var.f(ox0Var.u);
            }
        }
    }

    public static ox0 c(al alVar, List<tx0> list, Boolean bool) {
        ox0 e2 = e(list, bool.booleanValue());
        gr1.x(e2, "PlaylistPickerDialog", alVar);
        return e2;
    }

    public static ox0 e(List<tx0> list, boolean z2) {
        ox0 ox0Var = new ox0();
        ArrayList<String> arrayList = new ArrayList<>(list.size());
        for (tx0 tx0Var : list) {
            arrayList.add(tx0Var.g());
        }
        Bundle bundle = new Bundle();
        bundle.putInt("arg1", z2 ? 1 : 0);
        bundle.putStringArrayList("arg2", arrayList);
        ox0Var.setArguments(bundle);
        return ox0Var;
    }

    public final void d(g0<long[], ArrayList<String>, ArrayList<tx0>> g0Var) {
        if (this.s) {
            g0Var.a(this.v, this.w, this.u);
            return;
        }
        this.p.setVisibility(0);
        this.q.setVisibility(8);
        this.t = g0Var;
    }

    public final void f(ArrayList<tx0> arrayList) {
        g0<long[], ArrayList<String>, ArrayList<tx0>> g0Var;
        this.v = new long[arrayList.size()];
        Iterator<tx0> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.v[i] = it.next().l();
            i++;
        }
        this.p.setVisibility(8);
        this.q.setVisibility(0);
        this.s = true;
        if (this.r || (g0Var = this.t) == null) {
            return;
        }
        g0Var.a(this.v, this.w, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        if (r0 < 1) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.widget.ArrayAdapter<java.lang.String> r3, java.util.Collection<java.lang.String> r4) {
        /*
            r2 = this;
            if (r4 == 0) goto L9
            int r0 = r4.size()
            r1 = 1
            if (r0 >= r1) goto L1c
        L9:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            android.content.res.Resources r0 = r2.getResources()
            r1 = 2131755501(0x7f1001ed, float:1.9141883E38)
            java.lang.String r0 = r0.getString(r1)
            r4.add(r0)
        L1c:
            r3.clear()
            r3.addAll(r4)
            r3.notifyDataSetChanged()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ox0.g(android.widget.ArrayAdapter, java.util.Collection):void");
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Handler handler = new Handler(Looper.getMainLooper());
        Bundle arguments = getArguments();
        boolean z2 = arguments.getInt("arg1") != 0;
        ArrayList<String> stringArrayList = arguments.getStringArrayList("arg2");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.dialog_send_to_playlist_title);
        View inflate = View.inflate(getActivity(), R.layout.dialog_choose_playlist, null);
        builder.setView(inflate);
        this.p = (LinearLayout) inflate.findViewById(R.id.contentLoading);
        this.q = (LinearLayout) inflate.findViewById(R.id.content);
        TabHost tabHost = (TabHost) inflate.findViewById(R.id.tabHost);
        tabHost.setup();
        TabHost.TabSpec newTabSpec = tabHost.newTabSpec("Tab One");
        newTabSpec.setContent(R.id.tab1);
        newTabSpec.setIndicator(getResources().getString(R.string.section_playlist_system));
        tabHost.addTab(newTabSpec);
        TabHost.TabSpec newTabSpec2 = tabHost.newTabSpec("Tab Two");
        newTabSpec2.setContent(R.id.tab2);
        newTabSpec2.setIndicator(getResources().getString(R.string.section_playlist_standalone));
        tabHost.addTab(newTabSpec2);
        CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.checkBoxOverwrite);
        CheckBox checkBox2 = (CheckBox) inflate.findViewById(R.id.checkBoxRelative);
        checkBox2.setChecked(true);
        if (z2) {
            checkBox.setVisibility(0);
            checkBox.setChecked(true);
        } else {
            checkBox.setVisibility(8);
        }
        ListView listView = (ListView) inflate.findViewById(R.id.listViewPlaylist1);
        listView.setTextFilterEnabled(true);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(), R.layout.bgreco_list_item);
        listView.setAdapter((ListAdapter) arrayAdapter);
        ListView listView2 = (ListView) inflate.findViewById(R.id.listViewPlaylist2);
        listView2.setTextFilterEnabled(true);
        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<>(getActivity(), R.layout.bgreco_list_item);
        listView2.setAdapter((ListAdapter) arrayAdapter2);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        dr1.c(getActivity(), arrayList, arrayList2);
        g(arrayAdapter, arrayList2);
        er0<String, String> a2 = z.a(new er0<>());
        ArrayList arrayList3 = new ArrayList(a2.size());
        Iterator<lo1<String, String>> it = a2.iterator();
        while (it.hasNext()) {
            arrayList3.add(hk.Z(it.next().b));
        }
        g(arrayAdapter2, arrayList3);
        listView.setOnItemClickListener(new a(z2, checkBox, arrayList));
        listView2.setOnItemClickListener(new b(z2, checkBox, checkBox2, a2));
        builder.setPositiveButton(R.string.dialog_send_to_playlist_add_to_new, new c());
        builder.setNegativeButton(R.string.dialog_cancel, new d());
        this.u = new ArrayList<>(stringArrayList.size());
        this.w = new ArrayList<>(this.u.size());
        int[] iArr = {0};
        Iterator<String> it2 = stringArrayList.iterator();
        while (it2.hasNext()) {
            tx0 tx0Var = new tx0(it2.next());
            this.u.add(tx0Var);
            this.w.add(tx0Var.m());
            tx0Var.i(handler, new e(iArr, stringArrayList), null, null);
        }
        return builder.create();
    }
}
