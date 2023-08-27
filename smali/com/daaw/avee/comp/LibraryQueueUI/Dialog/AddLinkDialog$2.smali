.class Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog$2;
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

.field final synthetic val$et1:Landroid/widget/EditText;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;Landroid/widget/EditText;)V
    .locals 0

    .line 78
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog$2;->this$0:Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;

    iput-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog$2;->val$et1:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 81
    sget-object p1, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog;->onSubmitAddByLink:Lcom/daaw/avee/Common/Events/WeakEvent2;

    new-instance p2, Lcom/daaw/avee/ContextData;

    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog$2;->val$et1:Landroid/widget/EditText;

    invoke-direct {p2, v0}, Lcom/daaw/avee/ContextData;-><init>(Landroid/view/View;)V

    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/Dialog/AddLinkDialog$2;->val$et1:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/daaw/avee/Common/Events/WeakEvent2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
