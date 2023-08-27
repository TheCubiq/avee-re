.class final Lcom/google/android/gms/internal/ads/zzgn;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/webkit/ValueCallback;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/webkit/ValueCallback<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzaip:Lcom/google/android/gms/internal/ads/zzgm;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzgm;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzgn;->zzaip:Lcom/google/android/gms/internal/ads/zzgm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic onReceiveValue(Ljava/lang/Object;)V
    .locals 4

    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzgn;->zzaip:Lcom/google/android/gms/internal/ads/zzgm;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzgm;->zzaik:Lcom/google/android/gms/internal/ads/zzgk;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzgn;->zzaip:Lcom/google/android/gms/internal/ads/zzgm;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzgm;->zzaim:Lcom/google/android/gms/internal/ads/zzge;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzgn;->zzaip:Lcom/google/android/gms/internal/ads/zzgm;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzgm;->zzain:Landroid/webkit/WebView;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzgn;->zzaip:Lcom/google/android/gms/internal/ads/zzgm;

    iget-boolean v3, v3, Lcom/google/android/gms/internal/ads/zzgm;->zzaio:Z

    invoke-virtual {v0, v1, v2, p1, v3}, Lcom/google/android/gms/internal/ads/zzgk;->zza(Lcom/google/android/gms/internal/ads/zzge;Landroid/webkit/WebView;Ljava/lang/String;Z)V

    return-void
.end method
