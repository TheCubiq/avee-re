.class public final synthetic Lcom/daaw/pd6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/qd6;

.field public final synthetic q:Lcom/google/android/gms/ads/internal/client/zze;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/qd6;Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/pd6;->p:Lcom/daaw/qd6;

    iput-object p2, p0, Lcom/daaw/pd6;->q:Lcom/google/android/gms/ads/internal/client/zze;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/pd6;->p:Lcom/daaw/qd6;

    iget-object v1, p0, Lcom/daaw/pd6;->q:Lcom/google/android/gms/ads/internal/client/zze;

    iget-object v0, v0, Lcom/daaw/qd6;->e:Lcom/daaw/rd6;

    invoke-static {v0}, Lcom/daaw/rd6;->f(Lcom/daaw/rd6;)Lcom/daaw/az5;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/az5;->b(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method
