.class public final synthetic Lcom/daaw/cq1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ri1$a;


# instance fields
.field public final synthetic a:Lcom/daaw/eq1;

.field public final synthetic b:Ljava/lang/Iterable;

.field public final synthetic c:Lcom/daaw/sn1;

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/eq1;Ljava/lang/Iterable;Lcom/daaw/sn1;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cq1;->a:Lcom/daaw/eq1;

    iput-object p2, p0, Lcom/daaw/cq1;->b:Ljava/lang/Iterable;

    iput-object p3, p0, Lcom/daaw/cq1;->c:Lcom/daaw/sn1;

    iput-wide p4, p0, Lcom/daaw/cq1;->d:J

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/daaw/cq1;->a:Lcom/daaw/eq1;

    iget-object v1, p0, Lcom/daaw/cq1;->b:Ljava/lang/Iterable;

    iget-object v2, p0, Lcom/daaw/cq1;->c:Lcom/daaw/sn1;

    iget-wide v3, p0, Lcom/daaw/cq1;->d:J

    invoke-static {v0, v1, v2, v3, v4}, Lcom/daaw/eq1;->e(Lcom/daaw/eq1;Ljava/lang/Iterable;Lcom/daaw/sn1;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
