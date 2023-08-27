.class public final Lcom/google/android/gms/internal/ads/zzua;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# static fields
.field private static zzbox:Lcom/google/android/gms/internal/ads/zzua;


# instance fields
.field private zzboy:I

.field private zzboz:I

.field private zzbpa:I

.field private zzbpb:I

.field private zzbpc:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzua;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzua;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/zzua;->zzbox:Lcom/google/android/gms/internal/ads/zzua;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static zzlk()Lcom/google/android/gms/internal/ads/zzua;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/ads/zzua;->zzbox:Lcom/google/android/gms/internal/ads/zzua;

    return-object v0
.end method


# virtual methods
.method final zzll()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzua;->zzboz:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzua;->zzboz:I

    return-void
.end method

.method final zzlm()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzua;->zzbpa:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzua;->zzbpa:I

    return-void
.end method

.method final zzln()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzua;->zzbpb:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzua;->zzbpb:I

    return-void
.end method

.method final zzlo()V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzua;->zzbpc:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzua;->zzbpc:I

    return-void
.end method

.method public final zzlp()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzua;->zzboz:I

    return v0
.end method

.method public final zzlq()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzua;->zzbpa:I

    return v0
.end method

.method public final zzlr()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzua;->zzbpb:I

    return v0
.end method

.method public final zzls()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzua;->zzbpc:I

    return v0
.end method

.method public final zzlt()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzua;->zzboy:I

    const-string v2, "ipl"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzua;->zzboz:I

    const-string v2, "ipds"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzua;->zzbpa:I

    const-string v2, "ipde"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzua;->zzbpb:I

    const-string v2, "iph"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzua;->zzbpc:I

    const-string v2, "ipm"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method final zzw(I)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzua;->zzboy:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzua;->zzboy:I

    return-void
.end method
