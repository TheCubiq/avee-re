.class public final synthetic Lcom/daaw/ti8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/dj8;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:J

.field public final synthetic s:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/dj8;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ti8;->p:Lcom/daaw/dj8;

    iput-object p2, p0, Lcom/daaw/ti8;->q:Ljava/lang/String;

    iput-wide p3, p0, Lcom/daaw/ti8;->r:J

    iput-wide p5, p0, Lcom/daaw/ti8;->s:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lcom/daaw/ti8;->p:Lcom/daaw/dj8;

    iget-object v1, p0, Lcom/daaw/ti8;->q:Ljava/lang/String;

    iget-wide v2, p0, Lcom/daaw/ti8;->r:J

    iget-wide v4, p0, Lcom/daaw/ti8;->s:J

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/dj8;->j(Ljava/lang/String;JJ)V

    return-void
.end method
