.class final Lcom/google/android/gms/internal/ads/zzacz;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzanl;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zzanl<",
        "Lcom/google/android/gms/internal/ads/zzaqw;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic val$message:Ljava/lang/String;

.field private final synthetic zzcbv:Lorg/json/JSONObject;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzacq;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzacz;->val$message:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzacz;->zzcbv:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public final synthetic zzh(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/ads/zzaqw;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzacz;->val$message:Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzacz;->zzcbv:Lorg/json/JSONObject;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/ads/zzaqw;->zza(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
