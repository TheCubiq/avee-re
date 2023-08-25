.class public Lcom/daaw/jk$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ti$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/jk;->d(Landroid/content/Context;Ljava/lang/String;)Lcom/daaw/ts1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/gk;

.field public final synthetic b:Lcom/daaw/hk;

.field public final synthetic c:Lcom/daaw/jk;


# direct methods
.method public constructor <init>(Lcom/daaw/jk;Lcom/daaw/gk;Lcom/daaw/hk;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/jk$a;->c:Lcom/daaw/jk;

    iput-object p2, p0, Lcom/daaw/jk$a;->a:Lcom/daaw/gk;

    iput-object p3, p0, Lcom/daaw/jk$a;->b:Lcom/daaw/hk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;ILcom/daaw/wc0;)Lcom/daaw/ts1;
    .locals 6

    new-instance p1, Lcom/daaw/si;

    const/4 p2, 0x2

    new-array v0, p2, [Lcom/daaw/si$b;

    new-instance v1, Lcom/daaw/si$b;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Lcom/daaw/si$b;-><init>(I)V

    const/4 v3, 0x0

    aput-object v1, v0, v3

    new-instance v1, Lcom/daaw/si$b;

    invoke-direct {v1, v2}, Lcom/daaw/si$b;-><init>(I)V

    const/4 v2, 0x1

    aput-object v1, v0, v2

    new-array v1, p2, [Lcom/daaw/ts1$a;

    iget-object v4, p0, Lcom/daaw/jk$a;->a:Lcom/daaw/gk;

    aput-object v4, v1, v3

    iget-object v5, p0, Lcom/daaw/jk$a;->b:Lcom/daaw/hk;

    aput-object v5, v1, v2

    new-array p2, p2, [Lcom/daaw/wc0;

    aput-object v4, p2, v3

    aput-object v5, p2, v2

    invoke-direct {p1, v0, v1, p2}, Lcom/daaw/si;-><init>([Lcom/daaw/si$b;[Lcom/daaw/ts1$a;[Lcom/daaw/wc0;)V

    new-instance p2, Lcom/daaw/d90;

    const/4 v0, 0x6

    invoke-direct {p2, p1, p3, v0, v2}, Lcom/daaw/d90;-><init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;II)V

    new-instance p1, Lcom/daaw/ts1;

    invoke-direct {p1, p2, p3}, Lcom/daaw/ts1;-><init>(Lcom/daaw/ts1$a;Lcom/daaw/wc0;)V

    return-object p1
.end method
