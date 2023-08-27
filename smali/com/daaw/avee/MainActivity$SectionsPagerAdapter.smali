.class public Lcom/daaw/avee/MainActivity$SectionsPagerAdapter;
.super Landroidx/legacy/app/FragmentPagerAdapter;
.source "MainActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/MainActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "SectionsPagerAdapter"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/MainActivity;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/MainActivity;Landroid/app/FragmentManager;)V
    .locals 0

    .line 1113
    iput-object p1, p0, Lcom/daaw/avee/MainActivity$SectionsPagerAdapter;->this$0:Lcom/daaw/avee/MainActivity;

    .line 1114
    invoke-direct {p0, p2}, Landroidx/legacy/app/FragmentPagerAdapter;-><init>(Landroid/app/FragmentManager;)V

    return-void
.end method


# virtual methods
.method public getCount()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public getItem(I)Landroid/app/Fragment;
    .locals 1

    if-eqz p1, :cond_2

    const/4 v0, 0x1

    if-eq p1, v0, :cond_1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1125
    :cond_0
    invoke-static {}, Lcom/daaw/avee/comp/VisualUI/Fragment2;->newInstance()Lcom/daaw/avee/comp/VisualUI/Fragment2;

    move-result-object p1

    return-object p1

    .line 1123
    :cond_1
    invoke-static {}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;->newInstance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment1;

    move-result-object p1

    return-object p1

    .line 1121
    :cond_2
    invoke-static {}, Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;->newInstance()Lcom/daaw/avee/comp/LibraryQueueUI/Fragment0;

    move-result-object p1

    return-object p1
.end method

.method public getPageTitle(I)Ljava/lang/CharSequence;
    .locals 6

    const/4 v0, 0x2

    const-string v1, "   "

    const/4 v2, 0x1

    if-eqz p1, :cond_2

    if-eq p1, v2, :cond_1

    if-eq p1, v0, :cond_0

    const-string p1, " "

    return-object p1

    .line 1152
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/MainActivity$SectionsPagerAdapter;->this$0:Lcom/daaw/avee/MainActivity;

    const v3, 0x7f080117

    invoke-static {p1, v3}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 1153
    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1148
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/MainActivity$SectionsPagerAdapter;->this$0:Lcom/daaw/avee/MainActivity;

    const v3, 0x7f0800f9

    invoke-static {p1, v3}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 1149
    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 1144
    :cond_2
    iget-object p1, p0, Lcom/daaw/avee/MainActivity$SectionsPagerAdapter;->this$0:Lcom/daaw/avee/MainActivity;

    const v3, 0x7f0800e0

    invoke-static {p1, v3}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 1145
    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-direct {v3, v1}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    :goto_0
    if-nez p1, :cond_3

    const-string p1, ""

    return-object p1

    .line 1162
    :cond_3
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    const/4 v5, 0x0

    invoke-virtual {p1, v5, v5, v1, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1164
    new-instance v1, Landroid/text/style/ImageSpan;

    invoke-direct {v1, p1, v2}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;I)V

    const/16 p1, 0x21

    .line 1165
    invoke-virtual {v3, v1, v2, v0, p1}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    return-object v3
.end method
