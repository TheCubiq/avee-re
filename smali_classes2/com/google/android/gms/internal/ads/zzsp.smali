.class final synthetic Lcom/google/android/gms/internal/ads/zzsp;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final zzbnq:Lcom/google/android/gms/internal/ads/zzso;

.field private final zzbnr:Lcom/google/android/gms/internal/ads/zzsf;

.field private final zzbns:Lcom/google/android/gms/internal/ads/zzaoj;

.field private final zzbnt:Lcom/google/android/gms/internal/ads/zzsg;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzso;Lcom/google/android/gms/internal/ads/zzsf;Lcom/google/android/gms/internal/ads/zzaoj;Lcom/google/android/gms/internal/ads/zzsg;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzbnq:Lcom/google/android/gms/internal/ads/zzso;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzbnr:Lcom/google/android/gms/internal/ads/zzsf;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzbns:Lcom/google/android/gms/internal/ads/zzaoj;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzbnt:Lcom/google/android/gms/internal/ads/zzsg;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzbnq:Lcom/google/android/gms/internal/ads/zzso;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzbnr:Lcom/google/android/gms/internal/ads/zzsf;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzbns:Lcom/google/android/gms/internal/ads/zzaoj;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzsp;->zzbnt:Lcom/google/android/gms/internal/ads/zzsg;

    :try_start_0
    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzsf;->zzlb()Lcom/google/android/gms/internal/ads/zzsk;

    move-result-object v1

    invoke-interface {v1, v3}, Lcom/google/android/gms/internal/ads/zzsk;->zza(Lcom/google/android/gms/internal/ads/zzsg;)Landroid/os/ParcelFileDescriptor;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzaoj;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    const-string v3, "Unable to obtain a cache service instance."

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/ads/zzakb;->zzb(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/ads/zzaoj;->setException(Ljava/lang/Throwable;)V

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzso;->zzbnn:Lcom/google/android/gms/internal/ads/zzsm;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzsm;->zza(Lcom/google/android/gms/internal/ads/zzsm;)V

    return-void
.end method
