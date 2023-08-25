.class public final Lcom/daaw/y36;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Lcom/daaw/ri6;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;Lcom/daaw/ri6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/y36;->a:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/y36;->b:Lcom/daaw/ri6;

    return-void
.end method


# virtual methods
.method public final synthetic a()Lcom/daaw/z36;
    .locals 3

    new-instance v0, Lcom/daaw/z36;

    iget-object v1, p0, Lcom/daaw/y36;->b:Lcom/daaw/ri6;

    iget-object v1, v1, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    invoke-static {v1}, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzf;->zzb(Lcom/google/android/gms/ads/internal/client/zzl;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "requester_type_2"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    invoke-direct {v0, v1}, Lcom/daaw/z36;-><init>(Z)V

    return-object v0
.end method

.method public final zza()I
    .locals 1

    const/16 v0, 0x15

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/y36;->a:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/x36;

    invoke-direct {v1, p0}, Lcom/daaw/x36;-><init>(Lcom/daaw/y36;)V

    invoke-interface {v0, v1}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0
.end method
