.class final Lcom/google/android/gms/internal/ads/zzasm;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field private final synthetic zzdcg:Lcom/google/android/gms/internal/ads/zzait;

.field private final synthetic zzdes:Lcom/google/android/gms/internal/ads/zzasj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzasj;Lcom/google/android/gms/internal/ads/zzait;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzasm;->zzdes:Lcom/google/android/gms/internal/ads/zzasj;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzasm;->zzdcg:Lcom/google/android/gms/internal/ads/zzait;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzasm;->zzdes:Lcom/google/android/gms/internal/ads/zzasj;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzasm;->zzdcg:Lcom/google/android/gms/internal/ads/zzait;

    const/16 v2, 0xa

    invoke-static {v0, p1, v1, v2}, Lcom/google/android/gms/internal/ads/zzasj;->zza(Lcom/google/android/gms/internal/ads/zzasj;Landroid/view/View;Lcom/google/android/gms/internal/ads/zzait;I)V

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    return-void
.end method
