.class public Lcom/daaw/pf$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/TypeEvaluator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/pf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/animation/TypeEvaluator<",
        "Lcom/daaw/pf$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Landroid/animation/TypeEvaluator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/animation/TypeEvaluator<",
            "Lcom/daaw/pf$e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Lcom/daaw/pf$e;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/pf$b;

    invoke-direct {v0}, Lcom/daaw/pf$b;-><init>()V

    sput-object v0, Lcom/daaw/pf$b;->b:Landroid/animation/TypeEvaluator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/pf$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/pf$e;-><init>(Lcom/daaw/pf$a;)V

    iput-object v0, p0, Lcom/daaw/pf$b;->a:Lcom/daaw/pf$e;

    return-void
.end method


# virtual methods
.method public a(FLcom/daaw/pf$e;Lcom/daaw/pf$e;)Lcom/daaw/pf$e;
    .locals 4

    iget-object v0, p0, Lcom/daaw/pf$b;->a:Lcom/daaw/pf$e;

    iget v1, p2, Lcom/daaw/pf$e;->a:F

    iget v2, p3, Lcom/daaw/pf$e;->a:F

    invoke-static {v1, v2, p1}, Lcom/daaw/rn0;->c(FFF)F

    move-result v1

    iget v2, p2, Lcom/daaw/pf$e;->b:F

    iget v3, p3, Lcom/daaw/pf$e;->b:F

    invoke-static {v2, v3, p1}, Lcom/daaw/rn0;->c(FFF)F

    move-result v2

    iget p2, p2, Lcom/daaw/pf$e;->c:F

    iget p3, p3, Lcom/daaw/pf$e;->c:F

    invoke-static {p2, p3, p1}, Lcom/daaw/rn0;->c(FFF)F

    move-result p1

    invoke-virtual {v0, v1, v2, p1}, Lcom/daaw/pf$e;->a(FFF)V

    iget-object p1, p0, Lcom/daaw/pf$b;->a:Lcom/daaw/pf$e;

    return-object p1
.end method

.method public bridge synthetic evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Lcom/daaw/pf$e;

    check-cast p3, Lcom/daaw/pf$e;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/pf$b;->a(FLcom/daaw/pf$e;Lcom/daaw/pf$e;)Lcom/daaw/pf$e;

    move-result-object p1

    return-object p1
.end method
