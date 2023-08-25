.class public final synthetic Lcom/daaw/r54;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/y24;

.field public final synthetic q:Z

.field public final synthetic r:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/y24;ZJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/r54;->p:Lcom/daaw/y24;

    iput-boolean p2, p0, Lcom/daaw/r54;->q:Z

    iput-wide p3, p0, Lcom/daaw/r54;->r:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/r54;->p:Lcom/daaw/y24;

    iget-boolean v1, p0, Lcom/daaw/r54;->q:Z

    iget-wide v2, p0, Lcom/daaw/r54;->r:J

    invoke-interface {v0, v1, v2, v3}, Lcom/daaw/y24;->m0(ZJ)V

    return-void
.end method
