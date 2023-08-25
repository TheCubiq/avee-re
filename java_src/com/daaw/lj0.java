package com.daaw;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.daaw.avee.R;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* loaded from: classes2.dex */
public class lj0 extends DialogFragment {
    public static ww1<String, Integer> u = new ww1<>();
    public AsyncTask<Void, Void, String> p;
    public int q = R.raw.licenses;
    public String r = "";
    public WebView s;
    public ProgressBar t;

    /* loaded from: classes2.dex */
    public class a extends WebViewClient {
        public a() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith("local:")) {
                String[] strArr = new String[2];
                br1.C(str, "//", strArr);
                int intValue = lj0.u.a(strArr[1], 0).intValue();
                if (intValue > 0) {
                    lj0.this.f(intValue);
                    return true;
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* loaded from: classes2.dex */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* loaded from: classes2.dex */
    public class c extends AsyncTask<Void, Void, String> {
        public final /* synthetic */ int a;

        public c(int i) {
            this.a = i;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(lj0.this.getActivity().getResources().openRawResource(this.a)));
            StringBuilder sb = new StringBuilder();
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append("\n");
                } catch (IOException unused) {
                }
            }
            bufferedReader.close();
            return sb.toString();
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(String str) {
            super.onPostExecute(str);
            if (lj0.this.getActivity() == null || isCancelled()) {
                return;
            }
            lj0.this.t.setVisibility(4);
            lj0.this.s.setVisibility(0);
            WebView webView = lj0.this.s;
            webView.loadDataWithBaseURL("file:///android_asset/" + lj0.this.r, str, "text/html", "utf-8", null);
            lj0.this.p = null;
        }
    }

    public static void e(FragmentManager fragmentManager, boolean z, int i, int i2, String str) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag("nz.net.speakman.androidlicensespage.LicensesFragment");
        if (findFragmentByTag != null) {
            beginTransaction.remove(findFragmentByTag);
        }
        beginTransaction.addToBackStack(null);
        g(z, i, i2, str).show(beginTransaction, "nz.net.speakman.androidlicensespage.LicensesFragment");
    }

    public static lj0 g(boolean z, int i, int i2, String str) {
        lj0 lj0Var = new lj0();
        Bundle bundle = new Bundle();
        bundle.putBoolean("keyShowCloseButton", z);
        bundle.putInt("licenseResId", i);
        bundle.putInt("titleResId", i2);
        bundle.putString("extraUrl", str);
        lj0Var.setArguments(bundle);
        return lj0Var;
    }

    public final void f(int i) {
        this.p = new c(i).execute(new Void[0]);
    }

    public void h(AlertDialog.Builder builder) {
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        f(this.q);
    }

    @Override // android.app.DialogFragment
    @SuppressLint({"InflateParams"})
    public Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.licenses_fragment, (ViewGroup) null);
        WebView webView = (WebView) inflate.findViewById(R.id.licensesFragmentWebView);
        this.s = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.t = (ProgressBar) inflate.findViewById(R.id.licensesFragmentIndeterminateProgress);
        this.s.setWebViewClient(new a());
        Bundle arguments = getArguments();
        int i = 0;
        if (arguments != null) {
            z = arguments.getBoolean("keyShowCloseButton");
            this.q = arguments.getInt("licenseResId", R.raw.licenses);
            i = arguments.getInt("titleResId", 0);
            this.r = arguments.getString("extraUrl", "");
        } else {
            z = false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        if (i != 0) {
            builder.setTitle(getString(i));
        }
        builder.setView(inflate);
        if (z) {
            builder.setNegativeButton(getActivity().getResources().getString(R.string.dialog_close), new b());
        }
        h(builder);
        return builder.create();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AsyncTask<Void, Void, String> asyncTask = this.p;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
    }
}
