.class public final Lcom/daaw/hr6;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/nq6;

.field public final b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lcom/daaw/nq6;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/hr6;->b:Ljava/util/ArrayList;

    iput-object p1, p0, Lcom/daaw/hr6;->a:Lcom/daaw/nq6;

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/nq6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/hr6;->a:Lcom/daaw/nq6;

    return-object v0
.end method

.method public final b()Ljava/util/ArrayList;
    .locals 1

    iget-object v0, p0, Lcom/daaw/hr6;->b:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final c(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/hr6;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
