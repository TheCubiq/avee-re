.class public Lnz/net/speakman/androidlicensespage/LicensesFragment;
.super Landroid/app/DialogFragment;
.source "LicensesFragment.java"


# static fields
.field private static final FRAGMENT_TAG:Ljava/lang/String; = "nz.net.speakman.androidlicensespage.LicensesFragment"

.field protected static final KEY_EXTRA_URL:Ljava/lang/String; = "extraUrl"

.field protected static final KEY_RES_ID:Ljava/lang/String; = "licenseResId"

.field protected static final KEY_SHOW_CLOSE_BUTTON:Ljava/lang/String; = "keyShowCloseButton"

.field protected static final KEY_TITLE_RES_ID:Ljava/lang/String; = "titleResId"

.field public static onRequestUrl:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field extraUrl:Ljava/lang/String;

.field licenseResId:I

.field private mIndeterminateProgress:Landroid/widget/ProgressBar;

.field private mLicenseLoader:Landroid/os/AsyncTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/AsyncTask<",
            "Ljava/lang/Void;",
            "Ljava/lang/Void;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mWebView:Landroid/webkit/WebView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 52
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lnz/net/speakman/androidlicensespage/LicensesFragment;->onRequestUrl:Lcom/daaw/avee/Common/Events/WeakEventR1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 50
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    const v0, 0x7f0f001f

    .line 61
    iput v0, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment;->licenseResId:I

    const-string v0, ""

    .line 62
    iput-object v0, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment;->extraUrl:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$000(Lnz/net/speakman/androidlicensespage/LicensesFragment;I)V
    .locals 0

    .line 50
    invoke-direct {p0, p1}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->loadLicenses(I)V

    return-void
.end method

.method static synthetic access$100(Lnz/net/speakman/androidlicensespage/LicensesFragment;)Landroid/widget/ProgressBar;
    .locals 0

    .line 50
    iget-object p0, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment;->mIndeterminateProgress:Landroid/widget/ProgressBar;

    return-object p0
.end method

.method static synthetic access$200(Lnz/net/speakman/androidlicensespage/LicensesFragment;)Landroid/webkit/WebView;
    .locals 0

    .line 50
    iget-object p0, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment;->mWebView:Landroid/webkit/WebView;

    return-object p0
.end method

.method static synthetic access$302(Lnz/net/speakman/androidlicensespage/LicensesFragment;Landroid/os/AsyncTask;)Landroid/os/AsyncTask;
    .locals 0

    .line 50
    iput-object p1, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment;->mLicenseLoader:Landroid/os/AsyncTask;

    return-object p1
.end method

