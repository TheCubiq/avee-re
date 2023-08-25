.class public Lcom/daaw/wb$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/wb;->s(Ljava/util/List;Lcom/daaw/lz0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Ljava/util/List;

.field public final synthetic q:Lcom/daaw/lz0;

.field public final synthetic r:Lcom/daaw/wb;


# direct methods
.method public constructor <init>(Lcom/daaw/wb;Ljava/util/List;Lcom/daaw/lz0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wb$b;->r:Lcom/daaw/wb;

    iput-object p2, p0, Lcom/daaw/wb$b;->p:Ljava/util/List;

    iput-object p3, p0, Lcom/daaw/wb$b;->q:Lcom/daaw/lz0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/wb$b;->r:Lcom/daaw/wb;

    invoke-static {v0}, Lcom/daaw/wb;->f(Lcom/daaw/wb;)Lcom/daaw/qb;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/wb$b;->r:Lcom/daaw/wb;

    invoke-static {v0}, Lcom/daaw/wb;->f(Lcom/daaw/wb;)Lcom/daaw/qb;

    move-result-object v0

    invoke-static {}, Lcom/daaw/j01;->a()Lcom/daaw/j01$a;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/wb$b;->p:Ljava/util/List;

    invoke-virtual {v1, v2}, Lcom/daaw/j01$a;->b(Ljava/util/List;)Lcom/daaw/j01$a;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/j01$a;->a()Lcom/daaw/j01;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/wb$b;->q:Lcom/daaw/lz0;

    invoke-virtual {v0, v1, v2}, Lcom/daaw/qb;->f(Lcom/daaw/j01;Lcom/daaw/lz0;)V

    return-void
.end method
