.class final Lcom/google/android/gms/internal/ads/zzaca;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzank;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zzank<",
        "Ljava/util/List<",
        "Lcom/google/android/gms/internal/ads/zzon;",
        ">;",
        "Lcom/google/android/gms/internal/ads/zzoj;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzcan:Ljava/lang/String;

.field private final synthetic zzcao:Ljava/lang/Integer;

.field private final synthetic zzcap:Ljava/lang/Integer;

.field private final synthetic zzcaq:I

.field private final synthetic zzcar:I

.field private final synthetic zzcas:I

.field private final synthetic zzcat:I

.field private final synthetic zzcau:Z


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzabv;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;IIIIZ)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzaca;->zzcan:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzaca;->zzcao:Ljava/lang/Integer;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzaca;->zzcap:Ljava/lang/Integer;

    iput p5, p0, Lcom/google/android/gms/internal/ads/zzaca;->zzcaq:I

    iput p6, p0, Lcom/google/android/gms/internal/ads/zzaca;->zzcar:I

    iput p7, p0, Lcom/google/android/gms/internal/ads/zzaca;->zzcas:I

    iput p8, p0, Lcom/google/android/gms/internal/ads/zzaca;->zzcat:I

    iput-boolean p9, p0, Lcom/google/android/gms/internal/ads/zzaca;->zzcau:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    move-object v2, p1

    check-cast v2, Ljava/util/List;

    const/4 p1, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v9, Lcom/google/android/gms/internal/ads/zzoj;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzaca;->zzcan:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzaca;->zzcao:Ljava/lang/Integer;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzaca;->zzcap:Ljava/lang/Integer;

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaca;->zzcaq:I

    if-lez v0, :cond_1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    :cond_1
    move-object v5, p1

    iget p1, p0, Lcom/google/android/gms/internal/ads/zzaca;->zzcar:I

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzaca;->zzcas:I

    add-int v6, p1, v0

    iget v7, p0, Lcom/google/android/gms/internal/ads/zzaca;->zzcat:I

    iget-boolean v8, p0, Lcom/google/android/gms/internal/ads/zzaca;->zzcau:Z

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lcom/google/android/gms/internal/ads/zzoj;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZ)V

    return-object v9

    :cond_2
    :goto_0
    return-object p1
.end method
