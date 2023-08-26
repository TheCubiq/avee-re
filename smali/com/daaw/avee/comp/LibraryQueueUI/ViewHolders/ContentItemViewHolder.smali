.class public Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;
.super Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseViewHolder;
.source "ContentItemViewHolder.java"


# static fields
.field public static onItemInteracted:Lcom/daaw/avee/Common/Events/WeakEvent1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent1<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static onItemSelected:Lcom/daaw/avee/Common/Events/WeakEvent3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEvent3<",
            "[",
            "Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;",
            "Ljava/lang/Boolean;",
            "Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field public static onRequestIsSelectingEnabled:Lcom/daaw/avee/Common/Events/WeakEventR;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private btnItemMore:Landroid/widget/ImageButton;

.field private btnItemMoreDefaultDrawable:Landroid/graphics/drawable/Drawable;

.field public dataId:Ljava/lang/Object;

.field public imgArt:Landroid/widget/ImageView;

.field private isSelected:Lcom/daaw/avee/Common/Action1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Action1<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;",
            ">;"
        }
    .end annotation
.end field

.field private itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

.field public itemPosition:I

.field public itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private overrideHideTxtItemLine2:Z

.field public txtItemDuration:Landroid/widget/TextView;

.field public txtItemLine1:Landroid/widget/TextView;

.field private txtItemLine2:Landroid/widget/TextView;

.field public txtNum:Landroid/widget/TextView;

.field public viewItemBg:Landroid/view/View;

.field public viewItemBgSelected:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 38
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent3;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent3;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->onItemSelected:Lcom/daaw/avee/Common/Events/WeakEvent3;

    .line 39
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->onRequestIsSelectingEnabled:Lcom/daaw/avee/Common/Events/WeakEventR;

    .line 40
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEvent1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEvent1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->onItemInteracted:Lcom/daaw/avee/Common/Events/WeakEvent1;

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 3

    .line 59
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x0

    const v2, 0x7f0c0083

    invoke-virtual {v0, v2, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/BaseViewHolder;-><init>(Landroid/view/View;)V

    const/4 p1, 0x0

    .line 42
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    .line 43
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->dataId:Ljava/lang/Object;

    .line 54
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    .line 55
    iput-boolean v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->overrideHideTxtItemLine2:Z

    .line 56
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->isSelected:Lcom/daaw/avee/Common/Action1;

    .line 61
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemView:Landroid/view/View;

    const v0, 0x7f09026d

    .line 62
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    const v0, 0x7f09011e

    .line 63
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    const v0, 0x7f090247

    .line 64
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtNum:Landroid/widget/TextView;

    const v0, 0x7f090244

    .line 65
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine1:Landroid/widget/TextView;

    const v0, 0x7f090245

    .line 66
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine2:Landroid/widget/TextView;

    const v0, 0x7f090243

    .line 67
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemDuration:Landroid/widget/TextView;

    const v0, 0x7f090074

    .line 68
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    .line 70
    invoke-virtual {p1}, Landroid/widget/ImageButton;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMoreDefaultDrawable:Landroid/graphics/drawable/Drawable;

    .line 71
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemView:Landroid/view/View;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setLongClickable(Z)V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;
    .locals 0

    .line 36
    iget-object p0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    return-object p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;Z)V
    .locals 0

    .line 36
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setStayPressed(Z)V

    return-void
.end method

.method private setBtnItemMoreColorFilter(I)V
    .locals 3

    .line 111
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    const v1, 0xffffff

    and-int/2addr v1, p1

    const/high16 v2, -0x1000000

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setColorFilter(I)V

    .line 112
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setImageAlpha(I)V

    return-void
.end method

.method private setStayPressed(Z)V
    .locals 1

    .line 358
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setSelected(Z)V

    return-void
.end method


# virtual methods
.method public onBind(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;I)V
    .locals 0

    return-void
.end method

