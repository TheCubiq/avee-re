.class public Lcom/daaw/nn0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/gc1$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/nn0;->i()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:F

.field public final synthetic b:Lcom/daaw/nn0;


# direct methods
.method public constructor <init>(Lcom/daaw/nn0;F)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/nn0$b;->b:Lcom/daaw/nn0;

    iput p2, p0, Lcom/daaw/nn0$b;->a:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/ll;)Lcom/daaw/ll;
    .locals 2

    instance-of v0, p1, Lcom/daaw/o31;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/daaw/g1;

    iget v1, p0, Lcom/daaw/nn0$b;->a:F

    invoke-direct {v0, v1, p1}, Lcom/daaw/g1;-><init>(FLcom/daaw/ll;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method
