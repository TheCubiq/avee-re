.class public final Lcom/daaw/gv5;
.super Lcom/daaw/zo3;
.source ""


# instance fields
.field public final p:Lcom/daaw/tq5;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/hv5;Lcom/daaw/tq5;Lcom/daaw/fv5;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/zo3;-><init>()V

    iput-object p2, p0, Lcom/daaw/gv5;->p:Lcom/daaw/tq5;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/gv5;->p:Lcom/daaw/tq5;

    iget-object v0, v0, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast v0, Lcom/daaw/ys5;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/daaw/ys5;->j0(ILjava/lang/String;)V

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/gv5;->p:Lcom/daaw/tq5;

    iget-object v0, v0, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast v0, Lcom/daaw/ys5;

    invoke-virtual {v0, p1}, Lcom/daaw/ys5;->q0(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method

.method public final zzg()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/gv5;->p:Lcom/daaw/tq5;

    iget-object v0, v0, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    check-cast v0, Lcom/daaw/ys5;

    invoke-virtual {v0}, Lcom/daaw/ys5;->zzo()V

    return-void
.end method
