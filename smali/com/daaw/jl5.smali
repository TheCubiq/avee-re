.class public final Lcom/daaw/jl5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/xp4;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Lcom/daaw/vz4;
    .locals 2

    new-instance v0, Lcom/daaw/wo5;

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1, p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    invoke-direct {v0, v1}, Lcom/daaw/wo5;-><init>(Landroid/os/Handler;)V

    return-object v0
.end method

.method public final zza()J
    .locals 2

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    return-wide v0
.end method