.method public refreshSelection()V
    .locals 3

    .line 206
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->isSelected:Lcom/daaw/avee/Common/Action1;

    if-eqz v0, :cond_0

    .line 207
    invoke-interface {v0, p0}, Lcom/daaw/avee/Common/Action1;->onInvoke(Ljava/lang/Object;)V

    .line 210
    :cond_0
    sget-object v0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->onRequestIsSelectingEnabled:Lcom/daaw/avee/Common/Events/WeakEventR;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/daaw/avee/Common/Events/WeakEventR;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_1

    .line 211
    invoke-direct {p0, v1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setStayPressed(Z)V

    :cond_1
    return-void
.end method

.method public setBtnItemMoreImage(I)V
    .locals 1

    .line 138
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    invoke-virtual {v0, p1}, Landroid/widget/ImageButton;->setImageResource(I)V

    return-void
.end method

.method public setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2

    .line 118
    invoke-static {}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtFactory;->getInstance()Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 120
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;->cancelRequest(Landroid/widget/ImageView;)V

    .line 123
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public setImgColorFilter(I)V
    .locals 3

    const v0, 0xffffff

    const/4 v1, -0x1

    if-ne p1, v1, :cond_0

    .line 92
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    and-int/2addr p1, v0

    invoke-virtual {v1, p1}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 93
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    const/16 v0, 0xff

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageAlpha(I)V

    return-void

    .line 97
    :cond_0
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    and-int/2addr v0, p1

    const/high16 v2, -0x1000000

    add-int/2addr v0, v2

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 98
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    invoke-static {p1}, Landroid/graphics/Color;->alpha(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageAlpha(I)V

    return-void
.end method

.method public setImgResource(I)V
    .locals 2

    .line 81
    invoke-static {}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtFactory;->getInstance()Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 83
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    invoke-interface {v0, v1}, Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;->cancelRequest(Landroid/widget/ImageView;)V

    .line 85
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void
.end method

.method public setItemActions2([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V
    .locals 7

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    .line 200
    invoke-virtual/range {v0 .. v6}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setItemActions2([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;ZZLcom/daaw/avee/Common/Action1;)V

    return-void
.end method

.method public setItemActions2([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;ZZLcom/daaw/avee/Common/Action1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;",
            "I",
            "Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;",
            "ZZ",
            "Lcom/daaw/avee/Common/Action1<",
            "Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;",
            ">;)V"
        }
    .end annotation

    .line 222
    iput-object p6, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->isSelected:Lcom/daaw/avee/Common/Action1;

    .line 224
    iput-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    if-nez p1, :cond_0

    const/4 p2, -0x1

    :cond_0
    const/4 p1, 0x0

    if-eqz p4, :cond_1

    .line 231
    iget-object p5, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    const p6, 0x7f08014f

    invoke-virtual {p5, p6}, Landroid/widget/ImageButton;->setBackgroundResource(I)V

    .line 233
    iget-object p5, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    new-instance p6, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$4;

    invoke-direct {p6, p0, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$4;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    invoke-virtual {p5, p6}, Landroid/widget/ImageButton;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    goto :goto_0

    .line 242
    :cond_1
    iget-object p5, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    iget-object p6, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMoreDefaultDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p5, p6}, Landroid/widget/ImageButton;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 243
    iget-object p5, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    invoke-virtual {p5, p1}, Landroid/widget/ImageButton;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 246
    :goto_0
    iget-object p5, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    if-eqz p5, :cond_2

    array-length p5, p5

    if-lez p5, :cond_2

    .line 247
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    const/4 p5, 0x0

    invoke-virtual {p1, p5}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 248
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    const p5, 0x7f0800f6

    invoke-virtual {p1, p5}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 250
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    new-instance p5, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$5;

    invoke-direct {p5, p0, p4, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$5;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;ZLcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    invoke-virtual {p1, p5}, Landroid/widget/ImageButton;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 264
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    new-instance p5, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;

    invoke-direct {p5, p0, p4}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$6;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;Z)V

    invoke-virtual {p1, p5}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    .line 302
    :cond_2
    iget-object p4, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    const/16 p5, 0x8

    invoke-virtual {p4, p5}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 303
    iget-object p4, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    invoke-virtual {p4, p1}, Landroid/widget/ImageButton;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 304
    iget-object p4, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    invoke-virtual {p4, p1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :goto_1
    if-ltz p2, :cond_3

    .line 307
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    array-length p4, p1

    if-lez p4, :cond_3

    .line 308
    aget-object p1, p1, p2

    .line 309
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemView:Landroid/view/View;

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$7;

    invoke-direct {p3, p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$7;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_2

    .line 329
    :cond_3
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemView:Landroid/view/View;

    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$8;

    invoke-direct {p2, p0, p3}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$8;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 343
    :goto_2
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemListenerActions:[Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;

    if-eqz p1, :cond_4

    array-length p1, p1

    if-lez p1, :cond_4

    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    if-eqz p1, :cond_4

    .line 344
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemView:Landroid/view/View;

    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$9;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$9;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_4
    return-void
.end method

.method public setToDefault(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 1

    const/4 v0, 0x0

    .line 143
    invoke-virtual {p0, p1, v0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setToDefault(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Ljava/lang/Object;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V

    return-void
.end method

.method public setToDefault(Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;Ljava/lang/Object;Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;)V
    .locals 3

    .line 148
    invoke-interface {p1}, Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;->getContainerItemHeight()Lcom/daaw/avee/Common/Tuple2;

    move-result-object v0

    .line 149
    iget-object v1, v0, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    iput-boolean v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->overrideHideTxtItemLine2:Z

    .line 151
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 152
    iget-object v2, v0, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 153
    iget-object v2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    invoke-virtual {v2, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 154
    iget-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    invoke-virtual {v1}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 155
    iget-object v0, v0, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 156
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->imgArt:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v0, 0x0

    .line 159
    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->dataId:Ljava/lang/Object;

    if-eqz p2, :cond_0

    .line 162
    new-instance v1, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    invoke-direct {v1, p3, p2}, Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;-><init>(Lcom/daaw/avee/comp/Common/IGeneralItemContainerIdentifier;Ljava/lang/Object;)V

    iput-object v1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    goto :goto_0

    .line 164
    :cond_0
    iput-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemSelection:Lcom/daaw/avee/comp/ContextualActionBar/ItemSelection$One;

    .line 166
    :goto_0
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemView:Landroid/view/View;

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$1;

    invoke-direct {p3, p0, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$1;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;Lcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 173
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemView:Landroid/view/View;

    new-instance p3, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$2;

    invoke-direct {p3, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$2;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 181
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    const/16 p3, 0x8

    invoke-virtual {p2, p3}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 182
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    const p3, 0x7f0800f6

    invoke-virtual {p2, p3}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 183
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->btnItemMore:Landroid/widget/ImageButton;

    const p3, 0x7f0400c0

    invoke-static {p2, p3}, Lcom/daaw/avee/Common/UtilsUI;->getAttrColor(Landroid/view/View;I)I

    move-result p2

    invoke-direct {p0, p2}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setBtnItemMoreColorFilter(I)V

    .line 188
    iget-object p2, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->viewItemBg:Landroid/view/View;

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Landroid/view/View;->setActivated(Z)V

    const/4 p2, -0x1

    .line 189
    invoke-virtual {p0, v0, p2, p1}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->setItemActions2([Lcom/daaw/avee/comp/ContextualActionBar/ActionListenerBase;ILcom/daaw/avee/comp/LibraryQueueUI/Containers/Base/IContainerData;)V

    .line 191
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->itemView:Landroid/view/View;

    new-instance p2, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$3;

    invoke-direct {p2, p0}, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder$3;-><init>(Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public setTxtItemLine2Text(Ljava/lang/String;)V
    .locals 1

    .line 127
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine2:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public setTxtItemLine2Visibility(I)V
    .locals 1

    .line 131
    iget-boolean v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->overrideHideTxtItemLine2:Z

    if-nez v0, :cond_0

    .line 132
    iget-object v0, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine2:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 134
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/LibraryQueueUI/ViewHolders/ContentItemViewHolder;->txtItemLine2:Landroid/widget/TextView;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    :goto_0
    return-void
.end method
