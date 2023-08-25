.class public Lcom/daaw/wn$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/wn;->z(Lcom/daaw/yn;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/yn;

.field public final synthetic q:Lcom/daaw/wn;


# direct methods
.method public constructor <init>(Lcom/daaw/wn;Lcom/daaw/yn;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/wn$a;->q:Lcom/daaw/wn;

    iput-object p2, p0, Lcom/daaw/wn$a;->p:Lcom/daaw/yn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    iget-object p1, p0, Lcom/daaw/wn$a;->p:Lcom/daaw/yn;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$c0;->l()I

    move-result p1

    iget-object v0, p0, Lcom/daaw/wn$a;->q:Lcom/daaw/wn;

    invoke-static {v0}, Lcom/daaw/wn;->x(Lcom/daaw/wn;)Lcom/daaw/wn$d;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/wn$a;->p:Lcom/daaw/yn;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView$c0;->a:Landroid/view/View;

    invoke-interface {v0, p1, v1}, Lcom/daaw/wn$d;->a(ILandroid/view/View;)Z

    return-void
.end method
