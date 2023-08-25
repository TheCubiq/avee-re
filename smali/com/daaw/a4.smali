.class public Lcom/daaw/a4;
.super Lcom/daaw/z3;
.source ""

# interfaces
.implements Landroidx/appcompat/view/menu/e$a;
.implements Landroid/view/LayoutInflater$Factory2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/a4$n;,
        Lcom/daaw/a4$m;,
        Lcom/daaw/a4$l;,
        Lcom/daaw/a4$k;,
        Lcom/daaw/a4$p;,
        Lcom/daaw/a4$r;,
        Lcom/daaw/a4$q;,
        Lcom/daaw/a4$o;,
        Lcom/daaw/a4$h;,
        Lcom/daaw/a4$t;,
        Lcom/daaw/a4$u;,
        Lcom/daaw/a4$i;,
        Lcom/daaw/a4$v;,
        Lcom/daaw/a4$j;,
        Lcom/daaw/a4$s;
    }
.end annotation


# static fields
.field public static final A0:[I

.field public static final B0:Z

.field public static final C0:Z

.field public static D0:Z

.field public static final y0:Lcom/daaw/cd1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/cd1<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final z0:Z


# instance fields
.field public final A:Ljava/lang/Object;

.field public final B:Landroid/content/Context;

.field public C:Landroid/view/Window;

.field public D:Lcom/daaw/a4$o;

.field public final E:Lcom/daaw/t3;

.field public F:Lcom/daaw/i0;

.field public G:Landroid/view/MenuInflater;

.field public H:Ljava/lang/CharSequence;

.field public I:Lcom/daaw/hq;

.field public J:Lcom/daaw/a4$i;

.field public K:Lcom/daaw/a4$v;

.field public L:Lcom/daaw/n0;

.field public M:Landroidx/appcompat/widget/ActionBarContextView;

.field public N:Landroid/widget/PopupWindow;

.field public O:Ljava/lang/Runnable;

.field public P:Lcom/daaw/ut1;

.field public Q:Z

.field public R:Z

.field public S:Landroid/view/ViewGroup;

.field public T:Landroid/widget/TextView;

.field public U:Landroid/view/View;

.field public V:Z

.field public W:Z

.field public X:Z

.field public Y:Z

.field public Z:Z

.field public a0:Z

.field public b0:Z

.field public c0:Z

.field public d0:[Lcom/daaw/a4$u;

.field public e0:Lcom/daaw/a4$u;

.field public f0:Z

.field public g0:Z

.field public h0:Z

.field public i0:Z

.field public j0:Landroid/content/res/Configuration;

.field public k0:I

.field public l0:I

.field public m0:I

.field public n0:Z

.field public o0:Lcom/daaw/a4$q;

.field public p0:Lcom/daaw/a4$q;

.field public q0:Z

.field public r0:I

.field public final s0:Ljava/lang/Runnable;

.field public t0:Z

.field public u0:Landroid/graphics/Rect;

.field public v0:Landroid/graphics/Rect;

.field public w0:Lcom/daaw/z4;

.field public x0:Lcom/daaw/ui0;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/daaw/cd1;

    invoke-direct {v0}, Lcom/daaw/cd1;-><init>()V

    sput-object v0, Lcom/daaw/a4;->y0:Lcom/daaw/cd1;

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x15

    if-ge v0, v3, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Lcom/daaw/a4;->z0:Z

    new-array v3, v2, [I

    const v4, 0x1010054

    aput v4, v3, v1

    sput-object v3, Lcom/daaw/a4;->A0:[I

    sget-object v1, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    const-string v3, "robolectric"

    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    xor-int/2addr v1, v2

    sput-boolean v1, Lcom/daaw/a4;->B0:Z

    sput-boolean v2, Lcom/daaw/a4;->C0:Z

    if-eqz v0, :cond_1

    sget-boolean v0, Lcom/daaw/a4;->D0:Z

    if-nez v0, :cond_1

    invoke-static {}, Ljava/lang/Thread;->getDefaultUncaughtExceptionHandler()Ljava/lang/Thread$UncaughtExceptionHandler;

    move-result-object v0

    new-instance v1, Lcom/daaw/a4$a;

    invoke-direct {v1, v0}, Lcom/daaw/a4$a;-><init>(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    invoke-static {v1}, Ljava/lang/Thread;->setDefaultUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V

    sput-boolean v2, Lcom/daaw/a4;->D0:Z

    :cond_1
    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lcom/daaw/t3;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2, p1}, Lcom/daaw/a4;-><init>(Landroid/content/Context;Landroid/view/Window;Lcom/daaw/t3;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroid/app/Dialog;Lcom/daaw/t3;)V
    .locals 2

    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-direct {p0, v0, v1, p2, p1}, Lcom/daaw/a4;-><init>(Landroid/content/Context;Landroid/view/Window;Lcom/daaw/t3;Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/Window;Lcom/daaw/t3;Ljava/lang/Object;)V
    .locals 2

    invoke-direct {p0}, Lcom/daaw/z3;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/a4;->P:Lcom/daaw/ut1;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/a4;->Q:Z

    const/16 v0, -0x64

    iput v0, p0, Lcom/daaw/a4;->k0:I

    new-instance v1, Lcom/daaw/a4$b;

    invoke-direct {v1, p0}, Lcom/daaw/a4$b;-><init>(Lcom/daaw/a4;)V

    iput-object v1, p0, Lcom/daaw/a4;->s0:Ljava/lang/Runnable;

    iput-object p1, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/a4;->E:Lcom/daaw/t3;

    iput-object p4, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    iget p1, p0, Lcom/daaw/a4;->k0:I

    if-ne p1, v0, :cond_0

    instance-of p1, p4, Landroid/app/Dialog;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/a4;->d1()Lcom/daaw/p3;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/p3;->F()Lcom/daaw/z3;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/z3;->r()I

    move-result p1

    iput p1, p0, Lcom/daaw/a4;->k0:I

    :cond_0
    iget p1, p0, Lcom/daaw/a4;->k0:I

    if-ne p1, v0, :cond_1

    sget-object p1, Lcom/daaw/a4;->y0:Lcom/daaw/cd1;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/daaw/cd1;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Integer;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result p3

    iput p3, p0, Lcom/daaw/a4;->k0:I

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/daaw/cd1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p0, p2}, Lcom/daaw/a4;->a0(Landroid/view/Window;)V

    :cond_2
    invoke-static {}, Lcom/daaw/d4;->h()V

    return-void
.end method

.method public static s0(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)Landroid/content/res/Configuration;
    .locals 5

    new-instance v0, Landroid/content/res/Configuration;

    invoke-direct {v0}, Landroid/content/res/Configuration;-><init>()V

    const/4 v1, 0x0

    iput v1, v0, Landroid/content/res/Configuration;->fontScale:F

    if-eqz p1, :cond_16

    invoke-virtual {p0, p1}, Landroid/content/res/Configuration;->diff(Landroid/content/res/Configuration;)I

    move-result v1

    if-nez v1, :cond_0

    goto/16 :goto_1

    :cond_0
    iget v1, p0, Landroid/content/res/Configuration;->fontScale:F

    iget v2, p1, Landroid/content/res/Configuration;->fontScale:F

    cmpl-float v1, v1, v2

    if-eqz v1, :cond_1

    iput v2, v0, Landroid/content/res/Configuration;->fontScale:F

    :cond_1
    iget v1, p0, Landroid/content/res/Configuration;->mcc:I

    iget v2, p1, Landroid/content/res/Configuration;->mcc:I

    if-eq v1, v2, :cond_2

    iput v2, v0, Landroid/content/res/Configuration;->mcc:I

    :cond_2
    iget v1, p0, Landroid/content/res/Configuration;->mnc:I

    iget v2, p1, Landroid/content/res/Configuration;->mnc:I

    if-eq v1, v2, :cond_3

    iput v2, v0, Landroid/content/res/Configuration;->mnc:I

    :cond_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x18

    if-lt v1, v2, :cond_4

    invoke-static {p0, p1, v0}, Lcom/daaw/a4$m;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    goto :goto_0

    :cond_4
    iget-object v2, p0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iget-object v3, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-static {v2, v3}, Lcom/daaw/pt0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_5

    iget-object v2, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    iput-object v2, v0, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    :cond_5
    :goto_0
    iget v2, p0, Landroid/content/res/Configuration;->touchscreen:I

    iget v3, p1, Landroid/content/res/Configuration;->touchscreen:I

    if-eq v2, v3, :cond_6

    iput v3, v0, Landroid/content/res/Configuration;->touchscreen:I

    :cond_6
    iget v2, p0, Landroid/content/res/Configuration;->keyboard:I

    iget v3, p1, Landroid/content/res/Configuration;->keyboard:I

    if-eq v2, v3, :cond_7

    iput v3, v0, Landroid/content/res/Configuration;->keyboard:I

    :cond_7
    iget v2, p0, Landroid/content/res/Configuration;->keyboardHidden:I

    iget v3, p1, Landroid/content/res/Configuration;->keyboardHidden:I

    if-eq v2, v3, :cond_8

    iput v3, v0, Landroid/content/res/Configuration;->keyboardHidden:I

    :cond_8
    iget v2, p0, Landroid/content/res/Configuration;->navigation:I

    iget v3, p1, Landroid/content/res/Configuration;->navigation:I

    if-eq v2, v3, :cond_9

    iput v3, v0, Landroid/content/res/Configuration;->navigation:I

    :cond_9
    iget v2, p0, Landroid/content/res/Configuration;->navigationHidden:I

    iget v3, p1, Landroid/content/res/Configuration;->navigationHidden:I

    if-eq v2, v3, :cond_a

    iput v3, v0, Landroid/content/res/Configuration;->navigationHidden:I

    :cond_a
    iget v2, p0, Landroid/content/res/Configuration;->orientation:I

    iget v3, p1, Landroid/content/res/Configuration;->orientation:I

    if-eq v2, v3, :cond_b

    iput v3, v0, Landroid/content/res/Configuration;->orientation:I

    :cond_b
    iget v2, p0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v2, v2, 0xf

    iget v3, p1, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v4, v3, 0xf

    if-eq v2, v4, :cond_c

    iget v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v3, v3, 0xf

    or-int/2addr v2, v3

    iput v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    :cond_c
    iget v2, p0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v2, v2, 0xc0

    iget v3, p1, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v4, v3, 0xc0

    if-eq v2, v4, :cond_d

    iget v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v3, v3, 0xc0

    or-int/2addr v2, v3

    iput v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    :cond_d
    iget v2, p0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v2, v2, 0x30

    iget v3, p1, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v4, v3, 0x30

    if-eq v2, v4, :cond_e

    iget v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v3, v3, 0x30

    or-int/2addr v2, v3

    iput v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    :cond_e
    iget v2, p0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v2, v2, 0x300

    iget v3, p1, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v4, v3, 0x300

    if-eq v2, v4, :cond_f

    iget v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit16 v3, v3, 0x300

    or-int/2addr v2, v3

    iput v2, v0, Landroid/content/res/Configuration;->screenLayout:I

    :cond_f
    const/16 v2, 0x1a

    if-lt v1, v2, :cond_10

    invoke-static {p0, p1, v0}, Lcom/daaw/a4$n;->a(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    :cond_10
    iget v1, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v1, v1, 0xf

    iget v2, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v3, v2, 0xf

    if-eq v1, v3, :cond_11

    iget v1, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v2, v2, 0xf

    or-int/2addr v1, v2

    iput v1, v0, Landroid/content/res/Configuration;->uiMode:I

    :cond_11
    iget v1, p0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v1, v1, 0x30

    iget v2, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v3, v2, 0x30

    if-eq v1, v3, :cond_12

    iget v1, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v2, v2, 0x30

    or-int/2addr v1, v2

    iput v1, v0, Landroid/content/res/Configuration;->uiMode:I

    :cond_12
    iget v1, p0, Landroid/content/res/Configuration;->screenWidthDp:I

    iget v2, p1, Landroid/content/res/Configuration;->screenWidthDp:I

    if-eq v1, v2, :cond_13

    iput v2, v0, Landroid/content/res/Configuration;->screenWidthDp:I

    :cond_13
    iget v1, p0, Landroid/content/res/Configuration;->screenHeightDp:I

    iget v2, p1, Landroid/content/res/Configuration;->screenHeightDp:I

    if-eq v1, v2, :cond_14

    iput v2, v0, Landroid/content/res/Configuration;->screenHeightDp:I

    :cond_14
    iget v1, p0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    iget v2, p1, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    if-eq v1, v2, :cond_15

    iput v2, v0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    :cond_15
    invoke-static {p0, p1, v0}, Lcom/daaw/a4$k;->b(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V

    :cond_16
    :goto_1
    return-object v0
.end method


# virtual methods
.method public final A0()Landroid/view/Window$Callback;
    .locals 1

    iget-object v0, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    return-object v0
.end method

.method public final B0()V
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/a4;->p0()V

    iget-boolean v0, p0, Lcom/daaw/a4;->X:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/a4;->F:Lcom/daaw/i0;

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_1

    new-instance v0, Lcom/daaw/mx1;

    iget-object v1, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    check-cast v1, Landroid/app/Activity;

    iget-boolean v2, p0, Lcom/daaw/a4;->Y:Z

    invoke-direct {v0, v1, v2}, Lcom/daaw/mx1;-><init>(Landroid/app/Activity;Z)V

    :goto_0
    iput-object v0, p0, Lcom/daaw/a4;->F:Lcom/daaw/i0;

    goto :goto_1

    :cond_1
    instance-of v0, v0, Landroid/app/Dialog;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/daaw/mx1;

    iget-object v1, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    check-cast v1, Landroid/app/Dialog;

    invoke-direct {v0, v1}, Lcom/daaw/mx1;-><init>(Landroid/app/Dialog;)V

    goto :goto_0

    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/daaw/a4;->F:Lcom/daaw/i0;

    if-eqz v0, :cond_3

    iget-boolean v1, p0, Lcom/daaw/a4;->t0:Z

    invoke-virtual {v0, v1}, Lcom/daaw/i0;->r(Z)V

    :cond_3
    :goto_2
    return-void
.end method

.method public C(Landroid/content/res/Configuration;)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/a4;->X:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/daaw/a4;->R:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/a4;->w()Lcom/daaw/i0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lcom/daaw/i0;->m(Landroid/content/res/Configuration;)V

    :cond_0
    invoke-static {}, Lcom/daaw/d4;->b()Lcom/daaw/d4;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {p1, v0}, Lcom/daaw/d4;->g(Landroid/content/Context;)V

    new-instance p1, Landroid/content/res/Configuration;

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput-object p1, p0, Lcom/daaw/a4;->j0:Landroid/content/res/Configuration;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lcom/daaw/a4;->X(Z)Z

    return-void
.end method

.method public final C0(Lcom/daaw/a4$u;)Z
    .locals 3

    iget-object v0, p1, Lcom/daaw/a4$u;->i:Landroid/view/View;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-object v0, p1, Lcom/daaw/a4$u;->h:Landroid/view/View;

    return v1

    :cond_0
    iget-object v0, p1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    const/4 v2, 0x0

    if-nez v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, Lcom/daaw/a4;->K:Lcom/daaw/a4$v;

    if-nez v0, :cond_2

    new-instance v0, Lcom/daaw/a4$v;

    invoke-direct {v0, p0}, Lcom/daaw/a4$v;-><init>(Lcom/daaw/a4;)V

    iput-object v0, p0, Lcom/daaw/a4;->K:Lcom/daaw/a4$v;

    :cond_2
    iget-object v0, p0, Lcom/daaw/a4;->K:Lcom/daaw/a4$v;

    invoke-virtual {p1, v0}, Lcom/daaw/a4$u;->a(Landroidx/appcompat/view/menu/i$a;)Landroidx/appcompat/view/menu/j;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    iput-object v0, p1, Lcom/daaw/a4$u;->h:Landroid/view/View;

    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public D(Landroid/os/Bundle;)V
    .locals 2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/a4;->g0:Z

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/a4;->X(Z)Z

    invoke-virtual {p0}, Lcom/daaw/a4;->q0()V

    iget-object v0, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_2

    const/4 v1, 0x0

    :try_start_0
    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lcom/daaw/as0;->c(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    nop

    :goto_0
    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/a4;->S0()Lcom/daaw/i0;

    move-result-object v0

    if-nez v0, :cond_0

    iput-boolean p1, p0, Lcom/daaw/a4;->t0:Z

    goto :goto_1

    :cond_0
    invoke-virtual {v0, p1}, Lcom/daaw/i0;->r(Z)V

    :cond_1
    :goto_1
    invoke-static {p0}, Lcom/daaw/z3;->e(Lcom/daaw/z3;)V

    :cond_2
    new-instance v0, Landroid/content/res/Configuration;

    iget-object v1, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput-object v0, p0, Lcom/daaw/a4;->j0:Landroid/content/res/Configuration;

    iput-boolean p1, p0, Lcom/daaw/a4;->h0:Z

    return-void
.end method

.method public final D0(Lcom/daaw/a4$u;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/a4;->t0()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/a4$u;->d(Landroid/content/Context;)V

    new-instance v0, Lcom/daaw/a4$t;

    iget-object v1, p1, Lcom/daaw/a4$u;->l:Landroid/content/Context;

    invoke-direct {v0, p0, v1}, Lcom/daaw/a4$t;-><init>(Lcom/daaw/a4;Landroid/content/Context;)V

    iput-object v0, p1, Lcom/daaw/a4$u;->g:Landroid/view/ViewGroup;

    const/16 v0, 0x51

    iput v0, p1, Lcom/daaw/a4$u;->c:I

    const/4 p1, 0x1

    return p1
.end method

.method public E()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/daaw/z3;->K(Lcom/daaw/z3;)V

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/a4;->q0:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/a4;->s0:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/a4;->i0:Z

    iget v0, p0, Lcom/daaw/a4;->k0:I

    const/16 v1, -0x64

    if-eq v0, v1, :cond_2

    iget-object v0, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_2

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isChangingConfigurations()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lcom/daaw/a4;->y0:Lcom/daaw/cd1;

    iget-object v1, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Lcom/daaw/a4;->k0:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/daaw/cd1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/daaw/a4;->y0:Lcom/daaw/cd1;

    iget-object v1, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/cd1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    iget-object v0, p0, Lcom/daaw/a4;->F:Lcom/daaw/i0;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/daaw/i0;->n()V

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/a4;->f0()V

    return-void
.end method

.method public final E0(Lcom/daaw/a4$u;)Z
    .locals 6

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    iget v1, p1, Lcom/daaw/a4$u;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    const/16 v3, 0x6c

    if-ne v1, v3, :cond_4

    :cond_0
    iget-object v1, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    if-eqz v1, :cond_4

    new-instance v1, Landroid/util/TypedValue;

    invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v3

    sget v4, Lcom/daaw/x01;->f:I

    invoke-virtual {v3, v4, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    const/4 v4, 0x0

    iget v5, v1, Landroid/util/TypedValue;->resourceId:I

    if-eqz v5, :cond_1

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v5, v1, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v4, v5, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    sget v5, Lcom/daaw/x01;->g:I

    invoke-virtual {v4, v5, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    goto :goto_0

    :cond_1
    sget v5, Lcom/daaw/x01;->g:I

    invoke-virtual {v3, v5, v1, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    :goto_0
    iget v5, v1, Landroid/util/TypedValue;->resourceId:I

    if-eqz v5, :cond_3

    if-nez v4, :cond_2

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    :cond_2
    iget v1, v1, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v4, v1, v2}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_3
    if-eqz v4, :cond_4

    new-instance v1, Lcom/daaw/bl;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v3}, Lcom/daaw/bl;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    move-object v0, v1

    :cond_4
    new-instance v1, Landroidx/appcompat/view/menu/e;

    invoke-direct {v1, v0}, Landroidx/appcompat/view/menu/e;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, p0}, Landroidx/appcompat/view/menu/e;->V(Landroidx/appcompat/view/menu/e$a;)V

    invoke-virtual {p1, v1}, Lcom/daaw/a4$u;->c(Landroidx/appcompat/view/menu/e;)V

    return v2
.end method

.method public F(Landroid/os/Bundle;)V
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/a4;->p0()V

    return-void
.end method

.method public final F0(I)V
    .locals 2

    iget v0, p0, Lcom/daaw/a4;->r0:I

    const/4 v1, 0x1

    shl-int p1, v1, p1

    or-int/2addr p1, v0

    iput p1, p0, Lcom/daaw/a4;->r0:I

    iget-boolean p1, p0, Lcom/daaw/a4;->q0:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/a4;->s0:Ljava/lang/Runnable;

    invoke-static {p1, v0}, Lcom/daaw/xs1;->j0(Landroid/view/View;Ljava/lang/Runnable;)V

    iput-boolean v1, p0, Lcom/daaw/a4;->q0:Z

    :cond_0
    return-void
.end method

.method public G()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/a4;->w()Lcom/daaw/i0;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/i0;->v(Z)V

    :cond_0
    return-void
.end method

.method public G0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/a4;->Q:Z

    return v0
.end method

.method public H(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public H0(Landroid/content/Context;I)I
    .locals 2

    const/16 v0, -0x64

    const/4 v1, -0x1

    if-eq p2, v0, :cond_4

    if-eq p2, v1, :cond_3

    if-eqz p2, :cond_1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_3

    const/4 v0, 0x2

    if-eq p2, v0, :cond_3

    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p1}, Lcom/daaw/a4;->v0(Landroid/content/Context;)Lcom/daaw/a4$q;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, Lcom/daaw/a4$q;->c()I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x17

    if-lt p2, v0, :cond_2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const-string v0, "uimode"

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/UiModeManager;

    invoke-virtual {p2}, Landroid/app/UiModeManager;->getNightMode()I

    move-result p2

    if-nez p2, :cond_2

    return v1

    :cond_2
    invoke-virtual {p0, p1}, Lcom/daaw/a4;->w0(Landroid/content/Context;)Lcom/daaw/a4$q;

    move-result-object p1

    goto :goto_0

    :cond_3
    return p2

    :cond_4
    return v1
.end method

.method public I()V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/a4;->X(Z)Z

    return-void
.end method

.method public I0()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/a4;->L:Lcom/daaw/n0;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/n0;->c()V

    return v1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/a4;->w()Lcom/daaw/i0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/i0;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public J()V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/a4;->w()Lcom/daaw/i0;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/i0;->v(Z)V

    :cond_0
    return-void
.end method

.method public J0(ILandroid/view/KeyEvent;)Z
    .locals 3

    const/4 v0, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v0, :cond_1

    const/16 v0, 0x52

    if-eq p1, v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v2, p2}, Lcom/daaw/a4;->K0(ILandroid/view/KeyEvent;)Z

    return v1

    :cond_1
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getFlags()I

    move-result p1

    and-int/lit16 p1, p1, 0x80

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Lcom/daaw/a4;->f0:Z

    :goto_1
    return v2
.end method

.method public final K0(ILandroid/view/KeyEvent;)Z
    .locals 1

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/a4;->y0(IZ)Lcom/daaw/a4$u;

    move-result-object p1

    iget-boolean v0, p1, Lcom/daaw/a4$u;->o:Z

    if-nez v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/a4;->U0(Lcom/daaw/a4$u;Landroid/view/KeyEvent;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public L0(ILandroid/view/KeyEvent;)Z
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/a4;->w()Lcom/daaw/i0;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lcom/daaw/i0;->o(ILandroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    return v1

    :cond_0
    iget-object p1, p0, Lcom/daaw/a4;->e0:Lcom/daaw/a4$u;

    if-eqz p1, :cond_2

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p0, p1, v0, p2, v1}, Lcom/daaw/a4;->T0(Lcom/daaw/a4$u;ILandroid/view/KeyEvent;I)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/a4;->e0:Lcom/daaw/a4$u;

    if-eqz p1, :cond_1

    iput-boolean v1, p1, Lcom/daaw/a4$u;->n:Z

    :cond_1
    return v1

    :cond_2
    iget-object p1, p0, Lcom/daaw/a4;->e0:Lcom/daaw/a4$u;

    const/4 v0, 0x0

    if-nez p1, :cond_3

    invoke-virtual {p0, v0, v1}, Lcom/daaw/a4;->y0(IZ)Lcom/daaw/a4$u;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/a4;->U0(Lcom/daaw/a4$u;Landroid/view/KeyEvent;)Z

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v2

    invoke-virtual {p0, p1, v2, p2, v1}, Lcom/daaw/a4;->T0(Lcom/daaw/a4$u;ILandroid/view/KeyEvent;I)Z

    move-result p2

    iput-boolean v0, p1, Lcom/daaw/a4$u;->m:Z

    if-eqz p2, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public M(I)Z
    .locals 4

    invoke-virtual {p0, p1}, Lcom/daaw/a4;->W0(I)I

    move-result p1

    iget-boolean v0, p0, Lcom/daaw/a4;->b0:Z

    const/4 v1, 0x0

    const/16 v2, 0x6c

    if-eqz v0, :cond_0

    if-ne p1, v2, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/a4;->X:Z

    const/4 v3, 0x1

    if-eqz v0, :cond_1

    if-ne p1, v3, :cond_1

    iput-boolean v1, p0, Lcom/daaw/a4;->X:Z

    :cond_1
    if-eq p1, v3, :cond_7

    const/4 v0, 0x2

    if-eq p1, v0, :cond_6

    const/4 v0, 0x5

    if-eq p1, v0, :cond_5

    const/16 v0, 0xa

    if-eq p1, v0, :cond_4

    if-eq p1, v2, :cond_3

    const/16 v0, 0x6d

    if-eq p1, v0, :cond_2

    iget-object v0, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->requestFeature(I)Z

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/a4;->c1()V

    iput-boolean v3, p0, Lcom/daaw/a4;->Y:Z

    return v3

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/a4;->c1()V

    iput-boolean v3, p0, Lcom/daaw/a4;->X:Z

    return v3

    :cond_4
    invoke-virtual {p0}, Lcom/daaw/a4;->c1()V

    iput-boolean v3, p0, Lcom/daaw/a4;->Z:Z

    return v3

    :cond_5
    invoke-virtual {p0}, Lcom/daaw/a4;->c1()V

    iput-boolean v3, p0, Lcom/daaw/a4;->W:Z

    return v3

    :cond_6
    invoke-virtual {p0}, Lcom/daaw/a4;->c1()V

    iput-boolean v3, p0, Lcom/daaw/a4;->V:Z

    return v3

    :cond_7
    invoke-virtual {p0}, Lcom/daaw/a4;->c1()V

    iput-boolean v3, p0, Lcom/daaw/a4;->b0:Z

    return v3
.end method

.method public M0(ILandroid/view/KeyEvent;)Z
    .locals 3

    const/4 v0, 0x4

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq p1, v0, :cond_1

    const/16 v0, 0x52

    if-eq p1, v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v2, p2}, Lcom/daaw/a4;->N0(ILandroid/view/KeyEvent;)Z

    return v1

    :cond_1
    iget-boolean p1, p0, Lcom/daaw/a4;->f0:Z

    iput-boolean v2, p0, Lcom/daaw/a4;->f0:Z

    invoke-virtual {p0, v2, v2}, Lcom/daaw/a4;->y0(IZ)Lcom/daaw/a4$u;

    move-result-object p2

    if-eqz p2, :cond_3

    iget-boolean v0, p2, Lcom/daaw/a4$u;->o:Z

    if-eqz v0, :cond_3

    if-nez p1, :cond_2

    invoke-virtual {p0, p2, v1}, Lcom/daaw/a4;->h0(Lcom/daaw/a4$u;Z)V

    :cond_2
    return v1

    :cond_3
    invoke-virtual {p0}, Lcom/daaw/a4;->I0()Z

    move-result p1

    if-eqz p1, :cond_4

    return v1

    :cond_4
    :goto_0
    return v2
.end method

.method public final N0(ILandroid/view/KeyEvent;)Z
    .locals 4

    iget-object v0, p0, Lcom/daaw/a4;->L:Lcom/daaw/n0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/a4;->y0(IZ)Lcom/daaw/a4$u;

    move-result-object v2

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Lcom/daaw/hq;->d()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    invoke-interface {p1}, Lcom/daaw/hq;->b()Z

    move-result p1

    if-nez p1, :cond_1

    iget-boolean p1, p0, Lcom/daaw/a4;->i0:Z

    if-nez p1, :cond_5

    invoke-virtual {p0, v2, p2}, Lcom/daaw/a4;->U0(Lcom/daaw/a4$u;Landroid/view/KeyEvent;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    invoke-interface {p1}, Lcom/daaw/hq;->g()Z

    move-result v0

    goto :goto_2

    :cond_1
    iget-object p1, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    invoke-interface {p1}, Lcom/daaw/hq;->f()Z

    move-result v0

    goto :goto_2

    :cond_2
    iget-boolean p1, v2, Lcom/daaw/a4$u;->o:Z

    if-nez p1, :cond_6

    iget-boolean v3, v2, Lcom/daaw/a4$u;->n:Z

    if-eqz v3, :cond_3

    goto :goto_1

    :cond_3
    iget-boolean p1, v2, Lcom/daaw/a4$u;->m:Z

    if-eqz p1, :cond_5

    iget-boolean p1, v2, Lcom/daaw/a4$u;->r:Z

    if-eqz p1, :cond_4

    iput-boolean v1, v2, Lcom/daaw/a4$u;->m:Z

    invoke-virtual {p0, v2, p2}, Lcom/daaw/a4;->U0(Lcom/daaw/a4$u;Landroid/view/KeyEvent;)Z

    move-result p1

    goto :goto_0

    :cond_4
    const/4 p1, 0x1

    :goto_0
    if-eqz p1, :cond_5

    invoke-virtual {p0, v2, p2}, Lcom/daaw/a4;->R0(Lcom/daaw/a4$u;Landroid/view/KeyEvent;)V

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    goto :goto_2

    :cond_6
    :goto_1
    invoke-virtual {p0, v2, v0}, Lcom/daaw/a4;->h0(Lcom/daaw/a4$u;Z)V

    move v0, p1

    :goto_2
    if-eqz v0, :cond_7

    iget-object p1, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string p2, "audio"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/media/AudioManager;

    if-eqz p1, :cond_7

    invoke-virtual {p1, v1}, Landroid/media/AudioManager;->playSoundEffect(I)V

    :cond_7
    return v0
.end method

.method public O0(I)V
    .locals 1

    const/16 v0, 0x6c

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/a4;->w()Lcom/daaw/i0;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/daaw/i0;->h(Z)V

    :cond_0
    return-void
.end method

.method public P(I)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/a4;->p0()V

    iget-object v0, p0, Lcom/daaw/a4;->S:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iget-object v1, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    iget-object p1, p0, Lcom/daaw/a4;->D:Lcom/daaw/a4$o;

    iget-object v0, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/a4$o;->c(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public P0(I)V
    .locals 2

    const/4 v0, 0x0

    const/16 v1, 0x6c

    if-ne p1, v1, :cond_0

    invoke-virtual {p0}, Lcom/daaw/a4;->w()Lcom/daaw/i0;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Lcom/daaw/i0;->h(Z)V

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    const/4 v1, 0x1

    invoke-virtual {p0, p1, v1}, Lcom/daaw/a4;->y0(IZ)Lcom/daaw/a4$u;

    move-result-object p1

    iget-boolean v1, p1, Lcom/daaw/a4$u;->o:Z

    if-eqz v1, :cond_1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/a4;->h0(Lcom/daaw/a4$u;Z)V

    :cond_1
    :goto_0
    return-void
.end method

.method public Q(Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/a4;->p0()V

    iget-object v0, p0, Lcom/daaw/a4;->S:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lcom/daaw/a4;->D:Lcom/daaw/a4$o;

    iget-object v0, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/daaw/a4$o;->c(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public Q0(Landroid/view/ViewGroup;)V
    .locals 0

    return-void
.end method

.method public R(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/a4;->p0()V

    iget-object v0, p0, Lcom/daaw/a4;->S:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lcom/daaw/a4;->D:Lcom/daaw/a4$o;

    iget-object p2, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/a4$o;->c(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final R0(Lcom/daaw/a4$u;Landroid/view/KeyEvent;)V
    .locals 13

    iget-boolean v0, p1, Lcom/daaw/a4$u;->o:Z

    if-nez v0, :cond_10

    iget-boolean v0, p0, Lcom/daaw/a4;->i0:Z

    if-eqz v0, :cond_0

    goto/16 :goto_4

    :cond_0
    iget v0, p1, Lcom/daaw/a4$u;->a:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->screenLayout:I

    and-int/lit8 v0, v0, 0xf

    const/4 v3, 0x4

    if-ne v0, v3, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/a4;->A0()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_3

    iget v3, p1, Lcom/daaw/a4$u;->a:I

    iget-object v4, p1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, v3, v4}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0, p1, v2}, Lcom/daaw/a4;->h0(Lcom/daaw/a4$u;Z)V

    return-void

    :cond_3
    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    const-string v3, "window"

    invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    if-nez v0, :cond_4

    return-void

    :cond_4
    invoke-virtual {p0, p1, p2}, Lcom/daaw/a4;->U0(Lcom/daaw/a4$u;Landroid/view/KeyEvent;)Z

    move-result p2

    if-nez p2, :cond_5

    return-void

    :cond_5
    iget-object p2, p1, Lcom/daaw/a4$u;->g:Landroid/view/ViewGroup;

    const/4 v3, -0x1

    const/4 v4, -0x2

    if-eqz p2, :cond_7

    iget-boolean v5, p1, Lcom/daaw/a4$u;->q:Z

    if-eqz v5, :cond_6

    goto :goto_1

    :cond_6
    iget-object p2, p1, Lcom/daaw/a4$u;->i:Landroid/view/View;

    if-eqz p2, :cond_e

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-eqz p2, :cond_e

    iget p2, p2, Landroid/view/ViewGroup$LayoutParams;->width:I

    if-ne p2, v3, :cond_e

    const/4 v6, -0x1

    goto :goto_2

    :cond_7
    :goto_1
    if-nez p2, :cond_9

    invoke-virtual {p0, p1}, Lcom/daaw/a4;->D0(Lcom/daaw/a4$u;)Z

    move-result p2

    if-eqz p2, :cond_8

    iget-object p2, p1, Lcom/daaw/a4$u;->g:Landroid/view/ViewGroup;

    if-nez p2, :cond_a

    :cond_8
    return-void

    :cond_9
    iget-boolean v3, p1, Lcom/daaw/a4$u;->q:Z

    if-eqz v3, :cond_a

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    if-lez p2, :cond_a

    iget-object p2, p1, Lcom/daaw/a4$u;->g:Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_a
    invoke-virtual {p0, p1}, Lcom/daaw/a4;->C0(Lcom/daaw/a4$u;)Z

    move-result p2

    if-eqz p2, :cond_f

    invoke-virtual {p1}, Lcom/daaw/a4$u;->b()Z

    move-result p2

    if-nez p2, :cond_b

    goto :goto_3

    :cond_b
    iget-object p2, p1, Lcom/daaw/a4$u;->h:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-nez p2, :cond_c

    new-instance p2, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {p2, v4, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    :cond_c
    iget v3, p1, Lcom/daaw/a4$u;->b:I

    iget-object v5, p1, Lcom/daaw/a4$u;->g:Landroid/view/ViewGroup;

    invoke-virtual {v5, v3}, Landroid/view/ViewGroup;->setBackgroundResource(I)V

    iget-object v3, p1, Lcom/daaw/a4$u;->h:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    instance-of v5, v3, Landroid/view/ViewGroup;

    if-eqz v5, :cond_d

    check-cast v3, Landroid/view/ViewGroup;

    iget-object v5, p1, Lcom/daaw/a4$u;->h:Landroid/view/View;

    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_d
    iget-object v3, p1, Lcom/daaw/a4$u;->g:Landroid/view/ViewGroup;

    iget-object v5, p1, Lcom/daaw/a4$u;->h:Landroid/view/View;

    invoke-virtual {v3, v5, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p2, p1, Lcom/daaw/a4$u;->h:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->hasFocus()Z

    move-result p2

    if-nez p2, :cond_e

    iget-object p2, p1, Lcom/daaw/a4$u;->h:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->requestFocus()Z

    :cond_e
    const/4 v6, -0x2

    :goto_2
    iput-boolean v1, p1, Lcom/daaw/a4$u;->n:Z

    new-instance p2, Landroid/view/WindowManager$LayoutParams;

    const/4 v7, -0x2

    iget v8, p1, Lcom/daaw/a4$u;->d:I

    iget v9, p1, Lcom/daaw/a4$u;->e:I

    const/16 v10, 0x3ea

    const/high16 v11, 0x820000

    const/4 v12, -0x3

    move-object v5, p2

    invoke-direct/range {v5 .. v12}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIIIII)V

    iget v1, p1, Lcom/daaw/a4$u;->c:I

    iput v1, p2, Landroid/view/WindowManager$LayoutParams;->gravity:I

    iget v1, p1, Lcom/daaw/a4$u;->f:I

    iput v1, p2, Landroid/view/WindowManager$LayoutParams;->windowAnimations:I

    iget-object v1, p1, Lcom/daaw/a4$u;->g:Landroid/view/ViewGroup;

    invoke-interface {v0, v1, p2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iput-boolean v2, p1, Lcom/daaw/a4$u;->o:Z

    return-void

    :cond_f
    :goto_3
    iput-boolean v2, p1, Lcom/daaw/a4$u;->q:Z

    :cond_10
    :goto_4
    return-void
.end method

.method public S(Landroidx/appcompat/widget/Toolbar;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    instance-of v0, v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/a4;->w()Lcom/daaw/i0;

    move-result-object v0

    instance-of v1, v0, Lcom/daaw/mx1;

    if-nez v1, :cond_3

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/daaw/a4;->G:Landroid/view/MenuInflater;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/i0;->n()V

    :cond_1
    iput-object v1, p0, Lcom/daaw/a4;->F:Lcom/daaw/i0;

    if-eqz p1, :cond_2

    new-instance v0, Lcom/daaw/dm1;

    invoke-virtual {p0}, Lcom/daaw/a4;->z0()Ljava/lang/CharSequence;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/a4;->D:Lcom/daaw/a4$o;

    invoke-direct {v0, p1, v1, v2}, Lcom/daaw/dm1;-><init>(Landroidx/appcompat/widget/Toolbar;Ljava/lang/CharSequence;Landroid/view/Window$Callback;)V

    iput-object v0, p0, Lcom/daaw/a4;->F:Lcom/daaw/i0;

    iget-object p1, p0, Lcom/daaw/a4;->D:Lcom/daaw/a4$o;

    iget-object v0, v0, Lcom/daaw/dm1;->c:Lcom/daaw/a4$h;

    invoke-virtual {p1, v0}, Lcom/daaw/a4$o;->e(Lcom/daaw/a4$h;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lcom/daaw/a4;->D:Lcom/daaw/a4$o;

    invoke-virtual {p1, v1}, Lcom/daaw/a4$o;->e(Lcom/daaw/a4$h;)V

    :goto_0
    invoke-virtual {p0}, Lcom/daaw/a4;->y()V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final S0()Lcom/daaw/i0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/a4;->F:Lcom/daaw/i0;

    return-object v0
.end method

.method public T(I)V
    .locals 0

    iput p1, p0, Lcom/daaw/a4;->l0:I

    return-void
.end method

.method public final T0(Lcom/daaw/a4$u;ILandroid/view/KeyEvent;I)Z
    .locals 2

    invoke-virtual {p3}, Landroid/view/KeyEvent;->isSystem()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p1, Lcom/daaw/a4$u;->m:Z

    if-nez v0, :cond_1

    invoke-virtual {p0, p1, p3}, Lcom/daaw/a4;->U0(Lcom/daaw/a4$u;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    iget-object v0, p1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p2, p3, p4}, Landroidx/appcompat/view/menu/e;->performShortcut(ILandroid/view/KeyEvent;I)Z

    move-result v1

    :cond_2
    if-eqz v1, :cond_3

    const/4 p2, 0x1

    and-int/lit8 p3, p4, 0x1

    if-nez p3, :cond_3

    iget-object p3, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    if-nez p3, :cond_3

    invoke-virtual {p0, p1, p2}, Lcom/daaw/a4;->h0(Lcom/daaw/a4$u;Z)V

    :cond_3
    return v1
.end method

.method public final U(Ljava/lang/CharSequence;)V
    .locals 1

    iput-object p1, p0, Lcom/daaw/a4;->H:Ljava/lang/CharSequence;

    iget-object v0, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/daaw/hq;->setWindowTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/a4;->S0()Lcom/daaw/i0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/a4;->S0()Lcom/daaw/i0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/i0;->y(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/daaw/a4;->T:Landroid/widget/TextView;

    if-eqz v0, :cond_2

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final U0(Lcom/daaw/a4$u;Landroid/view/KeyEvent;)Z
    .locals 8

    iget-boolean v0, p0, Lcom/daaw/a4;->i0:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p1, Lcom/daaw/a4$u;->m:Z

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, Lcom/daaw/a4;->e0:Lcom/daaw/a4$u;

    if-eqz v0, :cond_2

    if-eq v0, p1, :cond_2

    invoke-virtual {p0, v0, v1}, Lcom/daaw/a4;->h0(Lcom/daaw/a4$u;Z)V

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/a4;->A0()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_3

    iget v3, p1, Lcom/daaw/a4$u;->a:I

    invoke-interface {v0, v3}, Landroid/view/Window$Callback;->onCreatePanelView(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p1, Lcom/daaw/a4$u;->i:Landroid/view/View;

    :cond_3
    iget v3, p1, Lcom/daaw/a4$u;->a:I

    if-eqz v3, :cond_5

    const/16 v4, 0x6c

    if-ne v3, v4, :cond_4

    goto :goto_0

    :cond_4
    const/4 v3, 0x0

    goto :goto_1

    :cond_5
    :goto_0
    const/4 v3, 0x1

    :goto_1
    if-eqz v3, :cond_6

    iget-object v4, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    if-eqz v4, :cond_6

    invoke-interface {v4}, Lcom/daaw/hq;->c()V

    :cond_6
    iget-object v4, p1, Lcom/daaw/a4$u;->i:Landroid/view/View;

    if-nez v4, :cond_15

    if-eqz v3, :cond_7

    invoke-virtual {p0}, Lcom/daaw/a4;->S0()Lcom/daaw/i0;

    move-result-object v4

    instance-of v4, v4, Lcom/daaw/dm1;

    if-nez v4, :cond_15

    :cond_7
    iget-object v4, p1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    const/4 v5, 0x0

    if-eqz v4, :cond_8

    iget-boolean v6, p1, Lcom/daaw/a4$u;->r:Z

    if-eqz v6, :cond_f

    :cond_8
    if-nez v4, :cond_a

    invoke-virtual {p0, p1}, Lcom/daaw/a4;->E0(Lcom/daaw/a4$u;)Z

    move-result v4

    if-eqz v4, :cond_9

    iget-object v4, p1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    if-nez v4, :cond_a

    :cond_9
    return v1

    :cond_a
    if-eqz v3, :cond_c

    iget-object v4, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    if-eqz v4, :cond_c

    iget-object v4, p0, Lcom/daaw/a4;->J:Lcom/daaw/a4$i;

    if-nez v4, :cond_b

    new-instance v4, Lcom/daaw/a4$i;

    invoke-direct {v4, p0}, Lcom/daaw/a4$i;-><init>(Lcom/daaw/a4;)V

    iput-object v4, p0, Lcom/daaw/a4;->J:Lcom/daaw/a4$i;

    :cond_b
    iget-object v4, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    iget-object v6, p1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    iget-object v7, p0, Lcom/daaw/a4;->J:Lcom/daaw/a4$i;

    invoke-interface {v4, v6, v7}, Lcom/daaw/hq;->a(Landroid/view/Menu;Landroidx/appcompat/view/menu/i$a;)V

    :cond_c
    iget-object v4, p1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v4}, Landroidx/appcompat/view/menu/e;->h0()V

    iget v4, p1, Lcom/daaw/a4$u;->a:I

    iget-object v6, p1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, v4, v6}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v4

    if-nez v4, :cond_e

    invoke-virtual {p1, v5}, Lcom/daaw/a4$u;->c(Landroidx/appcompat/view/menu/e;)V

    if-eqz v3, :cond_d

    iget-object p1, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    if-eqz p1, :cond_d

    iget-object p2, p0, Lcom/daaw/a4;->J:Lcom/daaw/a4$i;

    invoke-interface {p1, v5, p2}, Lcom/daaw/hq;->a(Landroid/view/Menu;Landroidx/appcompat/view/menu/i$a;)V

    :cond_d
    return v1

    :cond_e
    iput-boolean v1, p1, Lcom/daaw/a4$u;->r:Z

    :cond_f
    iget-object v4, p1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v4}, Landroidx/appcompat/view/menu/e;->h0()V

    iget-object v4, p1, Lcom/daaw/a4$u;->s:Landroid/os/Bundle;

    if-eqz v4, :cond_10

    iget-object v6, p1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v6, v4}, Landroidx/appcompat/view/menu/e;->R(Landroid/os/Bundle;)V

    iput-object v5, p1, Lcom/daaw/a4$u;->s:Landroid/os/Bundle;

    :cond_10
    iget-object v4, p1, Lcom/daaw/a4$u;->i:Landroid/view/View;

    iget-object v6, p1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, v1, v4, v6}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    if-nez v0, :cond_12

    if-eqz v3, :cond_11

    iget-object p2, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    if-eqz p2, :cond_11

    iget-object v0, p0, Lcom/daaw/a4;->J:Lcom/daaw/a4$i;

    invoke-interface {p2, v5, v0}, Lcom/daaw/hq;->a(Landroid/view/Menu;Landroidx/appcompat/view/menu/i$a;)V

    :cond_11
    iget-object p1, p1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->g0()V

    return v1

    :cond_12
    if-eqz p2, :cond_13

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result p2

    goto :goto_2

    :cond_13
    const/4 p2, -0x1

    :goto_2
    invoke-static {p2}, Landroid/view/KeyCharacterMap;->load(I)Landroid/view/KeyCharacterMap;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/KeyCharacterMap;->getKeyboardType()I

    move-result p2

    if-eq p2, v2, :cond_14

    const/4 p2, 0x1

    goto :goto_3

    :cond_14
    const/4 p2, 0x0

    :goto_3
    iput-boolean p2, p1, Lcom/daaw/a4$u;->p:Z

    iget-object v0, p1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v0, p2}, Landroidx/appcompat/view/menu/e;->setQwertyMode(Z)V

    iget-object p2, p1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {p2}, Landroidx/appcompat/view/menu/e;->g0()V

    :cond_15
    iput-boolean v2, p1, Lcom/daaw/a4$u;->m:Z

    iput-boolean v1, p1, Lcom/daaw/a4$u;->n:Z

    iput-object p1, p0, Lcom/daaw/a4;->e0:Lcom/daaw/a4$u;

    return v2
.end method

.method public V(Lcom/daaw/n0$a;)Lcom/daaw/n0;
    .locals 2

    if-eqz p1, :cond_3

    iget-object v0, p0, Lcom/daaw/a4;->L:Lcom/daaw/n0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/n0;->c()V

    :cond_0
    new-instance v0, Lcom/daaw/a4$j;

    invoke-direct {v0, p0, p1}, Lcom/daaw/a4$j;-><init>(Lcom/daaw/a4;Lcom/daaw/n0$a;)V

    invoke-virtual {p0}, Lcom/daaw/a4;->w()Lcom/daaw/i0;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Lcom/daaw/i0;->z(Lcom/daaw/n0$a;)Lcom/daaw/n0;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/a4;->L:Lcom/daaw/n0;

    if-eqz p1, :cond_1

    iget-object v1, p0, Lcom/daaw/a4;->E:Lcom/daaw/t3;

    if-eqz v1, :cond_1

    invoke-interface {v1, p1}, Lcom/daaw/t3;->j(Lcom/daaw/n0;)V

    :cond_1
    iget-object p1, p0, Lcom/daaw/a4;->L:Lcom/daaw/n0;

    if-nez p1, :cond_2

    invoke-virtual {p0, v0}, Lcom/daaw/a4;->b1(Lcom/daaw/n0$a;)Lcom/daaw/n0;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/a4;->L:Lcom/daaw/n0;

    :cond_2
    iget-object p1, p0, Lcom/daaw/a4;->L:Lcom/daaw/n0;

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "ActionMode callback can not be null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final V0(Z)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    invoke-interface {v0}, Lcom/daaw/hq;->d()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->hasPermanentMenuKey()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    invoke-interface {v0}, Lcom/daaw/hq;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/a4;->A0()Landroid/view/Window$Callback;

    move-result-object v0

    iget-object v3, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    invoke-interface {v3}, Lcom/daaw/hq;->b()Z

    move-result v3

    const/16 v4, 0x6c

    if-eqz v3, :cond_2

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    invoke-interface {p1}, Lcom/daaw/hq;->f()Z

    iget-boolean p1, p0, Lcom/daaw/a4;->i0:Z

    if-nez p1, :cond_4

    invoke-virtual {p0, v2, v1}, Lcom/daaw/a4;->y0(IZ)Lcom/daaw/a4$u;

    move-result-object p1

    iget-object p1, p1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, v4, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    goto :goto_1

    :cond_2
    :goto_0
    if-eqz v0, :cond_4

    iget-boolean p1, p0, Lcom/daaw/a4;->i0:Z

    if-nez p1, :cond_4

    iget-boolean p1, p0, Lcom/daaw/a4;->q0:Z

    if-eqz p1, :cond_3

    iget p1, p0, Lcom/daaw/a4;->r0:I

    and-int/2addr p1, v1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v3, p0, Lcom/daaw/a4;->s0:Ljava/lang/Runnable;

    invoke-virtual {p1, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object p1, p0, Lcom/daaw/a4;->s0:Ljava/lang/Runnable;

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_3
    invoke-virtual {p0, v2, v1}, Lcom/daaw/a4;->y0(IZ)Lcom/daaw/a4$u;

    move-result-object p1

    iget-object v1, p1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    if-eqz v1, :cond_4

    iget-boolean v3, p1, Lcom/daaw/a4$u;->r:Z

    if-nez v3, :cond_4

    iget-object v3, p1, Lcom/daaw/a4$u;->i:Landroid/view/View;

    invoke-interface {v0, v2, v3, v1}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object p1, p1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    invoke-interface {v0, v4, p1}, Landroid/view/Window$Callback;->onMenuOpened(ILandroid/view/Menu;)Z

    iget-object p1, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    invoke-interface {p1}, Lcom/daaw/hq;->g()Z

    :cond_4
    :goto_1
    return-void

    :cond_5
    invoke-virtual {p0, v2, v1}, Lcom/daaw/a4;->y0(IZ)Lcom/daaw/a4$u;

    move-result-object p1

    iput-boolean v1, p1, Lcom/daaw/a4$u;->q:Z

    invoke-virtual {p0, p1, v2}, Lcom/daaw/a4;->h0(Lcom/daaw/a4$u;Z)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/a4;->R0(Lcom/daaw/a4$u;Landroid/view/KeyEvent;)V

    return-void
.end method

.method public final W0(I)I
    .locals 1

    const/16 v0, 0x8

    if-ne p1, v0, :cond_0

    const/16 p1, 0x6c

    return p1

    :cond_0
    const/16 v0, 0x9

    if-ne p1, v0, :cond_1

    const/16 p1, 0x6d

    :cond_1
    return p1
.end method

.method public final X(Z)Z
    .locals 5

    iget-boolean v0, p0, Lcom/daaw/a4;->i0:Z

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/a4;->c0()I

    move-result v0

    iget-object v1, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {p0, v1, v0}, Lcom/daaw/a4;->H0(Landroid/content/Context;I)I

    move-result v1

    const/4 v2, 0x0

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x21

    if-ge v3, v4, :cond_1

    iget-object v2, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {p0, v2}, Lcom/daaw/a4;->b0(Landroid/content/Context;)Lcom/daaw/rk0;

    move-result-object v2

    :cond_1
    invoke-virtual {p0, v1, v2, p1}, Lcom/daaw/a4;->f1(ILcom/daaw/rk0;Z)Z

    move-result p1

    if-nez v0, :cond_2

    iget-object v1, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {p0, v1}, Lcom/daaw/a4;->w0(Landroid/content/Context;)Lcom/daaw/a4$q;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/a4$q;->e()V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lcom/daaw/a4;->o0:Lcom/daaw/a4$q;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/daaw/a4$q;->a()V

    :cond_3
    :goto_0
    const/4 v1, 0x3

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/daaw/a4;->v0(Landroid/content/Context;)Lcom/daaw/a4$q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/a4$q;->e()V

    goto :goto_1

    :cond_4
    iget-object v0, p0, Lcom/daaw/a4;->p0:Lcom/daaw/a4$q;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/daaw/a4$q;->a()V

    :cond_5
    :goto_1
    return p1
.end method

.method public X0(Landroid/content/res/Configuration;Lcom/daaw/rk0;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    invoke-static {p1, p2}, Lcom/daaw/a4$m;->d(Landroid/content/res/Configuration;Lcom/daaw/rk0;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/daaw/rk0;->d(I)Ljava/util/Locale;

    move-result-object v1

    invoke-static {p1, v1}, Lcom/daaw/a4$k;->d(Landroid/content/res/Configuration;Ljava/util/Locale;)V

    invoke-virtual {p2, v0}, Lcom/daaw/rk0;->d(I)Ljava/util/Locale;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/daaw/a4$k;->c(Landroid/content/res/Configuration;Ljava/util/Locale;)V

    :goto_0
    return-void
.end method

.method public Y()Z
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/a4;->X(Z)Z

    move-result v0

    return v0
.end method

.method public Y0(Lcom/daaw/rk0;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    invoke-static {p1}, Lcom/daaw/a4$m;->c(Lcom/daaw/rk0;)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/daaw/rk0;->d(I)Ljava/util/Locale;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Locale;->setDefault(Ljava/util/Locale;)V

    :goto_0
    return-void
.end method

.method public final Z()V
    .locals 5

    iget-object v0, p0, Lcom/daaw/a4;->S:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v1, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    invoke-virtual {v1}, Landroid/view/View;->getPaddingTop()I

    move-result v3

    invoke-virtual {v1}, Landroid/view/View;->getPaddingRight()I

    move-result v4

    invoke-virtual {v1}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    invoke-virtual {v0, v2, v3, v4, v1}, Landroidx/appcompat/widget/ContentFrameLayout;->b(IIII)V

    iget-object v1, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    sget-object v2, Lcom/daaw/x21;->y0:[I

    invoke-virtual {v1, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v1

    sget v2, Lcom/daaw/x21;->K0:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    sget v2, Lcom/daaw/x21;->L0:I

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getMinWidthMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    sget v2, Lcom/daaw/x21;->I0:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_0
    sget v2, Lcom/daaw/x21;->J0:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedWidthMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_1
    sget v2, Lcom/daaw/x21;->G0:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMajor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_2
    sget v2, Lcom/daaw/x21;->H0:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Landroidx/appcompat/widget/ContentFrameLayout;->getFixedHeightMinor()Landroid/util/TypedValue;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z

    :cond_3
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->requestLayout()V

    return-void
.end method

.method public final Z0()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/a4;->R:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/a4;->S:Landroid/view/ViewGroup;

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/daaw/xs1;->V(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public a(Landroidx/appcompat/view/menu/e;Landroid/view/MenuItem;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/a4;->A0()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Lcom/daaw/a4;->i0:Z

    if-nez v1, :cond_0

    invoke-virtual {p1}, Landroidx/appcompat/view/menu/e;->F()Landroidx/appcompat/view/menu/e;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/a4;->r0(Landroid/view/Menu;)Lcom/daaw/a4$u;

    move-result-object p1

    if-eqz p1, :cond_0

    iget p1, p1, Lcom/daaw/a4$u;->a:I

    invoke-interface {v0, p1, p2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final a0(Landroid/view/Window;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    const-string v1, "AppCompat has already installed itself into the Window"

    if-nez v0, :cond_2

    invoke-virtual {p1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    instance-of v2, v0, Lcom/daaw/a4$o;

    if-nez v2, :cond_1

    new-instance v1, Lcom/daaw/a4$o;

    invoke-direct {v1, p0, v0}, Lcom/daaw/a4$o;-><init>(Lcom/daaw/a4;Landroid/view/Window$Callback;)V

    iput-object v1, p0, Lcom/daaw/a4;->D:Lcom/daaw/a4$o;

    invoke-virtual {p1, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    const/4 v1, 0x0

    sget-object v2, Lcom/daaw/a4;->A0:[I

    invoke-static {v0, v1, v2}, Lcom/daaw/ul1;->u(Landroid/content/Context;Landroid/util/AttributeSet;[I)Lcom/daaw/ul1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/ul1;->h(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v1}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    invoke-virtual {v0}, Lcom/daaw/ul1;->w()V

    iput-object p1, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a1(Landroid/view/ViewParent;)Z
    .locals 3

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    :goto_0
    if-nez p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    if-eq p1, v1, :cond_3

    instance-of v2, p1, Landroid/view/View;

    if-eqz v2, :cond_3

    move-object v2, p1

    check-cast v2, Landroid/view/View;

    invoke-static {v2}, Lcom/daaw/xs1;->U(Landroid/view/View;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    goto :goto_0

    :cond_3
    :goto_1
    return v0
.end method

.method public b(Landroidx/appcompat/view/menu/e;)V
    .locals 0

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Lcom/daaw/a4;->V0(Z)V

    return-void
.end method

.method public b0(Landroid/content/Context;)Lcom/daaw/rk0;
    .locals 3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x0

    const/16 v2, 0x21

    if-lt v0, v2, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, Lcom/daaw/z3;->u()Lcom/daaw/rk0;

    move-result-object v2

    if-nez v2, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/a4;->x0(Landroid/content/res/Configuration;)Lcom/daaw/rk0;

    move-result-object p1

    const/16 v1, 0x18

    if-lt v0, v1, :cond_2

    invoke-static {v2, p1}, Lcom/daaw/vk0;->b(Lcom/daaw/rk0;Lcom/daaw/rk0;)Lcom/daaw/rk0;

    move-result-object v0

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Lcom/daaw/rk0;->f()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/daaw/rk0;->e()Lcom/daaw/rk0;

    move-result-object v0

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/daaw/rk0;->d(I)Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/rk0;->c(Ljava/lang/String;)Lcom/daaw/rk0;

    move-result-object v0

    :goto_0
    invoke-virtual {v0}, Lcom/daaw/rk0;->f()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    move-object p1, v0

    :goto_1
    return-object p1
.end method

.method public b1(Lcom/daaw/n0$a;)Lcom/daaw/n0;
    .locals 7

    invoke-virtual {p0}, Lcom/daaw/a4;->o0()V

    iget-object v0, p0, Lcom/daaw/a4;->L:Lcom/daaw/n0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/n0;->c()V

    :cond_0
    instance-of v0, p1, Lcom/daaw/a4$j;

    if-nez v0, :cond_1

    new-instance v0, Lcom/daaw/a4$j;

    invoke-direct {v0, p0, p1}, Lcom/daaw/a4$j;-><init>(Lcom/daaw/a4;Lcom/daaw/n0$a;)V

    move-object p1, v0

    :cond_1
    iget-object v0, p0, Lcom/daaw/a4;->E:Lcom/daaw/t3;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-boolean v2, p0, Lcom/daaw/a4;->i0:Z

    if-nez v2, :cond_2

    :try_start_0
    invoke-interface {v0, p1}, Lcom/daaw/t3;->l(Lcom/daaw/n0$a;)Lcom/daaw/n0;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/AbstractMethodError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_2
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_3

    iput-object v0, p0, Lcom/daaw/a4;->L:Lcom/daaw/n0;

    goto/16 :goto_5

    :cond_3
    iget-object v0, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v0, :cond_6

    iget-boolean v0, p0, Lcom/daaw/a4;->a0:Z

    if-eqz v0, :cond_5

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v4, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    sget v5, Lcom/daaw/x01;->f:I

    invoke-virtual {v4, v5, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v5, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v5, :cond_4

    iget-object v5, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->newTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    iget v4, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v5, v4, v3}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    new-instance v4, Lcom/daaw/bl;

    iget-object v6, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-direct {v4, v6, v2}, Lcom/daaw/bl;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v6

    invoke-virtual {v6, v5}, Landroid/content/res/Resources$Theme;->setTo(Landroid/content/res/Resources$Theme;)V

    goto :goto_1

    :cond_4
    iget-object v4, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    :goto_1
    new-instance v5, Landroidx/appcompat/widget/ActionBarContextView;

    invoke-direct {v5, v4}, Landroidx/appcompat/widget/ActionBarContextView;-><init>(Landroid/content/Context;)V

    iput-object v5, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    new-instance v5, Landroid/widget/PopupWindow;

    sget v6, Lcom/daaw/x01;->i:I

    invoke-direct {v5, v4, v1, v6}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    iput-object v5, p0, Lcom/daaw/a4;->N:Landroid/widget/PopupWindow;

    const/4 v6, 0x2

    invoke-static {v5, v6}, Lcom/daaw/hy0;->b(Landroid/widget/PopupWindow;I)V

    iget-object v5, p0, Lcom/daaw/a4;->N:Landroid/widget/PopupWindow;

    iget-object v6, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    iget-object v5, p0, Lcom/daaw/a4;->N:Landroid/widget/PopupWindow;

    const/4 v6, -0x1

    invoke-virtual {v5, v6}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v5

    sget v6, Lcom/daaw/x01;->b:I

    invoke-virtual {v5, v6, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v0, v0, Landroid/util/TypedValue;->data:I

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    invoke-static {v0, v4}, Landroid/util/TypedValue;->complexToDimensionPixelSize(ILandroid/util/DisplayMetrics;)I

    move-result v0

    iget-object v4, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v4, v0}, Landroidx/appcompat/widget/ActionBarContextView;->setContentHeight(I)V

    iget-object v0, p0, Lcom/daaw/a4;->N:Landroid/widget/PopupWindow;

    const/4 v4, -0x2

    invoke-virtual {v0, v4}, Landroid/widget/PopupWindow;->setHeight(I)V

    new-instance v0, Lcom/daaw/a4$f;

    invoke-direct {v0, p0}, Lcom/daaw/a4$f;-><init>(Lcom/daaw/a4;)V

    iput-object v0, p0, Lcom/daaw/a4;->O:Ljava/lang/Runnable;

    goto :goto_2

    :cond_5
    iget-object v0, p0, Lcom/daaw/a4;->S:Landroid/view/ViewGroup;

    sget v4, Lcom/daaw/o11;->h:I

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ViewStubCompat;

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lcom/daaw/a4;->t0()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroidx/appcompat/widget/ViewStubCompat;->setLayoutInflater(Landroid/view/LayoutInflater;)V

    invoke-virtual {v0}, Landroidx/appcompat/widget/ViewStubCompat;->a()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroidx/appcompat/widget/ActionBarContextView;

    iput-object v0, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    :cond_6
    :goto_2
    iget-object v0, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_b

    invoke-virtual {p0}, Lcom/daaw/a4;->o0()V

    iget-object v0, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v0}, Landroidx/appcompat/widget/ActionBarContextView;->k()V

    new-instance v0, Lcom/daaw/ff1;

    iget-object v4, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v4

    iget-object v5, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    iget-object v6, p0, Lcom/daaw/a4;->N:Landroid/widget/PopupWindow;

    if-nez v6, :cond_7

    goto :goto_3

    :cond_7
    const/4 v3, 0x0

    :goto_3
    invoke-direct {v0, v4, v5, p1, v3}, Lcom/daaw/ff1;-><init>(Landroid/content/Context;Landroidx/appcompat/widget/ActionBarContextView;Lcom/daaw/n0$a;Z)V

    invoke-virtual {v0}, Lcom/daaw/n0;->e()Landroid/view/Menu;

    move-result-object v3

    invoke-interface {p1, v0, v3}, Lcom/daaw/n0$a;->b(Lcom/daaw/n0;Landroid/view/Menu;)Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-virtual {v0}, Lcom/daaw/n0;->k()V

    iget-object p1, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroidx/appcompat/widget/ActionBarContextView;->h(Lcom/daaw/n0;)V

    iput-object v0, p0, Lcom/daaw/a4;->L:Lcom/daaw/n0;

    invoke-virtual {p0}, Lcom/daaw/a4;->Z0()Z

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object p1, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {p1}, Lcom/daaw/xs1;->e(Landroid/view/View;)Lcom/daaw/ut1;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/daaw/ut1;->b(F)Lcom/daaw/ut1;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/a4;->P:Lcom/daaw/ut1;

    new-instance v0, Lcom/daaw/a4$g;

    invoke-direct {v0, p0}, Lcom/daaw/a4$g;-><init>(Lcom/daaw/a4;)V

    invoke-virtual {p1, v0}, Lcom/daaw/ut1;->h(Lcom/daaw/wt1;)Lcom/daaw/ut1;

    goto :goto_4

    :cond_8
    iget-object p1, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->setAlpha(F)V

    iget-object p1, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1, v2}, Landroidx/appcompat/widget/ActionBarContextView;->setVisibility(I)V

    iget-object p1, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p1, p1, Landroid/view/View;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, Lcom/daaw/xs1;->o0(Landroid/view/View;)V

    :cond_9
    :goto_4
    iget-object p1, p0, Lcom/daaw/a4;->N:Landroid/widget/PopupWindow;

    if-eqz p1, :cond_b

    iget-object p1, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/a4;->O:Ljava/lang/Runnable;

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_5

    :cond_a
    iput-object v1, p0, Lcom/daaw/a4;->L:Lcom/daaw/n0;

    :cond_b
    :goto_5
    iget-object p1, p0, Lcom/daaw/a4;->L:Lcom/daaw/n0;

    if-eqz p1, :cond_c

    iget-object v0, p0, Lcom/daaw/a4;->E:Lcom/daaw/t3;

    if-eqz v0, :cond_c

    invoke-interface {v0, p1}, Lcom/daaw/t3;->j(Lcom/daaw/n0;)V

    :cond_c
    iget-object p1, p0, Lcom/daaw/a4;->L:Lcom/daaw/n0;

    return-object p1
.end method

.method public final c0()I
    .locals 2

    iget v0, p0, Lcom/daaw/a4;->k0:I

    const/16 v1, -0x64

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/z3;->q()I

    move-result v0

    :goto_0
    return v0
.end method

.method public final c1()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/a4;->R:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Landroid/util/AndroidRuntimeException;

    const-string v1, "Window feature must be requested before adding content"

    invoke-direct {v0, v1}, Landroid/util/AndroidRuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public d0(ILcom/daaw/a4$u;Landroid/view/Menu;)V
    .locals 2

    if-nez p3, :cond_1

    if-nez p2, :cond_0

    if-ltz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/a4;->d0:[Lcom/daaw/a4$u;

    array-length v1, v0

    if-ge p1, v1, :cond_0

    aget-object p2, v0, p1

    :cond_0
    if-eqz p2, :cond_1

    iget-object p3, p2, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    :cond_1
    if-eqz p2, :cond_2

    iget-boolean p2, p2, Lcom/daaw/a4$u;->o:Z

    if-nez p2, :cond_2

    return-void

    :cond_2
    iget-boolean p2, p0, Lcom/daaw/a4;->i0:Z

    if-nez p2, :cond_3

    iget-object p2, p0, Lcom/daaw/a4;->D:Lcom/daaw/a4$o;

    iget-object v0, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v0

    invoke-virtual {p2, v0, p1, p3}, Lcom/daaw/a4$o;->d(Landroid/view/Window$Callback;ILandroid/view/Menu;)V

    :cond_3
    return-void
.end method

.method public final d1()Lcom/daaw/p3;
    .locals 3

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    instance-of v2, v0, Lcom/daaw/p3;

    if-eqz v2, :cond_0

    check-cast v0, Lcom/daaw/p3;

    return-object v0

    :cond_0
    instance-of v2, v0, Landroid/content/ContextWrapper;

    if-eqz v2, :cond_1

    check-cast v0, Landroid/content/ContextWrapper;

    invoke-virtual {v0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public e0(Landroidx/appcompat/view/menu/e;)V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/a4;->c0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/a4;->c0:Z

    iget-object v0, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    invoke-interface {v0}, Lcom/daaw/hq;->i()V

    invoke-virtual {p0}, Lcom/daaw/a4;->A0()Landroid/view/Window$Callback;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-boolean v1, p0, Lcom/daaw/a4;->i0:Z

    if-nez v1, :cond_1

    const/16 v1, 0x6c

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onPanelClosed(ILandroid/view/Menu;)V

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/daaw/a4;->c0:Z

    return-void
.end method

.method public final e1(Landroid/content/res/Configuration;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    check-cast v0, Landroid/app/Activity;

    instance-of v1, v0, Lcom/daaw/sj0;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/daaw/sj0;

    invoke-interface {v1}, Lcom/daaw/sj0;->a()Landroidx/lifecycle/c;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/lifecycle/c;->b()Landroidx/lifecycle/c$c;

    move-result-object v1

    sget-object v2, Landroidx/lifecycle/c$c;->r:Landroidx/lifecycle/c$c;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/c$c;->a(Landroidx/lifecycle/c$c;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/daaw/a4;->h0:Z

    if-eqz v1, :cond_1

    iget-boolean v1, p0, Lcom/daaw/a4;->i0:Z

    if-nez v1, :cond_1

    :goto_0
    invoke-virtual {v0, p1}, Landroid/app/Activity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    :cond_1
    return-void
.end method

.method public f(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2

    invoke-virtual {p0}, Lcom/daaw/a4;->p0()V

    iget-object v0, p0, Lcom/daaw/a4;->S:Landroid/view/ViewGroup;

    const v1, 0x1020002

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    iget-object p1, p0, Lcom/daaw/a4;->D:Lcom/daaw/a4$o;

    iget-object p2, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {p2}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/daaw/a4$o;->c(Landroid/view/Window$Callback;)V

    return-void
.end method

.method public final f0()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/a4;->o0:Lcom/daaw/a4$q;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/a4$q;->a()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/a4;->p0:Lcom/daaw/a4$q;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/daaw/a4$q;->a()V

    :cond_1
    return-void
.end method

.method public final f1(ILcom/daaw/rk0;Z)Z
    .locals 8

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, p1, p2, v1}, Lcom/daaw/a4;->i0(Landroid/content/Context;ILcom/daaw/rk0;Landroid/content/res/Configuration;)Landroid/content/res/Configuration;

    move-result-object v0

    invoke-virtual {p0}, Lcom/daaw/a4;->u0()I

    move-result v2

    iget-object v3, p0, Lcom/daaw/a4;->j0:Landroid/content/res/Configuration;

    if-nez v3, :cond_0

    iget-object v3, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    :cond_0
    iget v4, v3, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v4, v4, 0x30

    iget v5, v0, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v5, v5, 0x30

    invoke-virtual {p0, v3}, Lcom/daaw/a4;->x0(Landroid/content/res/Configuration;)Lcom/daaw/rk0;

    move-result-object v3

    if-nez p2, :cond_1

    move-object v0, v1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Lcom/daaw/a4;->x0(Landroid/content/res/Configuration;)Lcom/daaw/rk0;

    move-result-object v0

    :goto_0
    const/4 v6, 0x0

    if-eq v4, v5, :cond_2

    const/16 v4, 0x200

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v3, v0}, Lcom/daaw/rk0;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    or-int/lit8 v3, v4, 0x4

    or-int/lit16 v4, v3, 0x2000

    :cond_3
    xor-int/lit8 v3, v2, -0x1

    and-int/2addr v3, v4

    const/4 v7, 0x1

    if-eqz v3, :cond_5

    if-eqz p3, :cond_5

    iget-boolean p3, p0, Lcom/daaw/a4;->g0:Z

    if-eqz p3, :cond_5

    sget-boolean p3, Lcom/daaw/a4;->B0:Z

    if-nez p3, :cond_4

    iget-boolean p3, p0, Lcom/daaw/a4;->h0:Z

    if-eqz p3, :cond_5

    :cond_4
    iget-object p3, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    instance-of v3, p3, Landroid/app/Activity;

    if-eqz v3, :cond_5

    check-cast p3, Landroid/app/Activity;

    invoke-virtual {p3}, Landroid/app/Activity;->isChild()Z

    move-result p3

    if-nez p3, :cond_5

    iget-object p3, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    check-cast p3, Landroid/app/Activity;

    invoke-static {p3}, Lcom/daaw/q0;->n(Landroid/app/Activity;)V

    const/4 p3, 0x1

    goto :goto_2

    :cond_5
    const/4 p3, 0x0

    :goto_2
    if-nez p3, :cond_7

    if-eqz v4, :cond_7

    and-int p3, v4, v2

    if-ne p3, v4, :cond_6

    const/4 v6, 0x1

    :cond_6
    invoke-virtual {p0, v5, v0, v6, v1}, Lcom/daaw/a4;->g1(ILcom/daaw/rk0;ZLandroid/content/res/Configuration;)V

    goto :goto_3

    :cond_7
    move v7, p3

    :goto_3
    if-eqz v7, :cond_9

    iget-object p3, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    instance-of v1, p3, Lcom/daaw/p3;

    if-eqz v1, :cond_9

    and-int/lit16 v1, v4, 0x200

    if-eqz v1, :cond_8

    check-cast p3, Lcom/daaw/p3;

    invoke-virtual {p3, p1}, Lcom/daaw/p3;->K(I)V

    :cond_8
    and-int/lit8 p1, v4, 0x4

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    check-cast p1, Lcom/daaw/p3;

    invoke-virtual {p1, p2}, Lcom/daaw/p3;->J(Lcom/daaw/rk0;)V

    :cond_9
    if-eqz v7, :cond_a

    if-eqz v0, :cond_a

    invoke-virtual {p0, v0}, Lcom/daaw/a4;->Y0(Lcom/daaw/rk0;)V

    :cond_a
    return v7
.end method

.method public g()Z
    .locals 2

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/z3;->z(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/z3;->u()Lcom/daaw/rk0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/daaw/z3;->u()Lcom/daaw/rk0;

    move-result-object v0

    invoke-static {}, Lcom/daaw/z3;->v()Lcom/daaw/rk0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/rk0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {p0, v0}, Lcom/daaw/z3;->i(Landroid/content/Context;)V

    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/daaw/a4;->X(Z)Z

    move-result v0

    return v0
.end method

.method public g0(I)V
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/a4;->y0(IZ)Lcom/daaw/a4$u;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/a4;->h0(Lcom/daaw/a4$u;Z)V

    return-void
.end method

.method public final g1(ILcom/daaw/rk0;ZLandroid/content/res/Configuration;)V
    .locals 3

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    new-instance v1, Landroid/content/res/Configuration;

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    if-eqz p4, :cond_0

    invoke-virtual {v1, p4}, Landroid/content/res/Configuration;->updateFrom(Landroid/content/res/Configuration;)I

    :cond_0
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p4

    iget p4, p4, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p4, p4, -0x31

    or-int/2addr p1, p4

    iput p1, v1, Landroid/content/res/Configuration;->uiMode:I

    if-eqz p2, :cond_1

    invoke-virtual {p0, v1, p2}, Lcom/daaw/a4;->X0(Landroid/content/res/Configuration;Lcom/daaw/rk0;)V

    :cond_1
    const/4 p1, 0x0

    invoke-virtual {v0, v1, p1}, Landroid/content/res/Resources;->updateConfiguration(Landroid/content/res/Configuration;Landroid/util/DisplayMetrics;)V

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p2, 0x1a

    if-ge p1, p2, :cond_2

    invoke-static {v0}, Lcom/daaw/m51;->a(Landroid/content/res/Resources;)V

    :cond_2
    iget p2, p0, Lcom/daaw/a4;->l0:I

    if-eqz p2, :cond_3

    iget-object p4, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {p4, p2}, Landroid/content/Context;->setTheme(I)V

    const/16 p2, 0x17

    if-lt p1, p2, :cond_3

    iget-object p1, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    iget p2, p0, Lcom/daaw/a4;->l0:I

    const/4 p4, 0x1

    invoke-virtual {p1, p2, p4}, Landroid/content/res/Resources$Theme;->applyStyle(IZ)V

    :cond_3
    if-eqz p3, :cond_4

    iget-object p1, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    instance-of p1, p1, Landroid/app/Activity;

    if-eqz p1, :cond_4

    invoke-virtual {p0, v1}, Lcom/daaw/a4;->e1(Landroid/content/res/Configuration;)V

    :cond_4
    return-void
.end method

.method public h0(Lcom/daaw/a4$u;Z)V
    .locals 3

    if-eqz p2, :cond_0

    iget v0, p1, Lcom/daaw/a4$u;->a:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/hq;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {p0, p1}, Lcom/daaw/a4;->e0(Landroidx/appcompat/view/menu/e;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-boolean v2, p1, Lcom/daaw/a4$u;->o:Z

    if-eqz v2, :cond_1

    iget-object v2, p1, Lcom/daaw/a4$u;->g:Landroid/view/ViewGroup;

    if-eqz v2, :cond_1

    invoke-interface {v0, v2}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    if-eqz p2, :cond_1

    iget p2, p1, Lcom/daaw/a4$u;->a:I

    invoke-virtual {p0, p2, p1, v1}, Lcom/daaw/a4;->d0(ILcom/daaw/a4$u;Landroid/view/Menu;)V

    :cond_1
    const/4 p2, 0x0

    iput-boolean p2, p1, Lcom/daaw/a4$u;->m:Z

    iput-boolean p2, p1, Lcom/daaw/a4$u;->n:Z

    iput-boolean p2, p1, Lcom/daaw/a4$u;->o:Z

    iput-object v1, p1, Lcom/daaw/a4$u;->h:Landroid/view/View;

    const/4 p2, 0x1

    iput-boolean p2, p1, Lcom/daaw/a4$u;->q:Z

    iget-object p2, p0, Lcom/daaw/a4;->e0:Lcom/daaw/a4$u;

    if-ne p2, p1, :cond_2

    iput-object v1, p0, Lcom/daaw/a4;->e0:Lcom/daaw/a4$u;

    :cond_2
    return-void
.end method

.method public final h1(Lcom/daaw/px1;Landroid/graphics/Rect;)I
    .locals 10

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/daaw/px1;->l()I

    move-result v1

    goto :goto_0

    :cond_0
    if-eqz p2, :cond_1

    iget v1, p2, Landroid/graphics/Rect;->top:I

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    const/16 v3, 0x8

    if-eqz v2, :cond_10

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    instance-of v2, v2, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v2, :cond_10

    iget-object v2, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    iget-object v4, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {v4}, Landroid/view/ViewGroup;->isShown()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_e

    iget-object v4, p0, Lcom/daaw/a4;->u0:Landroid/graphics/Rect;

    if-nez v4, :cond_2

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, p0, Lcom/daaw/a4;->u0:Landroid/graphics/Rect;

    new-instance v4, Landroid/graphics/Rect;

    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    iput-object v4, p0, Lcom/daaw/a4;->v0:Landroid/graphics/Rect;

    :cond_2
    iget-object v4, p0, Lcom/daaw/a4;->u0:Landroid/graphics/Rect;

    iget-object v6, p0, Lcom/daaw/a4;->v0:Landroid/graphics/Rect;

    if-nez p1, :cond_3

    invoke-virtual {v4, p2}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lcom/daaw/px1;->j()I

    move-result p2

    invoke-virtual {p1}, Lcom/daaw/px1;->l()I

    move-result v7

    invoke-virtual {p1}, Lcom/daaw/px1;->k()I

    move-result v8

    invoke-virtual {p1}, Lcom/daaw/px1;->i()I

    move-result p1

    invoke-virtual {v4, p2, v7, v8, p1}, Landroid/graphics/Rect;->set(IIII)V

    :goto_1
    iget-object p1, p0, Lcom/daaw/a4;->S:Landroid/view/ViewGroup;

    invoke-static {p1, v4, v6}, Lcom/daaw/hu1;->a(Landroid/view/View;Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    iget p1, v4, Landroid/graphics/Rect;->top:I

    iget p2, v4, Landroid/graphics/Rect;->left:I

    iget v4, v4, Landroid/graphics/Rect;->right:I

    iget-object v6, p0, Lcom/daaw/a4;->S:Landroid/view/ViewGroup;

    invoke-static {v6}, Lcom/daaw/xs1;->L(Landroid/view/View;)Lcom/daaw/px1;

    move-result-object v6

    if-nez v6, :cond_4

    const/4 v7, 0x0

    goto :goto_2

    :cond_4
    invoke-virtual {v6}, Lcom/daaw/px1;->j()I

    move-result v7

    :goto_2
    if-nez v6, :cond_5

    const/4 v6, 0x0

    goto :goto_3

    :cond_5
    invoke-virtual {v6}, Lcom/daaw/px1;->k()I

    move-result v6

    :goto_3
    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ne v8, p1, :cond_7

    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v8, p2, :cond_7

    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v8, v4, :cond_6

    goto :goto_4

    :cond_6
    const/4 p2, 0x0

    goto :goto_5

    :cond_7
    :goto_4
    iput p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput p2, v2, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    const/4 p2, 0x1

    :goto_5
    if-lez p1, :cond_8

    iget-object p1, p0, Lcom/daaw/a4;->U:Landroid/view/View;

    if-nez p1, :cond_8

    new-instance p1, Landroid/view/View;

    iget-object v4, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-direct {p1, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lcom/daaw/a4;->U:Landroid/view/View;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    iget v4, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    const/16 v8, 0x33

    const/4 v9, -0x1

    invoke-direct {p1, v9, v4, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    iput v7, p1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    iput v6, p1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    iget-object v4, p0, Lcom/daaw/a4;->S:Landroid/view/ViewGroup;

    iget-object v6, p0, Lcom/daaw/a4;->U:Landroid/view/View;

    invoke-virtual {v4, v6, v9, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_6

    :cond_8
    iget-object p1, p0, Lcom/daaw/a4;->U:Landroid/view/View;

    if-eqz p1, :cond_a

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iget v8, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-ne v4, v8, :cond_9

    iget v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    if-ne v4, v7, :cond_9

    iget v4, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    if-eq v4, v6, :cond_a

    :cond_9
    iput v8, p1, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    iput v7, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v6, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iget-object v4, p0, Lcom/daaw/a4;->U:Landroid/view/View;

    invoke-virtual {v4, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_a
    :goto_6
    iget-object p1, p0, Lcom/daaw/a4;->U:Landroid/view/View;

    if-eqz p1, :cond_b

    goto :goto_7

    :cond_b
    const/4 v5, 0x0

    :goto_7
    if-eqz v5, :cond_c

    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    move-result p1

    if-eqz p1, :cond_c

    iget-object p1, p0, Lcom/daaw/a4;->U:Landroid/view/View;

    invoke-virtual {p0, p1}, Lcom/daaw/a4;->i1(Landroid/view/View;)V

    :cond_c
    iget-boolean p1, p0, Lcom/daaw/a4;->Z:Z

    if-nez p1, :cond_d

    if-eqz v5, :cond_d

    const/4 v1, 0x0

    :cond_d
    move p1, v5

    move v5, p2

    goto :goto_8

    :cond_e
    iget p1, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    if-eqz p1, :cond_f

    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    const/4 p1, 0x0

    goto :goto_8

    :cond_f
    const/4 p1, 0x0

    const/4 v5, 0x0

    :goto_8
    if-eqz v5, :cond_11

    iget-object p2, p0, Lcom/daaw/a4;->M:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_9

    :cond_10
    const/4 p1, 0x0

    :cond_11
    :goto_9
    iget-object p2, p0, Lcom/daaw/a4;->U:Landroid/view/View;

    if-eqz p2, :cond_13

    if-eqz p1, :cond_12

    goto :goto_a

    :cond_12
    const/16 v0, 0x8

    :goto_a
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_13
    return v1
.end method

.method public final i0(Landroid/content/Context;ILcom/daaw/rk0;Landroid/content/res/Configuration;)Landroid/content/res/Configuration;
    .locals 1

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v0, 0x2

    if-eq p2, v0, :cond_0

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p1

    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p1, p1, 0x30

    goto :goto_0

    :cond_0
    const/16 p1, 0x20

    goto :goto_0

    :cond_1
    const/16 p1, 0x10

    :goto_0
    new-instance p2, Landroid/content/res/Configuration;

    invoke-direct {p2}, Landroid/content/res/Configuration;-><init>()V

    const/4 v0, 0x0

    iput v0, p2, Landroid/content/res/Configuration;->fontScale:F

    if-eqz p4, :cond_2

    invoke-virtual {p2, p4}, Landroid/content/res/Configuration;->setTo(Landroid/content/res/Configuration;)V

    :cond_2
    iget p4, p2, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 p4, p4, -0x31

    or-int/2addr p1, p4

    iput p1, p2, Landroid/content/res/Configuration;->uiMode:I

    if-eqz p3, :cond_3

    invoke-virtual {p0, p2, p3}, Lcom/daaw/a4;->X0(Landroid/content/res/Configuration;Lcom/daaw/rk0;)V

    :cond_3
    return-object p2
.end method

.method public final i1(Landroid/view/View;)V
    .locals 2

    invoke-static {p1}, Lcom/daaw/xs1;->O(Landroid/view/View;)I

    move-result v0

    and-int/lit16 v0, v0, 0x2000

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    sget v1, Lcom/daaw/b11;->b:I

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    sget v1, Lcom/daaw/b11;->a:I

    :goto_1
    invoke-static {v0, v1}, Lcom/daaw/zk;->c(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method public final j0()Landroid/view/ViewGroup;
    .locals 7

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    sget-object v1, Lcom/daaw/x21;->y0:[I

    invoke-virtual {v0, v1}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Lcom/daaw/x21;->D0:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_12

    sget v2, Lcom/daaw/x21;->M0:I

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    invoke-virtual {p0, v4}, Lcom/daaw/a4;->M(I)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x6c

    invoke-virtual {p0, v1}, Lcom/daaw/a4;->M(I)Z

    :cond_1
    :goto_0
    sget v1, Lcom/daaw/x21;->E0:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    const/16 v2, 0x6d

    if-eqz v1, :cond_2

    invoke-virtual {p0, v2}, Lcom/daaw/a4;->M(I)Z

    :cond_2
    sget v1, Lcom/daaw/x21;->F0:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0xa

    invoke-virtual {p0, v1}, Lcom/daaw/a4;->M(I)Z

    :cond_3
    sget v1, Lcom/daaw/x21;->z0:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Lcom/daaw/a4;->a0:Z

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0}, Lcom/daaw/a4;->q0()V

    iget-object v0, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/a4;->b0:Z

    const/4 v5, 0x0

    if-nez v1, :cond_9

    iget-boolean v1, p0, Lcom/daaw/a4;->a0:Z

    if-eqz v1, :cond_4

    sget v1, Lcom/daaw/c21;->f:I

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-boolean v3, p0, Lcom/daaw/a4;->Y:Z

    iput-boolean v3, p0, Lcom/daaw/a4;->X:Z

    goto/16 :goto_3

    :cond_4
    iget-boolean v0, p0, Lcom/daaw/a4;->X:Z

    if-eqz v0, :cond_8

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v1, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget v6, Lcom/daaw/x01;->f:I

    invoke-virtual {v1, v6, v0, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    iget v1, v0, Landroid/util/TypedValue;->resourceId:I

    if-eqz v1, :cond_5

    new-instance v1, Lcom/daaw/bl;

    iget-object v4, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-direct {v1, v4, v0}, Lcom/daaw/bl;-><init>(Landroid/content/Context;I)V

    goto :goto_1

    :cond_5
    iget-object v1, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    :goto_1
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/daaw/c21;->p:I

    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    sget v1, Lcom/daaw/o11;->p:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/daaw/hq;

    iput-object v1, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    invoke-virtual {p0}, Lcom/daaw/a4;->A0()Landroid/view/Window$Callback;

    move-result-object v4

    invoke-interface {v1, v4}, Lcom/daaw/hq;->setWindowCallback(Landroid/view/Window$Callback;)V

    iget-boolean v1, p0, Lcom/daaw/a4;->Y:Z

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    invoke-interface {v1, v2}, Lcom/daaw/hq;->h(I)V

    :cond_6
    iget-boolean v1, p0, Lcom/daaw/a4;->V:Z

    if-eqz v1, :cond_7

    iget-object v1, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Lcom/daaw/hq;->h(I)V

    :cond_7
    iget-boolean v1, p0, Lcom/daaw/a4;->W:Z

    if-eqz v1, :cond_b

    iget-object v1, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    const/4 v2, 0x5

    invoke-interface {v1, v2}, Lcom/daaw/hq;->h(I)V

    goto :goto_3

    :cond_8
    move-object v0, v5

    goto :goto_3

    :cond_9
    iget-boolean v1, p0, Lcom/daaw/a4;->Z:Z

    if-eqz v1, :cond_a

    sget v1, Lcom/daaw/c21;->o:I

    goto :goto_2

    :cond_a
    sget v1, Lcom/daaw/c21;->n:I

    :goto_2
    invoke-virtual {v0, v1, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    :cond_b
    :goto_3
    if-eqz v0, :cond_11

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v1, v2, :cond_c

    new-instance v1, Lcom/daaw/a4$c;

    invoke-direct {v1, p0}, Lcom/daaw/a4$c;-><init>(Lcom/daaw/a4;)V

    invoke-static {v0, v1}, Lcom/daaw/xs1;->D0(Landroid/view/View;Lcom/daaw/vt0;)V

    goto :goto_4

    :cond_c
    instance-of v1, v0, Landroidx/appcompat/widget/a;

    if-eqz v1, :cond_d

    move-object v1, v0

    check-cast v1, Landroidx/appcompat/widget/a;

    new-instance v2, Lcom/daaw/a4$d;

    invoke-direct {v2, p0}, Lcom/daaw/a4$d;-><init>(Lcom/daaw/a4;)V

    invoke-interface {v1, v2}, Landroidx/appcompat/widget/a;->setOnFitSystemWindowsListener(Landroidx/appcompat/widget/a$a;)V

    :cond_d
    :goto_4
    iget-object v1, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    if-nez v1, :cond_e

    sget v1, Lcom/daaw/o11;->M:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    iput-object v1, p0, Lcom/daaw/a4;->T:Landroid/widget/TextView;

    :cond_e
    invoke-static {v0}, Lcom/daaw/hu1;->c(Landroid/view/View;)V

    sget v1, Lcom/daaw/o11;->b:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroidx/appcompat/widget/ContentFrameLayout;

    iget-object v2, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    const v4, 0x1020002

    invoke-virtual {v2, v4}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    if-eqz v2, :cond_10

    :goto_5
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    if-lez v6, :cond_f

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->removeViewAt(I)V

    invoke-virtual {v1, v6}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    goto :goto_5

    :cond_f
    const/4 v3, -0x1

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->setId(I)V

    invoke-virtual {v1, v4}, Landroid/widget/FrameLayout;->setId(I)V

    instance-of v3, v2, Landroid/widget/FrameLayout;

    if-eqz v3, :cond_10

    check-cast v2, Landroid/widget/FrameLayout;

    invoke-virtual {v2, v5}, Landroid/widget/FrameLayout;->setForeground(Landroid/graphics/drawable/Drawable;)V

    :cond_10
    iget-object v2, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {v2, v0}, Landroid/view/Window;->setContentView(Landroid/view/View;)V

    new-instance v2, Lcom/daaw/a4$e;

    invoke-direct {v2, p0}, Lcom/daaw/a4$e;-><init>(Lcom/daaw/a4;)V

    invoke-virtual {v1, v2}, Landroidx/appcompat/widget/ContentFrameLayout;->setAttachListener(Landroidx/appcompat/widget/ContentFrameLayout$a;)V

    return-object v0

    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "AppCompat does not support the current theme features: { windowActionBar: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/daaw/a4;->X:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionBarOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/daaw/a4;->Y:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", android:windowIsFloating: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/daaw/a4;->a0:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowActionModeOverlay: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/daaw/a4;->Z:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", windowNoTitle: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v2, p0, Lcom/daaw/a4;->b0:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, " }"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_7

    :goto_6
    throw v0

    :goto_7
    goto :goto_6
.end method

.method public k(Landroid/content/Context;)Landroid/content/Context;
    .locals 7

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/a4;->g0:Z

    invoke-virtual {p0}, Lcom/daaw/a4;->c0()I

    move-result v1

    invoke-virtual {p0, p1, v1}, Lcom/daaw/a4;->H0(Landroid/content/Context;I)I

    move-result v1

    invoke-static {p1}, Lcom/daaw/z3;->z(Landroid/content/Context;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {p1}, Lcom/daaw/z3;->W(Landroid/content/Context;)V

    :cond_0
    invoke-virtual {p0, p1}, Lcom/daaw/a4;->b0(Landroid/content/Context;)Lcom/daaw/rk0;

    move-result-object v2

    sget-boolean v3, Lcom/daaw/a4;->C0:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    instance-of v3, p1, Landroid/view/ContextThemeWrapper;

    if-eqz v3, :cond_1

    invoke-virtual {p0, p1, v1, v2, v4}, Lcom/daaw/a4;->i0(Landroid/content/Context;ILcom/daaw/rk0;Landroid/content/res/Configuration;)Landroid/content/res/Configuration;

    move-result-object v3

    :try_start_0
    move-object v5, p1

    check-cast v5, Landroid/view/ContextThemeWrapper;

    invoke-static {v5, v3}, Lcom/daaw/a4$s;->a(Landroid/view/ContextThemeWrapper;Landroid/content/res/Configuration;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    nop

    :cond_1
    instance-of v3, p1, Lcom/daaw/bl;

    if-eqz v3, :cond_2

    invoke-virtual {p0, p1, v1, v2, v4}, Lcom/daaw/a4;->i0(Landroid/content/Context;ILcom/daaw/rk0;Landroid/content/res/Configuration;)Landroid/content/res/Configuration;

    move-result-object v3

    :try_start_1
    move-object v5, p1

    check-cast v5, Lcom/daaw/bl;

    invoke-virtual {v5, v3}, Lcom/daaw/bl;->a(Landroid/content/res/Configuration;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_1

    return-object p1

    :catch_1
    nop

    :cond_2
    sget-boolean v3, Lcom/daaw/a4;->B0:Z

    if-nez v3, :cond_3

    invoke-super {p0, p1}, Lcom/daaw/z3;->k(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance v3, Landroid/content/res/Configuration;

    invoke-direct {v3}, Landroid/content/res/Configuration;-><init>()V

    const/4 v5, -0x1

    iput v5, v3, Landroid/content/res/Configuration;->uiMode:I

    const/4 v5, 0x0

    iput v5, v3, Landroid/content/res/Configuration;->fontScale:F

    invoke-static {p1, v3}, Lcom/daaw/a4$k;->a(Landroid/content/Context;Landroid/content/res/Configuration;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v5

    iget v6, v5, Landroid/content/res/Configuration;->uiMode:I

    iput v6, v3, Landroid/content/res/Configuration;->uiMode:I

    invoke-virtual {v3, v5}, Landroid/content/res/Configuration;->equals(Landroid/content/res/Configuration;)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-static {v3, v5}, Lcom/daaw/a4;->s0(Landroid/content/res/Configuration;Landroid/content/res/Configuration;)Landroid/content/res/Configuration;

    move-result-object v4

    :cond_4
    invoke-virtual {p0, p1, v1, v2, v4}, Lcom/daaw/a4;->i0(Landroid/content/Context;ILcom/daaw/rk0;Landroid/content/res/Configuration;)Landroid/content/res/Configuration;

    move-result-object v1

    new-instance v2, Lcom/daaw/bl;

    sget v3, Lcom/daaw/l21;->c:I

    invoke-direct {v2, p1, v3}, Lcom/daaw/bl;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v2, v1}, Lcom/daaw/bl;->a(Landroid/content/res/Configuration;)V

    const/4 v1, 0x0

    :try_start_2
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1
    :try_end_2
    .catch Ljava/lang/NullPointerException; {:try_start_2 .. :try_end_2} :catch_2

    if-eqz p1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v0, 0x0

    :goto_0
    move v1, v0

    goto :goto_1

    :catch_2
    nop

    :goto_1
    if-eqz v1, :cond_6

    invoke-virtual {v2}, Lcom/daaw/bl;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/j51$g;->a(Landroid/content/res/Resources$Theme;)V

    :cond_6
    invoke-super {p0, v2}, Lcom/daaw/z3;->k(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    return-object p1
.end method

.method public k0(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 11

    iget-object v0, p0, Lcom/daaw/a4;->w0:Lcom/daaw/z4;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    sget-object v2, Lcom/daaw/x21;->y0:[I

    invoke-virtual {v0, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v2, Lcom/daaw/x21;->C0:I

    invoke-virtual {v0, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/z4;

    invoke-direct {v0}, Lcom/daaw/z4;-><init>()V

    :goto_0
    iput-object v0, p0, Lcom/daaw/a4;->w0:Lcom/daaw/z4;

    goto :goto_1

    :cond_0
    :try_start_0
    iget-object v2, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Class;

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/daaw/z4;

    iput-object v2, p0, Lcom/daaw/a4;->w0:Lcom/daaw/z4;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to instantiate custom view inflater "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ". Falling back to default."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v0, Lcom/daaw/z4;

    invoke-direct {v0}, Lcom/daaw/z4;-><init>()V

    goto :goto_0

    :cond_1
    :goto_1
    sget-boolean v8, Lcom/daaw/a4;->z0:Z

    const/4 v0, 0x1

    if-eqz v8, :cond_6

    iget-object v2, p0, Lcom/daaw/a4;->x0:Lcom/daaw/ui0;

    if-nez v2, :cond_2

    new-instance v2, Lcom/daaw/ui0;

    invoke-direct {v2}, Lcom/daaw/ui0;-><init>()V

    iput-object v2, p0, Lcom/daaw/a4;->x0:Lcom/daaw/ui0;

    :cond_2
    iget-object v2, p0, Lcom/daaw/a4;->x0:Lcom/daaw/ui0;

    invoke-virtual {v2, p4}, Lcom/daaw/ui0;->a(Landroid/util/AttributeSet;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v7, 0x1

    goto :goto_3

    :cond_3
    instance-of v2, p4, Lorg/xmlpull/v1/XmlPullParser;

    if-eqz v2, :cond_4

    move-object v2, p4

    check-cast v2, Lorg/xmlpull/v1/XmlPullParser;

    invoke-interface {v2}, Lorg/xmlpull/v1/XmlPullParser;->getDepth()I

    move-result v2

    if-le v2, v0, :cond_5

    const/4 v1, 0x1

    goto :goto_2

    :cond_4
    move-object v0, p1

    check-cast v0, Landroid/view/ViewParent;

    invoke-virtual {p0, v0}, Lcom/daaw/a4;->a1(Landroid/view/ViewParent;)Z

    move-result v0

    move v1, v0

    :cond_5
    :goto_2
    move v7, v1

    goto :goto_3

    :cond_6
    const/4 v7, 0x0

    :goto_3
    iget-object v2, p0, Lcom/daaw/a4;->w0:Lcom/daaw/z4;

    const/4 v9, 0x1

    invoke-static {}, Lcom/daaw/hs1;->c()Z

    move-result v10

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-virtual/range {v2 .. v10}, Lcom/daaw/z4;->r(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;ZZZZ)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public l0()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/hq;->i()V

    :cond_0
    iget-object v0, p0, Lcom/daaw/a4;->N:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/a4;->O:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object v0, p0, Lcom/daaw/a4;->N:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/a4;->N:Landroid/widget/PopupWindow;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/a4;->N:Landroid/widget/PopupWindow;

    :cond_2
    invoke-virtual {p0}, Lcom/daaw/a4;->o0()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Lcom/daaw/a4;->y0(IZ)Lcom/daaw/a4$u;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, v0, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/e;->close()V

    :cond_3
    return-void
.end method

.method public m0(Landroid/view/KeyEvent;)Z
    .locals 3

    iget-object v0, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    instance-of v1, v0, Lcom/daaw/ii0$a;

    const/4 v2, 0x1

    if-nez v1, :cond_0

    instance-of v0, v0, Lcom/daaw/c4;

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0, p1}, Lcom/daaw/ii0;->d(Landroid/view/View;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x52

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/daaw/a4;->D:Lcom/daaw/a4$o;

    iget-object v1, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {v1}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/daaw/a4$o;->b(Landroid/view/Window$Callback;Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v2

    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_4

    invoke-virtual {p0, v0, p1}, Lcom/daaw/a4;->J0(ILandroid/view/KeyEvent;)Z

    move-result p1

    goto :goto_1

    :cond_4
    invoke-virtual {p0, v0, p1}, Lcom/daaw/a4;->M0(ILandroid/view/KeyEvent;)Z

    move-result p1

    :goto_1
    return p1
.end method

.method public n(I)Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/daaw/a4;->p0()V

    iget-object v0, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    invoke-virtual {v0, p1}, Landroid/view/Window;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public n0(I)V
    .locals 4

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/daaw/a4;->y0(IZ)Lcom/daaw/a4$u;

    move-result-object v1

    iget-object v2, v1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    if-eqz v2, :cond_1

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iget-object v3, v1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v3, v2}, Landroidx/appcompat/view/menu/e;->T(Landroid/os/Bundle;)V

    invoke-virtual {v2}, Landroid/os/Bundle;->size()I

    move-result v3

    if-lez v3, :cond_0

    iput-object v2, v1, Lcom/daaw/a4$u;->s:Landroid/os/Bundle;

    :cond_0
    iget-object v2, v1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v2}, Landroidx/appcompat/view/menu/e;->h0()V

    iget-object v2, v1, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    invoke-virtual {v2}, Landroidx/appcompat/view/menu/e;->clear()V

    :cond_1
    iput-boolean v0, v1, Lcom/daaw/a4$u;->r:Z

    iput-boolean v0, v1, Lcom/daaw/a4$u;->q:Z

    const/16 v0, 0x6c

    if-eq p1, v0, :cond_2

    if-nez p1, :cond_3

    :cond_2
    iget-object p1, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    if-eqz p1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {p0, p1, p1}, Lcom/daaw/a4;->y0(IZ)Lcom/daaw/a4$u;

    move-result-object v0

    if-eqz v0, :cond_3

    iput-boolean p1, v0, Lcom/daaw/a4$u;->m:Z

    const/4 p1, 0x0

    invoke-virtual {p0, v0, p1}, Lcom/daaw/a4;->U0(Lcom/daaw/a4$u;Landroid/view/KeyEvent;)Z

    :cond_3
    return-void
.end method

.method public o0()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/a4;->P:Lcom/daaw/ut1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/ut1;->c()V

    :cond_0
    return-void
.end method

.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/a4;->k0(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1, p2, p3}, Lcom/daaw/a4;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public p()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    return-object v0
.end method

.method public final p0()V
    .locals 2

    iget-boolean v0, p0, Lcom/daaw/a4;->R:Z

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lcom/daaw/a4;->j0()Landroid/view/ViewGroup;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/a4;->S:Landroid/view/ViewGroup;

    invoke-virtual {p0}, Lcom/daaw/a4;->z0()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lcom/daaw/a4;->I:Lcom/daaw/hq;

    if-eqz v1, :cond_0

    invoke-interface {v1, v0}, Lcom/daaw/hq;->setWindowTitle(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/a4;->S0()Lcom/daaw/i0;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lcom/daaw/a4;->S0()Lcom/daaw/i0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/i0;->y(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lcom/daaw/a4;->T:Landroid/widget/TextView;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lcom/daaw/a4;->Z()V

    iget-object v0, p0, Lcom/daaw/a4;->S:Landroid/view/ViewGroup;

    invoke-virtual {p0, v0}, Lcom/daaw/a4;->Q0(Landroid/view/ViewGroup;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/a4;->R:Z

    const/4 v0, 0x0

    invoke-virtual {p0, v0, v0}, Lcom/daaw/a4;->y0(IZ)Lcom/daaw/a4$u;

    move-result-object v0

    iget-boolean v1, p0, Lcom/daaw/a4;->i0:Z

    if-nez v1, :cond_4

    if-eqz v0, :cond_3

    iget-object v0, v0, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    if-nez v0, :cond_4

    :cond_3
    const/16 v0, 0x6c

    invoke-virtual {p0, v0}, Lcom/daaw/a4;->F0(I)V

    :cond_4
    return-void
.end method

.method public final q0()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/a4;->a0(Landroid/view/Window;)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/a4;->C:Landroid/view/Window;

    if-eqz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "We have not been given a Window"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public r()I
    .locals 1

    iget v0, p0, Lcom/daaw/a4;->k0:I

    return v0
.end method

.method public r0(Landroid/view/Menu;)Lcom/daaw/a4$u;
    .locals 5

    iget-object v0, p0, Lcom/daaw/a4;->d0:[Lcom/daaw/a4$u;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    array-length v2, v0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-ge v1, v2, :cond_2

    aget-object v3, v0, v1

    if-eqz v3, :cond_1

    iget-object v4, v3, Lcom/daaw/a4$u;->j:Landroidx/appcompat/view/menu/e;

    if-ne v4, p1, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public t()Landroid/view/MenuInflater;
    .locals 2

    iget-object v0, p0, Lcom/daaw/a4;->G:Landroid/view/MenuInflater;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/a4;->B0()V

    new-instance v0, Lcom/daaw/gi1;

    iget-object v1, p0, Lcom/daaw/a4;->F:Lcom/daaw/i0;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/daaw/i0;->j()Landroid/content/Context;

    move-result-object v1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    :goto_0
    invoke-direct {v0, v1}, Lcom/daaw/gi1;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/daaw/a4;->G:Landroid/view/MenuInflater;

    :cond_1
    iget-object v0, p0, Lcom/daaw/a4;->G:Landroid/view/MenuInflater;

    return-object v0
.end method

.method public final t0()Landroid/content/Context;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/a4;->w()Lcom/daaw/i0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/i0;->j()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    :cond_1
    return-object v0
.end method

.method public final u0()I
    .locals 6

    iget-boolean v0, p0, Lcom/daaw/a4;->n0:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    instance-of v0, v0, Landroid/app/Activity;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-lt v2, v3, :cond_1

    const/high16 v2, 0x100c0000

    goto :goto_0

    :cond_1
    const/16 v3, 0x18

    if-lt v2, v3, :cond_2

    const/high16 v2, 0xc0000

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    new-instance v3, Landroid/content/ComponentName;

    iget-object v4, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    iget-object v5, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v3, v2}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v0

    if-eqz v0, :cond_3

    iget v0, v0, Landroid/content/pm/ActivityInfo;->configChanges:I

    iput v0, p0, Lcom/daaw/a4;->m0:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    iput v1, p0, Lcom/daaw/a4;->m0:I

    :cond_3
    :goto_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/daaw/a4;->n0:Z

    iget v0, p0, Lcom/daaw/a4;->m0:I

    return v0
.end method

.method public final v0(Landroid/content/Context;)Lcom/daaw/a4$q;
    .locals 1

    iget-object v0, p0, Lcom/daaw/a4;->p0:Lcom/daaw/a4$q;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/a4$p;

    invoke-direct {v0, p0, p1}, Lcom/daaw/a4$p;-><init>(Lcom/daaw/a4;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/daaw/a4;->p0:Lcom/daaw/a4$q;

    :cond_0
    iget-object p1, p0, Lcom/daaw/a4;->p0:Lcom/daaw/a4$q;

    return-object p1
.end method

.method public w()Lcom/daaw/i0;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/a4;->B0()V

    iget-object v0, p0, Lcom/daaw/a4;->F:Lcom/daaw/i0;

    return-object v0
.end method

.method public final w0(Landroid/content/Context;)Lcom/daaw/a4$q;
    .locals 1

    iget-object v0, p0, Lcom/daaw/a4;->o0:Lcom/daaw/a4$q;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/a4$r;

    invoke-static {p1}, Lcom/daaw/po1;->a(Landroid/content/Context;)Lcom/daaw/po1;

    move-result-object p1

    invoke-direct {v0, p0, p1}, Lcom/daaw/a4$r;-><init>(Lcom/daaw/a4;Lcom/daaw/po1;)V

    iput-object v0, p0, Lcom/daaw/a4;->o0:Lcom/daaw/a4$q;

    :cond_0
    iget-object p1, p0, Lcom/daaw/a4;->o0:Lcom/daaw/a4$q;

    return-object p1
.end method

.method public x()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/a4;->B:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory()Landroid/view/LayoutInflater$Factory;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-static {v0, p0}, Lcom/daaw/vi0;->b(Landroid/view/LayoutInflater;Landroid/view/LayoutInflater$Factory2;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/LayoutInflater;->getFactory2()Landroid/view/LayoutInflater$Factory2;

    move-result-object v0

    instance-of v0, v0, Lcom/daaw/a4;

    :goto_0
    return-void
.end method

.method public x0(Landroid/content/res/Configuration;)Lcom/daaw/rk0;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    invoke-static {p1}, Lcom/daaw/a4$m;->b(Landroid/content/res/Configuration;)Lcom/daaw/rk0;

    move-result-object p1

    return-object p1

    :cond_0
    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    iget-object p1, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    invoke-static {p1}, Lcom/daaw/a4$l;->b(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/rk0;->c(Ljava/lang/String;)Lcom/daaw/rk0;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/util/Locale;

    const/4 v1, 0x0

    iget-object p1, p1, Landroid/content/res/Configuration;->locale:Ljava/util/Locale;

    aput-object p1, v0, v1

    invoke-static {v0}, Lcom/daaw/rk0;->a([Ljava/util/Locale;)Lcom/daaw/rk0;

    move-result-object p1

    return-object p1
.end method

.method public y()V
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/a4;->S0()Lcom/daaw/i0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/daaw/a4;->w()Lcom/daaw/i0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/i0;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/daaw/a4;->F0(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public y0(IZ)Lcom/daaw/a4$u;
    .locals 3

    iget-object p2, p0, Lcom/daaw/a4;->d0:[Lcom/daaw/a4$u;

    if-eqz p2, :cond_0

    array-length v0, p2

    if-gt v0, p1, :cond_2

    :cond_0
    add-int/lit8 v0, p1, 0x1

    new-array v0, v0, [Lcom/daaw/a4$u;

    if-eqz p2, :cond_1

    array-length v1, p2

    const/4 v2, 0x0

    invoke-static {p2, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1
    iput-object v0, p0, Lcom/daaw/a4;->d0:[Lcom/daaw/a4$u;

    move-object p2, v0

    :cond_2
    aget-object v0, p2, p1

    if-nez v0, :cond_3

    new-instance v0, Lcom/daaw/a4$u;

    invoke-direct {v0, p1}, Lcom/daaw/a4$u;-><init>(I)V

    aput-object v0, p2, p1

    :cond_3
    return-object v0
.end method

.method public final z0()Ljava/lang/CharSequence;
    .locals 2

    iget-object v0, p0, Lcom/daaw/a4;->A:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/a4;->H:Ljava/lang/CharSequence;

    return-object v0
.end method
