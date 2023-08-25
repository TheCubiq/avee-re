.class public final Lcom/daaw/of2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:J

.field public final synthetic r:Lcom/daaw/qf2;


# direct methods
.method public constructor <init>(Lcom/daaw/qf2;Ljava/lang/String;J)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/of2;->r:Lcom/daaw/qf2;

    iput-object p2, p0, Lcom/daaw/of2;->p:Ljava/lang/String;

    iput-wide p3, p0, Lcom/daaw/of2;->q:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/of2;->r:Lcom/daaw/qf2;

    invoke-static {v0}, Lcom/daaw/qf2;->b(Lcom/daaw/qf2;)Lcom/daaw/bg2;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/of2;->p:Ljava/lang/String;

    iget-wide v2, p0, Lcom/daaw/of2;->q:J

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/bg2;->a(Ljava/lang/String;J)V

    iget-object v0, p0, Lcom/daaw/of2;->r:Lcom/daaw/qf2;

    invoke-static {v0}, Lcom/daaw/qf2;->b(Lcom/daaw/qf2;)Lcom/daaw/bg2;

    move-result-object v1

    invoke-virtual {v0}, Lcom/daaw/qf2;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/daaw/bg2;->b(Ljava/lang/String;)V

    return-void
.end method
