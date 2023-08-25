.class public Lcom/daaw/vs;
.super Lcom/daaw/o;
.source ""

# interfaces
.implements Ljava/util/concurrent/ScheduledFuture;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RestrictedApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/vs$c;,
        Lcom/daaw/vs$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/daaw/o<",
        "TV;>;",
        "Ljava/util/concurrent/ScheduledFuture<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final w:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/vs$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/vs$c<",
            "TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/daaw/o;-><init>()V

    new-instance v0, Lcom/daaw/vs$a;

    invoke-direct {v0, p0}, Lcom/daaw/vs$a;-><init>(Lcom/daaw/vs;)V

    invoke-interface {p1, v0}, Lcom/daaw/vs$c;->a(Lcom/daaw/vs$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/vs;->w:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public static synthetic u(Lcom/daaw/vs;Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/o;->q(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic v(Lcom/daaw/vs;Ljava/lang/Throwable;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/o;->r(Ljava/lang/Throwable;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public b()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vs;->w:Ljava/util/concurrent/ScheduledFuture;

    invoke-virtual {p0}, Lcom/daaw/o;->t()Z

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    return-void
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/util/concurrent/Delayed;

    invoke-virtual {p0, p1}, Lcom/daaw/vs;->w(Ljava/util/concurrent/Delayed;)I

    move-result p1

    return p1
.end method

.method public getDelay(Ljava/util/concurrent/TimeUnit;)J
    .locals 2

    iget-object v0, p0, Lcom/daaw/vs;->w:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ScheduledFuture;->getDelay(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method

.method public w(Ljava/util/concurrent/Delayed;)I
    .locals 1

    iget-object v0, p0, Lcom/daaw/vs;->w:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ScheduledFuture;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
