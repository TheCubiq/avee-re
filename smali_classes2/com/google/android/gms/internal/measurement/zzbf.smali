.class final Lcom/google/android/gms/internal/measurement/zzbf;
.super Lcom/google/android/gms/internal/measurement/zzag$zzb;
.source "com.google.android.gms:play-services-measurement-sdk-api@@17.5.0"


# instance fields
.field private final synthetic zzc:Lcom/google/android/gms/measurement/internal/zzhd;

.field private final synthetic zzd:Lcom/google/android/gms/internal/measurement/zzag;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/measurement/zzag;Lcom/google/android/gms/measurement/internal/zzhd;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/google/android/gms/internal/measurement/zzbf;->zzd:Lcom/google/android/gms/internal/measurement/zzag;

    iput-object p2, p0, Lcom/google/android/gms/internal/measurement/zzbf;->zzc:Lcom/google/android/gms/measurement/internal/zzhd;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/measurement/zzag$zzb;-><init>(Lcom/google/android/gms/internal/measurement/zzag;)V

    return-void
.end method


# virtual methods
.method final zza()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/measurement/zzbf;->zzd:Lcom/google/android/gms/internal/measurement/zzag;

    invoke-static {v0}, Lcom/google/android/gms/internal/measurement/zzag;->zzc(Lcom/google/android/gms/internal/measurement/zzag;)Lcom/google/android/gms/internal/measurement/zzv;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzag$zza;

    iget-object v2, p0, Lcom/google/android/gms/internal/measurement/zzbf;->zzc:Lcom/google/android/gms/measurement/internal/zzhd;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/measurement/zzag$zza;-><init>(Lcom/google/android/gms/measurement/internal/zzhd;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/measurement/zzv;->setEventInterceptor(Lcom/google/android/gms/internal/measurement/zzab;)V

    return-void
.end method
