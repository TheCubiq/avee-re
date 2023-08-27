.class Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$7;
.super Ljava/lang/Object;
.source "DirectoryPickerDialog.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


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

    .line 188
    iput-object p1, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$7;->this$0:Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 190
    iget-object p1, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$7;->this$0:Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;

    invoke-static {p1}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->access$300(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    if-ge p3, p1, :cond_1

    iget-object p1, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$7;->this$0:Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;

    invoke-static {p1}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->access$300(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    .line 193
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$7;->this$0:Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;

    invoke-static {p1}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->access$300(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;)Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/io/File;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    .line 194
    iget-object p2, p0, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog$7;->this$0:Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;

    invoke-static {p2, p1}, Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;->access$200(Lcom/daaw/avee/comp/Common/DirectoryPickerDialog;Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method
