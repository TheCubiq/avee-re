.class public Lcom/daaw/xw0$j0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/xw0;->g(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Long;ZLcom/daaw/tx0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Z

.field public final synthetic q:Lcom/daaw/tx0;

.field public final synthetic r:Ljava/lang/Long;

.field public final synthetic s:Ljava/lang/Integer;

.field public final synthetic t:Lcom/daaw/xw0;


# direct methods
.method public constructor <init>(Lcom/daaw/xw0;ZLcom/daaw/tx0;Ljava/lang/Long;Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xw0$j0;->t:Lcom/daaw/xw0;

    iput-boolean p2, p0, Lcom/daaw/xw0$j0;->p:Z

    iput-object p3, p0, Lcom/daaw/xw0$j0;->q:Lcom/daaw/tx0;

    iput-object p4, p0, Lcom/daaw/xw0$j0;->r:Ljava/lang/Long;

    iput-object p5, p0, Lcom/daaw/xw0$j0;->s:Ljava/lang/Integer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/xw0$j0;->p:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/xw0$j0;->t:Lcom/daaw/xw0;

    iget-object v0, v0, Lcom/daaw/xw0;->a:Lcom/daaw/uf1;

    iget-object v1, p0, Lcom/daaw/xw0$j0;->q:Lcom/daaw/tx0;

    invoke-virtual {v0, v1}, Lcom/daaw/uf1;->a(Lcom/daaw/tx0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/l01;->c()Lcom/daaw/l01;

    move-result-object v0

    if-eqz v0, :cond_4

    :goto_0
    iget-object v1, p0, Lcom/daaw/xw0$j0;->r:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Lcom/daaw/l01;->F(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/xw0$j0;->s:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-static {}, Lcom/daaw/l01;->c()Lcom/daaw/l01;

    move-result-object v0

    if-eqz v0, :cond_4

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/xw0$j0;->s:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    invoke-static {}, Lcom/daaw/l01;->c()Lcom/daaw/l01;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/daaw/l01;->q()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lcom/daaw/xw0$j0;->r:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Lcom/daaw/l01;->G(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {}, Lcom/daaw/l01;->c()Lcom/daaw/l01;

    move-result-object v0

    if-eqz v0, :cond_4

    :cond_3
    iget-object v1, p0, Lcom/daaw/xw0$j0;->r:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Lcom/daaw/l01;->s(Ljava/lang/Object;)V

    :cond_4
    :goto_1
    return-void
.end method
