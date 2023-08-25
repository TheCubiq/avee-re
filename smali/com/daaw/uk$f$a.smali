.class public Lcom/daaw/uk$f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/gy0$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/uk$f;->onClick(Landroid/view/View;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:Lcom/daaw/uk$f;


# direct methods
.method public constructor <init>(Lcom/daaw/uk$f;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/uk$f$a;->b:Lcom/daaw/uk$f;

    iput-object p2, p0, Lcom/daaw/uk$f$a;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    iget-object v0, p0, Lcom/daaw/uk$f$a;->b:Lcom/daaw/uk$f;

    iget-object v0, v0, Lcom/daaw/uk$f;->q:Lcom/daaw/uk;

    invoke-static {v0}, Lcom/daaw/uk;->P(Lcom/daaw/uk;)[Lcom/daaw/l0;

    move-result-object v0

    aget-object p1, v0, p1

    new-instance v0, Lcom/daaw/al;

    iget-object v1, p0, Lcom/daaw/uk$f$a;->a:Landroid/view/View;

    invoke-direct {v0, v1}, Lcom/daaw/al;-><init>(Landroid/view/View;)V

    iget-object v1, p0, Lcom/daaw/uk$f$a;->b:Lcom/daaw/uk$f;

    iget-object v1, v1, Lcom/daaw/uk$f;->q:Lcom/daaw/uk;

    iget-object v1, v1, Lcom/daaw/uk;->t:Lcom/daaw/jh0$a;

    invoke-virtual {v1}, Lcom/daaw/jh0$a;->d()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/daaw/l0;->a(Lcom/daaw/al;Ljava/lang/Object;)V

    const/4 p1, 0x1

    return p1
.end method
