.class public final Lcom/daaw/im5;
.super Lcom/daaw/du3;
.source ""


# instance fields
.field public final synthetic p:Lcom/daaw/jm5;


# direct methods
.method public constructor <init>(Lcom/daaw/jm5;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/im5;->p:Lcom/daaw/jm5;

    invoke-direct {p0}, Lcom/daaw/du3;-><init>()V

    return-void
.end method


# virtual methods
.method public final K(Lcom/google/android/gms/ads/internal/util/zzaz;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/im5;->p:Lcom/daaw/jm5;

    iget-object v0, v0, Lcom/daaw/jm5;->a:Lcom/daaw/e14;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/util/zzaz;->zza()Lcom/google/android/gms/ads/internal/util/zzay;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/e14;->c(Ljava/lang/Throwable;)Z

    return-void
.end method

.method public final y(Landroid/os/ParcelFileDescriptor;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/im5;->p:Lcom/daaw/jm5;

    iget-object v0, v0, Lcom/daaw/jm5;->a:Lcom/daaw/e14;

    new-instance v1, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    invoke-direct {v1, p1}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    invoke-virtual {v0, v1}, Lcom/daaw/e14;->b(Ljava/lang/Object;)Z

    return-void
.end method
