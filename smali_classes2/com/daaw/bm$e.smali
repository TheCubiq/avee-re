.class public Lcom/daaw/bm$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/bm;->R(JLjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:J

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/daaw/bm;


# direct methods
.method public constructor <init>(Lcom/daaw/bm;JLjava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/bm$e;->c:Lcom/daaw/bm;

    iput-wide p2, p0, Lcom/daaw/bm$e;->a:J

    iput-object p4, p0, Lcom/daaw/bm$e;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 4

    iget-object v0, p0, Lcom/daaw/bm$e;->c:Lcom/daaw/bm;

    invoke-virtual {v0}, Lcom/daaw/bm;->H()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/bm$e;->c:Lcom/daaw/bm;

    invoke-static {v0}, Lcom/daaw/bm;->e(Lcom/daaw/bm;)Lcom/daaw/fl0;

    move-result-object v0

    iget-wide v1, p0, Lcom/daaw/bm$e;->a:J

    iget-object v3, p0, Lcom/daaw/bm$e;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2, v3}, Lcom/daaw/fl0;->g(JLjava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/bm$e;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
