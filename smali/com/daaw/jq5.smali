.class public final Lcom/daaw/jq5;
.super Ljava/util/TimerTask;
.source ""


# instance fields
.field public final synthetic p:Landroid/app/AlertDialog;

.field public final synthetic q:Ljava/util/Timer;

.field public final synthetic r:Lcom/google/android/gms/ads/internal/overlay/zzl;


# direct methods
.method public constructor <init>(Landroid/app/AlertDialog;Ljava/util/Timer;Lcom/google/android/gms/ads/internal/overlay/zzl;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/jq5;->p:Landroid/app/AlertDialog;

    iput-object p2, p0, Lcom/daaw/jq5;->q:Ljava/util/Timer;

    iput-object p3, p0, Lcom/daaw/jq5;->r:Lcom/google/android/gms/ads/internal/overlay/zzl;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/jq5;->p:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    iget-object v0, p0, Lcom/daaw/jq5;->q:Ljava/util/Timer;

    invoke-virtual {v0}, Ljava/util/Timer;->cancel()V

    iget-object v0, p0, Lcom/daaw/jq5;->r:Lcom/google/android/gms/ads/internal/overlay/zzl;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/ads/internal/overlay/zzl;->zzb()V

    :cond_0
    return-void
.end method
