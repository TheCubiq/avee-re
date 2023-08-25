.class public final Lcom/daaw/fe5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:Lcom/daaw/p2$b;

.field public final c:Lcom/daaw/g5;

.field public final d:Lcom/daaw/yk4;


# direct methods
.method public constructor <init>(Lcom/daaw/g5;Lcom/daaw/p2$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/daaw/fe5;->b:Lcom/daaw/p2$b;

    iput-object p1, p0, Lcom/daaw/fe5;->c:Lcom/daaw/g5;

    new-instance p2, Lcom/daaw/yk4;

    invoke-direct {p2, p0}, Lcom/daaw/yk4;-><init>(Lcom/daaw/fe5;)V

    iput-object p2, p0, Lcom/daaw/fe5;->d:Lcom/daaw/yk4;

    invoke-virtual {p1, p2}, Lcom/daaw/g5;->q(Lcom/daaw/g5$a;)V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lcom/daaw/fe5;->a:Ljava/util/Set;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/fe5;)Lcom/daaw/p2$b;
    .locals 0

    iget-object p0, p0, Lcom/daaw/fe5;->b:Lcom/daaw/p2$b;

    return-object p0
.end method
