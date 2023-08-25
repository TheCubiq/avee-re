.class public final Lcom/daaw/pn6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/pn6;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/pn6;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/pn6;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/daaw/pn6;->a:Lcom/daaw/m08;

    invoke-static {v0}, Lcom/daaw/vz7;->a(Lcom/daaw/m08;)Lcom/daaw/qz7;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/pn6;->b:Lcom/daaw/m08;

    invoke-static {v1}, Lcom/daaw/vz7;->a(Lcom/daaw/m08;)Lcom/daaw/qz7;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/pn6;->c:Lcom/daaw/m08;

    invoke-interface {v2}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v3, Lcom/daaw/g93;->L7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_0

    new-instance v1, Lcom/daaw/rn6;

    invoke-interface {v0}, Lcom/daaw/qz7;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/on6;

    invoke-direct {v1, v0, v2}, Lcom/daaw/rn6;-><init>(Lcom/daaw/on6;Ljava/util/concurrent/ScheduledExecutorService;)V

    goto :goto_0

    :cond_0
    invoke-interface {v1}, Lcom/daaw/qz7;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/daaw/on6;

    :goto_0
    invoke-static {v1}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method
