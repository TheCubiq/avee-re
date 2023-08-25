.class public Lcom/daaw/zx0$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/zx0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public a:F

.field public b:F

.field public final synthetic c:Lcom/daaw/zx0;


# direct methods
.method public constructor <init>(Lcom/daaw/zx0;FF)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zx0$a;->c:Lcom/daaw/zx0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/daaw/zx0$a;->a:F

    iput p3, p0, Lcom/daaw/zx0$a;->b:F

    return-void
.end method
