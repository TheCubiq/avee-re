.class public Lcom/daaw/rd$a;
.super Lcom/daaw/rd;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/rd;->b(Ljava/util/UUID;Lcom/daaw/ey1;)Lcom/daaw/rd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic q:Lcom/daaw/ey1;

.field public final synthetic r:Ljava/util/UUID;


# direct methods
.method public constructor <init>(Lcom/daaw/ey1;Ljava/util/UUID;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rd$a;->q:Lcom/daaw/ey1;

    iput-object p2, p0, Lcom/daaw/rd$a;->r:Ljava/util/UUID;

    invoke-direct {p0}, Lcom/daaw/rd;-><init>()V

    return-void
.end method


# virtual methods
.method public h()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/rd$a;->q:Lcom/daaw/ey1;

    invoke-virtual {v0}, Lcom/daaw/ey1;->o()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/b61;->c()V

    :try_start_0
    iget-object v1, p0, Lcom/daaw/rd$a;->q:Lcom/daaw/ey1;

    iget-object v2, p0, Lcom/daaw/rd$a;->r:Ljava/util/UUID;

    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v1, v2}, Lcom/daaw/rd;->a(Lcom/daaw/ey1;Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/daaw/b61;->r()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lcom/daaw/b61;->g()V

    iget-object v0, p0, Lcom/daaw/rd$a;->q:Lcom/daaw/ey1;

    invoke-virtual {p0, v0}, Lcom/daaw/rd;->g(Lcom/daaw/ey1;)V

    return-void

    :catchall_0
    move-exception v1

    invoke-virtual {v0}, Lcom/daaw/b61;->g()V

    throw v1
.end method
