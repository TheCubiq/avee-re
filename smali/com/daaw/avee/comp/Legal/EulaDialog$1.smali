.class Lcom/daaw/avee/comp/Legal/EulaDialog$1;
.super Ljava/lang/Object;
.source "EulaDialog.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/Legal/EulaDialog;->onDialogBuild(Landroid/app/AlertDialog$Builder;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/Legal/EulaDialog;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/Legal/EulaDialog;)V
    .locals 0

    .line 77
    iput-object p1, p0, Lcom/daaw/avee/comp/Legal/EulaDialog$1;->this$0:Lcom/daaw/avee/comp/Legal/EulaDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 80
    sget-object p2, Lcom/daaw/avee/comp/Legal/EulaDialog;->onRejectEula:Lcom/daaw/avee/Common/Events/WeakEvent1;

    iget-object v0, p0, Lcom/daaw/avee/comp/Legal/EulaDialog$1;->this$0:Lcom/daaw/avee/comp/Legal/EulaDialog;

    invoke-virtual {p2, v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;->invoke(Ljava/lang/Object;)V

    .line 81
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void
.end method
