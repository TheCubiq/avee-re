.class public final Lcom/daaw/yz$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/u20$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/yz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/u20$a<",
        "Lcom/daaw/y;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Landroid/graphics/Rect;)V
    .locals 0

    check-cast p1, Lcom/daaw/y;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/yz$a;->b(Lcom/daaw/y;Landroid/graphics/Rect;)V

    return-void
.end method

.method public b(Lcom/daaw/y;Landroid/graphics/Rect;)V
    .locals 0

    invoke-virtual {p1, p2}, Lcom/daaw/y;->m(Landroid/graphics/Rect;)V

    return-void
.end method
