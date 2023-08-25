.class public final synthetic Lcom/daaw/dq1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ri1$a;


# instance fields
.field public final synthetic a:Lcom/daaw/eq1;

.field public final synthetic b:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/eq1;Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/dq1;->a:Lcom/daaw/eq1;

    iput-object p2, p0, Lcom/daaw/dq1;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/dq1;->a:Lcom/daaw/eq1;

    iget-object v1, p0, Lcom/daaw/dq1;->b:Ljava/util/Map;

    invoke-static {v0, v1}, Lcom/daaw/eq1;->c(Lcom/daaw/eq1;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
