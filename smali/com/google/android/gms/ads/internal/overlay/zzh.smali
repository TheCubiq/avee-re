.class public final Lcom/google/android/gms/ads/internal/overlay/zzh;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final zza:I

.field public final zzb:Landroid/view/ViewGroup$LayoutParams;

.field public final zzc:Landroid/view/ViewGroup;

.field public final zzd:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/daaw/a74;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lcom/daaw/a74;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzb:Landroid/view/ViewGroup$LayoutParams;

    invoke-interface {p1}, Lcom/daaw/a74;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    invoke-interface {p1}, Lcom/daaw/a74;->j()Landroid/content/Context;

    move-result-object v1

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzd:Landroid/content/Context;

    if-eqz v0, :cond_0

    instance-of v1, v0, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zzc:Landroid/view/ViewGroup;

    invoke-interface {p1}, Lcom/daaw/a74;->g()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    iput v1, p0, Lcom/google/android/gms/ads/internal/overlay/zzh;->zza:I

    invoke-interface {p1}, Lcom/daaw/a74;->g()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Lcom/daaw/a74;->g0(Z)V

    return-void

    :cond_0
    new-instance p1, Lcom/daaw/f86;

    const-string v0, "Could not get the parent of the WebView for an overlay."

    invoke-direct {p1, v0}, Lcom/daaw/f86;-><init>(Ljava/lang/String;)V

    throw p1
.end method
