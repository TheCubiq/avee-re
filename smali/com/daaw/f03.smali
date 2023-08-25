.class public final Lcom/daaw/f03;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/google/android/gms/internal/ads/zzatd;

.field public final synthetic q:Lcom/daaw/k03;


# direct methods
.method public constructor <init>(Lcom/daaw/k03;Lcom/google/android/gms/internal/ads/zzatd;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/f03;->q:Lcom/daaw/k03;

    iput-object p2, p0, Lcom/daaw/f03;->p:Lcom/google/android/gms/internal/ads/zzatd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/f03;->q:Lcom/daaw/k03;

    invoke-static {v0}, Lcom/daaw/k03;->a(Lcom/daaw/k03;)Lcom/daaw/l03;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/f03;->p:Lcom/google/android/gms/internal/ads/zzatd;

    invoke-interface {v0, v1}, Lcom/daaw/l03;->t(Lcom/google/android/gms/internal/ads/zzatd;)V

    return-void
.end method
