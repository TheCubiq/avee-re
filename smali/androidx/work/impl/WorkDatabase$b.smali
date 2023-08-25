.class public Landroidx/work/impl/WorkDatabase$b;
.super Lcom/daaw/b61$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/WorkDatabase;->u()Lcom/daaw/b61$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/b61$b;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lcom/daaw/ji1;)V
    .locals 1

    invoke-super {p0, p1}, Lcom/daaw/b61$b;->c(Lcom/daaw/ji1;)V

    invoke-interface {p1}, Lcom/daaw/ji1;->a()V

    :try_start_0
    invoke-static {}, Landroidx/work/impl/WorkDatabase;->w()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/daaw/ji1;->h(Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/daaw/ji1;->s()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Lcom/daaw/ji1;->C()V

    return-void

    :catchall_0
    move-exception v0

    invoke-interface {p1}, Lcom/daaw/ji1;->C()V

    throw v0
.end method
