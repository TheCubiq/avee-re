.class final Lcom/google/android/gms/internal/ads/zzs;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic zzas:Ljava/lang/String;

.field private final synthetic zzat:J

.field private final synthetic zzau:Lcom/google/android/gms/internal/ads/zzr;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzr;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzs;->zzau:Lcom/google/android/gms/internal/ads/zzr;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzs;->zzas:Ljava/lang/String;

    iput-wide p3, p0, Lcom/google/android/gms/internal/ads/zzs;->zzat:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzs;->zzau:Lcom/google/android/gms/internal/ads/zzr;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzr;->zzd(Lcom/google/android/gms/internal/ads/zzr;)Lcom/google/android/gms/internal/ads/zzaf$zza;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzs;->zzas:Ljava/lang/String;

    iget-wide v2, p0, Lcom/google/android/gms/internal/ads/zzs;->zzat:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzaf$zza;->zza(Ljava/lang/String;J)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzs;->zzau:Lcom/google/android/gms/internal/ads/zzr;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzr;->zzd(Lcom/google/android/gms/internal/ads/zzr;)Lcom/google/android/gms/internal/ads/zzaf$zza;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzaf$zza;->zzc(Ljava/lang/String;)V

    return-void
.end method
