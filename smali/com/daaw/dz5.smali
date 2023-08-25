.class public final Lcom/daaw/dz5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ct4;


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field public final p:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lcom/daaw/dz5;->p:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/ads/internal/client/zzdg;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/dz5;->p:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final f(Lcom/google/android/gms/ads/internal/client/zzs;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dz5;->p:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v1, Lcom/daaw/cz5;

    invoke-direct {v1, p1}, Lcom/daaw/cz5;-><init>(Lcom/google/android/gms/ads/internal/client/zzs;)V

    invoke-static {v0, v1}, Lcom/daaw/ne6;->a(Ljava/util/concurrent/atomic/AtomicReference;Lcom/daaw/me6;)V

    return-void
.end method
