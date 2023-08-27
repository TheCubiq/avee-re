.class Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog$3;
.super Ljava/lang/Object;
.source "AddLinkDialog.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;)V
    .locals 0

    .line 85
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog$3;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 87
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog$3;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/avee/Common/UtilsUI;->cancelDialogSafe(Landroid/app/Dialog;)V

    return-void
.end method
