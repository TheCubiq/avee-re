.class public abstract Lcom/google/android/gms/internal/ads/zzapg;
.super Landroid/view/TextureView;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzaqa;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field protected final zzcxk:Lcom/google/android/gms/internal/ads/zzapp;

.field protected final zzcxl:Lcom/google/android/gms/internal/ads/zzapz;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    invoke-direct {p0, p1}, Landroid/view/TextureView;-><init>(Landroid/content/Context;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzapp;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzapp;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzapg;->zzcxk:Lcom/google/android/gms/internal/ads/zzapp;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzapz;

    invoke-direct {v0, p1, p0}, Lcom/google/android/gms/internal/ads/zzapz;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzaqa;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzapg;->zzcxl:Lcom/google/android/gms/internal/ads/zzapz;

    return-void
.end method


# virtual methods
.method public abstract getCurrentPosition()I
.end method

.method public abstract getDuration()I
.end method

.method public abstract getVideoHeight()I
.end method

.method public abstract getVideoWidth()I
.end method

.method public abstract pause()V
.end method

.method public abstract play()V
.end method

.method public abstract seekTo(I)V
.end method

.method public abstract setVideoPath(Ljava/lang/String;)V
.end method

.method public abstract stop()V
.end method

.method public abstract zza(FF)V
.end method

.method public abstract zza(Lcom/google/android/gms/internal/ads/zzapf;)V
.end method

.method public abstract zzsp()Ljava/lang/String;
.end method

.method public abstract zzst()V
.end method
