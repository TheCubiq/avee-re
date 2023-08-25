.class public Lcom/daaw/uk$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/uk;->Y([Lcom/daaw/l0;ILcom/daaw/wc0;ZZLcom/daaw/e0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Z

.field public final synthetic q:Lcom/daaw/wc0;

.field public final synthetic r:Lcom/daaw/uk;


# direct methods
.method public constructor <init>(Lcom/daaw/uk;ZLcom/daaw/wc0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/uk$e;->r:Lcom/daaw/uk;

    iput-boolean p2, p0, Lcom/daaw/uk$e;->p:Z

    iput-object p3, p0, Lcom/daaw/uk$e;->q:Lcom/daaw/wc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 2

    iget-boolean p1, p0, Lcom/daaw/uk$e;->p:Z

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    sget-object p1, Lcom/daaw/uk;->I:Lcom/daaw/vw1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/daaw/uk$e;->q:Lcom/daaw/wc0;

    invoke-interface {p1}, Lcom/daaw/wc0;->u()Lcom/daaw/wc0$c;

    move-result-object p1

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object p1, p0, Lcom/daaw/uk$e;->q:Lcom/daaw/wc0;

    invoke-interface {p1}, Lcom/daaw/wc0;->u()Lcom/daaw/wc0$c;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/uk$e;->r:Lcom/daaw/uk;

    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    invoke-interface {p1, p2}, Lcom/daaw/wc0$c;->a(Landroid/view/View;)V

    const/4 p1, 0x1

    return p1

    :cond_1
    return v0
.end method
