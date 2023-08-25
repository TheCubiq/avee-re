.class public final synthetic Lcom/daaw/hl5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/v57;


# instance fields
.field public final synthetic a:Lcom/daaw/pl5;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/zzcbf;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/pl5;Lcom/google/android/gms/internal/ads/zzcbf;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hl5;->a:Lcom/daaw/pl5;

    iput-object p2, p0, Lcom/daaw/hl5;->b:Lcom/google/android/gms/internal/ads/zzcbf;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/hl5;->a:Lcom/daaw/pl5;

    iget-object v1, p0, Lcom/daaw/hl5;->b:Lcom/google/android/gms/internal/ads/zzcbf;

    invoke-virtual {v0, v1}, Lcom/daaw/pl5;->a(Lcom/google/android/gms/internal/ads/zzcbf;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
