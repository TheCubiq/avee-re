.class public final Lcom/daaw/hc1$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/hc1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lcom/daaw/gc1;

.field public final b:Landroid/graphics/Path;

.field public final c:Landroid/graphics/RectF;

.field public final d:Lcom/daaw/hc1$b;

.field public final e:F


# direct methods
.method public constructor <init>(Lcom/daaw/gc1;FLandroid/graphics/RectF;Lcom/daaw/hc1$b;Landroid/graphics/Path;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Lcom/daaw/hc1$c;->d:Lcom/daaw/hc1$b;

    iput-object p1, p0, Lcom/daaw/hc1$c;->a:Lcom/daaw/gc1;

    iput p2, p0, Lcom/daaw/hc1$c;->e:F

    iput-object p3, p0, Lcom/daaw/hc1$c;->c:Landroid/graphics/RectF;

    iput-object p5, p0, Lcom/daaw/hc1$c;->b:Landroid/graphics/Path;

    return-void
.end method
