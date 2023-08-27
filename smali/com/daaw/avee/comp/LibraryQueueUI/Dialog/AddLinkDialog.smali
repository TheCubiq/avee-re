.class public Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;
.super Landroid/app/DialogFragment;
.source "AddLinkDialog.java"


# static fields
.field public static onSubmitAddByLink:Lcom/daaw/avee/Common/Events/WeakEvent2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent2<",
            "Lcom/daaw/avee/ContextData;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private currentSample:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 25
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent2;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;->onSubmitAddByLink:Lcom/daaw/avee/Common/Events/WeakEvent2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 35
    invoke-direct {p0}, Landroid/app/DialogFragment;-><init>()V

    const/4 v0, 0x0

    .line 27
    iput v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;->currentSample:I

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;)I
    .locals 0

    .line 23
    iget p0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;->currentSample:I

    return p0
.end method

.method static synthetic access$002(Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;I)I
    .locals 0

    .line 23
    iput p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;->currentSample:I

    return p1
.end method

.method public static createAndShowDialog(Lcom/daaw/avee/ContextData;)Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;
    .locals 2

    .line 30
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;

    invoke-direct {v0}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;-><init>()V

    const-string v1, "AddLinkDialog"

    .line 31
    invoke-static {v0, v1, p0}, Lcom/daaw/avee/Common/UtilsUI;->showDialogSafe(Landroid/app/DialogFragment;Ljava/lang/String;Lcom/daaw/avee/ContextData;)V

    return-object v0
.end method


# virtual methods
.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .line 40
    new-instance p1, Landroid/app/AlertDialog$Builder;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 42
    invoke-virtual {p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;->getActivity()Landroid/app/Activity;

    move-result-object v0

    const v1, 0x7f0c0039

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 43
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    const v1, 0x7f0900c9

    .line 45
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/EditText;

    const v2, 0x7f100039

    .line 46
    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setText(I)V

    const v2, 0x7f090259

    .line 48
    invoke-virtual {v0, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 49
    new-instance v2, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog$1;

    invoke-direct {v2, p0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;Landroid/widget/EditText;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f10003e

    .line 76
    invoke-virtual {p1, v0}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    .line 78
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog$2;

    invoke-direct {v0, p0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog$2;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;Landroid/widget/EditText;)V

    const v1, 0x7f100036

    invoke-virtual {p1, v1, v0}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 85
    new-instance v0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog$3;

    invoke-direct {v0, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog$3;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;)V

    const v1, 0x7f100044

    invoke-virtual {p1, v1, v0}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 91
    invoke-virtual {p1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method
