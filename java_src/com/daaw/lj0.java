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

    /* renamed from: u */
    public static ww1<String, Integer> f17448u = new ww1<>();

    /* renamed from: p */
    public AsyncTask<Void, Void, String> f17449p;

    /* renamed from: q */
    public int f17450q = R.raw.licenses;

    /* renamed from: r */
    public String f17451r = "";

    /* renamed from: s */
    public WebView f17452s;

    /* renamed from: t */
    public ProgressBar f17453t;

    /* renamed from: com.daaw.lj0$a */
    /* loaded from: classes2.dex */
    public class C2044a extends WebViewClient {
        public C2044a() {
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.startsWith("local:")) {
                String[] strArr = new String[2];
                br1.m25914C(str, "//", strArr);
                int intValue = lj0.f17448u.m5753a(strArr[1], 0).intValue();
                if (intValue > 0) {
                    lj0.this.m16914f(intValue);
                    return true;
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* renamed from: com.daaw.lj0$b */
    /* loaded from: classes2.dex */
    public class DialogInterface$OnClickListenerC2045b implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC2045b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.daaw.lj0$c */
    /* loaded from: classes2.dex */
    public class AsyncTaskC2046c extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        public final /* synthetic */ int f17456a;

        public AsyncTaskC2046c(int i) {
            this.f17456a = i;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(lj0.this.getActivity().getResources().openRawResource(this.f17456a)));
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
            lj0.this.f17453t.setVisibility(4);
            lj0.this.f17452s.setVisibility(0);
            WebView webView = lj0.this.f17452s;
            webView.loadDataWithBaseURL("file:///android_asset/" + lj0.this.f17451r, str, "text/html", "utf-8", null);
            lj0.this.f17449p = null;
        }
    }

    /* renamed from: e */
    public static void m16915e(FragmentManager fragmentManager, boolean z, int i, int i2, String str) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag("nz.net.speakman.androidlicensespage.LicensesFragment");
        if (findFragmentByTag != null) {
            beginTransaction.remove(findFragmentByTag);
        }
        beginTransaction.addToBackStack(null);
        m16913g(z, i, i2, str).show(beginTransaction, "nz.net.speakman.androidlicensespage.LicensesFragment");
    }

    /* renamed from: g */
    public static lj0 m16913g(boolean z, int i, int i2, String str) {
        lj0 lj0Var = new lj0();
        Bundle bundle = new Bundle();
        bundle.putBoolean("keyShowCloseButton", z);
        bundle.putInt("licenseResId", i);
        bundle.putInt("titleResId", i2);
        bundle.putString("extraUrl", str);
        lj0Var.setArguments(bundle);
        return lj0Var;
    }

    /* renamed from: f */
    public final void m16914f(int i) {
        this.f17449p = new AsyncTaskC2046c(i).execute(new Void[0]);
    }

    /* renamed from: h */
    public void mo6682h(AlertDialog.Builder builder) {
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m16914f(this.f17450q);
    }

    @Override // android.app.DialogFragment
    @SuppressLint({"InflateParams"})
    public Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.licenses_fragment, (ViewGroup) null);
        WebView webView = (WebView) inflate.findViewById(R.id.licensesFragmentWebView);
        this.f17452s = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f17453t = (ProgressBar) inflate.findViewById(R.id.licensesFragmentIndeterminateProgress);
        this.f17452s.setWebViewClient(new C2044a());
        Bundle arguments = getArguments();
        int i = 0;
        if (arguments != null) {
            z = arguments.getBoolean("keyShowCloseButton");
            this.f17450q = arguments.getInt("licenseResId", R.raw.licenses);
            i = arguments.getInt("titleResId", 0);
            this.f17451r = arguments.getString("extraUrl", "");
        } else {
            z = false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        if (i != 0) {
            builder.setTitle(getString(i));
        }
        builder.setView(inflate);
        if (z) {
            builder.setNegativeButton(getActivity().getResources().getString(R.string.dialog_close), new DialogInterface$OnClickListenerC2045b());
        }
        mo6682h(builder);
        return builder.create();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AsyncTask<Void, Void, String> asyncTask = this.f17449p;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
    }
}
