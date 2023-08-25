.class public final Lcom/daaw/zi6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/o67;


# instance fields
.field public final synthetic a:Lcom/daaw/a74;

.field public final synthetic b:Lcom/daaw/op6;

.field public final synthetic c:Lcom/daaw/cq5;


# direct methods
.method public constructor <init>(Lcom/daaw/a74;Lcom/daaw/op6;Lcom/daaw/cq5;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zi6;->a:Lcom/daaw/a74;

    iput-object p2, p0, Lcom/daaw/zi6;->b:Lcom/daaw/op6;

    iput-object p3, p0, Lcom/daaw/zi6;->c:Lcom/daaw/cq5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 8

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    iget-object p1, p0, Lcom/daaw/zi6;->a:Lcom/daaw/a74;

    invoke-interface {p1}, Lcom/daaw/a74;->d()Lcom/daaw/th6;

    move-result-object p1

    iget-boolean p1, p1, Lcom/daaw/th6;->k0:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/zi6;->b:Lcom/daaw/op6;

    const/4 v0, 0x0

    invoke-virtual {p1, v4, v0}, Lcom/daaw/op6;->c(Ljava/lang/String;Lcom/daaw/to6;)V

    return-void

    :cond_0
    new-instance p1, Lcom/daaw/eq5;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzB()Lcom/daaw/ag;

    move-result-object v0

    invoke-interface {v0}, Lcom/daaw/ag;->a()J

    move-result-wide v1

    iget-object v0, p0, Lcom/daaw/zi6;->a:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->v()Lcom/daaw/wh6;

    move-result-object v0

    iget-object v3, v0, Lcom/daaw/wh6;->b:Ljava/lang/String;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zzo()Lcom/daaw/qz3;

    move-result-object v0

    iget-object v5, p0, Lcom/daaw/zi6;->a:Lcom/daaw/a74;

    invoke-interface {v5}, Lcom/daaw/a74;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v0, v5}, Lcom/daaw/qz3;->x(Landroid/content/Context;)Z

    move-result v0

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-nez v0, :cond_1

    sget-object v0, Lcom/daaw/g93;->J5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v7

    invoke-virtual {v7, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/zi6;->a:Lcom/daaw/a74;

    invoke-interface {v0}, Lcom/daaw/a74;->d()Lcom/daaw/th6;

    move-result-object v0

    iget-boolean v0, v0, Lcom/daaw/th6;->T:Z

    if-eqz v0, :cond_2

    :cond_1
    const/4 v5, 0x2

    :cond_2
    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/daaw/eq5;-><init>(JLjava/lang/String;Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/daaw/zi6;->c:Lcom/daaw/cq5;

    invoke-virtual {v0, p1}, Lcom/daaw/cq5;->u(Lcom/daaw/eq5;)V

    return-void
.end method

.method public final b(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method
