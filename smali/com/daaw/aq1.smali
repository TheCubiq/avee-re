.class public final synthetic Lcom/daaw/aq1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ri1$a;


# instance fields
.field public final synthetic a:Lcom/daaw/eq1;

.field public final synthetic b:Lcom/daaw/sn1;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/eq1;Lcom/daaw/sn1;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/aq1;->a:Lcom/daaw/eq1;

    iput-object p2, p0, Lcom/daaw/aq1;->b:Lcom/daaw/sn1;

    iput-wide p3, p0, Lcom/daaw/aq1;->c:J

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/aq1;->a:Lcom/daaw/eq1;

    iget-object v1, p0, Lcom/daaw/aq1;->b:Lcom/daaw/sn1;

    iget-wide v2, p0, Lcom/daaw/aq1;->c:J

    invoke-static {v0, v1, v2, v3}, Lcom/daaw/eq1;->f(Lcom/daaw/eq1;Lcom/daaw/sn1;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
