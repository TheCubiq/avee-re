.class public final Lcom/daaw/hp0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/hp0$a;
    }
.end annotation


# direct methods
.method public static a(Landroid/view/MenuItem;Lcom/daaw/o0;)Landroid/view/MenuItem;
    .locals 1

    instance-of v0, p0, Lcom/daaw/hi1;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/daaw/hi1;

    invoke-interface {p0, p1}, Lcom/daaw/hi1;->b(Lcom/daaw/o0;)Lcom/daaw/hi1;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static b(Landroid/view/MenuItem;CI)V
    .locals 2

    instance-of v0, p0, Lcom/daaw/hi1;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/daaw/hi1;

    invoke-interface {p0, p1, p2}, Lcom/daaw/hi1;->setAlphabeticShortcut(CI)Landroid/view/MenuItem;

    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    invoke-static {p0, p1, p2}, Lcom/daaw/hp0$a;->g(Landroid/view/MenuItem;CI)Landroid/view/MenuItem;

    :cond_1
    :goto_0
    return-void
.end method

.method public static c(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V
    .locals 2

    instance-of v0, p0, Lcom/daaw/hi1;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/daaw/hi1;

    invoke-interface {p0, p1}, Lcom/daaw/hi1;->setContentDescription(Ljava/lang/CharSequence;)Lcom/daaw/hi1;

    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    invoke-static {p0, p1}, Lcom/daaw/hp0$a;->h(Landroid/view/MenuItem;Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    :cond_1
    :goto_0
    return-void
.end method

.method public static d(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)V
    .locals 2

    instance-of v0, p0, Lcom/daaw/hi1;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/daaw/hi1;

    invoke-interface {p0, p1}, Lcom/daaw/hi1;->setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    invoke-static {p0, p1}, Lcom/daaw/hp0$a;->i(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    :cond_1
    :goto_0
    return-void
.end method

.method public static e(Landroid/view/MenuItem;Landroid/graphics/PorterDuff$Mode;)V
    .locals 2

    instance-of v0, p0, Lcom/daaw/hi1;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/daaw/hi1;

    invoke-interface {p0, p1}, Lcom/daaw/hi1;->setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    invoke-static {p0, p1}, Lcom/daaw/hp0$a;->j(Landroid/view/MenuItem;Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    :cond_1
    :goto_0
    return-void
.end method

.method public static f(Landroid/view/MenuItem;CI)V
    .locals 2

    instance-of v0, p0, Lcom/daaw/hi1;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/daaw/hi1;

    invoke-interface {p0, p1, p2}, Lcom/daaw/hi1;->setNumericShortcut(CI)Landroid/view/MenuItem;

    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    invoke-static {p0, p1, p2}, Lcom/daaw/hp0$a;->k(Landroid/view/MenuItem;CI)Landroid/view/MenuItem;

    :cond_1
    :goto_0
    return-void
.end method

.method public static g(Landroid/view/MenuItem;Ljava/lang/CharSequence;)V
    .locals 2

    instance-of v0, p0, Lcom/daaw/hi1;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/daaw/hi1;

    invoke-interface {p0, p1}, Lcom/daaw/hi1;->setTooltipText(Ljava/lang/CharSequence;)Lcom/daaw/hi1;

    goto :goto_0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_1

    invoke-static {p0, p1}, Lcom/daaw/hp0$a;->m(Landroid/view/MenuItem;Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    :cond_1
    :goto_0
    return-void
.end method
