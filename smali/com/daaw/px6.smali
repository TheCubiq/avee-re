.class public final Lcom/daaw/px6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/content/ServiceConnection;


# instance fields
.field public final synthetic a:Lcom/daaw/qx6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/qx6;Lcom/daaw/ox6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/px6;->a:Lcom/daaw/qx6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/px6;->a:Lcom/daaw/qx6;

    invoke-static {v0}, Lcom/daaw/qx6;->f(Lcom/daaw/qx6;)Lcom/daaw/cx6;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "ServiceConnectionImpl.onServiceConnected(%s)"

    invoke-virtual {v0, p1, v1}, Lcom/daaw/cx6;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object p1, p0, Lcom/daaw/px6;->a:Lcom/daaw/qx6;

    new-instance v0, Lcom/daaw/mx6;

    invoke-direct {v0, p0, p2}, Lcom/daaw/mx6;-><init>(Lcom/daaw/px6;Landroid/os/IBinder;)V

    invoke-virtual {p1}, Lcom/daaw/qx6;->c()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/px6;->a:Lcom/daaw/qx6;

    invoke-static {v0}, Lcom/daaw/qx6;->f(Lcom/daaw/qx6;)Lcom/daaw/cx6;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "ServiceConnectionImpl.onServiceDisconnected(%s)"

    invoke-virtual {v0, p1, v1}, Lcom/daaw/cx6;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    iget-object p1, p0, Lcom/daaw/px6;->a:Lcom/daaw/qx6;

    new-instance v0, Lcom/daaw/nx6;

    invoke-direct {v0, p0}, Lcom/daaw/nx6;-><init>(Lcom/daaw/px6;)V

    invoke-virtual {p1}, Lcom/daaw/qx6;->c()Landroid/os/Handler;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
