.class public final Lcom/daaw/a17;
.super Landroid/widget/RelativeLayout;
.source ""


# instance fields
.field public final p:Lcom/google/android/gms/ads/internal/util/zzas;

.field public q:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/ads/internal/util/zzas;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/ads/internal/util/zzas;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/daaw/a17;->p:Lcom/google/android/gms/ads/internal/util/zzas;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/ads/internal/util/zzas;->zzo(Ljava/lang/String;)V

    invoke-virtual {v0, p4}, Lcom/google/android/gms/ads/internal/util/zzas;->zzn(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/a17;->q:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/a17;->p:Lcom/google/android/gms/ads/internal/util/zzas;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/ads/internal/util/zzas;->zzm(Landroid/view/MotionEvent;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
