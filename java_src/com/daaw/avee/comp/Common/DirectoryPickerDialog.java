package com.daaw.avee.comp.Common;

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
import com.AOSPutils.Context_storage;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/* loaded from: classes.dex */
public class DirectoryPickerDialog extends DialogFragment {
    private static final String arg1 = "arg1";
    private static final String arg2 = "arg2";
    private static final String arg3 = "arg3";
    public static WeakEvent3<ContextData, String, String> onSubmitValue = new WeakEvent3<>();
    private static final boolean onlyDirs = true;
    private static final boolean showHidden = false;
    private ArrayAdapter<String> adapter;
    private ArrayList<File> currentFiles = new ArrayList<>();
    private File dir;
    private EditText textView;

    public static DirectoryPickerDialog createAndShowDialog(ContextData contextData, String str, int i, String str2) {
        DirectoryPickerDialog directoryPickerDialog = new DirectoryPickerDialog();
        Bundle bundle = new Bundle();
        bundle.putInt(arg1, i);
        bundle.putString(arg2, str2);
        bundle.putString(arg3, str);
        directoryPickerDialog.setArguments(bundle);
        UtilsUI.showDialogSafe(directoryPickerDialog, "DirectoryPickerDialog", contextData);
        return directoryPickerDialog;
    }

    private static ArrayList<File> filter(File[] fileArr, boolean z, boolean z2) {
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

    private static String[] names(ArrayList<File> arrayList) {
        String[] strArr = new String[arrayList.size()];
        Iterator<File> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            strArr[i] = it.next().getName();
            i++;
        }
        return strArr;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        int i = arguments.getInt(arg1);
        String string = arguments.getString(arg2);
        final String string2 = arguments.getString(arg3);
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(i);
        View inflate = View.inflate(getActivity(), R.layout.bgreco_chooser_list, null);
        builder.setView(inflate);
        View[] viewArr = {inflate.findViewById(R.id.group1), inflate.findViewById(R.id.group2), inflate.findViewById(R.id.group5), inflate.findViewById(R.id.group3), inflate.findViewById(R.id.group4)};
        viewArr[4].setVisibility(Context_storage.hasExternalSDCard(getActivity()) ? 0 : 8);
        viewArr[0].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.Common.DirectoryPickerDialog.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DirectoryPickerDialog.this.setCurrentPath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
            }
        });
        viewArr[1].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.Common.DirectoryPickerDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DirectoryPickerDialog.this.setCurrentPath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES));
            }
        });
        viewArr[2].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.Common.DirectoryPickerDialog.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DirectoryPickerDialog.this.setCurrentPath(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MUSIC));
            }
        });
        viewArr[3].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.Common.DirectoryPickerDialog.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DirectoryPickerDialog.this.setCurrentPath(new File(Context_storage.getInternalStoragePath()));
            }
        });
        viewArr[4].setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.Common.DirectoryPickerDialog.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                DirectoryPickerDialog.this.setCurrentPath(new File(Context_storage.getSDCardPathOnce(view.getContext())));
            }
        });
        this.textView = (EditText) inflate.findViewById(R.id.txtName);
        ((Button) inflate.findViewById(R.id.btnNavigateBack)).setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.Common.DirectoryPickerDialog.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String parent = DirectoryPickerDialog.this.dir != null ? DirectoryPickerDialog.this.dir.getParent() : null;
                if (parent != null) {
                    DirectoryPickerDialog.this.setCurrentPath(parent);
                }
            }
        });
        ListView listView = (ListView) inflate.findViewById(R.id.list);
        listView.setTextFilterEnabled(true);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(getActivity(), R.layout.bgreco_list_item);
        this.adapter = arrayAdapter;
        listView.setAdapter((ListAdapter) arrayAdapter);
        setCurrentPath(string);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.daaw.avee.comp.Common.DirectoryPickerDialog.7
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                if (i2 >= DirectoryPickerDialog.this.currentFiles.size() || !((File) DirectoryPickerDialog.this.currentFiles.get(i2)).isDirectory()) {
                    return;
                }
                DirectoryPickerDialog.this.setCurrentPath(((File) DirectoryPickerDialog.this.currentFiles.get(i2)).getAbsolutePath());
            }
        });
        builder.setPositiveButton(R.string.dialog_choose, new DialogInterface.OnClickListener() { // from class: com.daaw.avee.comp.Common.DirectoryPickerDialog.8
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                DirectoryPickerDialog directoryPickerDialog = DirectoryPickerDialog.this;
                directoryPickerDialog.returnDir(directoryPickerDialog.textView.getText().toString(), string2);
            }
        });
        builder.setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.daaw.avee.comp.Common.DirectoryPickerDialog.9
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i2) {
                DirectoryPickerDialog.this.getDialog().cancel();
            }
        });
        return builder.create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentPath(String str) {
        setCurrentPath((str == null || str.isEmpty()) ? null : new File(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCurrentPath(File file) {
        String str;
        if (file == null) {
            this.dir = Environment.getExternalStorageDirectory();
        } else if (!file.isDirectory()) {
            return;
        } else {
            this.dir = file;
        }
        ArrayList<File> filter = filter(this.dir.listFiles(), true, false);
        this.currentFiles = filter;
        String[] names = names(filter);
        if (names.length < 1) {
            names = new String[]{getResources().getString(R.string.dialog_dir_empty_placeholder)};
        }
        this.adapter.clear();
        this.adapter.addAll(names);
        this.adapter.notifyDataSetChanged();
        try {
            str = this.dir.getCanonicalPath();
        } catch (IOException unused) {
            str = "";
        }
        if (str.length() == 0) {
            str = "/";
        }
        this.textView.setText(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void returnDir(String str, String str2) {
        onSubmitValue.invoke(new ContextData(getActivity()), str, str2);
    }
}
