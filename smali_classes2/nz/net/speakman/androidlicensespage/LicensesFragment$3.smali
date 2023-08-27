.class Lnz/net/speakman/androidlicensespage/LicensesFragment$3;
.super Landroid/os/AsyncTask;
.source "LicensesFragment.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnz/net/speakman/androidlicensespage/LicensesFragment;->loadLicenses(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/os/AsyncTask<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lnz/net/speakman/androidlicensespage/LicensesFragment;

.field final synthetic val$resId:I


# direct methods
.method constructor <init>(Lnz/net/speakman/androidlicensespage/LicensesFragment;I)V
    .locals 0

    .line 227
    iput-object p1, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment$3;->this$0:Lnz/net/speakman/androidlicensespage/LicensesFragment;

    iput p2, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment$3;->val$resId:I

    invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V

    return-void
.end method


# virtual methods
.method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 227
    check-cast p1, [Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lnz/net/speakman/androidlicensespage/LicensesFragment$3;->doInBackground([Ljava/lang/Void;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/String;
    .locals 2

    .line 231
    iget-object p1, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment$3;->this$0:Lnz/net/speakman/androidlicensespage/LicensesFragment;

    invoke-virtual {p1}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->getActivity()Landroid/app/Activity;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    iget v0, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment$3;->val$resId:I

    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->openRawResource(I)Ljava/io/InputStream;

    move-result-object p1

    .line 232
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 235
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 238
    :goto_0
    :try_start_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 239
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    .line 240
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    .line 242
    :cond_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 247
    :catch_0
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method protected bridge synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 0

    .line 227
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lnz/net/speakman/androidlicensespage/LicensesFragment$3;->onPostExecute(Ljava/lang/String;)V

    return-void
.end method

.method protected onPostExecute(Ljava/lang/String;)V
    .locals 7

    .line 252
    invoke-super {p0, p1}, Landroid/os/AsyncTask;->onPostExecute(Ljava/lang/Object;)V

    .line 253
    iget-object v0, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment$3;->this$0:Lnz/net/speakman/androidlicensespage/LicensesFragment;

    invoke-virtual {v0}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lnz/net/speakman/androidlicensespage/LicensesFragment$3;->isCancelled()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 256
    :cond_0
    iget-object v0, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment$3;->this$0:Lnz/net/speakman/androidlicensespage/LicensesFragment;

    invoke-static {v0}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->access$100(Lnz/net/speakman/androidlicensespage/LicensesFragment;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 257
    iget-object v0, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment$3;->this$0:Lnz/net/speakman/androidlicensespage/LicensesFragment;

    invoke-static {v0}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->access$200(Lnz/net/speakman/androidlicensespage/LicensesFragment;)Landroid/webkit/WebView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V

    .line 259
    iget-object v0, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment$3;->this$0:Lnz/net/speakman/androidlicensespage/LicensesFragment;

    invoke-static {v0}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->access$200(Lnz/net/speakman/androidlicensespage/LicensesFragment;)Landroid/webkit/WebView;

    move-result-object v1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "file:///android_asset/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment$3;->this$0:Lnz/net/speakman/androidlicensespage/LicensesFragment;

    iget-object v2, v2, Lnz/net/speakman/androidlicensespage/LicensesFragment;->extraUrl:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    const-string v4, "text/html"

    const-string v5, "utf-8"

    move-object v3, p1

    invoke-virtual/range {v1 .. v6}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 260
    iget-object p1, p0, Lnz/net/speakman/androidlicensespage/LicensesFragment$3;->this$0:Lnz/net/speakman/androidlicensespage/LicensesFragment;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->access$302(Lnz/net/speakman/androidlicensespage/LicensesFragment;Landroid/os/AsyncTask;)Landroid/os/AsyncTask;

    :cond_1
    :goto_0
    return-void
.end method
