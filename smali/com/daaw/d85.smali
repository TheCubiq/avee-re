.class public final Lcom/daaw/d85;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/zg3;


# instance fields
.field public final a:Lcom/daaw/ce3;

.field public final b:Lcom/daaw/u85;

.field public final c:Lcom/daaw/qz7;


# direct methods
.method public constructor <init>(Lcom/daaw/u35;Lcom/daaw/j35;Lcom/daaw/u85;Lcom/daaw/qz7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p2}, Lcom/daaw/j35;->g0()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/u35;->c(Ljava/lang/String;)Lcom/daaw/ce3;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/d85;->a:Lcom/daaw/ce3;

    iput-object p3, p0, Lcom/daaw/d85;->b:Lcom/daaw/u85;

    iput-object p4, p0, Lcom/daaw/d85;->c:Lcom/daaw/qz7;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 2

    const-string p1, "asset"

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    :try_start_0
    iget-object p2, p0, Lcom/daaw/d85;->a:Lcom/daaw/ce3;

    iget-object v0, p0, Lcom/daaw/d85;->c:Lcom/daaw/qz7;

    invoke-interface {v0}, Lcom/daaw/qz7;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/sd3;

    invoke-interface {p2, v0, p1}, Lcom/daaw/ce3;->u0(Lcom/daaw/sd3;Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Failed to call onCustomClick for asset "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Lcom/daaw/k04;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/d85;->a:Lcom/daaw/ce3;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/d85;->b:Lcom/daaw/u85;

    const-string v1, "/nativeAdCustomClick"

    invoke-virtual {v0, v1, p0}, Lcom/daaw/u85;->i(Ljava/lang/String;Lcom/daaw/zg3;)V

    return-void
.end method
