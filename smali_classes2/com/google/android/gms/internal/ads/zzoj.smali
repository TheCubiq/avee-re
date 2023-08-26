.class public final Lcom/google/android/gms/internal/ads/zzoj;
.super Lcom/google/android/gms/internal/ads/zzpt;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# static fields
.field private static final zzbha:I

.field private static final zzbhb:I

.field private static final zzbhc:I

.field private static final zzbhd:I


# instance fields
.field private final mTextColor:I

.field private final zzbhe:Ljava/lang/String;

.field private final zzbhf:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzon;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbhg:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzpw;",
            ">;"
        }
    .end annotation
.end field

.field private final zzbhh:I

.field private final zzbhi:I

.field private final zzbhj:I

.field private final zzbhk:I

.field private final zzbhl:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xc

    const/16 v1, 0xae

    const/16 v2, 0xce

    invoke-static {v0, v1, v2}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    sput v0, Lcom/google/android/gms/internal/ads/zzoj;->zzbha:I

    const/16 v0, 0xcc

    invoke-static {v0, v0, v0}, Landroid/graphics/Color;->rgb(III)I

    move-result v0

    sput v0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhb:I

    sput v0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhc:I

    sget v0, Lcom/google/android/gms/internal/ads/zzoj;->zzbha:I

    sput v0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhd:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIZ)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzon;",
            ">;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            "IIZ)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzpt;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhf:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhg:Ljava/util/List;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhe:Ljava/lang/String;

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzon;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhf:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhg:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_1

    :cond_1
    sget p1, Lcom/google/android/gms/internal/ads/zzoj;->zzbhc:I

    :goto_1
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhh:I

    if-eqz p4, :cond_2

    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_2

    :cond_2
    sget p1, Lcom/google/android/gms/internal/ads/zzoj;->zzbhd:I

    :goto_2
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzoj;->mTextColor:I

    if-eqz p5, :cond_3

    invoke-virtual {p5}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_3

    :cond_3
    const/16 p1, 0xc

    :goto_3
    iput p1, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhi:I

    iput p6, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhj:I

    iput p7, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhk:I

    iput-boolean p8, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhl:Z

    return-void
.end method


# virtual methods
.method public final getBackgroundColor()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhh:I

    return v0
.end method

.method public final getText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhe:Ljava/lang/String;

    return-object v0
.end method

.method public final getTextColor()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzoj;->mTextColor:I

    return v0
.end method

.method public final getTextSize()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhi:I

    return v0
.end method

.method public final zzjr()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzpw;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhg:Ljava/util/List;

    return-object v0
.end method

.method public final zzjs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/ads/zzon;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhf:Ljava/util/List;

    return-object v0
.end method

.method public final zzjt()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhj:I

    return v0
.end method

.method public final zzju()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhk:I

    return v0
.end method

.method public final zzjv()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/ads/zzoj;->zzbhl:Z

    return v0
.end method
