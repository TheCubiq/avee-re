.class Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$9;
.super Ljava/lang/Object;
.source "DirectoryPickerDialog.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;)V
    .locals 0

    .line 205
    iput-object p1, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$9;->this$0:Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 207
    iget-object p1, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$9;->this$0:Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->getDialog()Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->cancel()V

    return-void
.end method
