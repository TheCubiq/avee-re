.class final synthetic Lcom/google/android/gms/internal/ads/zzalf;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private final zzcsh:Lcom/google/android/gms/internal/ads/zzald;

.field private final zzcsi:I

.field private final zzcsj:I

.field private final zzcsk:I


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzald;III)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzalf;->zzcsh:Lcom/google/android/gms/internal/ads/zzald;

    iput p2, p0, Lcom/google/android/gms/internal/ads/zzalf;->zzcsi:I

    iput p3, p0, Lcom/google/android/gms/internal/ads/zzalf;->zzcsj:I

    iput p4, p0, Lcom/google/android/gms/internal/ads/zzalf;->zzcsk:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzalf;->zzcsh:Lcom/google/android/gms/internal/ads/zzald;

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzalf;->zzcsi:I

    iget v2, p0, Lcom/google/android/gms/internal/ads/zzalf;->zzcsj:I

    iget v3, p0, Lcom/google/android/gms/internal/ads/zzalf;->zzcsk:I

    move-object v4, p1

    move v5, p2

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzald;->zza(IIILandroid/content/DialogInterface;I)V

    return-void
.end method
