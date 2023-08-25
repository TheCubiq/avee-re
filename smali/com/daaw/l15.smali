.class public final Lcom/daaw/l15;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/u35;

.field public final b:Lcom/google/android/gms/ads/internal/client/zzbh;


# direct methods
.method public constructor <init>(Lcom/daaw/u35;Lcom/google/android/gms/ads/internal/client/zzbh;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/l15;->a:Lcom/daaw/u35;

    iput-object p2, p0, Lcom/daaw/l15;->b:Lcom/google/android/gms/ads/internal/client/zzbh;

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/ads/internal/client/zzbh;
    .locals 1

    iget-object v0, p0, Lcom/daaw/l15;->b:Lcom/google/android/gms/ads/internal/client/zzbh;

    return-object v0
.end method

.method public final b()Lcom/daaw/u35;
    .locals 1

    iget-object v0, p0, Lcom/daaw/l15;->a:Lcom/daaw/u35;

    return-object v0
.end method
