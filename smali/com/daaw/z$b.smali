.class public Lcom/daaw/z$b;
.super Lcom/daaw/z$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Lcom/daaw/z;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/z$a;-><init>(Lcom/daaw/z;)V

    return-void
.end method


# virtual methods
.method public findFocus(I)Landroid/view/accessibility/AccessibilityNodeInfo;
    .locals 1

    iget-object v0, p0, Lcom/daaw/z$a;->a:Lcom/daaw/z;

    invoke-virtual {v0, p1}, Lcom/daaw/z;->d(I)Lcom/daaw/y;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/y;->C0()Landroid/view/accessibility/AccessibilityNodeInfo;

    move-result-object p1

    return-object p1
.end method
