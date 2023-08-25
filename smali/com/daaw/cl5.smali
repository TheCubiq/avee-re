.class public final synthetic Lcom/daaw/cl5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/v57;


# instance fields
.field public final synthetic a:Lcom/daaw/fl5;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/zzcbj;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/fl5;Lcom/google/android/gms/internal/ads/zzcbj;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cl5;->a:Lcom/daaw/fl5;

    iput-object p2, p0, Lcom/daaw/cl5;->b:Lcom/google/android/gms/internal/ads/zzcbj;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/cl5;->a:Lcom/daaw/fl5;

    iget-object v1, p0, Lcom/daaw/cl5;->b:Lcom/google/android/gms/internal/ads/zzcbj;

    invoke-virtual {v0, v1}, Lcom/daaw/fl5;->a(Lcom/google/android/gms/internal/ads/zzcbj;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
