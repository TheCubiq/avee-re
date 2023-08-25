.class public Lcom/daaw/lp0;
.super Lcom/daaw/ck0;
.source ""

# interfaces
.implements Lcom/daaw/ip0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/lp0$b;,
        Lcom/daaw/lp0$a;,
        Lcom/daaw/lp0$c;
    }
.end annotation


# static fields
.field public static Z:Ljava/lang/reflect/Method;


# instance fields
.field public Y:Lcom/daaw/ip0;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_0

    const-class v0, Landroid/widget/PopupWindow;

    const-string v1, "setTouchModal"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Class;

    const/4 v3, 0x0

    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lcom/daaw/lp0;->Z:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/daaw/ck0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method


# virtual methods
.method public R(Ljava/lang/Object;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/ck0;->U:Landroid/widget/PopupWindow;

    check-cast p1, Landroid/transition/Transition;

    invoke-static {v0, p1}, Lcom/daaw/lp0$a;->a(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    :cond_0
    return-void
.end method

.method public S(Ljava/lang/Object;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x17

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/ck0;->U:Landroid/widget/PopupWindow;

    check-cast p1, Landroid/transition/Transition;

    invoke-static {v0, p1}, Lcom/daaw/lp0$a;->b(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    :cond_0
    return-void
.end method

.method public T(Lcom/daaw/ip0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/lp0;->Y:Lcom/daaw/ip0;

    return-void
.end method

.method public U(Z)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_0

    sget-object v0, Lcom/daaw/lp0;->Z:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v1, p0, Lcom/daaw/ck0;->U:Landroid/widget/PopupWindow;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    aput-object p1, v2, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/daaw/ck0;->U:Landroid/widget/PopupWindow;

    invoke-static {v0, p1}, Lcom/daaw/lp0$b;->a(Landroid/widget/PopupWindow;Z)V

    :catch_0
    :cond_1
    :goto_0
    return-void
.end method

.method public d(Landroidx/appcompat/view/menu/e;Landroid/view/MenuItem;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/lp0;->Y:Lcom/daaw/ip0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/daaw/ip0;->d(Landroidx/appcompat/view/menu/e;Landroid/view/MenuItem;)V

    :cond_0
    return-void
.end method

.method public g(Landroidx/appcompat/view/menu/e;Landroid/view/MenuItem;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/lp0;->Y:Lcom/daaw/ip0;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, Lcom/daaw/ip0;->g(Landroidx/appcompat/view/menu/e;Landroid/view/MenuItem;)V

    :cond_0
    return-void
.end method

.method public s(Landroid/content/Context;Z)Lcom/daaw/zu;
    .locals 1

    new-instance v0, Lcom/daaw/lp0$c;

    invoke-direct {v0, p1, p2}, Lcom/daaw/lp0$c;-><init>(Landroid/content/Context;Z)V

    invoke-virtual {v0, p0}, Lcom/daaw/lp0$c;->setHoverListener(Lcom/daaw/ip0;)V

    return-object v0
.end method
