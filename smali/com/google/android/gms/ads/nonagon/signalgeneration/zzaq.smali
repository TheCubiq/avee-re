.class public final synthetic Lcom/google/android/gms/ads/nonagon/signalgeneration/zzaq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/daaw/oj1;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/oj1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzaq;->zza:Lcom/daaw/oj1;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/nonagon/signalgeneration/zzaq;->zza:Lcom/daaw/oj1;

    invoke-virtual {v0}, Lcom/daaw/oj1;->getViewSignals()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
