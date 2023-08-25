.class public final Lcom/daaw/hx6;
.super Lcom/daaw/dx6;
.source ""


# instance fields
.field public final synthetic q:Lcom/daaw/qx6;


# direct methods
.method public constructor <init>(Lcom/daaw/qx6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/hx6;->q:Lcom/daaw/qx6;

    invoke-direct {p0}, Lcom/daaw/dx6;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/hx6;->q:Lcom/daaw/qx6;

    invoke-static {v0}, Lcom/daaw/qx6;->d(Lcom/daaw/qx6;)Landroid/os/IInterface;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/daaw/qx6;->f(Lcom/daaw/qx6;)Lcom/daaw/cx6;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Unbind from service."

    invoke-virtual {v0, v3, v2}, Lcom/daaw/cx6;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lcom/daaw/hx6;->q:Lcom/daaw/qx6;

    invoke-static {v0}, Lcom/daaw/qx6;->a(Lcom/daaw/qx6;)Landroid/content/Context;

    move-result-object v2

    invoke-static {v0}, Lcom/daaw/qx6;->b(Lcom/daaw/qx6;)Landroid/content/ServiceConnection;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iget-object v0, p0, Lcom/daaw/hx6;->q:Lcom/daaw/qx6;

    invoke-static {v0, v1}, Lcom/daaw/qx6;->j(Lcom/daaw/qx6;Z)V

    iget-object v0, p0, Lcom/daaw/hx6;->q:Lcom/daaw/qx6;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/qx6;->k(Lcom/daaw/qx6;Landroid/os/IInterface;)V

    iget-object v0, p0, Lcom/daaw/hx6;->q:Lcom/daaw/qx6;

    invoke-static {v0, v1}, Lcom/daaw/qx6;->i(Lcom/daaw/qx6;Landroid/content/ServiceConnection;)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/hx6;->q:Lcom/daaw/qx6;

    invoke-static {v0}, Lcom/daaw/qx6;->l(Lcom/daaw/qx6;)V

    return-void
.end method
