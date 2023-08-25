.class public Lcom/daaw/mx1$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/yt1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/mx1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/mx1;


# direct methods
.method public constructor <init>(Lcom/daaw/mx1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/mx1$c;->a:Lcom/daaw/mx1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/mx1$c;->a:Lcom/daaw/mx1;

    iget-object p1, p1, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
