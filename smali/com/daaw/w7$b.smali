.class public Lcom/daaw/w7$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/w7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/w7;


# direct methods
.method public constructor <init>(Lcom/daaw/w7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/w7$b;->p:Lcom/daaw/w7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/w7$b;->p:Lcom/daaw/w7;

    iget-boolean v1, v0, Lcom/daaw/w7;->D:Z

    if-nez v1, :cond_0

    return-void

    :cond_0
    iget-boolean v1, v0, Lcom/daaw/w7;->B:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    iput-boolean v2, v0, Lcom/daaw/w7;->B:Z

    iget-object v0, v0, Lcom/daaw/w7;->p:Lcom/daaw/w7$a;

    invoke-virtual {v0}, Lcom/daaw/w7$a;->m()V

    :cond_1
    iget-object v0, p0, Lcom/daaw/w7$b;->p:Lcom/daaw/w7;

    iget-object v0, v0, Lcom/daaw/w7;->p:Lcom/daaw/w7$a;

    invoke-virtual {v0}, Lcom/daaw/w7$a;->h()Z

    move-result v1

    if-nez v1, :cond_4

    iget-object v1, p0, Lcom/daaw/w7$b;->p:Lcom/daaw/w7;

    invoke-virtual {v1}, Lcom/daaw/w7;->v()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/daaw/w7$b;->p:Lcom/daaw/w7;

    iget-boolean v3, v1, Lcom/daaw/w7;->C:Z

    if-eqz v3, :cond_3

    iput-boolean v2, v1, Lcom/daaw/w7;->C:Z

    invoke-virtual {v1}, Lcom/daaw/w7;->c()V

    :cond_3
    invoke-virtual {v0}, Lcom/daaw/w7$a;->a()V

    invoke-virtual {v0}, Lcom/daaw/w7$a;->b()I

    move-result v1

    invoke-virtual {v0}, Lcom/daaw/w7$a;->c()I

    move-result v0

    iget-object v2, p0, Lcom/daaw/w7$b;->p:Lcom/daaw/w7;

    invoke-virtual {v2, v1, v0}, Lcom/daaw/w7;->j(II)V

    iget-object v0, p0, Lcom/daaw/w7$b;->p:Lcom/daaw/w7;

    iget-object v0, v0, Lcom/daaw/w7;->r:Landroid/view/View;

    invoke-static {v0, p0}, Lcom/daaw/xs1;->j0(Landroid/view/View;Ljava/lang/Runnable;)V

    return-void

    :cond_4
    :goto_0
    iget-object v0, p0, Lcom/daaw/w7$b;->p:Lcom/daaw/w7;

    iput-boolean v2, v0, Lcom/daaw/w7;->D:Z

    return-void
.end method
