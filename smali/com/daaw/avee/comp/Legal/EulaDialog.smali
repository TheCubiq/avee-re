.class public Lcom/daaw/avee/comp/Legal/EulaDialog;
.super Lnz/net/speakman/androidlicensespage/LicensesFragment;
.source "EulaDialog.java"


# static fields
.field private static fragmentTag:Ljava/lang/String;

.field public static onAcceptEula:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/comp/Legal/EulaDialog;",
            ">;"
        }
    .end annotation
.end field

.field public static onDismissEula:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/comp/Legal/EulaDialog;",
            ">;"
        }
    .end annotation
.end field

.field public static onRejectEula:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/comp/Legal/EulaDialog;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 28
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Legal/EulaDialog;->onAcceptEula:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 29
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Legal/EulaDialog;->onRejectEula:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 30
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Legal/EulaDialog;->onDismissEula:Lcom/daaw/avee/Common/Events/WeakEvent1;

    const-string v0, "EulaDialog"

    .line 33
    sput-object v0, Lcom/daaw/avee/comp/Legal/EulaDialog;->fragmentTag:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 26
    invoke-direct {p0}, Lnz/net/speakman/androidlicensespage/LicensesFragment;-><init>()V

    return-void
.end method

.method public static createAndShow(Lcom/daaw/avee/ContextData;Z)V
    .locals 4

    .line 44
    new-instance p1, Lcom/daaw/avee/comp/Legal/EulaDialog;

    invoke-direct {p1}, Lcom/daaw/avee/comp/Legal/EulaDialog;-><init>()V

    .line 46
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const/4 v1, 0x0

    const-string v2, "keyShowCloseButton"

    .line 47
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v2, "licenseResId"

    const v3, 0x7f0f001a

    .line 48
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "titleResId"

    .line 49
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v2, "extraUrl"

    const-string v3, ""

    .line 50
    invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Legal/EulaDialog;->setArguments(Landroid/os/Bundle;)V

    .line 53
    invoke-virtual {p1, v1}, Lcom/daaw/avee/comp/Legal/EulaDialog;->setCancelable(Z)V

    .line 55
    sget-object v0, Lcom/daaw/avee/comp/Legal/EulaDialog;->fragmentTag:Ljava/lang/String;

    invoke-static {p0, p1, v0}, Lcom/daaw/avee/Common/UtilsUI;->displayOneDialog(Lcom/daaw/avee/ContextData;Landroid/app/DialogFragment;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method protected onDialogBuild(Landroid/app/AlertDialog$Builder;)V
    .locals 2

    .line 74
    invoke-super {p0, p1}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->onDialogBuild(Landroid/app/AlertDialog$Builder;)V

    .line 76
    new-instance v0, Lcom/daaw/avee/comp/Legal/EulaDialog$1;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/Legal/EulaDialog$1;-><init>(Lcom/daaw/avee/comp/Legal/EulaDialog;)V

    const-string v1, "Decline"

    invoke-virtual {p1, v1, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 88
    new-instance v0, Lcom/daaw/avee/comp/Legal/EulaDialog$2;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/Legal/EulaDialog$2;-><init>(Lcom/daaw/avee/comp/Legal/EulaDialog;)V

    const-string v1, "I Agree"

    invoke-virtual {p1, v1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    .line 102
    invoke-super {p0, p1}, Lnz/net/speakman/androidlicensespage/LicensesFragment;->onDismiss(Landroid/content/DialogInterface;)V

    .line 104
    sget-object p1, Lcom/daaw/avee/comp/Legal/EulaDialog;->onDismissEula:Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-virtual {p1, p0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    return-void
.end method
