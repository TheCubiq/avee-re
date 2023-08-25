.class public Lcom/daaw/uk$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/uk;->Y([Lcom/daaw/l0;ILcom/daaw/wc0;ZZLcom/daaw/e0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/wc0;

.field public final synthetic q:Lcom/daaw/uk;


# direct methods
.method public constructor <init>(Lcom/daaw/uk;Lcom/daaw/wc0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/uk$d;->q:Lcom/daaw/uk;

    iput-object p2, p0, Lcom/daaw/uk$d;->p:Lcom/daaw/wc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 1

    iget-object p1, p0, Lcom/daaw/uk$d;->p:Lcom/daaw/wc0;

    invoke-interface {p1}, Lcom/daaw/wc0;->u()Lcom/daaw/wc0$c;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object p1, p0, Lcom/daaw/uk$d;->p:Lcom/daaw/wc0;

    invoke-interface {p1}, Lcom/daaw/wc0;->u()Lcom/daaw/wc0$c;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/uk$d;->q:Lcom/daaw/uk;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    invoke-interface {p1, v0}, Lcom/daaw/wc0$c;->a(Landroid/view/View;)V

    const/4 p1, 0x1

    return p1
.end method
