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
/* loaded from: classes.dex */
public class st extends DialogFragment {
    public static sw1<al, String, String> t = new sw1<>();
    public ArrayList<File> p = new ArrayList<>();
    public ArrayAdapter<String> q;
    public EditText r;
    public File s;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            st.this.k(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            st.this.k(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES));
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            st.this.k(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC));
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            st.this.k(new File(j5.e().l()));
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            st.this.k(new File(j5.e().q()));
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String parent = st.this.s != null ? st.this.s.getParent() : null;
            if (parent != null) {
                st.this.l(parent);
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements AdapterView.OnItemClickListener {
        public g() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (i >= st.this.p.size() || !((File) st.this.p.get(i)).isDirectory()) {
                return;
            }
            st.this.l(((File) st.this.p.get(i)).getAbsolutePath());
        }
    }

    /* loaded from: classes.dex */
    public class h implements DialogInterface.OnClickListener {
        public final /* synthetic */ String p;

        public h(String str) {
            this.p = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            st stVar = st.this;
            stVar.j(stVar.r.getText().toString(), this.p);
        }
    }

    /* loaded from: classes.dex */
    public class i implements DialogInterface.OnClickListener {
        public i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            st.this.getDialog().cancel();
        }
    }

    public static st g(al alVar, String str, int i2, String str2) {
        st stVar = new st();
        Bundle bundle = new Bundle();
        bundle.putInt("arg1", i2);
        bundle.putString("arg2", str2);
        bundle.putString("arg3", str);
        stVar.setArguments(bundle);
        gr1.x(stVar, "DirectoryPickerDialog", alVar);
        return stVar;
    }

    public static ArrayList<File> h(File[] fileArr, boolean z, boolean z2) {
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

    public static String[] i(ArrayList<File> arrayList) {
        String[] strArr = new String[arrayList.size()];
        Iterator<File> it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            strArr[i2] = it.next().getName();
            i2++;
        }
        return strArr;
    }

    public final void j(String str, String str2) {
        t.a(new al(getActivity()), str, str2);
    }

    public final void k(File file) {
        String str;
        if (file == null) {
            file = Environment.getExternalStorageDirectory();
        } else if (!file.isDirectory()) {
            return;
        }
        this.s = file;
        ArrayList<File> h2 = h(this.s.listFiles(), true, false);
        this.p = h2;
        String[] i2 = i(h2);
        if (i2.length < 1) {
            i2 = new String[]{getResources().getString(R.string.dialog_dir_empty_placeholder)};
        }
        this.q.clear();
        this.q.addAll(i2);
        this.q.notifyDataSetChanged();
        try {
            str = this.s.getCanonicalPath();
        } catch (IOException unused) {
            str = "";
        }
        if (str.length() == 0) {
            str = "/";
        }
        this.r.setText(str);
    }

    public final void l(String str) {
        k((str == null || str.isEmpty()) ? null : new File(str));
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        int i2 = arguments.getInt("arg1");
        String string = arguments.getString("arg2");
        String string2 = arguments.getString("arg3");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(i2);
        View inflate = View.inflate(getActivity(), R.layout.bgreco_chooser_list, null);
        builder.setView(inflate);
        View[] viewArr = {inflate.findViewById(R.id.group1), inflate.findViewById(R.id.group2), inflate.findViewById(R.id.group5), inflate.findViewById(R.id.group3), inflate.findViewById(R.id.group4)};
        viewArr[4].setVisibility(j5.e().v() ? 0 : 8);
        viewArr[0].setOnClickListener(new a());
        viewArr[1].setOnClickListener(new b());
        viewArr[2].setOnClickListener(new c());
        viewArr[3].setOnClickListener(new d());
        viewArr[4].setOnClickListener(new e());
        this.r = (EditText) inflate.findViewById(R.id.txtName);
        ((Button) inflate.findViewById(R.id.btnNavigateBack)).setOnClickListener(new f());
        ListView listView = (ListView) inflate.findViewById(R.id.list);
        listView.setTextFilterEnabled(true);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(), R.layout.bgreco_list_item);
        this.q = arrayAdapter;
        listView.setAdapter((ListAdapter) arrayAdapter);
        l(string);
        listView.setOnItemClickListener(new g());
        builder.setPositiveButton(R.string.dialog_choose, new h(string2));
        builder.setNegativeButton(R.string.dialog_cancel, new i());
        return builder.create();
    }
}
