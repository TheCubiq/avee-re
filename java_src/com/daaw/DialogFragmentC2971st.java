package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.daaw.avee.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* renamed from: com.daaw.st */
/* loaded from: classes.dex */
public class DialogFragmentC2971st extends DialogFragment {

    /* renamed from: t */
    public static sw1<C0645al, String, String> f26613t = new sw1<>();

    /* renamed from: p */
    public ArrayList<File> f26614p = new ArrayList<>();

    /* renamed from: q */
    public ArrayAdapter<String> f26615q;

    /* renamed from: r */
    public EditText f26616r;

    /* renamed from: s */
    public File f26617s;

    /* renamed from: com.daaw.st$a */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2972a implements View.OnClickListener {
        public View$OnClickListenerC2972a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC2971st.this.m9909k(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
        }
    }

    /* renamed from: com.daaw.st$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2973b implements View.OnClickListener {
        public View$OnClickListenerC2973b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC2971st.this.m9909k(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES));
        }
    }

    /* renamed from: com.daaw.st$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2974c implements View.OnClickListener {
        public View$OnClickListenerC2974c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC2971st.this.m9909k(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC));
        }
    }

    /* renamed from: com.daaw.st$d */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2975d implements View.OnClickListener {
        public View$OnClickListenerC2975d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC2971st.this.m9909k(new File(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18914l()));
        }
    }

    /* renamed from: com.daaw.st$e */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2976e implements View.OnClickListener {
        public View$OnClickListenerC2976e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogFragmentC2971st.this.m9909k(new File(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18909q()));
        }
    }

    /* renamed from: com.daaw.st$f */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2977f implements View.OnClickListener {
        public View$OnClickListenerC2977f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String parent = DialogFragmentC2971st.this.f26617s != null ? DialogFragmentC2971st.this.f26617s.getParent() : null;
            if (parent != null) {
                DialogFragmentC2971st.this.m9908l(parent);
            }
        }
    }

    /* renamed from: com.daaw.st$g */
    /* loaded from: classes.dex */
    public class C2978g implements AdapterView.OnItemClickListener {
        public C2978g() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= DialogFragmentC2971st.this.f26614p.size() || !((File) DialogFragmentC2971st.this.f26614p.get(i)).isDirectory()) {
                return;
            }
            DialogFragmentC2971st.this.m9908l(((File) DialogFragmentC2971st.this.f26614p.get(i)).getAbsolutePath());
        }
    }

    /* renamed from: com.daaw.st$h */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC2979h implements DialogInterface.OnClickListener {

        /* renamed from: p */
        public final /* synthetic */ String f26625p;

        public DialogInterface$OnClickListenerC2979h(String str) {
            this.f26625p = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            DialogFragmentC2971st dialogFragmentC2971st = DialogFragmentC2971st.this;
            dialogFragmentC2971st.m9910j(dialogFragmentC2971st.f26616r.getText().toString(), this.f26625p);
        }
    }

    /* renamed from: com.daaw.st$i */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC2980i implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC2980i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            DialogFragmentC2971st.this.getDialog().cancel();
        }
    }

    /* renamed from: g */
    public static DialogFragmentC2971st m9913g(C0645al c0645al, String str, int i, String str2) {
        DialogFragmentC2971st dialogFragmentC2971st = new DialogFragmentC2971st();
        Bundle bundle = new Bundle();
        bundle.putInt("arg1", i);
        bundle.putString("arg2", str2);
        bundle.putString("arg3", str);
        dialogFragmentC2971st.setArguments(bundle);
        gr1.m21311x(dialogFragmentC2971st, "DirectoryPickerDialog", c0645al);
        return dialogFragmentC2971st;
    }

    /* renamed from: h */
    public static ArrayList<File> m9912h(File[] fileArr, boolean z, boolean z2) {
        ArrayList<File> arrayList = new ArrayList<>();
        if (fileArr == null) {
            return arrayList;
        }
        for (File file : fileArr) {
            if ((!z || file.isDirectory()) && (z2 || !file.isHidden())) {
                arrayList.add(file);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: i */
    public static String[] m9911i(ArrayList<File> arrayList) {
        String[] strArr = new String[arrayList.size()];
        Iterator<File> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            strArr[i] = it.next().getName();
            i++;
        }
        return strArr;
    }

    /* renamed from: j */
    public final void m9910j(String str, String str2) {
        f26613t.m9795a(new C0645al(getActivity()), str, str2);
    }

    /* renamed from: k */
    public final void m9909k(File file) {
        String str;
        if (file == null) {
            file = Environment.getExternalStorageDirectory();
        } else if (!file.isDirectory()) {
            return;
        }
        this.f26617s = file;
        ArrayList<File> m9912h = m9912h(this.f26617s.listFiles(), true, false);
        this.f26614p = m9912h;
        String[] m9911i = m9911i(m9912h);
        if (m9911i.length < 1) {
            m9911i = new String[]{getResources().getString(R.string.dialog_dir_empty_placeholder)};
        }
        this.f26615q.clear();
        this.f26615q.addAll(m9911i);
        this.f26615q.notifyDataSetChanged();
        try {
            str = this.f26617s.getCanonicalPath();
        } catch (IOException unused) {
            str = "";
        }
        if (str.length() == 0) {
            str = "/";
        }
        this.f26616r.setText(str);
    }

    /* renamed from: l */
    public final void m9908l(String str) {
        m9909k((str == null || str.isEmpty()) ? null : new File(str));
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        int i = arguments.getInt("arg1");
        String string = arguments.getString("arg2");
        String string2 = arguments.getString("arg3");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(i);
        View inflate = View.inflate(getActivity(), R.layout.bgreco_chooser_list, null);
        builder.setView(inflate);
        View[] viewArr = {inflate.findViewById(R.id.group1), inflate.findViewById(R.id.group2), inflate.findViewById(R.id.group5), inflate.findViewById(R.id.group3), inflate.findViewById(R.id.group4)};
        viewArr[4].setVisibility(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18904v() ? 0 : 8);
        viewArr[0].setOnClickListener(new View$OnClickListenerC2972a());
        viewArr[1].setOnClickListener(new View$OnClickListenerC2973b());
        viewArr[2].setOnClickListener(new View$OnClickListenerC2974c());
        viewArr[3].setOnClickListener(new View$OnClickListenerC2975d());
        viewArr[4].setOnClickListener(new View$OnClickListenerC2976e());
        this.f26616r = (EditText) inflate.findViewById(R.id.txtName);
        ((Button) inflate.findViewById(R.id.btnNavigateBack)).setOnClickListener(new View$OnClickListenerC2977f());
        ListView listView = (ListView) inflate.findViewById(R.id.list);
        listView.setTextFilterEnabled(true);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(), R.layout.bgreco_list_item);
        this.f26615q = arrayAdapter;
        listView.setAdapter((ListAdapter) arrayAdapter);
        m9908l(string);
        listView.setOnItemClickListener(new C2978g());
        builder.setPositiveButton(R.string.dialog_choose, new DialogInterface$OnClickListenerC2979h(string2));
        builder.setNegativeButton(R.string.dialog_cancel, new DialogInterface$OnClickListenerC2980i());
        return builder.create();
    }
}
