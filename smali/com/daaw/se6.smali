.class public final Lcom/daaw/se6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Lcom/daaw/ve6;


# direct methods
.method public constructor <init>(Lcom/daaw/ve6;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/se6;->a:Lcom/daaw/ve6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
        .end annotation
    .end param
    .annotation runtime Lorg/checkerframework/checker/nullness/compatqual/NullableDecl;
    .end annotation

    check-cast p1, Lcom/google/android/gms/internal/ads/zzccb;

    iget-object v0, p0, Lcom/daaw/se6;->a:Lcom/daaw/ve6;

    new-instance v1, Lcom/daaw/ue6;

    new-instance v2, Lcom/daaw/tk6;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzccb;->y:Ljava/lang/String;

    invoke-direct {v2, v3}, Lcom/daaw/tk6;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3}, Lcom/daaw/ue6;-><init>(Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/rk6;Lcom/daaw/te6;)V

    invoke-static {v0, v1}, Lcom/daaw/ve6;->d(Lcom/daaw/ve6;Lcom/daaw/ue6;)V

    iget-object p1, p0, Lcom/daaw/se6;->a:Lcom/daaw/ve6;

    invoke-static {p1}, Lcom/daaw/ve6;->a(Lcom/daaw/ve6;)Lcom/daaw/ue6;

    move-result-object p1

    return-object p1
.end method