.method public static displayLicensesFragment(Landroid/app/FragmentManager;)V
    .locals 2

    .line 100
    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    const-string v1, "nz.net.speakman.androidlicensespage.LicensesFragment"

    .line 101
    invoke-virtual {p0, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 103
    invoke-virtual {v0, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    :cond_0
    const/4 p0, 0x0

    .line 105
    invoke-virtual {v0, p0}, Landroid/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 108
    invoke-static {}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->newInstance()Lnz/net/speakman/androidlicensespage/LicensesFragment;

    move-result-object p0

    .line 109
    invoke-virtual {p0, v0, v1}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentTransaction;Ljava/lang/String;)I

    return-void
.end method

.method public static displayLicensesFragment(Landroid/app/FragmentManager;ZIILjava/lang/String;)V
    .locals 2

    .line 121
    invoke-virtual {p0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    move-result-object v0

    const-string v1, "nz.net.speakman.androidlicensespage.LicensesFragment"

    .line 122
    invoke-virtual {p0, v1}, Landroid/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/app/Fragment;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 124
    invoke-virtual {v0, p0}, Landroid/app/FragmentTransaction;->remove(Landroid/app/Fragment;)Landroid/app/FragmentTransaction;

    :cond_0
    const/4 p0, 0x0

    .line 126
    invoke-virtual {v0, p0}, Landroid/app/FragmentTransaction;->addToBackStack(Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 129
    invoke-static {p1, p2, p3, p4}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->newInstance(ZIILjava/lang/String;)Lnz/net/speakman/androidlicensespage/LicensesFragment;

    move-result-object p0

    .line 130
    invoke-virtual {p0, v0, v1}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentTransaction;Ljava/lang/String;)I

    return-void
.end method

.method private loadLicenses(I)V
    .locals 1

    .line 227
    new-instance v0, Lnz/net/speakman/androidlicensespage/LicensesFragment$3;

    invoke-direct {v0, p0, p1}, Lnz/net/speakman/androidlicensespage/LicensesFragment$3;-><init>(Lnz/net/speakman/androidlicensespage/LicensesFragment;I)V

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Void;

    .line 263
    invoke-virtual {v0, p1}, Lnz/net/speakman/androidlicensespage/LicensesFragment$3;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    move-result-object p1

    iput-object p1, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment;->mLicenseLoader:Landroid/os/AsyncTask;

    return-void
.end method

.method public static newInstance()Lnz/net/speakman/androidlicensespage/LicensesFragment;
    .locals 1

    .line 69
    new-instance v0, Lnz/net/speakman/androidlicensespage/LicensesFragment;

    invoke-direct {v0}, Lnz/net/speakman/androidlicensespage/LicensesFragment;-><init>()V

    return-object v0
.end method

.method public static newInstance(ZIILjava/lang/String;)Lnz/net/speakman/androidlicensespage/LicensesFragment;
    .locals 3

    .line 80
    new-instance v0, Lnz/net/speakman/androidlicensespage/LicensesFragment;

    invoke-direct {v0}, Lnz/net/speakman/androidlicensespage/LicensesFragment;-><init>()V

    .line 82
    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v2, "keyShowCloseButton"

    .line 83
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string p0, "licenseResId"

    .line 84
    invoke-virtual {v1, p0, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "titleResId"

    .line 85
    invoke-virtual {v1, p0, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string p0, "extraUrl"

    .line 86
    invoke-virtual {v1, p0, p3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 87
    invoke-virtual {v0, v1}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->setArguments(Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .line 135
    invoke-super {p0, p1}, Landroid/app/DialogFragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 136
    iget p1, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment;->licenseResId:I

    invoke-direct {p0, p1}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->loadLicenses(I)V

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 5

    .line 153
    invoke-virtual {p0}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    const v0, 0x7f0c0081

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object p1

    const v0, 0x7f090131

    .line 154
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/webkit/WebView;

    iput-object v0, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment;->mWebView:Landroid/webkit/WebView;

    .line 155
    invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    const v0, 0x7f090130

    .line 156
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment;->mIndeterminateProgress:Landroid/widget/ProgressBar;

    .line 159
    iget-object v0, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment;->mWebView:Landroid/webkit/WebView;

    new-instance v1, Lnz/net/speakman/androidlicensespage/LicensesFragment$1;

    invoke-direct {v1, p0}, Lnz/net/speakman/androidlicensespage/LicensesFragment$1;-><init>(Lnz/net/speakman/androidlicensespage/LicensesFragment;)V

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 195
    invoke-virtual {p0}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "keyShowCloseButton"

    .line 197
    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    const v3, 0x7f0f001f

    const-string v4, "licenseResId"

    .line 198
    invoke-virtual {v0, v4, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v3

    iput v3, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment;->licenseResId:I

    const-string v3, "titleResId"

    .line 199
    invoke-virtual {v0, v3, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    const-string v3, "extraUrl"

    const-string v4, ""

    .line 200
    invoke-virtual {v0, v3, v4}, Landroid/os/Bundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment;->extraUrl:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 203
    :goto_0
    new-instance v0, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->getActivity()Landroid/app/Activity;

    move-result-object v3

    invoke-direct {v0, v3}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    if-eqz v1, :cond_1

    .line 204
    invoke-virtual {p0, v1}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 205
    :cond_1
    invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    if-eqz v2, :cond_2

    .line 207
    new-instance p1, Lnz/net/speakman/androidlicensespage/LicensesFragment$2;

    invoke-direct {p1, p0}, Lnz/net/speakman/androidlicensespage/LicensesFragment$2;-><init>(Lnz/net/speakman/androidlicensespage/LicensesFragment;)V

    const-string v1, "Close"

    invoke-virtual {v0, v1, p1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 216
    :cond_2
    invoke-virtual {p0, v0}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->onDialogBuild(Landroid/app/AlertDialog$Builder;)V

    .line 218
    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method

.method public onDestroy()V
    .locals 2

    .line 141
    invoke-super {p0}, Landroid/app/DialogFragment;->onDestroy()V

    .line 142
    iget-object v0, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment;->mLicenseLoader:Landroid/os/AsyncTask;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 143
    invoke-virtual {v0, v1}, Landroid/os/AsyncTask;->cancel(Z)Z

    :cond_0
    return-void
.end method

.method protected onDialogBuild(Landroid/app/AlertDialog$Builder;)V
    .locals 0

    return-void
.end method
