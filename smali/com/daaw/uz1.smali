.class public final Lcom/daaw/uz1;
.super Lcom/daaw/p22;
.source ""


# instance fields
.field public final u:Lcom/daaw/j6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/j6<",
            "Lcom/daaw/o3<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final v:Lcom/daaw/z70;


# direct methods
.method public constructor <init>(Lcom/daaw/pj0;Lcom/daaw/z70;Lcom/daaw/w70;)V
    .locals 0

    invoke-direct {p0, p1, p3}, Lcom/daaw/p22;-><init>(Lcom/daaw/pj0;Lcom/daaw/w70;)V

    new-instance p1, Lcom/daaw/j6;

    invoke-direct {p1}, Lcom/daaw/j6;-><init>()V

    iput-object p1, p0, Lcom/daaw/uz1;->u:Lcom/daaw/j6;

    iput-object p2, p0, Lcom/daaw/uz1;->v:Lcom/daaw/z70;

    iget-object p1, p0, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->p:Lcom/daaw/pj0;

    const-string p2, "ConnectionlessLifecycleHelper"

    invoke-interface {p1, p2, p0}, Lcom/daaw/pj0;->b(Ljava/lang/String;Lcom/google/android/gms/common/api/internal/LifecycleCallback;)V

    return-void
.end method

.method public static u(Landroid/app/Activity;Lcom/daaw/z70;Lcom/daaw/o3;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Lcom/daaw/z70;",
            "Lcom/daaw/o3<",
            "*>;)V"
        }
    .end annotation

    invoke-static {p0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->c(Landroid/app/Activity;)Lcom/daaw/pj0;

    move-result-object p0

    const-class v0, Lcom/daaw/uz1;

    const-string v1, "ConnectionlessLifecycleHelper"

    invoke-interface {p0, v1, v0}, Lcom/daaw/pj0;->e(Ljava/lang/String;Ljava/lang/Class;)Lcom/google/android/gms/common/api/internal/LifecycleCallback;

    move-result-object v0

    check-cast v0, Lcom/daaw/uz1;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/uz1;

    invoke-static {}, Lcom/daaw/w70;->m()Lcom/daaw/w70;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lcom/daaw/uz1;-><init>(Lcom/daaw/pj0;Lcom/daaw/z70;Lcom/daaw/w70;)V

    :cond_0
    const-string p0, "ApiKey cannot be null"

    invoke-static {p2, p0}, Lcom/daaw/ry0;->k(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p0, v0, Lcom/daaw/uz1;->u:Lcom/daaw/j6;

    invoke-virtual {p0, p2}, Lcom/daaw/j6;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1, v0}, Lcom/daaw/z70;->c(Lcom/daaw/uz1;)V

    return-void
.end method


# virtual methods
.method public final h()V
    .locals 0

    invoke-super {p0}, Lcom/google/android/gms/common/api/internal/LifecycleCallback;->h()V

    invoke-virtual {p0}, Lcom/daaw/uz1;->v()V

    return-void
.end method

.method public final j()V
    .locals 0

    invoke-super {p0}, Lcom/daaw/p22;->j()V

    invoke-virtual {p0}, Lcom/daaw/uz1;->v()V

    return-void
.end method

.method public final k()V
    .locals 1

    invoke-super {p0}, Lcom/daaw/p22;->k()V

    iget-object v0, p0, Lcom/daaw/uz1;->v:Lcom/daaw/z70;

    invoke-virtual {v0, p0}, Lcom/daaw/z70;->d(Lcom/daaw/uz1;)V

    return-void
.end method

.method public final m(Lcom/google/android/gms/common/ConnectionResult;I)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/uz1;->v:Lcom/daaw/z70;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/z70;->F(Lcom/google/android/gms/common/ConnectionResult;I)V

    return-void
.end method

.method public final n()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/uz1;->v:Lcom/daaw/z70;

    invoke-virtual {v0}, Lcom/daaw/z70;->a()V

    return-void
.end method

.method public final t()Lcom/daaw/j6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/j6<",
            "Lcom/daaw/o3<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/uz1;->u:Lcom/daaw/j6;

    return-object v0
.end method

.method public final v()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/uz1;->u:Lcom/daaw/j6;

    invoke-virtual {v0}, Lcom/daaw/j6;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/uz1;->v:Lcom/daaw/z70;

    invoke-virtual {v0, p0}, Lcom/daaw/z70;->c(Lcom/daaw/uz1;)V

    :cond_0
    return-void
.end method
