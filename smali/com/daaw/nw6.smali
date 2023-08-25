.class public final Lcom/daaw/nw6;
.super Lcom/daaw/dx6;
.source ""


# instance fields
.field public final synthetic q:Lcom/daaw/ww6;

.field public final synthetic r:I

.field public final synthetic s:Lcom/daaw/uw6;

.field public final synthetic t:Lcom/daaw/tj1;

.field public final synthetic u:Lcom/daaw/pw6;


# direct methods
.method public constructor <init>(Lcom/daaw/pw6;Lcom/daaw/tj1;Lcom/daaw/ww6;ILcom/daaw/uw6;Lcom/daaw/tj1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nw6;->u:Lcom/daaw/pw6;

    iput-object p3, p0, Lcom/daaw/nw6;->q:Lcom/daaw/ww6;

    iput p4, p0, Lcom/daaw/nw6;->r:I

    iput-object p5, p0, Lcom/daaw/nw6;->s:Lcom/daaw/uw6;

    iput-object p6, p0, Lcom/daaw/nw6;->t:Lcom/daaw/tj1;

    invoke-direct {p0, p2}, Lcom/daaw/dx6;-><init>(Lcom/daaw/tj1;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lcom/daaw/nw6;->u:Lcom/daaw/pw6;

    iget-object v0, v0, Lcom/daaw/pw6;->a:Lcom/daaw/qx6;

    invoke-virtual {v0}, Lcom/daaw/qx6;->e()Landroid/os/IInterface;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/nw6;->q:Lcom/daaw/ww6;

    iget-object v2, p0, Lcom/daaw/nw6;->u:Lcom/daaw/pw6;

    invoke-static {v2}, Lcom/daaw/pw6;->b(Lcom/daaw/pw6;)Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/daaw/nw6;->r:I

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v5, "sessionToken"

    invoke-virtual {v1}, Lcom/daaw/ww6;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5, v6}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v5, "displayMode"

    invoke-virtual {v4, v5, v3}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v3, "callerPackage"

    invoke-virtual {v4, v3, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "appId"

    invoke-virtual {v1}, Lcom/daaw/ww6;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/daaw/ow6;

    iget-object v2, p0, Lcom/daaw/nw6;->u:Lcom/daaw/pw6;

    iget-object v3, p0, Lcom/daaw/nw6;->s:Lcom/daaw/uw6;

    invoke-direct {v1, v2, v3}, Lcom/daaw/ow6;-><init>(Lcom/daaw/pw6;Lcom/daaw/uw6;)V

    invoke-interface {v0, v4, v1}, Lcom/daaw/zw6;->M0(Landroid/os/Bundle;Lcom/daaw/bx6;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/daaw/pw6;->a()Lcom/daaw/cx6;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget v4, p0, Lcom/daaw/nw6;->r:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lcom/daaw/nw6;->u:Lcom/daaw/pw6;

    invoke-static {v4}, Lcom/daaw/pw6;->b(Lcom/daaw/pw6;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const-string v3, "switchDisplayMode overlay display to %d from: %s"

    invoke-virtual {v1, v0, v3, v2}, Lcom/daaw/cx6;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lcom/daaw/nw6;->t:Lcom/daaw/tj1;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lcom/daaw/tj1;->d(Ljava/lang/Exception;)Z

    return-void
.end method
