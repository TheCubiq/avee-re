.class public final synthetic Lcom/daaw/zf5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/fg5;

.field public final synthetic q:Lcom/daaw/gj3;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/fg5;Lcom/daaw/gj3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zf5;->p:Lcom/daaw/fg5;

    iput-object p2, p0, Lcom/daaw/zf5;->q:Lcom/daaw/gj3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/zf5;->p:Lcom/daaw/fg5;

    iget-object v1, p0, Lcom/daaw/zf5;->q:Lcom/daaw/gj3;

    :try_start_0
    invoke-virtual {v0}, Lcom/daaw/fg5;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v1, v0}, Lcom/daaw/gj3;->k2(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, ""

    invoke-static {v1, v0}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
