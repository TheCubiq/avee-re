.class public final Lcom/daaw/eb0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/eb0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Lcom/daaw/ef;

.field public b:Z

.field public c:Lcom/daaw/ib0$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p0}, Lcom/daaw/eb0$b;->a()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/eb0$b;->a:Lcom/daaw/ef;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lcom/daaw/eb0$b;->b:Z

    iput-object v0, p0, Lcom/daaw/eb0$b;->c:Lcom/daaw/ib0$a;

    return-void
.end method
