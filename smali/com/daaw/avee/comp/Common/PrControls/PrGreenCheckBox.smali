.class public final Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox;
.super Landroidx/appcompat/widget/AppCompatCheckBox;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox$a;
    }
.end annotation


# static fields
.field public static final u:Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox$a;

.field public static final v:Lcom/daaw/vw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/vw1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox$a;-><init>(Lcom/daaw/pq;)V

    sput-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox;->u:Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox$a;

    new-instance v0, Lcom/daaw/vw1;

    invoke-direct {v0}, Lcom/daaw/vw1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox;->v:Lcom/daaw/vw1;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatCheckBox;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox;->t:Ljava/util/List;

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox;->c()V

    return-void
.end method

.method public static synthetic b(Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox;Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox;->d(Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox;Ljava/lang/Integer;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox;Ljava/lang/Integer;)Ljava/lang/Boolean;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getId()I

    move-result v0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/CheckBox;->setEnabled(Z)V

    invoke-virtual {p0, p1}, Landroid/widget/CheckBox;->setChecked(Z)V

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :goto_1
    return-object p0
.end method


# virtual methods
.method public final c()V
    .locals 4

    sget-object v0, Lcom/daaw/oy0;->e:Lcom/daaw/vw1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lcom/daaw/vw1;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v2, "adsDisabled.invoke(false)"

    invoke-static {v0, v2}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/daaw/oy0;->d:Lcom/daaw/ww1;

    new-instance v2, Lcom/daaw/ny0;

    invoke-direct {v2, p0}, Lcom/daaw/ny0;-><init>(Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox;)V

    iget-object v3, p0, Lcom/daaw/avee/comp/Common/PrControls/PrGreenCheckBox;->t:Ljava/util/List;

    invoke-virtual {v0, v2, v3}, Lcom/daaw/ww1;->b(Lcom/daaw/ww1$a;Ljava/util/List;)V

    sget-object v0, Lcom/daaw/oy0;->c:Lcom/daaw/ww1;

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2, v1}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "isFieldUnlocked(id, false)"

    invoke-static {v0, v1}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/CheckBox;->setEnabled(Z)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    const-string v0, "event"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v3, 0x5

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    if-eqz v0, :cond_5

    invoke-virtual {p0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0, v1}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_3

    :cond_2
    invoke-virtual {p0}, Landroid/widget/CheckBox;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_3

    :goto_2
    invoke-virtual {p0, v2}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto :goto_3

    :cond_3
    sget-object p1, Lcom/daaw/oy0;->b:Lcom/daaw/ww1;

    invoke-virtual {p0}, Landroid/widget/CheckBox;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0, v1}, Lcom/daaw/ww1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "unlockField(id, false)"

    invoke-static {p1, v0}, Lcom/daaw/ug0;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0, v2}, Landroid/widget/CheckBox;->setEnabled(Z)V

    goto :goto_2

    :cond_4
    :goto_3
    return v2

    :cond_5
    invoke-super {p0, p1}, Landroid/widget/CheckBox;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
