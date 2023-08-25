.class public Lcom/daaw/pv1$e0$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pv1$e0$a;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:I

.field public final synthetic q:Lcom/daaw/vn;

.field public final synthetic r:Lcom/daaw/pv1$e0$a;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1$e0$a;ILcom/daaw/vn;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$e0$a$a;->r:Lcom/daaw/pv1$e0$a;

    iput p2, p0, Lcom/daaw/pv1$e0$a$a;->p:I

    iput-object p3, p0, Lcom/daaw/pv1$e0$a$a;->q:Lcom/daaw/vn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/pv1$e0$a$a;->r:Lcom/daaw/pv1$e0$a;

    iget-object v1, v0, Lcom/daaw/pv1$e0$a;->s:Lcom/daaw/pv1$e0;

    iget-object v1, v1, Lcom/daaw/pv1$e0;->a:Lcom/daaw/pv1;

    iget v2, p0, Lcom/daaw/pv1$e0$a$a;->p:I

    iget-object v0, v0, Lcom/daaw/pv1$e0$a;->q:Lcom/daaw/gt;

    invoke-virtual {v0}, Lcom/daaw/gt;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {v1, v2, v0}, Lcom/daaw/pv1;->q(Lcom/daaw/pv1;ILjava/util/List;)V

    iget-object v0, p0, Lcom/daaw/pv1$e0$a$a;->r:Lcom/daaw/pv1$e0$a;

    iget-object v0, v0, Lcom/daaw/pv1$e0$a;->r:Lcom/daaw/al;

    invoke-virtual {v0}, Lcom/daaw/al;->a()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/pv1$e0$a$a;->r:Lcom/daaw/pv1$e0$a;

    iget-object v0, v0, Lcom/daaw/pv1$e0$a;->r:Lcom/daaw/al;

    invoke-virtual {v0}, Lcom/daaw/al;->c()Landroid/app/FragmentManager;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/daaw/ho;->o(Landroid/app/FragmentManager;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/pv1$e0$a$a;->r:Lcom/daaw/pv1$e0$a;

    iget-object v0, v0, Lcom/daaw/pv1$e0$a;->r:Lcom/daaw/al;

    iget v1, p0, Lcom/daaw/pv1$e0$a$a;->p:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/pv1$e0$a$a;->q:Lcom/daaw/vn;

    sget-object v3, Lcom/daaw/xv;->b:[Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/ho;->j(Lcom/daaw/al;Ljava/lang/Integer;Lcom/daaw/vn;[Ljava/lang/String;)Lcom/daaw/ho;

    :cond_1
    return-void
.end method
