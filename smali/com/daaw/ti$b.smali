.class public Lcom/daaw/ti$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wc0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ti;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:Z

.field public d:Z

.field public e:Ljava/lang/String;

.field public final synthetic f:Lcom/daaw/ti;


# direct methods
.method public constructor <init>(Lcom/daaw/ti;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ti$b;->f:Lcom/daaw/ti;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/ti$b;->a:I

    iput p1, p0, Lcom/daaw/ti$b;->b:I

    iput-boolean p1, p0, Lcom/daaw/ti$b;->c:Z

    iput-boolean p1, p0, Lcom/daaw/ti$b;->d:Z

    const-string p1, ""

    iput-object p1, p0, Lcom/daaw/ti$b;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ti$b;->e:Ljava/lang/String;

    iget-object p1, p0, Lcom/daaw/ti$b;->f:Lcom/daaw/ti;

    invoke-static {p1}, Lcom/daaw/ti;->j(Lcom/daaw/ti;)V

    return-void
.end method

.method public b(IIZZ)V
    .locals 0

    iput p1, p0, Lcom/daaw/ti$b;->a:I

    iput p2, p0, Lcom/daaw/ti$b;->b:I

    iput-boolean p3, p0, Lcom/daaw/ti$b;->c:Z

    iput-boolean p4, p0, Lcom/daaw/ti$b;->d:Z

    iget-object p1, p0, Lcom/daaw/ti$b;->f:Lcom/daaw/ti;

    invoke-static {p1}, Lcom/daaw/ti;->f(Lcom/daaw/ti;)V

    return-void
.end method
