.class public final Lcom/daaw/l22;
.super Lcom/daaw/o02;
.source ""


# instance fields
.field public final synthetic a:Landroid/app/Dialog;

.field public final synthetic b:Lcom/daaw/n22;


# direct methods
.method public constructor <init>(Lcom/daaw/n22;Landroid/app/Dialog;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/l22;->b:Lcom/daaw/n22;

    iput-object p2, p0, Lcom/daaw/l22;->a:Landroid/app/Dialog;

    invoke-direct {p0}, Lcom/daaw/o02;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/l22;->b:Lcom/daaw/n22;

    iget-object v0, v0, Lcom/daaw/n22;->q:Lcom/daaw/p22;

    invoke-static {v0}, Lcom/daaw/p22;->r(Lcom/daaw/p22;)V

    iget-object v0, p0, Lcom/daaw/l22;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/l22;->a:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    return-void
.end method
