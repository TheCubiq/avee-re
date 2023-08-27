.class Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$4;
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

    .line 143
    iput-object p1, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$4;->this$0:Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 146
    new-instance p1, Ljava/io/File;

    invoke-static {}, Lcom/AOSPutils/Context_storage;->getInternalStoragePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 147
    iget-object v0, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$4;->this$0:Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;

    invoke-static {v0, p1}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->access$000(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;Ljava/io/File;)V

    return-void
.end method
