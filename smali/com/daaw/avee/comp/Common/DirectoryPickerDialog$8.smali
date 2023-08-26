.class Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$8;
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

.field final synthetic val$valueIdentifier:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;Ljava/lang/String;)V
    .locals 0

    .line 198
    iput-object p1, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$8;->this$0:Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;

    iput-object p2, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$8;->val$valueIdentifier:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 201
    iget-object p1, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$8;->this$0:Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;

    invoke-static {p1}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->access$400(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;)Landroid/widget/EditText;

    move-result-object p2

    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$8;->val$valueIdentifier:Ljava/lang/String;

    invoke-static {p1, p2, v0}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->access$500(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
