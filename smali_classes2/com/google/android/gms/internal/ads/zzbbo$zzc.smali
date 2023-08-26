.class public abstract Lcom/google/android/gms/internal/ads/zzbbo$zzc;
.super Lcom/google/android/gms/internal/ads/zzbbo;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbcw;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/ads/zzbbo;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "zzc"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/ads/zzbbo$zzc<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/ads/zzbbo<",
        "TMessageType;TBuilderType;>;",
        "Lcom/google/android/gms/internal/ads/zzbcw;"
    }
.end annotation


# instance fields
.field protected zzdtz:Lcom/google/android/gms/internal/ads/zzbbg;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzbbg<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbbo;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzbbg;->zzacv()Lcom/google/android/gms/internal/ads/zzbbg;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbbo$zzc;->zzdtz:Lcom/google/android/gms/internal/ads/zzbbg;

    return-void
.end method
