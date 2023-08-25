.class public final synthetic Lcom/daaw/of6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/pf6;

.field public final synthetic q:Lcom/google/android/gms/ads/internal/client/zze;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/pf6;Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/of6;->p:Lcom/daaw/pf6;

    iput-object p2, p0, Lcom/daaw/of6;->q:Lcom/google/android/gms/ads/internal/client/zze;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/of6;->p:Lcom/daaw/pf6;

    iget-object v1, p0, Lcom/daaw/of6;->q:Lcom/google/android/gms/ads/internal/client/zze;

    iget-object v0, v0, Lcom/daaw/pf6;->e:Lcom/daaw/qf6;

    invoke-static {v0}, Lcom/daaw/qf6;->c(Lcom/daaw/qf6;)Lcom/daaw/tg6;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/tg6;->b(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method
