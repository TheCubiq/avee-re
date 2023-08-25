.class public final Lcom/daaw/tq2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/google/android/gms/internal/ads/zzatd;

.field public final synthetic q:Lcom/daaw/xq2;


# direct methods
.method public constructor <init>(Lcom/daaw/xq2;Lcom/google/android/gms/internal/ads/zzatd;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/tq2;->q:Lcom/daaw/xq2;

    iput-object p2, p0, Lcom/daaw/tq2;->p:Lcom/google/android/gms/internal/ads/zzatd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/tq2;->q:Lcom/daaw/xq2;

    invoke-static {v0}, Lcom/daaw/xq2;->a(Lcom/daaw/xq2;)Lcom/daaw/dr2;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/tq2;->p:Lcom/google/android/gms/internal/ads/zzatd;

    invoke-interface {v0, v1}, Lcom/daaw/dr2;->d(Lcom/google/android/gms/internal/ads/zzatd;)V

    return-void
.end method
