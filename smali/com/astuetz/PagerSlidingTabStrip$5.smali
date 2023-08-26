.class Lcom/astuetz/PagerSlidingTabStrip$5;
.super Ljava/lang/Object;
.source "PagerSlidingTabStrip.java"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/astuetz/PagerSlidingTabStrip;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/astuetz/PagerSlidingTabStrip;


# direct methods
.method constructor <init>(Lcom/astuetz/PagerSlidingTabStrip;)V
    .locals 0

    .line 486
    iput-object p1, p0, Lcom/astuetz/PagerSlidingTabStrip$5;->this$0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .locals 6

    .line 490
    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip$5;->this$0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/astuetz/PagerSlidingTabStrip;->access$200(Lcom/astuetz/PagerSlidingTabStrip;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 492
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x10

    if-ge v2, v3, :cond_0

    .line 493
    iget-object v2, p0, Lcom/astuetz/PagerSlidingTabStrip$5;->this$0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {v2}, Lcom/astuetz/PagerSlidingTabStrip;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_0

    .line 495
    :cond_0
    iget-object v2, p0, Lcom/astuetz/PagerSlidingTabStrip$5;->this$0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {v2}, Lcom/astuetz/PagerSlidingTabStrip;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v2

    invoke-virtual {v2, p0}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 498
    :goto_0
    iget-object v2, p0, Lcom/astuetz/PagerSlidingTabStrip$5;->this$0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-static {v2}, Lcom/astuetz/PagerSlidingTabStrip;->access$300(Lcom/astuetz/PagerSlidingTabStrip;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 499
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    .line 500
    iget-object v2, p0, Lcom/astuetz/PagerSlidingTabStrip$5;->this$0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {v2}, Lcom/astuetz/PagerSlidingTabStrip;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v3, v0

    invoke-static {v2, v3}, Lcom/astuetz/PagerSlidingTabStrip;->access$502(Lcom/astuetz/PagerSlidingTabStrip;I)I

    move-result v0

    invoke-static {v2, v0}, Lcom/astuetz/PagerSlidingTabStrip;->access$402(Lcom/astuetz/PagerSlidingTabStrip;I)I

    .line 502
    :cond_1
    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip$5;->this$0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/astuetz/PagerSlidingTabStrip;->access$400(Lcom/astuetz/PagerSlidingTabStrip;)I

    move-result v2

    iget-object v3, p0, Lcom/astuetz/PagerSlidingTabStrip$5;->this$0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {v3}, Lcom/astuetz/PagerSlidingTabStrip;->getPaddingTop()I

    move-result v3

    iget-object v4, p0, Lcom/astuetz/PagerSlidingTabStrip$5;->this$0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-static {v4}, Lcom/astuetz/PagerSlidingTabStrip;->access$500(Lcom/astuetz/PagerSlidingTabStrip;)I

    move-result v4

    iget-object v5, p0, Lcom/astuetz/PagerSlidingTabStrip$5;->this$0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {v5}, Lcom/astuetz/PagerSlidingTabStrip;->getPaddingBottom()I

    move-result v5

    invoke-virtual {v0, v2, v3, v4, v5}, Lcom/astuetz/PagerSlidingTabStrip;->setPadding(IIII)V

    .line 503
    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip$5;->this$0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/astuetz/PagerSlidingTabStrip;->access$600(Lcom/astuetz/PagerSlidingTabStrip;)I

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip$5;->this$0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-virtual {v0}, Lcom/astuetz/PagerSlidingTabStrip;->getWidth()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    iget-object v3, p0, Lcom/astuetz/PagerSlidingTabStrip$5;->this$0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-static {v3}, Lcom/astuetz/PagerSlidingTabStrip;->access$400(Lcom/astuetz/PagerSlidingTabStrip;)I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v0, v2}, Lcom/astuetz/PagerSlidingTabStrip;->access$602(Lcom/astuetz/PagerSlidingTabStrip;I)I

    .line 506
    :cond_2
    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip$5;->this$0:Lcom/astuetz/PagerSlidingTabStrip;

    iget v2, v0, Lcom/astuetz/PagerSlidingTabStrip;->myCurrentItem:I

    invoke-static {v0, v2}, Lcom/astuetz/PagerSlidingTabStrip;->access$702(Lcom/astuetz/PagerSlidingTabStrip;I)I

    .line 507
    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip$5;->this$0:Lcom/astuetz/PagerSlidingTabStrip;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lcom/astuetz/PagerSlidingTabStrip;->access$802(Lcom/astuetz/PagerSlidingTabStrip;F)F

    .line 508
    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip$5;->this$0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/astuetz/PagerSlidingTabStrip;->access$700(Lcom/astuetz/PagerSlidingTabStrip;)I

    move-result v2

    invoke-static {v0, v2, v1}, Lcom/astuetz/PagerSlidingTabStrip;->access$900(Lcom/astuetz/PagerSlidingTabStrip;II)V

    .line 509
    iget-object v0, p0, Lcom/astuetz/PagerSlidingTabStrip$5;->this$0:Lcom/astuetz/PagerSlidingTabStrip;

    invoke-static {v0}, Lcom/astuetz/PagerSlidingTabStrip;->access$700(Lcom/astuetz/PagerSlidingTabStrip;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/astuetz/PagerSlidingTabStrip;->access$1000(Lcom/astuetz/PagerSlidingTabStrip;I)V

    return-void
.end method
