.class public Lcom/daaw/f3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Landroid/animation/TimeInterpolator;

.field public static final b:Landroid/animation/TimeInterpolator;

.field public static final c:Landroid/animation/TimeInterpolator;

.field public static final d:Landroid/animation/TimeInterpolator;

.field public static final e:Landroid/animation/TimeInterpolator;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroid/view/animation/LinearInterpolator;

    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    sput-object v0, Lcom/daaw/f3;->a:Landroid/animation/TimeInterpolator;

    new-instance v0, Lcom/daaw/l00;

    invoke-direct {v0}, Lcom/daaw/l00;-><init>()V

    sput-object v0, Lcom/daaw/f3;->b:Landroid/animation/TimeInterpolator;

    new-instance v0, Lcom/daaw/k00;

    invoke-direct {v0}, Lcom/daaw/k00;-><init>()V

    sput-object v0, Lcom/daaw/f3;->c:Landroid/animation/TimeInterpolator;

    new-instance v0, Lcom/daaw/zj0;

    invoke-direct {v0}, Lcom/daaw/zj0;-><init>()V

    sput-object v0, Lcom/daaw/f3;->d:Landroid/animation/TimeInterpolator;

    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    sput-object v0, Lcom/daaw/f3;->e:Landroid/animation/TimeInterpolator;

    return-void
.end method

.method public static a(FFF)F
    .locals 0

    sub-float/2addr p1, p0

    mul-float p2, p2, p1

    add-float/2addr p0, p2

    return p0
.end method
