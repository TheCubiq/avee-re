.class public final Lcom/google/android/gms/internal/ads/zzasi;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field public final heightPixels:I

.field private final type:I

.field public final widthPixels:I


# direct methods
.method private constructor <init>(III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/ads/zzasi;->type:I

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzasi;->widthPixels:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzasi;->heightPixels:I

    return-void
.end method

.method public static zzb(Lcom/google/android/gms/internal/ads/zzjn;)Lcom/google/android/gms/internal/ads/zzasi;
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzjn;->zzarc:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance p0, Lcom/google/android/gms/internal/ads/zzasi;

    const/4 v0, 0x3

    invoke-direct {p0, v0, v1, v1}, Lcom/google/android/gms/internal/ads/zzasi;-><init>(III)V

    return-object p0

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzjn;->zzarf:Z

    if-eqz v0, :cond_1

    new-instance p0, Lcom/google/android/gms/internal/ads/zzasi;

    const/4 v0, 0x2

    invoke-direct {p0, v0, v1, v1}, Lcom/google/android/gms/internal/ads/zzasi;-><init>(III)V

    return-object p0

    :cond_1
    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzjn;->zzare:Z

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzasi;->zzvq()Lcom/google/android/gms/internal/ads/zzasi;

    move-result-object p0

    return-object p0

    :cond_2
    iget v0, p0, Lcom/google/android/gms/internal/ads/zzjn;->widthPixels:I

    iget p0, p0, Lcom/google/android/gms/internal/ads/zzjn;->heightPixels:I

    invoke-static {v0, p0}, Lcom/google/android/gms/internal/ads/zzasi;->zzi(II)Lcom/google/android/gms/internal/ads/zzasi;

    move-result-object p0

    return-object p0
.end method

.method public static zzi(II)Lcom/google/android/gms/internal/ads/zzasi;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzasi;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p1}, Lcom/google/android/gms/internal/ads/zzasi;-><init>(III)V

    return-object v0
.end method

.method public static zzvq()Lcom/google/android/gms/internal/ads/zzasi;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/ads/zzasi;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1}, Lcom/google/android/gms/internal/ads/zzasi;-><init>(III)V

    return-object v0
.end method

.method public static zzvr()Lcom/google/android/gms/internal/ads/zzasi;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/ads/zzasi;

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-direct {v0, v2, v1, v1}, Lcom/google/android/gms/internal/ads/zzasi;-><init>(III)V

    return-object v0
.end method


# virtual methods
.method public final isFluid()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzasi;->type:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzvs()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzasi;->type:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzvt()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzasi;->type:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzvu()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzasi;->type:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
