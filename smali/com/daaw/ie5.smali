.class public final synthetic Lcom/daaw/ie5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lcom/daaw/l68;


# direct methods
.method public synthetic constructor <init>(ZLjava/lang/String;Lcom/daaw/l68;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/daaw/ie5;->a:Z

    iput-object p2, p0, Lcom/daaw/ie5;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/ie5;->c:Lcom/daaw/l68;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-boolean v0, p0, Lcom/daaw/ie5;->a:Z

    iget-object v1, p0, Lcom/daaw/ie5;->b:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/ie5;->c:Lcom/daaw/l68;

    invoke-static {v0, v1, v2}, Lcom/daaw/qh8;->c(ZLjava/lang/String;Lcom/daaw/l68;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
