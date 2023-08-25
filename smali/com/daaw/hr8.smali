.class public final synthetic Lcom/daaw/hr8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/rb;

.field public final synthetic b:Lcom/daaw/j01;

.field public final synthetic c:Lcom/daaw/lz0;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/rb;Lcom/daaw/j01;Lcom/daaw/lz0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/hr8;->a:Lcom/daaw/rb;

    iput-object p2, p0, Lcom/daaw/hr8;->b:Lcom/daaw/j01;

    iput-object p3, p0, Lcom/daaw/hr8;->c:Lcom/daaw/lz0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/hr8;->a:Lcom/daaw/rb;

    iget-object v1, p0, Lcom/daaw/hr8;->b:Lcom/daaw/j01;

    iget-object v2, p0, Lcom/daaw/hr8;->c:Lcom/daaw/lz0;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/rb;->D(Lcom/daaw/j01;Lcom/daaw/lz0;)Ljava/lang/Object;

    const/4 v0, 0x0

    return-object v0
.end method
