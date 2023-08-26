.class Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$6;
.super Ljava/lang/Object;
.source "DirectoryPickerDialog.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


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

    .line 171
    iput-object p1, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$6;->this$0:Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 174
    iget-object p1, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$6;->this$0:Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;

    invoke-static {p1}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->access$100(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;)Ljava/io/File;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$6;->this$0:Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;

    invoke-static {p1}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->access$100(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;)Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    .line 176
    iget-object v0, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$6;->this$0:Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->access$200(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;Ljava/lang/String;)V

    :cond_1
    return-void
.end method
