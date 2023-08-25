.class public final Lcom/daaw/lw6;
.super Lcom/daaw/dx6;
.source ""


# instance fields
.field public final synthetic q:Lcom/daaw/rw6;

.field public final synthetic r:Lcom/daaw/uw6;

.field public final synthetic s:Lcom/daaw/tj1;

.field public final synthetic t:Lcom/daaw/pw6;


# direct methods
.method public constructor <init>(Lcom/daaw/pw6;Lcom/daaw/tj1;Lcom/daaw/rw6;Lcom/daaw/uw6;Lcom/daaw/tj1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/lw6;->t:Lcom/daaw/pw6;

    iput-object p3, p0, Lcom/daaw/lw6;->q:Lcom/daaw/rw6;

    iput-object p4, p0, Lcom/daaw/lw6;->r:Lcom/daaw/uw6;

    iput-object p5, p0, Lcom/daaw/lw6;->s:Lcom/daaw/tj1;

    invoke-direct {p0, p2}, Lcom/daaw/dx6;-><init>(Lcom/daaw/tj1;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/lw6;->t:Lcom/daaw/pw6;

    iget-object v1, v1, Lcom/daaw/pw6;->a:Lcom/daaw/qx6;

    invoke-virtual {v1}, Lcom/daaw/qx6;->e()Landroid/os/IInterface;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/lw6;->t:Lcom/daaw/pw6;

    invoke-static {v2}, Lcom/daaw/pw6;->b(Lcom/daaw/pw6;)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/lw6;->q:Lcom/daaw/rw6;

    invoke-static {v2}, Lcom/daaw/pw6;->b(Lcom/daaw/pw6;)Ljava/lang/String;

    move-result-object v2

    new-instance v5, Landroid/os/Bundle;

    invoke-direct {v5}, Landroid/os/Bundle;-><init>()V

    const-string v6, "windowToken"

    invoke-virtual {v4}, Lcom/daaw/rw6;->e()Landroid/os/IBinder;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/os/Bundle;->putBinder(Ljava/lang/String;Landroid/os/IBinder;)V

    const-string v6, "adFieldEnifd"

    invoke-virtual {v4}, Lcom/daaw/rw6;->f()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "layoutGravity"

    invoke-virtual {v4}, Lcom/daaw/rw6;->c()I

    move-result v7

    invoke-virtual {v5, v6, v7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v6, "layoutVerticalMargin"

    invoke-virtual {v4}, Lcom/daaw/rw6;->a()F

    move-result v7

    invoke-virtual {v5, v6, v7}, Landroid/os/Bundle;->putFloat(Ljava/lang/String;F)V

    const-string v6, "displayMode"

    invoke-virtual {v5, v6, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v6, "windowWidthPx"

    invoke-virtual {v4}, Lcom/daaw/rw6;->d()I

    move-result v7

    invoke-virtual {v5, v6, v7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v6, "stableSessionToken"

    invoke-virtual {v5, v6, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    const-string v6, "callerPackage"

    invoke-virtual {v5, v6, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4}, Lcom/daaw/rw6;->g()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    const-string v2, "appId"

    invoke-virtual {v4}, Lcom/daaw/rw6;->g()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v2, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    new-instance v2, Lcom/daaw/ow6;

    iget-object v4, p0, Lcom/daaw/lw6;->t:Lcom/daaw/pw6;

    iget-object v6, p0, Lcom/daaw/lw6;->r:Lcom/daaw/uw6;

    invoke-direct {v2, v4, v6}, Lcom/daaw/ow6;-><init>(Lcom/daaw/pw6;Lcom/daaw/uw6;)V

    invoke-interface {v1, v3, v5, v2}, Lcom/daaw/zw6;->Q0(Ljava/lang/String;Landroid/os/Bundle;Lcom/daaw/bx6;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    invoke-static {}, Lcom/daaw/pw6;->a()Lcom/daaw/cx6;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    iget-object v4, p0, Lcom/daaw/lw6;->t:Lcom/daaw/pw6;

    invoke-static {v4}, Lcom/daaw/pw6;->b(Lcom/daaw/pw6;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v0

    const-string v0, "show overlay display from: %s"

    invoke-virtual {v2, v1, v0, v3}, Lcom/daaw/cx6;->c(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object v0, p0, Lcom/daaw/lw6;->s:Lcom/daaw/tj1;

    new-instance v2, Ljava/lang/RuntimeException;

    invoke-direct {v2, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v0, v2}, Lcom/daaw/tj1;->d(Ljava/lang/Exception;)Z

    return-void
.end method
