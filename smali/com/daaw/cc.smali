.class public final Lcom/daaw/cc;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/ep0;

.field public final b:Lcom/daaw/bc;

.field public final c:Lcom/daaw/cq;

.field public final d:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Lcom/daaw/ep0;Lcom/daaw/bc;Lcom/daaw/cq;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/daaw/cc;->d:Landroid/os/Handler;

    iput-object p1, p0, Lcom/daaw/cc;->a:Lcom/daaw/ep0;

    iput-object p2, p0, Lcom/daaw/cc;->b:Lcom/daaw/bc;

    iput-object p3, p0, Lcom/daaw/cc;->c:Lcom/daaw/cq;

    return-void
.end method
