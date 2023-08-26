.class public Lcom/daaw/avee/comp/InAppBilling/StoreNotAvailableVerDialog;
.super Landroid/app/DialogFragment;
.source "StoreNotAvailableVerDialog.java"


# static fields
.field private static instanceWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/InAppBilling/StoreNotAvailableVerDialog;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 21
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/comp/InAppBilling/StoreNotAvailableVerDialog;->instanceWeak:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 19
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    return-void
.end method

.method public static createAndShowStoreNotAvailableVerDialog(Lcom/daaw/avee/ContextData;)Lcom/daaw/avee/comp/InAppBilling/StoreNotAvailableVerDialog;
    .locals 2

    .line 24
    sget-object v0, Lcom/daaw/avee/comp/InAppBilling/StoreNotAvailableVerDialog;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/InAppBilling/StoreNotAvailableVerDialog;

    if-eqz v0, :cond_0

    .line 25
    invoke-virtual {v0}, Lcom/daaw/avee/comp/InAppBilling/StoreNotAvailableVerDialog;->getDialog()Landroid/app/Dialog;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/daaw/avee/comp/InAppBilling/StoreNotAvailableVerDialog;->getDialog()Landroid/app/Dialog;

    move-result-object v1

    invoke-virtual {v1}, Landroid/app/Dialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    .line 28
    :cond_0
    new-instance v0, Lcom/daaw/avee/comp/InAppBilling/StoreNotAvailableVerDialog;

    invoke-direct {v0}, Lcom/daaw/avee/comp/InAppBilling/StoreNotAvailableVerDialog;-><init>()V

    const-string v1, "StoreNotAvailableVerDialog"

    .line 29
    invoke-static {v0, v1, p0}, Lcom/daaw/avee/Common/UtilsUI;->showDialogSafe(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/avee/ContextData;)V

    .line 30
    new-instance p0, Ljava/lang/ref/WeakReference;

    invoke-direct {p0, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object p0, Lcom/daaw/avee/comp/InAppBilling/StoreNotAvailableVerDialog;->instanceWeak:Ljava/lang/ref/WeakReference;

    return-object v0
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .line 37
    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/InAppBilling/StoreNotAvailableVerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 39
    invoke-virtual {p0}, Lcom/daaw/avee/comp/InAppBilling/StoreNotAvailableVerDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0c0068

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 40
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    .line 43
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method
