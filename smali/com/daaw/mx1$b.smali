.class public Lcom/daaw/mx1$b;
.super Lcom/daaw/xt1;
.source ""


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

    iput-object p1, p0, Lcom/daaw/mx1$b;->a:Lcom/daaw/mx1;

    invoke-direct {p0}, Lcom/daaw/xt1;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/mx1$b;->a:Lcom/daaw/mx1;

    const/4 v0, 0x0

    iput-object v0, p1, Lcom/daaw/mx1;->y:Lcom/daaw/vt1;

    iget-object p1, p1, Lcom/daaw/mx1;->e:Landroidx/appcompat/widget/ActionBarContainer;

    invoke-virtual {p1}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method
