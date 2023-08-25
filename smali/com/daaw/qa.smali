.class public abstract Lcom/daaw/qa;
.super Lcom/daaw/ma;
.source ""


# static fields
.field public static A:Lcom/daaw/sw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/sw1<",
            "[J",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/daaw/al;",
            ">;"
        }
    .end annotation
.end field

.field public static u:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static v:Lcom/daaw/rw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/rw1<",
            "Lcom/daaw/al;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public static w:Lcom/daaw/rw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/rw1<",
            "Lcom/daaw/al;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public static x:Lcom/daaw/rw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/rw1<",
            "Lcom/daaw/al;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public static y:Lcom/daaw/sw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/sw1<",
            "Lcom/daaw/al;",
            "Ljava/lang/Integer;",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public static z:Lcom/daaw/qw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/qw1<",
            "Lcom/daaw/al;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/qa;->u:Lcom/daaw/vw1;

    new-instance v0, Lcom/daaw/rw1;

    invoke-direct {v0}, Lcom/daaw/rw1;-><init>()V

    sput-object v0, Lcom/daaw/qa;->v:Lcom/daaw/rw1;

    new-instance v0, Lcom/daaw/rw1;

    invoke-direct {v0}, Lcom/daaw/rw1;-><init>()V

    sput-object v0, Lcom/daaw/qa;->w:Lcom/daaw/rw1;

    new-instance v0, Lcom/daaw/rw1;

    invoke-direct {v0}, Lcom/daaw/rw1;-><init>()V

    sput-object v0, Lcom/daaw/qa;->x:Lcom/daaw/rw1;

    new-instance v0, Lcom/daaw/sw1;

    invoke-direct {v0}, Lcom/daaw/sw1;-><init>()V

    sput-object v0, Lcom/daaw/qa;->y:Lcom/daaw/sw1;

    new-instance v0, Lcom/daaw/qw1;

    invoke-direct {v0}, Lcom/daaw/qw1;-><init>()V

    sput-object v0, Lcom/daaw/qa;->z:Lcom/daaw/qw1;

    new-instance v0, Lcom/daaw/sw1;

    invoke-direct {v0}, Lcom/daaw/sw1;-><init>()V

    sput-object v0, Lcom/daaw/qa;->A:Lcom/daaw/sw1;

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lcom/daaw/ma;-><init>(Landroid/view/View;IZ)V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0, p2}, Lcom/daaw/ma;-><init>(Landroid/view/View;IZ)V

    return-void
.end method

.method public static P([Landroid/widget/TextView;Landroid/content/Context;)V
    .locals 5

    invoke-static {}, Lcom/daaw/j5;->e()Lcom/daaw/j5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/j5;->p(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "pref_toolButtonsShowTexts"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lcom/daaw/j5;->L(Landroid/content/SharedPreferences;Ljava/lang/String;Z)Z

    move-result p1

    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_2

    aget-object v3, p0, v2

    if-eqz v3, :cond_1

    if-eqz p1, :cond_0

    const/4 v4, 0x0

    goto :goto_1

    :cond_0
    const/16 v4, 0x8

    :goto_1
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setVisibility(I)V

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method
