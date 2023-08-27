.class public Lcom/daaw/avee/comp/InAppBilling/StoreDialog;
.super Landroid/app/DialogFragment;
.source "StoreDialog.java"


# static fields
.field private static instanceWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/InAppBilling/StoreDialog;",
            ">;"
        }
    .end annotation
.end field

.field public static onBuyAction:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Lcom/daaw/avee/ContextData;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestIsPremium:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private btnBuy:Landroid/widget/Button;

.field private colorOff:I

.field private colorOn:I

.field private secondsRemaining:I

.field private timerOn:Z

.field private timerTask:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 33
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->onBuyAction:Lcom/daaw/avee/Common/Events/WeakEvent1;

    .line 34
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->onRequestIsPremium:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 48
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->instanceWeak:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 31
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    const/4 v0, 0x0

    .line 42
    iput-boolean v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->timerOn:Z

    .line 43
    iput v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->secondsRemaining:I

    return-void
.end method

.method public static createAndShowStoreDialog(Lcom/daaw/avee/ContextData;)Lcom/daaw/avee/comp/InAppBilling/StoreDialog;
    .locals 2

    .line 51
    sget-object v0, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;

    if-eqz v0, :cond_0

    .line 52
    invoke-virtual {v0}, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->getDialog()Landroid/app/Dialog;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->getDialog()Landroid/app/Dialog;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Dialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 55
    :cond_0
    new-instance v0, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;

    invoke-direct {v0}, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;-><init>()V

    const-string v1, "StoreDialog"

    .line 56
    invoke-static {v0, v1, p0}, Lcom/daaw/avee/Common/UtilsUI;->showDialogSafe(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/avee/ContextData;)V

    .line 57
    new-instance p0, Ljava/lang/ref/WeakReference;

    invoke-direct {p0, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object p0, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->instanceWeak:Ljava/lang/ref/WeakReference;

    return-object v0
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .line 64
    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 66
    invoke-virtual {p0}, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0c0067

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 67
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f090066

    .line 76
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->btnBuy:Landroid/widget/Button;

    .line 78
    sget-object v0, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->onRequestIsPremium:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 79
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->btnBuy:Landroid/widget/Button;

    const v1, 0x7f100173

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    goto :goto_0

    .line 81
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->btnBuy:Landroid/widget/Button;

    const v1, 0x7f100171

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setText(I)V

    .line 99
    :goto_0
    iget-object v0, p0, Lcom/daaw/avee/comp/InAppBilling/StoreDialog;->btnBuy:Landroid/widget/Button;

    new-instance v1, Lcom/daaw/avee/comp/InAppBilling/StoreDialog$1;

    invoke-direct {v1, p0}, Lcom/daaw/avee/comp/InAppBilling/StoreDialog$1;-><init>(Lcom/daaw/avee/comp/InAppBilling/StoreDialog;)V

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 143
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method
