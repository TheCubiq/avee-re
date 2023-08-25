.class public final synthetic Lcom/daaw/zg6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/ah6;

.field public final synthetic q:Lcom/google/android/gms/ads/internal/client/zze;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ah6;Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zg6;->p:Lcom/daaw/ah6;

    iput-object p2, p0, Lcom/daaw/zg6;->q:Lcom/google/android/gms/ads/internal/client/zze;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/zg6;->p:Lcom/daaw/ah6;

    iget-object v1, p0, Lcom/daaw/zg6;->q:Lcom/google/android/gms/ads/internal/client/zze;

    iget-object v0, v0, Lcom/daaw/ah6;->e:Lcom/daaw/dh6;

    invoke-static {v0}, Lcom/daaw/dh6;->e(Lcom/daaw/dh6;)Lcom/daaw/tg6;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/tg6;->b(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method
