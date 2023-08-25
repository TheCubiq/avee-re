.class public final Lcom/daaw/q70$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/q70;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lcom/daaw/zf1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/q70$a;->a:Lcom/daaw/zf1;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/q70;
    .locals 2

    new-instance v0, Lcom/daaw/q70;

    iget-object v1, p0, Lcom/daaw/q70$a;->a:Lcom/daaw/zf1;

    invoke-direct {v0, v1}, Lcom/daaw/q70;-><init>(Lcom/daaw/zf1;)V

    return-object v0
.end method

.method public b(Lcom/daaw/zf1;)Lcom/daaw/q70$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/q70$a;->a:Lcom/daaw/zf1;

    return-object p0
.end method
