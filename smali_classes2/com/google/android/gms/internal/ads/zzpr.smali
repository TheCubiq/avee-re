.class final Lcom/google/android/gms/internal/ads/zzpr;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzox;


# instance fields
.field private final synthetic zzbkc:Landroid/view/View;

.field private final synthetic zzbkj:Lcom/google/android/gms/internal/ads/zzpp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzpp;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzpr;->zzbkj:Lcom/google/android/gms/internal/ads/zzpp;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzpr;->zzbkc:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzc(Landroid/view/MotionEvent;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpr;->zzbkj:Lcom/google/android/gms/internal/ads/zzpp;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzpp;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    return-void
.end method

.method public final zzki()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpr;->zzbkj:Lcom/google/android/gms/internal/ads/zzpp;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzpp;->zzbjs:[Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzpp;->zza(Lcom/google/android/gms/internal/ads/zzpp;[Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzpr;->zzbkj:Lcom/google/android/gms/internal/ads/zzpp;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzpr;->zzbkc:Landroid/view/View;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzpp;->onClick(Landroid/view/View;)V

    :cond_0
    return-void
.end method
