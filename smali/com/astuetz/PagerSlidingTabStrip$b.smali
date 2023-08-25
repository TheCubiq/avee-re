.class public Lcom/astuetz/PagerSlidingTabStrip$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ir1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/astuetz/PagerSlidingTabStrip;->r(ILcom/daaw/me0;Landroid/view/View;Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/ir1$b<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Landroid/widget/TextView;

.field public final synthetic b:Lcom/astuetz/PagerSlidingTabStrip;


# direct methods
.method public constructor <init>(Lcom/astuetz/PagerSlidingTabStrip;Landroid/widget/TextView;)V
    .locals 0

    iput-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip$b;->b:Lcom/astuetz/PagerSlidingTabStrip;

    iput-object p2, p0, Lcom/astuetz/PagerSlidingTabStrip$b;->a:Landroid/widget/TextView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Z)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Lcom/astuetz/PagerSlidingTabStrip$b;->b(Ljava/lang/String;Z)V

    return-void
.end method

.method public b(Ljava/lang/String;Z)V
    .locals 0

    if-eqz p2, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    iget-object p2, p0, Lcom/astuetz/PagerSlidingTabStrip$b;->a:Landroid/widget/TextView;

    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method
