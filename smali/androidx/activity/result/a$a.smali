.class public Landroidx/activity/result/a$a;
.super Lcom/daaw/y0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/activity/result/a;->i(Ljava/lang/String;Lcom/daaw/v0;Lcom/daaw/u0;)Lcom/daaw/y0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/y0<",
        "TI;>;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/daaw/v0;

.field public final synthetic c:Landroidx/activity/result/a;


# direct methods
.method public constructor <init>(Landroidx/activity/result/a;Ljava/lang/String;Lcom/daaw/v0;)V
    .locals 0

    iput-object p1, p0, Landroidx/activity/result/a$a;->c:Landroidx/activity/result/a;

    iput-object p2, p0, Landroidx/activity/result/a$a;->a:Ljava/lang/String;

    iput-object p3, p0, Landroidx/activity/result/a$a;->b:Lcom/daaw/v0;

    invoke-direct {p0}, Lcom/daaw/y0;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Object;Lcom/daaw/s0;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;",
            "Lcom/daaw/s0;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/activity/result/a$a;->c:Landroidx/activity/result/a;

    iget-object v0, v0, Landroidx/activity/result/a;->c:Ljava/util/Map;

    iget-object v1, p0, Landroidx/activity/result/a$a;->a:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/activity/result/a$a;->c:Landroidx/activity/result/a;

    iget-object v1, v1, Landroidx/activity/result/a;->e:Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/activity/result/a$a;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Landroidx/activity/result/a$a;->c:Landroidx/activity/result/a;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Landroidx/activity/result/a$a;->b:Lcom/daaw/v0;

    invoke-virtual {v1, v0, v2, p1, p2}, Landroidx/activity/result/a;->f(ILcom/daaw/v0;Ljava/lang/Object;Lcom/daaw/s0;)V

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Attempting to launch an unregistered ActivityResultLauncher with contract "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Landroidx/activity/result/a$a;->b:Lcom/daaw/v0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " and input "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". You must ensure the ActivityResultLauncher is registered before calling launch()."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Landroidx/activity/result/a$a;->c:Landroidx/activity/result/a;

    iget-object v1, p0, Landroidx/activity/result/a$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroidx/activity/result/a;->k(Ljava/lang/String;)V

    return-void
.end method
