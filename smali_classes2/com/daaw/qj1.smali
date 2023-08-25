.class public abstract Lcom/daaw/qj1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public p:J

.field public q:Lcom/daaw/uj1;


# direct methods
.method public constructor <init>()V
    .locals 3

    sget-object v0, Lcom/daaw/ek1;->f:Lcom/daaw/uj1;

    const-wide/16 v1, 0x0

    invoke-direct {p0, v1, v2, v0}, Lcom/daaw/qj1;-><init>(JLcom/daaw/uj1;)V

    return-void
.end method

.method public constructor <init>(JLcom/daaw/uj1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/daaw/qj1;->p:J

    iput-object p3, p0, Lcom/daaw/qj1;->q:Lcom/daaw/uj1;

    return-void
.end method
