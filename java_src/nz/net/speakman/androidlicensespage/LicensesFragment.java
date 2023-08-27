package nz.net.speakman.androidlicensespage;

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
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.R;
import com.daaw.avee.comp.AlbumArt.LocalBitmapLoader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/* loaded from: classes2.dex */
public class LicensesFragment extends DialogFragment {
    private static final String FRAGMENT_TAG = "nz.net.speakman.androidlicensespage.LicensesFragment";
    protected static final String KEY_EXTRA_URL = "extraUrl";
    protected static final String KEY_RES_ID = "licenseResId";
    protected static final String KEY_SHOW_CLOSE_BUTTON = "keyShowCloseButton";
    protected static final String KEY_TITLE_RES_ID = "titleResId";
    public static WeakEventR1<String, Integer> onRequestUrl = new WeakEventR1<>();
    private ProgressBar mIndeterminateProgress;
    private AsyncTask<Void, Void, String> mLicenseLoader;
    private WebView mWebView;
    int licenseResId = R.raw.licenses;
    String extraUrl = "";

    /* JADX INFO: Access modifiers changed from: protected */
    public void onDialogBuild(AlertDialog.Builder builder) {
    }

    public static LicensesFragment newInstance() {
        return new LicensesFragment();
    }

    public static LicensesFragment newInstance(boolean z, int i, int i2, String str) {
        LicensesFragment licensesFragment = new LicensesFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean(KEY_SHOW_CLOSE_BUTTON, z);
        bundle.putInt(KEY_RES_ID, i);
        bundle.putInt(KEY_TITLE_RES_ID, i2);
        bundle.putString(KEY_EXTRA_URL, str);
        licensesFragment.setArguments(bundle);
        return licensesFragment;
    }

    public static void displayLicensesFragment(FragmentManager fragmentManager) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(FRAGMENT_TAG);
        if (findFragmentByTag != null) {
            beginTransaction.remove(findFragmentByTag);
        }
        beginTransaction.addToBackStack(null);
        newInstance().show(beginTransaction, FRAGMENT_TAG);
    }

    public static void displayLicensesFragment(FragmentManager fragmentManager, boolean z, int i, int i2, String str) {
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        Fragment findFragmentByTag = fragmentManager.findFragmentByTag(FRAGMENT_TAG);
        if (findFragmentByTag != null) {
            beginTransaction.remove(findFragmentByTag);
        }
        beginTransaction.addToBackStack(null);
        newInstance(z, i, i2, str).show(beginTransaction, FRAGMENT_TAG);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        loadLicenses(this.licenseResId);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AsyncTask<Void, Void, String> asyncTask = this.mLicenseLoader;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        boolean z;
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.licenses_fragment, (ViewGroup) null);
        WebView webView = (WebView) inflate.findViewById(R.id.licensesFragmentWebView);
        this.mWebView = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.mIndeterminateProgress = (ProgressBar) inflate.findViewById(R.id.licensesFragmentIndeterminateProgress);
        this.mWebView.setWebViewClient(new WebViewClient() { // from class: nz.net.speakman.androidlicensespage.LicensesFragment.1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                if (str.startsWith(LocalBitmapLoader.Prefix)) {
                    String[] strArr = new String[2];
                    Utils.stringSplitInTwo(str, "//", strArr);
                    int intValue = LicensesFragment.onRequestUrl.invoke(strArr[1], 0).intValue();
                    if (intValue > 0) {
                        LicensesFragment.this.loadLicenses(intValue);
                        return true;
                    }
                }
                return super.shouldOverrideUrlLoading(webView2, str);
            }

            @Override // android.webkit.WebViewClient
            public void onLoadResource(WebView webView2, String str) {
                super.onLoadResource(webView2, str);
            }
        });
        Bundle arguments = getArguments();
        int i = 0;
        if (arguments != null) {
            z = arguments.getBoolean(KEY_SHOW_CLOSE_BUTTON);
            this.licenseResId = arguments.getInt(KEY_RES_ID, R.raw.licenses);
            i = arguments.getInt(KEY_TITLE_RES_ID, 0);
            this.extraUrl = arguments.getString(KEY_EXTRA_URL, "");
        } else {
            z = false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        if (i != 0) {
            builder.setTitle(getString(i));
        }
        builder.setView(inflate);
        if (z) {
            builder.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: nz.net.speakman.androidlicensespage.LicensesFragment.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i2) {
                    dialogInterface.dismiss();
                }
            });
        }
        onDialogBuild(builder);
        return builder.create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [nz.net.speakman.androidlicensespage.LicensesFragment$3] */
    public void loadLicenses(final int i) {
        this.mLicenseLoader = new AsyncTask<Void, Void, String>() { // from class: nz.net.speakman.androidlicensespage.LicensesFragment.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public String doInBackground(Void... voidArr) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(LicensesFragment.this.getActivity().getResources().openRawResource(i)));
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

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(String str) {
                super.onPostExecute((AnonymousClass3) str);
                if (LicensesFragment.this.getActivity() == null || isCancelled()) {
                    return;
                }
                LicensesFragment.this.mIndeterminateProgress.setVisibility(4);
                LicensesFragment.this.mWebView.setVisibility(0);
                WebView webView = LicensesFragment.this.mWebView;
                webView.loadDataWithBaseURL("file:///android_asset/" + LicensesFragment.this.extraUrl, str, "text/html", "utf-8", null);
                LicensesFragment.this.mLicenseLoader = null;
            }
        }.execute(new Void[0]);
    }
}
