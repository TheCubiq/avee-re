.class public final Lcom/daaw/re6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Lcom/daaw/ve6;


# direct methods
.method public constructor <init>(Lcom/daaw/ve6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/re6;->a:Lcom/daaw/ve6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation

    check-cast p1, Lcom/daaw/pk5;

    const-string v0, ""

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string p1, "Failed to get a cache key, reverting to legacy flow."

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/zze;->zza(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/daaw/re6;->a:Lcom/daaw/ve6;

    new-instance v0, Lcom/daaw/ue6;

    invoke-static {p1}, Lcom/daaw/ve6;->b(Lcom/daaw/ve6;)Lcom/daaw/rk6;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lcom/daaw/ue6;-><init>(Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/rk6;Lcom/daaw/te6;)V

    invoke-static {p1, v0}, Lcom/daaw/ve6;->d(Lcom/daaw/ve6;Lcom/daaw/ue6;)V

    iget-object p1, p0, Lcom/daaw/re6;->a:Lcom/daaw/ve6;

    invoke-static {p1}, Lcom/daaw/ve6;->a(Lcom/daaw/ve6;)Lcom/daaw/ue6;

    move-result-object p1

    return-object p1
.end method
