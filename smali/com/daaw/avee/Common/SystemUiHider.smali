.class public abstract Lcom/daaw/avee/Common/SystemUiHider;
.super Ljava/lang/Object;
.source "SystemUiHider.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/Common/SystemUiHider$OnVisibilityChangeListener;
    }
.end annotation


# static fields
.field public static final FLAG_FULLSCREEN:I = 0x2

.field public static final FLAG_HIDE_NAVIGATION:I = 0x6

.field public static final FLAG_LAYOUT_IN_SCREEN_OLDER_DEVICES:I = 0x1

.field private static sDummyListener:Lcom/daaw/avee/Common/SystemUiHider$OnVisibilityChangeListener;


# instance fields
.field protected mAnchorView:Landroid/view/View;

.field protected mFlags:I

.field protected mOnVisibilityChangeListener:Lcom/daaw/avee/Common/SystemUiHider$OnVisibilityChangeListener;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 61
    new-instance v0, Lcom/daaw/avee/Common/SystemUiHider$1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/SystemUiHider$1;-><init>()V

    sput-object v0, Lcom/daaw/avee/Common/SystemUiHider;->sDummyListener:Lcom/daaw/avee/Common/SystemUiHider$OnVisibilityChangeListener;

    return-void
.end method

.method protected constructor <init>(Landroid/view/View;I)V
    .locals 1

    .line 105
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 103
    sget-object v0, Lcom/daaw/avee/Common/SystemUiHider;->sDummyListener:Lcom/daaw/avee/Common/SystemUiHider$OnVisibilityChangeListener;

    iput-object v0, p0, Lcom/daaw/avee/Common/SystemUiHider;->mOnVisibilityChangeListener:Lcom/daaw/avee/Common/SystemUiHider$OnVisibilityChangeListener;

    .line 107
    iput-object p1, p0, Lcom/daaw/avee/Common/SystemUiHider;->mAnchorView:Landroid/view/View;

    .line 108
    iput p2, p0, Lcom/daaw/avee/Common/SystemUiHider;->mFlags:I

    return-void
.end method


# virtual methods
.method public abstract hide()V
.end method

.method public abstract isVisible()Z
.end method

.method public setOnVisibilityChangeListener(Lcom/daaw/avee/Common/SystemUiHider$OnVisibilityChangeListener;)V
    .locals 0

    if-nez p1, :cond_0

    .line 149
    sget-object p1, Lcom/daaw/avee/Common/SystemUiHider;->sDummyListener:Lcom/daaw/avee/Common/SystemUiHider$OnVisibilityChangeListener;

    .line 152
    :cond_0
    iput-object p1, p0, Lcom/daaw/avee/Common/SystemUiHider;->mOnVisibilityChangeListener:Lcom/daaw/avee/Common/SystemUiHider$OnVisibilityChangeListener;

    return-void
.end method

.method public abstract setup()V
.end method

.method public abstract show()V
.end method

.method public toggle()V
    .locals 1

    .line 136
    invoke-virtual {p0}, Lcom/daaw/avee/Common/SystemUiHider;->isVisible()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    invoke-virtual {p0}, Lcom/daaw/avee/Common/SystemUiHider;->hide()V

    goto :goto_0

    .line 139
    :cond_0
    invoke-virtual {p0}, Lcom/daaw/avee/Common/SystemUiHider;->show()V

    :goto_0
    return-void
.end method
