.class public final Lcom/daaw/ms5;
.super Lcom/daaw/qo3;
.source ""


# instance fields
.field public final p:Lcom/daaw/tq5;

.field public final synthetic q:Lcom/daaw/ns5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ns5;Lcom/daaw/tq5;Lcom/daaw/ls5;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ms5;->q:Lcom/daaw/ns5;

    invoke-direct {p0}, Lcom/daaw/qo3;-><init>()V

    iput-object p2, p0, Lcom/daaw/ms5;->p:Lcom/daaw/tq5;

    return-void
.end method


# virtual methods
.method public final P2(Lcom/daaw/yd0;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ms5;->q:Lcom/daaw/ns5;

    invoke-static {p1}, Lcom/daaw/nt0;->M(Lcom/daaw/yd0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/daaw/ns5;->e(Lcom/daaw/ns5;Landroid/view/View;)V

    iget-object p1, p0, Lcom/daaw/ms5;->p:Lcom/daaw/tq5;

    iget-object p1, p1, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast p1, Lcom/daaw/ys5;

    invoke-virtual {p1}, Lcom/daaw/ys5;->zzo()V

    return-void
.end method

.method public final U2(Lcom/daaw/mn3;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ms5;->q:Lcom/daaw/ns5;

    invoke-static {v0, p1}, Lcom/daaw/ns5;->d(Lcom/daaw/ns5;Lcom/daaw/mn3;)V

    iget-object p1, p0, Lcom/daaw/ms5;->p:Lcom/daaw/tq5;

    iget-object p1, p1, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast p1, Lcom/daaw/ys5;

    invoke-virtual {p1}, Lcom/daaw/ys5;->zzo()V

    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ms5;->p:Lcom/daaw/tq5;

    iget-object v0, v0, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast v0, Lcom/daaw/ys5;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/daaw/ys5;->j0(ILjava/lang/String;)V

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ms5;->p:Lcom/daaw/tq5;

    iget-object v0, v0, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast v0, Lcom/daaw/ys5;

    invoke-virtual {v0, p1}, Lcom/daaw/ys5;->q0(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method
