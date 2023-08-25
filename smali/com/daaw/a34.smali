.class public final Lcom/daaw/a34;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final p:Lcom/daaw/m24;

.field public q:Z


# direct methods
.method public constructor <init>(Lcom/daaw/m24;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/a34;->q:Z

    iput-object p1, p0, Lcom/daaw/a34;->p:Lcom/daaw/m24;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/a34;->q:Z

    iget-object v0, p0, Lcom/daaw/a34;->p:Lcom/daaw/m24;

    invoke-virtual {v0}, Lcom/daaw/m24;->w()V

    return-void
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/daaw/a34;->q:Z

    invoke-virtual {p0}, Lcom/daaw/a34;->c()V

    return-void
.end method

.method public final c()V
    .locals 3

    sget-object v0, Lcom/google/android/gms/ads/internal/util/zzs;->zza:Lcom/daaw/gv6;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const-wide/16 v1, 0xfa

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public final run()V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/a34;->q:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/a34;->p:Lcom/daaw/m24;

    invoke-virtual {v0}, Lcom/daaw/m24;->w()V

    invoke-virtual {p0}, Lcom/daaw/a34;->c()V

    :cond_0
    return-void
.end method
