.class public final Lcom/daaw/ir;
.super Lcom/daaw/bz;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final r:Lcom/daaw/ir;

.field public static final s:Lcom/daaw/pl;


# direct methods
.method public static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/daaw/ir;

    invoke-direct {v0}, Lcom/daaw/ir;-><init>()V

    sput-object v0, Lcom/daaw/ir;->r:Lcom/daaw/ir;

    sget-object v0, Lcom/daaw/op1;->q:Lcom/daaw/op1;

    invoke-static {}, Lcom/daaw/dj1;->a()I

    move-result v1

    const/16 v2, 0x40

    invoke-static {v2, v1}, Lcom/daaw/f31;->a(II)I

    move-result v4

    const-string v3, "kotlinx.coroutines.io.parallelism"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0xc

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lcom/daaw/dj1;->f(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/daaw/pl;->V(I)Lcom/daaw/pl;

    move-result-object v0

    sput-object v0, Lcom/daaw/ir;->s:Lcom/daaw/pl;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/bz;-><init>()V

    return-void
.end method


# virtual methods
.method public T(Lcom/daaw/nl;Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lcom/daaw/ir;->s:Lcom/daaw/pl;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/pl;->T(Lcom/daaw/nl;Ljava/lang/Runnable;)V

    return-void
.end method

.method public close()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot be invoked on Dispatchers.IO"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lcom/daaw/mw;->p:Lcom/daaw/mw;

    invoke-virtual {p0, v0, p1}, Lcom/daaw/ir;->T(Lcom/daaw/nl;Ljava/lang/Runnable;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Dispatchers.IO"

    return-object v0
.end method
