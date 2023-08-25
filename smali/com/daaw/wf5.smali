.class public final synthetic Lcom/daaw/wf5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/fg5;

.field public final synthetic q:Ljava/lang/Object;

.field public final synthetic r:Lcom/daaw/e14;

.field public final synthetic s:Ljava/lang/String;

.field public final synthetic t:J

.field public final synthetic u:Lcom/daaw/io6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/fg5;Ljava/lang/Object;Lcom/daaw/e14;Ljava/lang/String;JLcom/daaw/io6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/wf5;->p:Lcom/daaw/fg5;

    iput-object p2, p0, Lcom/daaw/wf5;->q:Ljava/lang/Object;

    iput-object p3, p0, Lcom/daaw/wf5;->r:Lcom/daaw/e14;

    iput-object p4, p0, Lcom/daaw/wf5;->s:Ljava/lang/String;

    iput-wide p5, p0, Lcom/daaw/wf5;->t:J

    iput-object p7, p0, Lcom/daaw/wf5;->u:Lcom/daaw/io6;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lcom/daaw/wf5;->p:Lcom/daaw/fg5;

    iget-object v1, p0, Lcom/daaw/wf5;->q:Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/wf5;->r:Lcom/daaw/e14;

    iget-object v3, p0, Lcom/daaw/wf5;->s:Ljava/lang/String;

    iget-wide v4, p0, Lcom/daaw/wf5;->t:J

    iget-object v6, p0, Lcom/daaw/wf5;->u:Lcom/daaw/io6;

    invoke-virtual/range {v0 .. v6}, Lcom/daaw/fg5;->q(Ljava/lang/Object;Lcom/daaw/e14;Ljava/lang/String;JLcom/daaw/io6;)V

    return-void
.end method
