.class public Lcom/daaw/te$j;
.super Lcom/daaw/jn1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/te;->r(Landroid/view/ViewGroup;Lcom/daaw/on1;Lcom/daaw/on1;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:Z

.field public final synthetic b:Landroid/view/ViewGroup;

.field public final synthetic c:Lcom/daaw/te;


# direct methods
.method public constructor <init>(Lcom/daaw/te;Landroid/view/ViewGroup;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/te$j;->c:Lcom/daaw/te;

    iput-object p2, p0, Lcom/daaw/te$j;->b:Landroid/view/ViewGroup;

    invoke-direct {p0}, Lcom/daaw/jn1;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/te$j;->a:Z

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/in1;)V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/te$j;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/te$j;->b:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/daaw/et1;->c(Landroid/view/ViewGroup;Z)V

    :cond_0
    invoke-virtual {p1, p0}, Lcom/daaw/in1;->T(Lcom/daaw/in1$f;)Lcom/daaw/in1;

    return-void
.end method

.method public b(Lcom/daaw/in1;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/te$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/et1;->c(Landroid/view/ViewGroup;Z)V

    return-void
.end method

.method public c(Lcom/daaw/in1;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/te$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/daaw/et1;->c(Landroid/view/ViewGroup;Z)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/te$j;->a:Z

    return-void
.end method

.method public e(Lcom/daaw/in1;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/te$j;->b:Landroid/view/ViewGroup;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/daaw/et1;->c(Landroid/view/ViewGroup;Z)V

    return-void
.end method
