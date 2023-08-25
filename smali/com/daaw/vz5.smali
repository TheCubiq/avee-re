.class public final synthetic Lcom/daaw/vz5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/wz5;

.field public final synthetic q:Lcom/google/android/gms/ads/internal/client/zze;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/wz5;Lcom/google/android/gms/ads/internal/client/zze;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/vz5;->p:Lcom/daaw/wz5;

    iput-object p2, p0, Lcom/daaw/vz5;->q:Lcom/google/android/gms/ads/internal/client/zze;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vz5;->p:Lcom/daaw/wz5;

    iget-object v1, p0, Lcom/daaw/vz5;->q:Lcom/google/android/gms/ads/internal/client/zze;

    iget-object v0, v0, Lcom/daaw/wz5;->e:Lcom/daaw/xz5;

    invoke-static {v0}, Lcom/daaw/xz5;->c(Lcom/daaw/xz5;)Lcom/daaw/nz5;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/nz5;->a()Lcom/daaw/oq4;

    move-result-object v0

    invoke-interface {v0, v1}, Lcom/daaw/oq4;->b(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method
