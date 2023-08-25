.class public Lcom/daaw/yn$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/PopupMenu$OnMenuItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/yn;->O(Landroid/view/View;[Lcom/daaw/l0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:[Lcom/daaw/l0;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Lcom/daaw/yn;


# direct methods
.method public constructor <init>(Lcom/daaw/yn;[Lcom/daaw/l0;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yn$h;->c:Lcom/daaw/yn;

    iput-object p2, p0, Lcom/daaw/yn$h;->a:[Lcom/daaw/l0;

    iput-object p3, p0, Lcom/daaw/yn$h;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    iget-object v0, p0, Lcom/daaw/yn$h;->a:[Lcom/daaw/l0;

    aget-object p1, v0, p1

    new-instance v0, Lcom/daaw/al;

    iget-object v1, p0, Lcom/daaw/yn$h;->b:Landroid/view/View;

    invoke-direct {v0, v1}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    iget-object v1, p0, Lcom/daaw/yn$h;->c:Lcom/daaw/yn;

    iget v1, v1, Lcom/daaw/yn;->y:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/daaw/l0;->a(Lcom/daaw/al;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
