.class public final Lcom/daaw/o06;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Lcom/daaw/ri6;

.field public final c:Lcom/daaw/dj6;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;Lcom/daaw/ri6;Lcom/daaw/dj6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/o06;->a:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/o06;->b:Lcom/daaw/ri6;

    iput-object p3, p0, Lcom/daaw/o06;->c:Lcom/daaw/dj6;

    return-void
.end method


# virtual methods
.method public final synthetic a()Lcom/daaw/p06;
    .locals 4

    new-instance v0, Lcom/daaw/p06;

    sget-object v1, Lcom/daaw/g93;->E6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/o06;->b:Lcom/daaw/ri6;

    iget-object v1, v1, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    invoke-static {v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzf;->zzb(Lcom/google/android/gms/ads/internal/client/zzl;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "requester_type_2"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/daaw/dj6;->a()Ljava/lang/String;

    move-result-object v2

    :cond_0
    invoke-direct {v0, v2}, Lcom/daaw/p06;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final zza()I
    .locals 1

    const/4 v0, 0x5

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/o06;->a:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/n06;

    invoke-direct {v1, p0}, Lcom/daaw/n06;-><init>(Lcom/daaw/o06;)V

    invoke-interface {v0, v1}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
