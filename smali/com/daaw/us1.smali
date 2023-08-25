.class public Lcom/daaw/us1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/f70;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/us1$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/daaw/f70<",
        "TR;>;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/us1$a;


# direct methods
.method public constructor <init>(Lcom/daaw/us1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/us1;->a:Lcom/daaw/us1$a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;Lcom/daaw/f70$a;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;",
            "Lcom/daaw/f70$a;",
            ")Z"
        }
    .end annotation

    invoke-interface {p2}, Lcom/daaw/f70$a;->getView()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    iget-object p2, p0, Lcom/daaw/us1;->a:Lcom/daaw/us1$a;

    invoke-interface {p2}, Lcom/daaw/us1$a;->a()Landroid/view/animation/Animation;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
