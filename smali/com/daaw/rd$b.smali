.class public Lcom/daaw/rd$b;
.super Lcom/daaw/rd;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/rd;->d(Ljava/lang/String;Lcom/daaw/ey1;)Lcom/daaw/rd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic q:Lcom/daaw/ey1;

.field public final synthetic r:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/daaw/ey1;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rd$b;->q:Lcom/daaw/ey1;

    iput-object p2, p0, Lcom/daaw/rd$b;->r:Ljava/lang/String;

    invoke-direct {p0}, Lcom/daaw/rd;-><init>()V

    return-void
.end method


# virtual methods
.method public h()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/rd$b;->q:Lcom/daaw/ey1;

    invoke-virtual {v0}, Lcom/daaw/ey1;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/b61;->c()V

    :try_start_0
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->B()Lcom/daaw/ry1;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/rd$b;->r:Ljava/lang/String;

    invoke-interface {v1, v2}, Lcom/daaw/ry1;->o(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/rd$b;->q:Lcom/daaw/ey1;

    invoke-virtual {p0, v3, v2}, Lcom/daaw/rd;->a(Lcom/daaw/ey1;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/b61;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lcom/daaw/b61;->g()V

    iget-object v0, p0, Lcom/daaw/rd$b;->q:Lcom/daaw/ey1;

    invoke-virtual {p0, v0}, Lcom/daaw/rd;->g(Lcom/daaw/ey1;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lcom/daaw/b61;->g()V

    goto :goto_2

    :goto_1
    throw v1

    :goto_2
    goto :goto_1
.end method
