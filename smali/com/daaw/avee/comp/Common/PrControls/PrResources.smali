.class public Lcom/daaw/avee/comp/Common/PrControls/PrResources;
.super Ljava/lang/Object;
.source "PrResources.java"


# static fields
.field private static drawableBg:Landroid/graphics/drawable/Drawable;

.field private static drawableGreenBg:Landroid/graphics/drawable/Drawable;

.field public static final onRequest:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final onRequestGreen:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 17
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrResources;->onRequest:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 18
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrResources;->onRequestGreen:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v0, 0x0

    .line 20
    sput-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrResources;->drawableBg:Landroid/graphics/drawable/Drawable;

    .line 21
    sput-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrResources;->drawableGreenBg:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static getDrawableBg()Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 25
    sget-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrResources;->onRequest:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 30
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrResources;->drawableBg:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_1

    .line 31
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_1

    const v1, 0x7f080081

    .line 33
    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    sput-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrResources;->drawableBg:Landroid/graphics/drawable/Drawable;

    .line 37
    :cond_1
    sget-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrResources;->drawableBg:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public static getDrawableRedBg()Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 43
    sget-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrResources;->onRequestGreen:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    .line 44
    sget-object v1, Lcom/daaw/avee/comp/Common/PrControls/PrResources;->drawableGreenBg:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_0

    if-nez v0, :cond_0

    .line 45
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v1

    if-eqz v1, :cond_0

    const v2, 0x7f08014a

    .line 47
    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    sput-object v1, Lcom/daaw/avee/comp/Common/PrControls/PrResources;->drawableGreenBg:Landroid/graphics/drawable/Drawable;

    :cond_0
    if-eqz v0, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    .line 51
    :cond_1
    sget-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrResources;->drawableGreenBg:Landroid/graphics/drawable/Drawable;

    :goto_0
    return-object v0
.end method
