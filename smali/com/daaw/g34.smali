.class public final synthetic Lcom/daaw/g34;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/t34;

.field public final synthetic q:Z

.field public final synthetic r:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/t34;ZJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g34;->p:Lcom/daaw/t34;

    iput-boolean p2, p0, Lcom/daaw/g34;->q:Z

    iput-wide p3, p0, Lcom/daaw/g34;->r:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/g34;->p:Lcom/daaw/t34;

    iget-boolean v1, p0, Lcom/daaw/g34;->q:Z

    iget-wide v2, p0, Lcom/daaw/g34;->r:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/t34;->G(ZJ)V

    return-void
.end method
