.class public Lcom/daaw/z$c;
.super Lcom/daaw/z$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# direct methods
.method public constructor <init>(Lcom/daaw/z;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/z$b;-><init>(Lcom/daaw/z;)V

    return-void
.end method


# virtual methods
.method public addExtraDataToAccessibilityNodeInfo(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/z$a;->a:Lcom/daaw/z;

    invoke-static {p2}, Lcom/daaw/y;->D0(Landroid/view/accessibility/AccessibilityNodeInfo;)Lcom/daaw/y;

    move-result-object p2

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/daaw/z;->a(ILcom/daaw/y;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
