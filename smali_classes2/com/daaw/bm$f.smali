.class public Lcom/daaw/bm$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/bm;->Q(Ljava/lang/Thread;Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:J

.field public final synthetic q:Ljava/lang/Throwable;

.field public final synthetic r:Ljava/lang/Thread;

.field public final synthetic s:Lcom/daaw/bm;


# direct methods
.method public constructor <init>(Lcom/daaw/bm;JLjava/lang/Throwable;Ljava/lang/Thread;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/bm$f;->s:Lcom/daaw/bm;

    iput-wide p2, p0, Lcom/daaw/bm$f;->p:J

    iput-object p4, p0, Lcom/daaw/bm$f;->q:Ljava/lang/Throwable;

    iput-object p5, p0, Lcom/daaw/bm$f;->r:Ljava/lang/Thread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Lcom/daaw/bm$f;->s:Lcom/daaw/bm;

    invoke-virtual {v0}, Lcom/daaw/bm;->H()Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v0, p0, Lcom/daaw/bm$f;->p:J

    invoke-static {v0, v1}, Lcom/daaw/bm;->b(J)J

    move-result-wide v6

    iget-object v0, p0, Lcom/daaw/bm$f;->s:Lcom/daaw/bm;

    invoke-static {v0}, Lcom/daaw/bm;->c(Lcom/daaw/bm;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_0

    invoke-static {}, Lcom/daaw/ml0;->f()Lcom/daaw/ml0;

    move-result-object v0

    const-string v1, "Tried to write a non-fatal exception while no session was open."

    invoke-virtual {v0, v1}, Lcom/daaw/ml0;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/bm$f;->s:Lcom/daaw/bm;

    invoke-static {v0}, Lcom/daaw/bm;->h(Lcom/daaw/bm;)Lcom/daaw/pb1;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/bm$f;->q:Ljava/lang/Throwable;

    iget-object v4, p0, Lcom/daaw/bm$f;->r:Ljava/lang/Thread;

    invoke-virtual/range {v2 .. v7}, Lcom/daaw/pb1;->s(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V

    :cond_1
    return-void
.end method
