.class public Lcom/daaw/hf1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public p:Lcom/daaw/ey1;

.field public q:Ljava/lang/String;

.field public r:Landroidx/work/WorkerParameters$a;


# direct methods
.method public constructor <init>(Lcom/daaw/ey1;Ljava/lang/String;Landroidx/work/WorkerParameters$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hf1;->p:Lcom/daaw/ey1;

    iput-object p2, p0, Lcom/daaw/hf1;->q:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/hf1;->r:Landroidx/work/WorkerParameters$a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/hf1;->p:Lcom/daaw/ey1;

    invoke-virtual {v0}, Lcom/daaw/ey1;->m()Lcom/daaw/jz0;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/hf1;->q:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/hf1;->r:Landroidx/work/WorkerParameters$a;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/jz0;->k(Ljava/lang/String;Landroidx/work/WorkerParameters$a;)Z

    return-void
.end method
