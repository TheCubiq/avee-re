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
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class ox0 extends DialogFragment {

    /* renamed from: p */
    public LinearLayout f22052p;

    /* renamed from: q */
    public LinearLayout f22053q;

    /* renamed from: r */
    public boolean f22054r = false;

    /* renamed from: s */
    public boolean f22055s = false;

    /* renamed from: t */
    public InterfaceC1348g0<long[], ArrayList<String>, ArrayList<tx0>> f22056t = null;

    /* renamed from: u */
    public ArrayList<tx0> f22057u = new ArrayList<>(0);

    /* renamed from: v */
    public long[] f22058v = new long[0];

    /* renamed from: w */
    public ArrayList<String> f22059w = new ArrayList<>(0);

    /* renamed from: x */
    public static uw1<Context, Long, long[], List<String>, Boolean> f22049x = new uw1<>();

    /* renamed from: y */
    public static uw1<String, String, List<tx0>, Boolean, Boolean> f22050y = new uw1<>();

    /* renamed from: z */
    public static vw1<er0<String, String>> f22051z = new vw1<>();

    /* renamed from: A */
    public static sw1<long[], List<String>, C0645al> f22048A = new sw1<>();

    /* renamed from: com.daaw.ox0$a */
    /* loaded from: classes.dex */
    public class C2487a implements AdapterView.OnItemClickListener {

        /* renamed from: p */
        public final /* synthetic */ boolean f22060p;

        /* renamed from: q */
        public final /* synthetic */ CheckBox f22061q;

        /* renamed from: r */
        public final /* synthetic */ List f22062r;

        public C2487a(boolean z, CheckBox checkBox, List list) {
            this.f22060p = z;
            this.f22061q = checkBox;
            this.f22062r = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m13890b(Activity activity, long j, boolean z, long[] jArr, ArrayList arrayList, ArrayList arrayList2) {
            gr1.m21325j(ox0.this);
            ox0.f22049x.m7667a(activity, Long.valueOf(j), jArr, arrayList, Boolean.valueOf(z));
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            final boolean z = this.f22060p && this.f22061q.isChecked();
            if (i < 0 || i >= this.f22062r.size()) {
                return;
            }
            final long longValue = ((Long) this.f22062r.get(i)).longValue();
            final Activity activity = ox0.this.getActivity();
            ox0.this.m13895d(new InterfaceC1348g0() { // from class: com.daaw.nx0
                @Override // com.daaw.InterfaceC1348g0
                /* renamed from: a */
                public final void mo2428a(Object obj, Object obj2, Object obj3) {
                    ox0.C2487a.this.m13890b(activity, longValue, z, (long[]) obj, (ArrayList) obj2, (ArrayList) obj3);
                }
            });
        }
    }

    /* renamed from: com.daaw.ox0$b */
    /* loaded from: classes.dex */
    public class C2488b implements AdapterView.OnItemClickListener {

        /* renamed from: p */
        public final /* synthetic */ boolean f22064p;

        /* renamed from: q */
        public final /* synthetic */ CheckBox f22065q;

        /* renamed from: r */
        public final /* synthetic */ CheckBox f22066r;

        /* renamed from: s */
        public final /* synthetic */ er0 f22067s;

        public C2488b(boolean z, CheckBox checkBox, CheckBox checkBox2, er0 er0Var) {
            this.f22064p = z;
            this.f22065q = checkBox;
            this.f22066r = checkBox2;
            this.f22067s = er0Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ void m13888b(lo1 lo1Var, boolean z, boolean z2, long[] jArr, ArrayList arrayList, ArrayList arrayList2) {
            gr1.m21325j(ox0.this);
            ox0.f22050y.m7667a((String) lo1Var.f17576a, (String) lo1Var.f17577b, arrayList2, Boolean.valueOf(z), Boolean.valueOf(z2));
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            final boolean z = this.f22064p && this.f22065q.isChecked();
            final boolean isChecked = this.f22066r.isChecked();
            if (i < 0 || i >= this.f22067s.size()) {
                return;
            }
            final lo1 lo1Var = this.f22067s.get(i);
            ox0.this.m13895d(new InterfaceC1348g0() { // from class: com.daaw.px0
                @Override // com.daaw.InterfaceC1348g0
                /* renamed from: a */
                public final void mo2428a(Object obj, Object obj2, Object obj3) {
                    ox0.C2488b.this.m13888b(lo1Var, z, isChecked, (long[]) obj, (ArrayList) obj2, (ArrayList) obj3);
                }
            });
        }
    }

    /* renamed from: com.daaw.ox0$c */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC2489c implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC2489c() {
        }

        /* renamed from: b */
        public static /* synthetic */ void m13886b(Activity activity, long[] jArr, ArrayList arrayList, ArrayList arrayList2) {
            ox0.f22048A.m9795a(jArr, arrayList, new C0645al(activity));
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ox0 ox0Var = ox0.this;
            if (!ox0Var.f22055s) {
                ox0Var.f22054r = true;
                return;
            }
            final Activity activity = ox0Var.getActivity();
            ox0.this.m13895d(new InterfaceC1348g0() { // from class: com.daaw.qx0
                @Override // com.daaw.InterfaceC1348g0
                /* renamed from: a */
                public final void mo2428a(Object obj, Object obj2, Object obj3) {
                    ox0.DialogInterface$OnClickListenerC2489c.m13886b(activity, (long[]) obj, (ArrayList) obj2, (ArrayList) obj3);
                }
            });
        }
    }

    /* renamed from: com.daaw.ox0$d */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC2490d implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC2490d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            ox0.this.f22054r = true;
        }
    }

    /* renamed from: com.daaw.ox0$e */
    /* loaded from: classes.dex */
    public class C2491e implements tx0.InterfaceC3145d {

        /* renamed from: a */
        public final /* synthetic */ int[] f22071a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f22072b;

        public C2491e(int[] iArr, ArrayList arrayList) {
            this.f22071a = iArr;
            this.f22072b = arrayList;
        }

        @Override // com.daaw.tx0.InterfaceC3145d
        /* renamed from: a */
        public void mo8722a(tx0.C3143b c3143b, Object obj, Object obj2) {
            int[] iArr = this.f22071a;
            iArr[0] = iArr[0] + 1;
            if (iArr[0] >= this.f22072b.size()) {
                ox0 ox0Var = ox0.this;
                ox0Var.m13893f(ox0Var.f22057u);
            }
        }
    }

    /* renamed from: c */
    public static ox0 m13896c(C0645al c0645al, List<tx0> list, Boolean bool) {
        ox0 m13894e = m13894e(list, bool.booleanValue());
        gr1.m21311x(m13894e, "PlaylistPickerDialog", c0645al);
        return m13894e;
    }

    /* renamed from: e */
    public static ox0 m13894e(List<tx0> list, boolean z) {
        ox0 ox0Var = new ox0();
        ArrayList<String> arrayList = new ArrayList<>(list.size());
        for (tx0 tx0Var : list) {
            arrayList.add(tx0Var.m8745g());
        }
        Bundle bundle = new Bundle();
        bundle.putInt("arg1", z ? 1 : 0);
        bundle.putStringArrayList("arg2", arrayList);
        ox0Var.setArguments(bundle);
        return ox0Var;
    }

    /* renamed from: d */
    public final void m13895d(InterfaceC1348g0<long[], ArrayList<String>, ArrayList<tx0>> interfaceC1348g0) {
        if (this.f22055s) {
            interfaceC1348g0.mo2428a(this.f22058v, this.f22059w, this.f22057u);
            return;
        }
        this.f22052p.setVisibility(0);
        this.f22053q.setVisibility(8);
        this.f22056t = interfaceC1348g0;
    }

    /* renamed from: f */
    public final void m13893f(ArrayList<tx0> arrayList) {
        InterfaceC1348g0<long[], ArrayList<String>, ArrayList<tx0>> interfaceC1348g0;
        this.f22058v = new long[arrayList.size()];
        Iterator<tx0> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            this.f22058v[i] = it.next().m8740l();
            i++;
        }
        this.f22052p.setVisibility(8);
        this.f22053q.setVisibility(0);
        this.f22055s = true;
        if (this.f22054r || (interfaceC1348g0 = this.f22056t) == null) {
            return;
        }
        interfaceC1348g0.mo2428a(this.f22058v, this.f22059w, arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        if (r0 < 1) goto L7;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13892g(ArrayAdapter<String> arrayAdapter, Collection<String> collection) {
        ArrayList arrayList;
        if (collection != null) {
            int size = collection.size();
            arrayList = collection;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(getResources().getString(R.string.playlist_empty_placeholder));
        arrayList = arrayList2;
        arrayAdapter.clear();
        arrayAdapter.addAll(arrayList);
        arrayAdapter.notifyDataSetChanged();
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Handler handler = new Handler(Looper.getMainLooper());
        Bundle arguments = getArguments();
        boolean z = arguments.getInt("arg1") != 0;
        ArrayList<String> stringArrayList = arguments.getStringArrayList("arg2");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(R.string.dialog_send_to_playlist_title);
        View inflate = View.inflate(getActivity(), R.layout.dialog_choose_playlist, null);
        builder.setView(inflate);
        this.f22052p = (LinearLayout) inflate.findViewById(R.id.contentLoading);
        this.f22053q = (LinearLayout) inflate.findViewById(R.id.content);
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
        if (z) {
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
        dr1.m24063c(getActivity(), arrayList, arrayList2);
        m13892g(arrayAdapter, arrayList2);
        er0<String, String> m6692a = f22051z.m6692a(new er0<>());
        ArrayList arrayList3 = new ArrayList(m6692a.size());
        Iterator<lo1<String, String>> it = m6692a.iterator();
        while (it.hasNext()) {
            arrayList3.add(C1577hk.m20663Z(it.next().f17577b));
        }
        m13892g(arrayAdapter2, arrayList3);
        listView.setOnItemClickListener(new C2487a(z, checkBox, arrayList));
        listView2.setOnItemClickListener(new C2488b(z, checkBox, checkBox2, m6692a));
        builder.setPositiveButton(R.string.dialog_send_to_playlist_add_to_new, new DialogInterface$OnClickListenerC2489c());
        builder.setNegativeButton(R.string.dialog_cancel, new DialogInterface$OnClickListenerC2490d());
        this.f22057u = new ArrayList<>(stringArrayList.size());
        this.f22059w = new ArrayList<>(this.f22057u.size());
        int[] iArr = {0};
        Iterator<String> it2 = stringArrayList.iterator();
        while (it2.hasNext()) {
            tx0 tx0Var = new tx0(it2.next());
            this.f22057u.add(tx0Var);
            this.f22059w.add(tx0Var.m8739m());
            tx0Var.m8743i(handler, new C2491e(iArr, stringArrayList), null, null);
        }
        return builder.create();
    }
}
