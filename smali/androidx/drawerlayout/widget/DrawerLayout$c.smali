.class public final Landroidx/drawerlayout/widget/DrawerLayout$c;
.super Lcom/daaw/w;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/drawerlayout/widget/DrawerLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/w;-><init>()V

    return-void
.end method


# virtual methods
.method public g(Landroid/view/View;Lcom/daaw/y;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lcom/daaw/w;->g(Landroid/view/View;Lcom/daaw/y;)V

    invoke-static {p1}, Landroidx/drawerlayout/widget/DrawerLayout;->y(Landroid/view/View;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lcom/daaw/y;->q0(Landroid/view/View;)V

    :cond_0
    return-void
.end method
