.class public final synthetic Lcom/daaw/ey8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/vy8;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/vy8;Ljava/lang/Object;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ey8;->p:Lcom/daaw/vy8;

    iput-object p2, p0, Lcom/daaw/ey8;->q:Ljava/lang/Object;

    iput-wide p3, p0, Lcom/daaw/ey8;->r:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/ey8;->p:Lcom/daaw/vy8;

    iget-object v1, p0, Lcom/daaw/ey8;->q:Ljava/lang/Object;

    iget-wide v2, p0, Lcom/daaw/ey8;->r:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/vy8;->m(Ljava/lang/Object;J)V

    return-void
.end method
