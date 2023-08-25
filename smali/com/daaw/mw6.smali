.class public final Lcom/daaw/mw6;
.super Lcom/daaw/dx6;
.source ""


# instance fields
.field public final synthetic q:Lcom/daaw/dw6;

.field public final synthetic r:Lcom/daaw/uw6;

.field public final synthetic s:Lcom/daaw/tj1;

.field public final synthetic t:Lcom/daaw/pw6;


# direct methods
.method public constructor <init>(Lcom/daaw/pw6;Lcom/daaw/tj1;Lcom/daaw/dw6;Lcom/daaw/uw6;Lcom/daaw/tj1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/mw6;->t:Lcom/daaw/pw6;

    iput-object p3, p0, Lcom/daaw/mw6;->q:Lcom/daaw/dw6;

    iput-object p4, p0, Lcom/daaw/mw6;->r:Lcom/daaw/uw6;

    iput-object p5, p0, Lcom/daaw/mw6;->s:Lcom/daaw/tj1;

    invoke-direct {p0, p2}, Lcom/daaw/dx6;-><init>(Lcom/daaw/tj1;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 6

    :try_start_0
    iget-object v0, p0, Lcom/daaw/mw6;->t:Lcom/daaw/pw6;

    iget-object v0, v0, Lcom/daaw/pw6;->a:Lcom/daaw/qx6;

    invoke-virtual {v0}, Lcom/daaw/qx6;->e()Landroid/os/IInterface;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/mw6;->q:Lcom/daaw/dw6;

    iget-object v2, p0, Lcom/daaw/mw6;->t:Lcom/daaw/pw6;

    invoke-static {v2}, Lcom/daaw/pw6;->b(Lcom/daaw/pw6;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    const-string v4, "sessionToken"

    invoke-virtual {v1}, Lcom/daaw/dw6;->b()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "callerPackage"

    invoke-virtual {v3, v4, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "appId"

    invoke-virtual {v1}, Lcom/daaw/dw6;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v1, Lcom/daaw/ow6;

    iget-object v2, p0, Lcom/daaw/mw6;->t:Lcom/daaw/pw6;

    iget-object v4, p0, Lcom/daaw/mw6;->r:Lcom/daaw/uw6;

    invoke-direct {v1, v2, v4}, Lcom/daaw/ow6;-><init>(Lcom/daaw/pw6;Lcom/daaw/uw6;)V

    invoke-interface {v0, v3, v1}, Lcom/daaw/zw6;->O(Landroid/os/Bundle;Lcom/daaw/bx6;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-static {}, Lcom/daaw/pw6;->a()Lcom/daaw/cx6;

    move-result-object v1

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/daaw/mw6;->t:Lcom/daaw/pw6;

    invoke-static {v4}, Lcom/daaw/pw6;->b(Lcom/daaw/pw6;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const-string v3, "dismiss overlay display from: %s"

    invoke-virtual {v1, v0, v3, v2}, Lcom/daaw/cx6;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v1, p0, Lcom/daaw/mw6;->s:Lcom/daaw/tj1;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lcom/daaw/tj1;->d(Ljava/lang/Exception;)Z

    return-void
.end method
