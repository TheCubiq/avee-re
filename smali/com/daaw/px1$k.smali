.class public Lcom/daaw/px1$k;
.super Lcom/daaw/px1$j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/px1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "k"
.end annotation


# static fields
.field public static final q:Lcom/daaw/px1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroid/view/WindowInsets;->CONSUMED:Landroid/view/WindowInsets;

    invoke-static {v0}, Lcom/daaw/px1;->w(Landroid/view/WindowInsets;)Lcom/daaw/px1;

    move-result-object v0

    sput-object v0, Lcom/daaw/px1$k;->q:Lcom/daaw/px1;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/px1;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/px1$j;-><init>(Lcom/daaw/px1;Landroid/view/WindowInsets;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/px1;Lcom/daaw/px1$k;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/px1$j;-><init>(Lcom/daaw/px1;Lcom/daaw/px1$j;)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public g(I)Lcom/daaw/gg0;
    .locals 1

    iget-object v0, p0, Lcom/daaw/px1$g;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, Lcom/daaw/px1$n;->a(I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/view/WindowInsets;->getInsets(I)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, Lcom/daaw/gg0;->d(Landroid/graphics/Insets;)Lcom/daaw/gg0;

    move-result-object p1

    return-object p1
.end method
