.class public Lcom/daaw/yx0$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pw1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/yx0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/yx0;


# direct methods
.method public constructor <init>(Lcom/daaw/yx0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/yx0$h;->a:Lcom/daaw/yx0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/yx0$h;->a:Lcom/daaw/yx0;

    invoke-static {v0}, Lcom/daaw/yx0;->b(Lcom/daaw/yx0;)Lcom/daaw/t91;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/t91;->b(I)V

    return-void
.end method
